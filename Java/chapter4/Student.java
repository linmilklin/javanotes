package chapter4;

public class Student {
    public static void main(String[] args) { //没有main方法，叫 实体类(没有main方法不能运行)
    //选择类创建一个对象
    Student1 r = new Student1();    //再建一个类
    //使用对象
    System.out.println(r);
    //使用对象的属性
    System.out.println(r.number);
    //定义新对象的属性
    r.name = "千反田爱瑠";
    r.number = 1213;
    r.xingbie = '女';
    r.nianling = "18";
    r.xingge = "温静";

    System.out.println("姓名" + r.name);
    System.out.println( r.number);
    System.out.println("性别" + r.xingbie);
    System.out.println("年龄" + r.nianling);
    System.out.println("性格" + r.xingge);
    int studentxh;
    }
}
