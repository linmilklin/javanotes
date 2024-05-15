import java.util.Random;
import java.util.Scanner;
import java.io.*;



public class shijianbu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random sj = new Random();
        int sjb = sj.nextInt(3);
        if( sjb == 0){
            System.out.println("石头");
        }else if(sjb == 1){
            System.out.println("剪刀");
        }else if(sjb == 2){
            System.out.println("布");
        }
        System.out.println(File.separator);
    }
}
