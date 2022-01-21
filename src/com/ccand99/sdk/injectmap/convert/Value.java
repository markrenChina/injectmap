package com.ccand99.sdk.injectmap.convert;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

/**
 * 用于字段注入
 * @author markrenChina
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ FIELD})
public @interface Value {

    /**
     * 字段名
     */
    String column() ;

    /**
     * 项目名，类似分组
     */
    String project() ;

}
