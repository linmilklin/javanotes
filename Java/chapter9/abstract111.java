package chapter9;

public abstract class abstract111 {         // abstract为抽象类，天生当爹，需要和extends配合使用
                                            // 抽象类的子类必须重写父类的方法

        //抽象类可同时存在抽象方法和非抽象方法
    public void name(String newName) {  //非抽象方法
        System.out.println(newName);
    }

    public abstract void cx();  // 抽象方法

    public static void main(String[] args) {

    }
}
