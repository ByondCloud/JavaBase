package com.cloud.c自定义泛型接口;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/21
 * @Time 6:27
 */
public interface Main<A, B, C> {

    void method1(A a);

    default B method2(C c) {
        return null;
    }

}

class A implements Main<String, Boolean, Integer> {

    @Override
    public void method1(String s) {
        System.out.println(s);
    }

    @Override
    public Boolean method2(Integer integer) {
        return false;
    }
}
