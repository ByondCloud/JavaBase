package c正则表达式语法.d选择匹配符;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/27
 * @Time 9:52
 */
public class Main {
    public static void main(String[] args) {
        String content = "林冲淋漓尽致Mr.lin";
        String regStr = "lin|林|淋";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
