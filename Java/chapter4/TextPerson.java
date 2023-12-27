package chapter4;

public class TextPerson {
    public static void main(String[] args) {
        Person p = new Person();

        p.id = 1;
        p.name = "界";
        p.sex = '男';

        System.out.println(p.id);
        System.out.println(p.name);
        System.out.println(p.sex);

        p.run(100);
        
        new Person().sleep();

        String make = p.makeMoney("修行", 100000000);
        System.out.println(make);

    }
    
}
