package chapter4;

import javax.print.attribute.standard.RequestingUserName;

public class Teacher {

    //声明方法eat，作用是输出"天生吃"
    //声明方法dou，作用是计算给定的int值*2
    //声明方法study，作用是给定string clzssName，返回"好好学习：clzssName"
    public void eat(){
        System.out.println("天生吃");
    }
    public int dou(int money){
        return money*2;
    }
    public String study(String clzssName){
        return "好好学习："+clzssName;
    }
    public int onePlusOne(int a,int b){
        return a+b;
    }
    public int oneMinusOne(int a,int b){
        return a-b;
    }
    public String ageAndNane(String name,int age){
        return "姓名："+name+"年龄："+age;
    }
    public void sayHello(String name){
        System.out.println("Hello"+name);
    }


}
