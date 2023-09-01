package abstract20230901;

/**
 * ClassName:Work6
 * Package:abstract20230901
 * Description:
 *
 * @Author: 宗树成
 * @Create: 2023/9/1-19:29
 * @version: v1.0
 */
public class Work6 {
    public static void main(String[] args) {
        Person south=new SouthPerson();
        south.eat();
        ((SouthPerson) south).swim();
        double salary = ((SouthPerson) south).salary;
        System.out.println("salary = " + salary);
        Person north=new NorthPerson();
        north.eat();
        ((NorthPerson) north).drink();
        double height = ((NorthPerson) north).height;
        System.out.println("height = " + height);
        System.out.println("哈哈哈哈");
    }
}

abstract class Person {
    String name;
    int age;
    public void eat() {
        System.out.println("人都要吃饭！");
    }
}

class SouthPerson extends Person {
    double salary;

    @Override
    public void eat() {
        System.out.println("南方人喜欢吃米饭");
    }

    public void swim() {
        System.out.println("会游泳！");
    }

}

class NorthPerson extends Person {
    double height;

    @Override
    public void eat() {
        System.out.println("北方人喜欢吃面食");
    }

    public void drink() {
        System.out.println("北方人能喝酒");
    }
}