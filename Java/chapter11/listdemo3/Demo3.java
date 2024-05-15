package chapter11.listdemo3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {

        //集合没有尖括号时可存任何数据
        ArrayList o = new ArrayList();
        o.add(123);
        o.add(new Demo3());//可使用但不安全的添加方式

        //添加尖括号后，只能往集合添加尖括号对应类型数据
        ArrayList<String> s = new ArrayList<String>();

        
        //集合规定时使用基本数据类型，需要使用其包装类
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Character> charList = new ArrayList<Character>();
        
        ArrayList<Byte> byteList = new ArrayList<Byte>();
        ArrayList<Short> shortList = new ArrayList<Short>();
        ArrayList<Long> longList = new ArrayList<Long>();
        ArrayList<Float> floatList = new ArrayList<Float>();
        ArrayList<Double> doubleList = new ArrayList<Double>();
        ArrayList<Boolean> booleanList = new ArrayList<Boolean>();



        /*
         *     推荐的集合写法
         */
        List<Integer> listOne = new ArrayList<>();
        Set<Character> setOne = new HashSet<>();
    }
}
