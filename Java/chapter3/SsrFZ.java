import java.util.*;
public class SsrFZ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//½×ÌÝ×´Ò»µ½¾Å
		for(int a = 1;a <=9 ; a++){
			System.out.println(" ");
			for(int b = 1;b <= a;b++){
				System.out.print(b+" ");
			}
		}
		
		//¾Å¾Å³Ë·¨±í
		for(int c = 1;c <= 9; c++){
			System.out.println(" ");
			for(int f = 1;f <= c;f++){
				System.out.print(c+"*"+f+"="+(c*f)+";");
			}
		}
		
		//µ¹Á¢
		for(int a = 1;a <=9 ; a++){
			System.out.println(" ");
			for(int b = 9;b >= a;b--){
				System.out.print("* ");
			}
		}
		
		//¿¿ÓÒ
		for(int a = 1;a <=9 ; a++){
			System.out.println(" ");
			for(int c = 1;c <= 9-a;c++){
				System.out.print(" ");
			}
			for(int b = 1;b <= a;b++){
				System.out.print("*");
			}
		}
		
		//½ð×ÖËþ
		for(int a = 1;a <=9 ; a++){
			System.out.println(" ");
			for(int c = 1;c <= 9-a;c++){
				System.out.print(" ");
			}
			for(int b = 1;b <= a;b++){
				System.out.print("* ");
			}
		}
		
		
	}
}