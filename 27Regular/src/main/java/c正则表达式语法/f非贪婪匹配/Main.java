package c正则表达式语法.f非贪婪匹配;



import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 13:50
 */
public class Main {
    @Test
    public void test() {
        String content = "12545811654";
        String regStr = "\\d+?"; //加上?就是非贪婪匹配
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("---------------------------------");
            System.out.println("找到" + matcher.group(0));
        }
    }
}
