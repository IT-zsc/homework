package abstract20230901;

import java.util.Map;
import java.util.function.IntToDoubleFunction;

/**
 * ClassName:Work8
 * Package:abstract20230901
 * Description:
 *
 * @Author: 宗树成
 * @Create: 2023/9/1-19:54
 * @version: v1.0
 */
public class Work8 {
    public static void main(String[] args) {
        System.out.println("-----长方形-----");
       Shap rectangle=new Rectangle();
       Rectangle rectangle1= (Rectangle) rectangle;
       rectangle1.setLength(10);
       rectangle1.setWidth(2);
        double primeter = rectangle1.getPrimeter();
        System.out.println("primeter = " + primeter);
        double area = rectangle1.getArea();
        System.out.println("area = " + area);
        System.out.println("-----圆----");
        Shap shap=new Circle();
        Circle circle= (Circle) shap;
        circle.setRadius(6);
        double primeter1 = circle.getPrimeter();
        System.out.println("primeter1 = " + primeter1);
        double area1 = circle.getArea();
        System.out.println("area1 = " + area1);

    }
}

//定义抽象类
abstract class Shap {
//    求周长
    public abstract double getPrimeter();
//    求面积
    public abstract double getArea();
}

//定义周长类
class Rectangle extends Shap {

   private double length;
  private   double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPrimeter() {
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
//面积类
class Circle extends Shap {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPrimeter() {
     return 2* Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
