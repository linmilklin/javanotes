public class DataTypeTransform{
	public static void main(String[] args){
		/*
		�����������͵�ת��ԭ��
			1.����С���Զ�ת��Ϊ�������
			2.�������ת��Ϊ����С�ģ���Ҫ���ǿ��ת�����������ܻ���ʧ����
			3.byte��short��char��������ʱ����ת��Ϊint
			4.�������͵Ļ�����㣬����ת��Ϊ�������
		*/
		byte b = (byte)300; //int �� byte
		System.out.println(b);
		
		short a = b;
		int c = a+b;
		System.out.println(c);
		
		System.out.println("1%10=1");
		System.out.println("����=������-����*��= 1-10*0=1");
		
	}
	
}