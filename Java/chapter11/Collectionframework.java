package chapter11;

import java.util.ArrayList;

import javax.jws.Oneway;

public class Collectionframework {
    public static void main(String[] args) {

        System.out.println("Collection");
        //List接口中，元素可重复
        //Set接口中，元素不可重复

        ArrayList one = new ArrayList<>();

        //名字+add 增
        one.add(5);
        one.add("AVS");
        System.out.println(one);
        one.add(1, 7);  //在指定下标处增加元素，原下标元素后移
        one.add(3,"REQ");
        System.out.println(one);

        //名字+remove 删
        one.remove(0);  // 移除指定下标的元素 (推荐)
        one.remove("AVS");  //移除指定元素
        System.out.println(one);

        //名字+set 改
        one.set(0, "frist");    // 修改
        System.out.println(one);

        //名字+get 查
        Object i = one.get(0);      //将one中下标为0的元素提取到变量o中
        System.out.println(i);

        int size = one.size();      //集合的大小
        System.out.println(size);


        //集合的遍历
        for(int K = 0;K<one.size();K++){
            Object d = one.get(K);
            System.out.println(d);
        }


        //  增强for循环
        for(Object z:one){

            System.out.println(z);

        }

    }
}
