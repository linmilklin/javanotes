import java.util.*;

/**
 * 定义一个 PerformanceAnalysis 类
 * 
 * @author lanqiao
 */
public class compute {

   /**
    * 控制台输入数组长度和数组元素，需要注意成绩可能不是整数，因此使用 double 类型的数组
    * 
    * @return 包含输入元素的数组
    */
   public static int[] iff(int []) {
      System.out.println("请输入要输入的成绩数长度");
      Scanner sc = new Scanner(System.in);
      int cd = sc.nextInt();
      int[] cc = new int[cd];
      for (; cd > 0; cd--) {
         int cj = sc.nextInt();
         System.out.println("请输入下一个数");
         cc[cd] = sc.nextInt();

      }
      
   }

   /**
    * 计算平均成绩
    * 
    * @param array 包含所有成绩的数组
    * @return 平均成绩
    */
   public static double average(double[] array) {
      
      System.out.println();

   }

   /**
    * 传入成绩数组和平均成绩，统计成绩大于平均成绩的人数
    * 
    * @param array   成绩数组
    * @param average 平均成绩
    * @return 大于平均成绩的人数
    */
   public static int averageNum(double[] array, double average) {
      
   }

   /**
    * 查找成绩数组中的最大值
    * 
    * @param array 成绩数组
    * @return 最大值
    */
   public static double findMax(double[] array) {
      
   }

   /**
    * 查找成绩数组中的最小值
    * 
    * @param array 成绩数组
    * @return 最小值
    */
   public static double findMin(double[] array) {
      
   }

   /**
    * 统计及格人数
    * 
    * @param array 成绩数组
    * @return 及格人数
    */
   public int passNum(double[] array) {
      
   }

   /**
    * 程序的入口
    * 调用上面的方法，完成功能
    */
   public static void main(String[] args) {
      return;
   }
}
