package chapter11.listdemo;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Core c = new Core();

        System.out.println("增加");
        String one = sc.next();
        c.add(one);
        
        Object a = c.getOne(0);
        System.out.println(a);
        c.getOne(0);
        c.getN();
    }
}
