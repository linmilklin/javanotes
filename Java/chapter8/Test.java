package chapter8;

import java.nio.channels.NetworkChannel;

public class Test {
    public static void main(String[] args) {
        inherit i = new inherit();                      //测试类
        i.idCard = "007";
        i.name = "黄昏";
        Student s = new Student();
        i.idCard = "03";
        s.name = "阿尼亚";
        s.name("阿尼亚");

        // 多态
        //向上转型
        inherit i1 = new Student();
        inherit i2 = new Teacher();
        //向下转型（强转）
        Student s1 = (Student)i1;
    }
}
