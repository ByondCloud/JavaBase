package j作业;

import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 19:25
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String num = "66.01";
        String regStr = "^\\-?[1-9]\\d*(\\.\\d*)?$|0";
        boolean matches = Pattern.matches(regStr, num);
        System.out.println(matches);
    }
}
