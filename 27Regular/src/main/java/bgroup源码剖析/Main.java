package bgroup源码剖析;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/27
 * @Time 7:08
 */
public class Main {
    public static void main(String[] args) {
        String content = "你说得对，但是我们1988这个压缩毛4448巾体积小方便携带，拆开一7777包，放水里就变大，怎么扯都扯不坏，用来擦脚，擦脸，擦嘴都是很好用的，你看打开以后像圆饼一样大小，放在水里遇水变大变高，吸水性很强的。打开以后，是一条加大加厚的毛巾，点击下方小黄车，买5条送5条，还包邮";
        Pattern compile = Pattern.compile("(\\d\\d)(\\d\\d)");
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("整体输出:" + matcher.group(0));
            System.out.println("输出第一组" + matcher.group(1));
            System.out.println("输出其二组" + matcher.group(2));

        }

    }
}
