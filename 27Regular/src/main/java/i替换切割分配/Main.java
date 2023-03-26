package i替换切割分配;


import org.junit.Test;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/28
 * @Time 19:07
 */
public class Main {
    // String中使用正则表达式
    @Test
    public void test() {
        String content = "宝可梦，游戏《宝可梦》系列及其衍生作品中的生物。" +
                "它们是一种既神秘又不可思议的生物。有些宝可梦和人类友好地居住在一起，" +
                "有些野生宝可梦则栖息于草丛、洞窟或是大海里。关于它们的生态仍然存在着许多人类未能破解的谜团。";

        // 使用正则表达式，将【宝可梦】和【人类】替换成A
        content = content.replaceAll("宝可梦|人类", "A");
        System.out.println(content);
    }

    // 验证手机号开头是否为138 139
    @Test
    public void test2() {
        String content = "13859024816";
        System.out.println(content.matches("^1(38|39)\\d{8}")? "验证成功":"验证失败");
    }


    @Test
    // 按照 # - ~ 或者数字来分隔
    public void test3() {
        String content = "hello#edu~jack-tom6hello7smith8hello";
        String[] split = content.split("#|-|~|\\d+");
        for (String s : split) {
            System.out.println(s);
        }
    }

}
