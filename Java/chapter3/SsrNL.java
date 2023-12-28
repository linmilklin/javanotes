import java.util.*;
public class SsrNL{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入年龄");
		int nl = sc.nextInt();
		if(nl >= 18){
			System.out.println("已成年");
		}else{
			System.out.println("未成年");
		}
		
	}
}
