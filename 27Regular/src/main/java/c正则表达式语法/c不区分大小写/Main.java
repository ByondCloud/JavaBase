package c正则表达式语法.c不区分大小写;



import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/27
 * @Time 8:35
 */
public class Main {
    // abc不区分大小写
    @Test
    public void test1() {
        String content = "abcaBCabCAbcABcABC";
        String regStr = "(?i)abc";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    // abc不区分大小写，通过方法
    @Test
    public void test12() {
        String content = "abcaBCabCAbcABcABC";
        String regStr = "abc";
        Pattern compile = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    @Test
    // abc中bc不区分大小写
    public void test2() {
        String content = "abcaBCabCAbcABcABC";
        String regStr = "a(?i)bc";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    @Test
    // abc中b不区分大小写
    public void test3() {
        String content = "abcaBCabCAbcABcABCaBc";
        String regStr = "a((?i)b)c";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    @Test
    // abc中b不区分大小写
    public void test4() {
        String content = "1234567890";
        String regStr = "(?<g1>\\d\\d)((?<g2>\\d))";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("---------------------------------");
            System.out.println("找到" + matcher.group(0));
            System.out.println("找到" + matcher.group("g1"));
            System.out.println("找到" + matcher.group("g2"));
        }
    }

}
