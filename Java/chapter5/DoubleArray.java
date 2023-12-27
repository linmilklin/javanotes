package chapter5;

import javax.sound.midi.Soundbank;

public class DoubleArray {
    public static void main(String[] args) {
        
    
        int[] one = new int[7];

        int[][] two = new int[7][7];    //第一个指行数，第二个指每行的列数
        int[][] two2 = {{1,2,3,4,5,6,7},{1,2,6,7},{1,2,3,4,5,6,7}};
        two[5][5]=25;       //第6行第6列
        System.out.println(two[5][5]);

        int fangwen = two[6][6];    //第7行第7列
        System.out.println(fangwen);

        System.out.println(two2[0][0]);     //第1行第1列

        //一维数组的遍历
        for(int a = 0;a<one.length;a++){
            System.out.print(a);
        }

        //二维数组的遍历
        for(int b=0;b<two2.length;++b){
            System.out.println("");
            for(int c=0;c<two2[b].length;c++){
                System.out.print(two2[b][c]);
            }
        }
        
        System.out.println("--------------------------------------------");        

        //输出二维数组的行数
        for(int b=0;b<two2.length;++b){
            System.out.println(two2[b].length);
        }
        
    }
}
