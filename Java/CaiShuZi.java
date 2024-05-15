import java.util.Random;
import java.util.Scanner;

public class CaiShuZi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random sj = new Random();
        int s = sj.nextInt(98)+1;      
        for(int i = 1;i<10;i++){
            int c = sc.nextInt();
            if(c < -1){
                System.out.println("错误");
            }else if(c > 99){
                System.out.println("错误");
            }else if(c < s) {
                System.out.println("小了");
            }else if(c > s){
                System.out.println("大了");
                
            }else{
                System.out.println("猜对啦");
                break;
            }
            if(i >= 10){
                System.out.println("正确答案是s");
            }            
        }
    }
}
