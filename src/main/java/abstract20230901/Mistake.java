package abstract20230901;

/**
 * ClassName:Mistake
 * Package:abstract20230901
 * Description:
 *
 * @Author: 宗树成
 * @Create: 2023/9/1-20:22
 * @version: v1.0
 */
public class Mistake {
    public static void main(String[] args) {
        Father son=new Son();
        GrandFather grandFather=son;
        grandFather.run();
        ((Father) grandFather).fly();
        ((Son) grandFather).flash();
    }
}
//抽象类可以new对象
class GrandFather {
public void run() {
    System.out.println("跑pao");
}
}

class Father extends GrandFather{
    public void fly() {
        System.out.println("飞");
    }
}

class Son extends Father {
    public void flash() {
        System.out.println("闪pao");
    }
}
