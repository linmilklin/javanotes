import java.util.*;
public class XunHuanWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//while循环为true时无限循环
		int i = 0;
		while(i <=11){
			System.out.println("N");
			i=i+3;
			
		}
		System.out.println(i);
		
		//	while循环
		int x = 1;
		while(x <= 9){
			System.out.println("* ");
			x++;
			int o = 1;
			while(o < x ){
				System.out.print("* ");
				o++;
			}
		}
		
		//	do{}while循环	先执行后判断
		int a = 1;
		int b = 0;
		int c = 1000;
		do{
			b=b+a;
			a=a+1;
			
		}while(a <= c);
		System.out.println("1~1000和为："+b);

	}
}