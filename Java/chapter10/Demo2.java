package chapter10;

public class Demo2 {

        

    public void hell() throws Exception {   //throws表示一个方法声明可能抛出一个异常    
        System.out.println(1 / 0);
    }

    public void fy(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("aaa");      //throw表示此处抛出一个已定义的异常
        }
    }

    public static void main(String[] args) throws Exception {
        Demo2 d = new Demo2();
        d.hell();
    }

}
