package h结巴程序;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 18:55
 */
public class Main {
    public static void main(String[] args) {
        String content = "我...我要.....要要要学.学....java";
        Pattern compile = Pattern.compile("\\.");
        Matcher matcher = compile.matcher(content);
        content = matcher.replaceAll("");

        System.out.println(content); // 我我要要要要学学java

        compile = Pattern.compile("(.)\\1+");
        matcher = compile.matcher(content);
        // 在外部使用反向引用就用$
        content = matcher.replaceAll("$1");
        System.out.println(content); // 我要学java
    }
}
