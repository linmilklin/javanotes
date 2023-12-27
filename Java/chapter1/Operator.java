public class Operator{
	public static void main(String[] args){
		//java的运算符有：算数、关系、逻辑、赋值、位
		
		//算数：+ - * / %（百分号叫取模或求余） ++ -- （自加、自减）
		int one = 12%-7;
		System.out.println(one);
		System.out.println(10086%651);
		
		int a = 2;
		System.out.println(a++);//2 （++在数字后，先执行语句再+1）
		System.out.println(a);//3
		
		int b = 2;
		System.out.println(++b);//3	（++在数字前，先+1再执行语句）
		System.out.println(b);//3
		
		int c = 2;
		int d = 2;
		int e = ++a + (b++) - (--c)+d--;
		System.out.println(e);
		
		
		//关系:    >    <      >=       <=       ==     !=
		//判断值  大于 小于 大于等于 小于等于   等于  不等于
		//关系表达式执行结果为boolean，及输出结果为true或false
		
		int f = 3;
		int g = 4;
		boolean h = ++f == g--;
		System.out.println(h);
		System.out.println(f != g);
		
		
		//逻辑： ！(非) &(逻辑与) |(逻辑或) &&(短路与) ||(短路或) ^(异或)
		/*
			非：判断真假， 假为真，真为假
			与：同为真才是真，有一个为假就是假
			或：同为假才是假，有一个为真就是真
			异或：不同时为真或不同时为假就是真
			
			短路与：&&前的为假，后面的不再运算;
							若前面为真，则后面的仍要运算
			短路或：||前面的为真，后面的不在运算;
							若前面为假，则后面的仍要运算
		*/
		
		boolean i = 1 == 2;
		boolean j = 1 <= 2;
		
		boolean k = !i;
		boolean l = !j;
		boolean m = j ^ k;
		boolean n = l ^ k;

		System.out.println(i);
		System.out.println(j);
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		
		boolean o = i && k;
		boolean p = j && k;
		System.out.println(o);
		System.out.println(p);
		
		
		//赋值: = += -= *= /= %=
		int q = 1;
		q += 3;	//等同于q = q + 3
		byte r = 2;
				//r = r + 3;会报错，则用下面的方法
		r += 3;	//不报错，会自动进行赋值转换
		System.out.println(q);
		System.out.println(r);
		
		//位： <<(左移) >>(右移) ~(按位反移) &(按位与) |(按位或) ^(按位异或) <<(无符号左移)
			//例：计算2的3次方的方式  2 << 2
		System.out.println(2 << 2);
			
		
		//三目运算符： ? :
		
			/*设 表达式1 ? 表达式2 ：表达式3
			表达式1 的值为true则最终结果为表达式2 的结果；
			表达式1 的值为flose则最终结果为表达式3 的结果
			
			注：表达式2和表达式3的结果类型必须相同或兼容
			*/
		int s = 1 < 2?3:4;
		int t = 1 > 2?3:4;
		System.out.println(s);
		System.out.println(t);
	}
}