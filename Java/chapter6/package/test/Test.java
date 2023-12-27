package test;
import vo.Dog;
      //vo.*; 是vo文件夹下所有可使用
public class Test{
	public static void main(String[] args){
	Dog d = new Dog();
	//vo.Dog d = new vo.Dog();	使用其他文件夹的方式
	System.out.println(d);	
	}
}