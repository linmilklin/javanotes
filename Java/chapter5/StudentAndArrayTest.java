package chapter5;

public class StudentAndArrayTest {
    public static void main(String[] args) {
        
        Studet s = new Studet();  //s是student类型的数据
                                    //student类型的默认值为null
            //整套流程
        Studet[] students = new Studet[6];    //声明student类型，长度为6，名为students的数组
        Studet ss = new Studet();             //在数组中创建对象名为ss
        students[5] = ss;                       //给数组的第6个数据赋值→对象

        students[3] = ss;
        System.out.println(students[5]);

        
    }
}
