package chapter5;

import java.util.*;
public class PersonText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person r = new Person();

        System.out.println("请输入姓名");
        String n = sc.next();
        r.name = n;
        System.out.println("请输入年龄");
        int a = sc.nextInt();
        r.age = a;
        System.out.println("请输入性别");
        char s = sc.next().charAt(0);   //char的输入格式
        r.sex = 's';

        System.out.println("已查询到"+n);
        System.out.println("姓名："+n+",年龄："+a+"性别："+s);
        
    }
}
