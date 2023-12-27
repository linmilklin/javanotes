package chapter5;

import java.nio.channels.NetworkChannel;

public class ArrayTextOne {
    //数组：相同类型的若干变量，按照一定数据组织起来，集合就数组
        /*特点：
            1.是连续的

        */
        
        public static void main(String[] args) {
            
        

        //声明的方法
        int[] name1;

        int name2[];

        //创建
        name1 = new int[4];

        //声明+创建 数组
        int[] name3 = new int[4];

        //声明+创建+赋值 数组
        int[] name4 = {1,2,3,4};

        int[] name5 = new int[]{1,2,3,4};
        
        String[] names = new String[8888];//数组为String型，有8889个值
         names[87]="爱丽丝";    //赋值

        String s = names[87];//将数组names中的第88个元素赋值给s
                            //数组是从0开始计数，所以[0]是第一个元素
        System.out.println(s);
        System.out.println(names[87]);

        String[] allName = new String[8];
        allName[0] = "零";
        allName[1] = "壹";
        allName[2] = "贰";
        allName[3] = "肆";
        allName[4] = "叁";
        allName[5] = "伍";
        allName[6] = "陆";
        allName[7] = "柒";

        allName[3] = "叁";
        allName[4] = "肆";

        System.out.println(allName[0]);
        System.out.println(allName[1]);
        System.out.println(allName[2]);
        System.out.println(allName[3]);
        System.out.println(allName[4]);
        System.out.println(allName[5]);
        System.out.println(allName[6]);
        System.out.println(allName[7]);

        // .length表示数组的长度，及数组的元素个数
        //常用
        for(int i = 0;i <allName.length;i++){   
            System.out.println(allName[i]);
        }

        //增强for循环，每次循环a会变化到下一个
        //不能修改
        for(String a:allName){      
            System.out.println(a);
        }
    }
}
