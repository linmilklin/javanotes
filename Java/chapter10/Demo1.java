package chapter10;

public class Demo1 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
                                                //异常的最高父类是 Throwable
                                                //Throwable 的直接子类只有 Error 和 Exception
        try{                                
            System.out.println(1/0);                              
                                                /*
                                                try捕获异常代码：将可能出现异常的代码都放在 try 代码块中，
                                                    try 语句块中发现异常，剩下的语句将不再执行
                                                */
            System.out.println(a[3]);           
        }catch(ArithmeticException e){                  //异常捕获顺序先小后大
            System.out.println(1/1);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(a[3/3]);
        }catch(Exception e){

        }
        
    }
}
