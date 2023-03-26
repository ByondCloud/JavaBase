package d应用;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 14:09
 */
public class cQQ号 {
    public static void main(String[] args) {
        String content = "1095938907";
        String regStr = "^[1-9]\\d{4,9}$";

        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
}
