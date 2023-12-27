package chapter5;

import java.util.*;
public class PersonTextOne{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入本次对象的个数");
        int num = sc.nextInt();
        Person[] p = new Person[num];   //创建长度为num的数组
        
        for(int x =0;x < num;x++){
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

            
            p[x] = r;
        }
        
        for(int i = 0;i <num;i++){

        
        System.out.println("姓名："+p[i].name+",年龄："+p[i].age+"性别："+p[i].sex);
        }
    }
}
