package fMatcher方法;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 15:53
 */
public class Main {
    public static void main(String[] args) {
        String content = "hello edu jack tom hello smith hello";
        String regStr = "hello";
        // 整体匹配
        boolean matches = Pattern.matches(regStr, content);

        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        // 将hello换成【你好】
        String newHello = matcher.replaceAll("你好");
        System.out.println(newHello);


    }
}
