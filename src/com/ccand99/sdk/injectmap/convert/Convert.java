package com.ccand99.sdk.injectmap.convert;

/**
 * 类型转换接口
 * @author markrenChina
 */
public interface Convert {

    /**
     * 判断是否支持
     * @param clazz 需要转换的Class类型
     * @return true 支持
     */
    boolean support(Class<?> clazz);

    /**
     * 执行转换
     * @param value 输入的字符串
     * @return 子类实现时应该使用具体的对象
     */
    Object invoke(String value);
}
