package c正则表达式语法.b元字符字符匹配符;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/27
 * @Time 8:19
 * 查找a-z
 */
public class Main {
    public static void main(String[] args) {
        String content = "abc(a.bd(123";
        String regStr = "[a-z]"; // 匹配a-z的字符
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
