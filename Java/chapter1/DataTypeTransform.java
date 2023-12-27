public class DataTypeTransform{
	public static void main(String[] args){
		/*
		基本数据类型的转化原则：
			1.容量小的自动转化为容量大的
			2.容量大的转化为容量小的，需要添加强制转化符，但可能会损失精度
			3.byte、short、char进行运算时会先转化为int
			4.多种类型的混合运算，优先转化为容量大的
		*/
		byte b = (byte)300; //int → byte
		System.out.println(b);
		
		short a = b;
		int c = a+b;
		System.out.println(c);
		
		System.out.println("1%10=1");
		System.out.println("余数=被除数-除数*商= 1-10*0=1");
		
	}
	
}