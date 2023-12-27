package chapter5;

public class Work {
    public void getMaxOne(int a,int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        System.out.println(a > b?a:b);

    }

    public int getMaxTwo(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public int getMaxThree(int[] a){
        int max = a[0];
        for(int i = 1;i<=a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Work w = new Work();
        w.getMaxOne(0, 0);
        int g = w.getMaxTwo(0, 0);
    }
}
