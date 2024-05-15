package chapter10;

public class Demo3 {

    public static void main(String[] args) throws Exception{
        //调用方法：被调用方法的对象.方法名(实参列表)
        Demo3 d = new Demo3();
        d.yichang();
    }                                               //异常要写在main方法后


    public void yichang2() throws Exception{
        System.out.println(1 / 1);
    }

    public void yichang() {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println(1 / 0);
        }finally{                               //finally中的代码无条件执行
            System.out.println("结束");         
        }                                       //catch和finally都要跟在try后

    }
}
