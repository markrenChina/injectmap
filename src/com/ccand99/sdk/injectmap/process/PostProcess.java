package com.ccand99.sdk.injectmap.process;


import com.ccand99.sdk.injectmap.convert.Convert;
import com.ccand99.sdk.injectmap.convert.Value;

import java.util.Map;

/**
 *  注入处理 不限于{@link Value}
 *  可以扩展新的注解
 * @author markrenChina
 * @see Value
 * @see Convert
 */
public interface PostProcess {

    /**
     * 注册类型转换器
     * @param convert
     */
    void register(Convert convert);

    /**
     * 副作用编程，处理map中输入注入obj
     * @param obj
     * @param source
     */
    public <T> void process(T obj, Map<String,String> source);
}
