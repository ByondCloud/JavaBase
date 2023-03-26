package c正则表达式语法.e非捕获分组;



import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 9:29
 */
public class Main {

    @Test
    public void test() {
        String content = "hello云之彼端1 jack云之彼端2 云之彼端3同学hello";
        String regStr = "云之彼端(?:1|2|3)";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("---------------------------------");
            System.out.println("找到" + matcher.group(0));

        }
    }


    @Test
    public void test2() {
        String content = "hello云之彼端1 jack云之彼端2 云之彼端3同学hello";
        String regStr = "云之彼端(?=1|2|3)";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("---------------------------------");
            System.out.println("找到" + matcher.group(0));

        }
    }

    @Test
    public void test3() {
        String content = "hello云之彼端1 jack云之彼端2 云之彼端3同学hello 云之彼端4456";
        String regStr = "云之彼端(?!1|2|3)";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("---------------------------------");
            System.out.println("找到" + matcher.group(0));
        }
    }


}
