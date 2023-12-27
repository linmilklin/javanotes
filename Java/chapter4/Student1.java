package chapter4;
    //定义类的属性

import org.omg.CORBA.INTERNAL;

public class Student1 {
    String nianling;
    String name;
    char xingbie;
    String xueyuan;
    String gongzuohao;
    String xingge;
    int number;
    


    //类的组成部分：方法
    //【修饰符】 返回值类型 方法名（形参列表）{方法体}
    public void eat(){}  //返回值类型：void类型没有返回值（无）;不是void类型时，则为返回值，方法体要加return
                        //形参列表：表示调用方法时需要提供的参数

    public String a(){return"";}
    
    public int onePlusOne(int a,int b){
        return a + b;
    }    
    public int oneMinusOne(int a,int b){
        return a - b;
    }

    public String ageANDnAME(String name,int age){
        return "姓名"+name+"年龄"+age;
    }
    public void sayHello(String name){      //void无返回值，则用输出
        System.out.println("Hello name");
    }

    
    
}
