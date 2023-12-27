package chapter6;

//封装：将类的属性藏起来，并提供对外访问的方法
//实体类
public class Student {
    
    char sex;
            //封装开始
    //1.将属性隐藏起来→申请专利
    private int Number;  

    //2.提供对外访问的方法→set、get方法
    public void setNumber(int Number){
        this.Number = Number;
    }
    public int getNumber(){
        return this.Number;
    }
            //封装完成

    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
