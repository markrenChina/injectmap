package com.ccand99.sdk.injectmap.convert;

/**
 * 类型转换 字符类型转整型
 * @author markrenChina
 * @see Convert
 * @see AbstractConvert
 */
public final class String2Int extends AbstractConvert<Integer> {

    public String2Int() {
        super(Integer.class);
    }

    @Override
    public Integer invoke(String value){
        try {
            return Integer.valueOf(value);
        }catch (Exception e){
            System.out.println("Integer 解析错误");
            return null;
        }
    }
}
