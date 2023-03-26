package a正则表达式引入;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/27
 * @Time 2:34
 */
public class Main {
    public static void main(String[] args) {
        String content = "你说得对Av，但是我们这个压缩毛巾gv体积小111方便携带，拆开一包，放898水里ddd就变大，怎么扯都扯不坏，用来擦脚，擦脸，擦嘴都是很好用的，你看打开以后像圆饼一样大小，放在水里遇水变大变高，吸水性很强的。打开以后，是一条加大加厚的毛巾，点击下方小黄车，买5条送5条，还包邮";
        // 1. 先创建一个Pattern对象【模式对象】【可以理解成一个正则表达式对象】

        // 找到所有的单词
        // Pattern pattern = Pattern.compile("[a-zA-Z]+");

        // 找到所有的数字
        // Pattern pattern = Pattern.compile("[0-9]+");

        // 找到所有的数字+字母
        Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        //2. 创建一个匹配器对象
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            // 匹配的内容会放到m.group(0)
            System.out.println("找到：" + matcher.group(0));

        }
    }

}
