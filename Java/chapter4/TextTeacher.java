package chapter4;

import javafx.scene.paint.Stop;

public class TextTeacher {
    public static void main(String[] args) {
        //1.
        //先创建一个类
        Teacher t = new Teacher();
        //调用方法：new的名字.方法名(实参列表)
        t.study("前辈");

        //2.
        //  new 类名字().方法名(实参属性)
        new Teacher().dou(10000);

        //3.
        Teacher tt = new Teacher();

        String clzssName = "前辈";
        tt.study(clzssName);


        Teacher ttt = new Teacher();
        // 调用无返回值的方法：new的名字.类的属性();
        ttt.eat();
        // 调用有返回值的方法：选择的类型 命名 = new的名字.方法名(实参列表);
        String st = ttt.study("前辈"); 
        System.out.println("返回值为"+t);



        ttt.dou(100000);

        ttt.sayHello("麻衣");


        int jia = ttt.onePlusOne(12, 13);
        System.out.println(jia);

        int jian = ttt.oneMinusOne(90, 12);
        System.out.println(jian);

        String xn = ttt.ageAndNane("真由喜", 18);
        System.out.println("xn");

        ttt.sayHello("猫猫");

    }
}
