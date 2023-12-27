package chapter4;

public class Variable {
    

    int c = 1;  //全局变量(成员变量、实例变量)
                //全局变量可在所有地方调用
    static int f = 100; //static 静态全局变量
    
    public void aPlusB(){
        int d = 0;  //局部变量，作用范围在大括号里
    }

    int e = 2;  //全局变量
}
