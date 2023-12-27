import java.util.*;
public class SsrTX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("1、矩形");
		System.out.println("2、直角三角形");
		System.out.println("3、等腰三角形");
		System.out.println("4、菱形");
		System.out.println("5、心形");
		System.out.println("-------------------");
		System.out.print("请选择要打印的图形：");
		int i = sc.nextInt();
		for(;i == 1;){
			System.out.print("请输入矩形的高：");
			int jg = sc.nextInt();
			System.out.print("请输入矩形的宽：");
			int jk = sc.nextInt();
			for(;jg >= 1;jg-- ){
				System.out.println(" ");
					
				for(int jk2=jk;jk2 >= 1;jk2--){
					System.out.print("* ");
					
				}
			}
			break;
		}
		
		for(;i == 2;){
			System.out.println("请输入三角形的高：");
			int sg = sc.nextInt();
			
			for(;sg >= 1;sg--){
				System.out.println(" ");
				for(int sg2 = 1;sg2 <= sg;){
					sg++;
					System.out.print("* ");
				}
			
			}
			
			break;	
		}
		
    }
}
