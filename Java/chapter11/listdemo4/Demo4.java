package chapter11.listdemo4;

import java.util.HashMap;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {

        //Map中的key是不能重复的

                //key↓   value↓                  
        HashMap<Integer,String> map = new HashMap<>();

        //put 增加修改
        map.put(165, "尤贝尔");
        map.put(171, "菲伦");
        System.out.println(map.put(161, "芙莉莲"));

        //删除  根据key值删除
        map.remove(171);

        //查询  根据key值得到value
        System.out.println(map.get(165));

        //返回集合中的数量
        System.out.println(map.size());

        // containskey 判断map集合中是否包含特定key
        System.out.println(map.containsKey(165));

        // containsValue 判断map集合是否包含特定value
        System.out.println(map.containsValue("尤贝尔"));

        // keySet 将map中的key值全部添加到Set中
        Set<Integer> a = map.keySet();
        System.out.println(a);

        for(Integer b:a){
            System.out.println(b);
            System.out.println(map.get(b));
        }
    }
}
