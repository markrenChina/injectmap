package com.ccand99.sdk.injectmap.convert;

/**
 * 实现类大部分情况应该继承本抽象类
 * @author markrenChina
 */
abstract class AbstractConvert<T> implements Convert{

    final Class<T> type;

    protected AbstractConvert(Class<T> type) {
        this.type = type;
    }

    @Override
    public  boolean support(Class<?> clazz) {
        return clazz == type;
    }
}
