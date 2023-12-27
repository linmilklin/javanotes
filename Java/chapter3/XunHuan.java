import java.util.*;
public class XunHuan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//死循环
		/*
		
		for(;;){
			System.out.println("升级");
		}
		
		*/
		//for循环
		/*for(表达式1;表达式2;表达式3){
			循环的代码
		}

			表达式1	为循环初始值
			表达式2 为循环的条件，判断是否循环
			表达式3 为循环一次改变的值
		*/
		
		for(int i = 0;i < 5;i++ ){
			System.out.println("恶");
			
		}
		
		for(int s = 11 ; s < 21 ; s++){
			System.out.print(s-10);		//print没有ln时不换行
	
		}
		for(int s = 11 ; s < 21 ; s++){
			System.out.println(s-10);
	
		}
		
		for(int x = 1 ; x <= 4 ; x++){
			System.out.println("# # # # #");
			for(int x2 = 1 ; x2 <= 4 ; x2++){		//双重for循环
				System.out.println("* * * * *");
				for(int x3 = 1 ; x3 <= 4 ; x3++){		//三重
					System.out.println("% % % % %");
				
				}
			}
		}
		
		for(int a = 1;a < 5;a++){
			System.out.println(" ");	//打印 空字符串+ln 做到换行的效果
			for(int b = 1;b < 5;b++){
				System.out.print("* ");
			}
		}
		
		System.out.println("输入一个数n，组成n*n的图像");
		int n = sc.nextInt();
		
		for(int a=1 ;a<n+1 ;a++){
			System.out.print(n);
			
			for(int b=0 ;b<n ;b++){
				System.out.print("");
			}
		}
			
		
	}
}