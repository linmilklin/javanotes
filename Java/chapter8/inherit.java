package chapter8;

//父类、基类
public class inherit {
    protected String idCard;        //protected 设置仅限子类访问权限(更安全)
    String name;
    int age;

    public void name(String newName){
        System.out.println("家庭"+newName); 
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
