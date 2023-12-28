import java.util.*;
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		for(int i = 1;i <= 100;i++){
			if(i == 8){
				break;	//符合条件时 提前结束当前同级的循环	
			}
		}
		
		abc:for(int i = 1;i <= 100;i++){
			if(i == 8){	//提前结束
				break abc;	//内层执行时同时结束名字相同的循环，能知道，但不推荐使用
			}
		}
		
		for(int i = 1;i <= 10;i++){
			if(i == 9){
				continue;	//结束符合条件的 单次 循环
			}
		}
		
		
    }
}
