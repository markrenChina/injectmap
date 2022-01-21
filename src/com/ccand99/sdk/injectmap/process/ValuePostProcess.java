package com.ccand99.sdk.injectmap.process;


import com.ccand99.sdk.injectmap.convert.Convert;
import com.ccand99.sdk.injectmap.convert.Value;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * {@link Value} 处理注入
 * @author markrenChina
 */
public class ValuePostProcess implements PostProcess{

    public static final String KEY_PROJECT = "项目";

    private final List<Convert> converts = new ArrayList<>(2);

    @Override
    public void register(Convert convert){
        converts.add(convert);
    }

    @Override
    public <T> void process(T obj, Map<String,String> source){
        String project = source.get(KEY_PROJECT);
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Value annotation = field.getAnnotation(Value.class);
            if (annotation == null) {
                continue;
            }
            if ("*".equals(annotation.project())||annotation.project().equals(project)){
                Class<?> fieldClass = field.getType();
                for (Convert convert : converts) {
                    if (convert.support(fieldClass)) {
                        try {
                            field.set(obj, convert.invoke(source.get(field.getAnnotation(Value.class).column())));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            }
        }
    }
}
