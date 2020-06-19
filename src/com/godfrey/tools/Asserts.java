package com.godfrey.tools;

/**
 * description : 断言工具类
 *
 * @author godfrey
 * @since 2020-06-16
 */
public class Asserts {
    public static void test(boolean value) {
        try {
            if (!value) {
                throw new Exception("测试未通过");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
