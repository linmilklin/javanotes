package chapter6;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(101);
        p.setName("夏提雅");

        System.out.println(p.getId());
        System.out.println(p.getName(null));

        Person e = new Person();
        e.setId(101);
        e.setName("雅儿贝德");
        System.out.println(e.getId());
        System.out.println(e.getName(null));

    }
}
