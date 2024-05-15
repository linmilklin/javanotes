package chapter7;

public class StringTest {
    public static void main(String[] args) {
        String one = "111";
        one = "111111";
            //String不可更改是指在内存中不可更改，如上111被保存在内存中，而是在内存中新创建一个111111

        String a = "1" + "2";
        char[] c = { '3', '3', '2', '2', '3', '3' };
        String oc = new String(c, 3, 3);

        System.out.println(oc);
        System.out.println(789%10);
    }
}
