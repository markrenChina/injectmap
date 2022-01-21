package com.ccand99.sdk.injectmap.convert;

/**
 * 类型转换 字符类型转双精度浮点，结果是源值的100倍
 * @author markrenChina
 * @see Convert
 * @see AbstractConvert
 */
public class String2Double extends AbstractConvert<Double> {

    public String2Double() {
        super(Double.class);
    }

    @Override
    public Double invoke(String value) {
        try {
            return Double.valueOf(value);
        }catch (Exception e){
            System.out.println("Double 解析错误");
            return null;
        }
    }
}
