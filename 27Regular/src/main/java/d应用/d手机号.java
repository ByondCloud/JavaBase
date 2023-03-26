package d应用;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 14:11
 */
public class d手机号 {
    public static void main(String[] args) {
        String content = "15859024816";
        String regStr = "^1[3|4|5|8]\\d{9}$";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }


}
