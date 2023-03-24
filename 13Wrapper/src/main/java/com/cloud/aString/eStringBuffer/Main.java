package com.cloud.aString.eStringBuffer;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 13:18
 */
public class Main {

    public static void main(String[] args) {
        //老韩解读
        //1. StringBuffer 的直接父类 是 AbstractStringBuilder
        //2. StringBuffer 实现了 Serializable, 即 StringBuffer 的对象可以串行化
        //3. 在父类中 AbstractStringBuilder 有属性 char[] value,不是 final
        // 该 value 数组存放 字符串内容，引出存放在堆中的
        //4. StringBuffer 是一个 final 类，不能被继承
        //5. 因为 StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除)
        // 不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String


        StringBuffer s = new StringBuffer("hello");

        // 增
        s.append(',');// "hello,"
        s.append("张三丰");//"hello,张三丰"
        // "hello,张三丰赵敏 100true10.5"
        s.append("赵敏").append(100).append(true).append(10.5);
        // "hello,张三丰赵敏 100true10.5"
        System.out.println(s);

        // 删
        /*
         * 删除索引为>=start && <end 处的字符
         * 解读: 删除 11~14 的字符 [11, 14)
         */
        s.delete(11, 14);
        System.out.println(s);//"hello,张三丰赵敏 true10.5"

        // 改
        // 老韩解读，使用 周芷若 替换 索引 9-11 的字符 [9,11)
        s.replace(9, 11, "周芷若");
        System.out.println(s);//"hello,张三丰周芷若 true10.5"
        // 查找指定的子串在字符串第一次出现的索引，如果找不到返回-1
        int indexOf = s.indexOf("张三丰");
        System.out.println(indexOf);//6

        // 增
        // 老韩解读，在索引为 9 的位置插入 "赵敏",原来索引为 9 的内容自动后移
        s.insert(9, "赵敏");
        // "hello,张三丰赵敏周芷若 true10.5"
        System.out.println(s);

        //长度
        System.out.println(s.length());//22
        System.out.println(s);


    }

}
