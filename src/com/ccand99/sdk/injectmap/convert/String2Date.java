package com.ccand99.sdk.injectmap.convert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串转日期
 * 时间直接转long类型会在注入时无法分辨是否是时间还是时间戳
 * @author markrenChina
 * @see AbstractConvert
 * @see Convert
 */
public final class String2Date extends AbstractConvert<Date> {

    private final DateFormat format ;

    public String2Date(String pattern) {
        super(Date.class);
        format = new SimpleDateFormat(pattern);
    }

    @Override
    public synchronized Date invoke(String value) {
        try {
            return format.parse(value);
        } catch (ParseException e) {
            System.out.println(value + "解析日期错误");
            e.printStackTrace();
        }
        return null;
    }
}
