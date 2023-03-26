package ePattern类;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 15:02
 */
public class Main {
    public static void main(String[] args) {
        String content = "Hello World";
        String regStr = "Hello";

        // 这个是对比，我们这里是局部匹配，如果包含hello，那么就匹配成功
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()) {
            System.out.println("匹配成功");
        }

        // 这个是整体匹配，相当于上面的regStr = "^(Hello)$"
        boolean matches = Pattern.matches(regStr, content);
        System.out.println(matches);



    }
}
