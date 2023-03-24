package com.cloud.cEnum实现接口;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/18
 * @Time 19:46
 */
public class Main {
        public static void main(String[] args) {
            Music.CLASSIC_MUSIC.playing();
        }

}


// 1.使用 enum 关键字后，就不能再继承其它类了，因为 enum 会隐式继承 Enum，而 Java 是单继承机制
class A { }
// enum Season3 extends A { }


// 2.enum 实现的枚举类，仍然是一个类，所以还是可以实现接口的.
interface IPlaying {
    public void playing();
}

enum Music implements IPlaying {
    CLASSIC_MUSIC;

    @Override
    public void playing() {
        System.out.println("播放好听的古典音乐...");
    }

}
