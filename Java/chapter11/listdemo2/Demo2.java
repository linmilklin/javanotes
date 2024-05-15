package chapter11.listdemo2;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();

        //增加
        boolean b1 = set.add(147);
        boolean b2 = set.add(147);  // Hash中存在相同的元素，发生哈希碰撞，无法存入
        boolean b3 = set.add(258);
        System.out.println(b1);
        System.out.println(b2);

        System.out.println(set);

            System.out.println(set.toArray());


        //删除
        set.remove(258);
        System.out.println(set);

        //contains  判断是否包涵某个元素
        boolean b4 = set.contains(1);
        System.out.println(b4);
        //clear 清空
        set.clear();
        //  isEmpty    判断集合是否为空
        System.out.println(set.isEmpty());

        //  size    返回集合中数据的数量
        System.out.println(set.size());
        
        
        //迭代器:遍历
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Object o = i.next();    //接收
            System.out.println(o);
        }
        //迭代器2
        Iterator<String> stringIterator = set.iterator();

    }
}
