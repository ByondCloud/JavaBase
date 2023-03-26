package j作业;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 19:18
 */
public class HomeWork01 {
    public static void main(String[] args) {
        // 验证电子邮箱是否合法
        String content = "ByondCloud@qq.com";
        String regStr = "^[\\w-]+@[a-zA-Z]+\\.[a-zA-z]+$";
        boolean matches = Pattern.matches(regStr, content);
        System.out.println(matches);
    }
}
