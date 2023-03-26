package g反向引用;



import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 17:00
 */
public class Main {
    // 找出1221这样的数字
    @Test
    public void test() {
        String content = "1221 1234 7887";
        String regStr = "(\\d)(\\d)\\2\\1";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("找到" + matcher.group(0));
        }
    }

    @Test
    // 找出12321-333666999这样的数字
    public void test2() {
        String content = "12321-333666999";
        String regStr = "(\\d)(\\d)(\\d)\\2\\1-(\\d)\\4{2}(\\d)\\5{2}(\\d)\\6{2}";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("找到" + matcher.group(0));
        }
    }

}
