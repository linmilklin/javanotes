class DataType{
	public static void main(String[] args){
		//����Ĭ��Ϊint
		System.out.println("����Ĭ��Ϊint");
		byte age = (byte)300;// (byte)ǿ������ת������intת��Ϊbyte�������ܻ���ʧ����
		byte dsfs = (byte)127;// -128~127
		System.out.println(age);
		System.out.println(dsfs);
		
		short ages = 128;// -2^15~2^15-1
		System.out.println(ages);
		
		int agei = 681;// -2^31~2^63-1
		System.out.println(agei);
		
		long agel = 999999999999999999L;// -2^63-1~2^63-1   long�����ֺ�+L������Ĭ��Ϊint
		System.out.println(agel);
		
		int a1 = 65;//10����
		int a2 = 020;//0��ͷΪ8����
		int a3 = 0XF;//0X��ͷΪ16����
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		//������Ĭ��Ϊdouble
		float price = 3.0F;//32λ
		
		double price3 = 3.1415926535;//64λ
		
		System.out.println(price);
		System.out.println(price3);
		
		//�ַ���Ĭ��Ϊ'\u0000'
		//�ַ���ֻ�� �������֡���ĸ�����š����֣��ַ���Ҫʹ�õ�����''
		char c1 = '\u4e2d';
		char c2 = '\u56fd';
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '1';
		char c4 = '*';
		System.out.println(c3);
		System.out.println(c4);
		
		
		char c11 = '\u6211';
		char c12 = '\u7231';
		char c13 = '\u4f60';
		System.out.println(c11);
		System.out.println(c12);
		System.out.println(c13);
		
		System.out.println('\u0000');
		
		//������Ĭ��Ϊfalse
		boolean hj = false;
		System.out.println(hj);
		boolean jl = true;
		System.out.println(jl);
		
		int a = 3;
		int b = 2;
		int c = 1;
		System.out.println(a>b);
		System.out.println(c>b);
		
		
		
		String name = "xiaobai";
		String s = name + 123;
		//String���κ�������ת��ΪString
	}
}