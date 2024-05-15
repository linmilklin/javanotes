package chapter11.listdemo;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.READER;

import org.omg.CORBA.PUBLIC_MEMBER;

import chapter9.abstract111;
import javafx.scene.control.Alert;

public class Core {
    // 增 删 改 查
    String title;
    int id;
    private ArrayList add = new ArrayList();

    //增
    public boolean add (Object a){
        add.add(a);
        add.add(2, "GAR");
        return true;
    }
    public void add (int g,Object a){
        add.add(a);
        add.add(2, "GBR");
        
    }



    //删
    public Object delete(Object b){
        add.remove(b);
        return true;
    }


    //改
    public boolean update(int a,Object c){
        add.set(a, c);
        return update(a, c);
    }

    
    //查单
    public Object getOne(int index){
        Object f = add.get(index-1);
        return f;
    }
    //查单2
    public Object getTwo(int index){
        return add.get(index+2);
    }

    //查全部(遍历)
    public ArrayList getN(){
        return add;
    }

    public static void main(String[] args) {

    }
}
