import java.util.*;
public class Ssr{

	String p;		//声明属性
	double d;


	public int a (int aa){		//声明方法
		return aa;
	}

	String mc;
    String dz;
    String xz;
    public void school(){
        System.out.println("学校名称："+mc+"，学校地址："+dz+"，校长："+xz);
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("输入数，判断是否为水仙草数");
		int shu = sc.nextInt();
		int qian = shu/1000;
		int bai = shu/100%10;
		int shi = shu/10%10;
		int ge = shu%10;
		int guo = qian*qian*qian*qian+bai*bai*bai*bai+shi*shi*shi*shi+ge*ge*ge*ge;
		System.out.println(guo == shu ? guo+"是水仙草":guo+"不是水仙草");


		String p = "安兹·乌尔·恭";
		double d = 3.1415926535897932384626433832795028841971;
		int s = p.length();
		System.out.println(s);	//输出选定标签的元素个数

		Ssr r = new Ssr();
        r.mc="剑桥";
        r.dz="英国";
        r.xz="斯蒂芬·图普";
        
        r.school();

		String z1 = "美猴王";
		String z2 = new String("美猴王");
		System.out.println(z1==z2);			//判断两个元素是否相等
		System.out.println(z1.equals(z2));	//判断两个值是否相等

	}
}
