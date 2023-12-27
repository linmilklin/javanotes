package chapter4;

public class Person {
   

    int id;
    String name;
    char sex;

    public void run(int quan){
        System.out.println("跑了"+quan+"圈"); 
    }    
    public void sleep(){
        System.out.println("睡觉");
    }
    public String makeMoney(String jobName,int salary){
        return "做"+jobName+"挣了"+salary;
    }
    
    
}
