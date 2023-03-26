package c正则表达式语法.a转义符号;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/27
 * @Time 7:52
 */
public class Main {
    public static void main(String[] args) {
        String content = "abc$abc(abc(123";
        String regStr = "\\.";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
