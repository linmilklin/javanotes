import java.util.*;
public class SsrWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int s = 1;
		while(s <= 5){
			System.out.println(s);
			s++;
		}
		
		int x = 1;
		while(x <= 4){
			System.out.print("*");
			x++;
		}
		
		
		int xc = 1;
		while(xc < 5){
			System.out.println("* * * *");
			xc++;
		}
		
		
		
		
		int x2 = 1;
		while(x2 < 5){
			System.out.println(" ");
			x2++;
			int xx = 1;
			while(xx < 5){
				System.out.print("* ");
				xx++;
			}
		}
		
		
		int c = 0;
		
		while(c < 9){
			System.out.println("");
			c++;
			int f = 1;
			while(f <= c){
				System.out.print(c+"*"+f+"="+(c*f)+";");
				f++;
			}
		}
			
	}
}