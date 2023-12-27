package chapter5;

import org.omg.CORBA.INTERNAL;

public class WorkOne {
    public void changOne(int a,int b){      //声明对象
        int c = a;
        a = b;
        b = c;

    }


    public void changTwo(int[] two){    //数组
        int c = two[0];
        two[0]=two[1];
        two[1]=c;
    }


        public void changThree(String one,String two){
        String c = one;
        two = one;
        one = two;
    }


    public static void main(String[] args) {
        
    //1.基本数据类型表行为值传递，2.引用数据类型表现为引用传递，3.特殊：String是引用数据类型，但是表现为值传递
       
    

    int[] changTwo = new int[2];
    changTwo[0] = 12;
    changTwo[1] = 13;

    System.out.println(changTwo[0]);
    System.out.println(changTwo[1]);

    int c = changTwo[0];
    changTwo[0] = changTwo[1];
    changTwo[1] = c;
    System.out.println(changTwo[0]);
    System.out.println(changTwo[1]);

    }
}
