package d应用;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 13:59
 */
public class a中文编码 {
    public static void main(String[] args) {
        String content = "云之彼端";
        String regStr = "^[\u0391-\uffe5]+$";

        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

    }
}
