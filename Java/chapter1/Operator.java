public class Operator{
	public static void main(String[] args){
		//java��������У���������ϵ���߼�����ֵ��λ
		
		//������+ - * / %���ٷֺŽ�ȡģ�����ࣩ ++ -- ���Լӡ��Լ���
		int one = 12%-7;
		System.out.println(one);
		System.out.println(10086%651);
		
		int a = 2;
		System.out.println(a++);//2 ��++�����ֺ���ִ�������+1��
		System.out.println(a);//3
		
		int b = 2;
		System.out.println(++b);//3	��++������ǰ����+1��ִ����䣩
		System.out.println(b);//3
		
		int c = 2;
		int d = 2;
		int e = ++a + (b++) - (--c)+d--;
		System.out.println(e);
		
		
		//��ϵ:    >    <      >=       <=       ==     !=
		//�ж�ֵ  ���� С�� ���ڵ��� С�ڵ���   ����  ������
		//��ϵ���ʽִ�н��Ϊboolean����������Ϊtrue��false
		
		int f = 3;
		int g = 4;
		boolean h = ++f == g--;
		System.out.println(h);
		System.out.println(f != g);
		
		
		//�߼��� ��(��) &(�߼���) |(�߼���) &&(��·��) ||(��·��) ^(���)
		/*
			�ǣ��ж���٣� ��Ϊ�棬��Ϊ��
			�룺ͬΪ������棬��һ��Ϊ�پ��Ǽ�
			��ͬΪ�ٲ��Ǽ٣���һ��Ϊ�������
			��򣺲�ͬʱΪ���ͬʱΪ�پ�����
			
			��·�룺&&ǰ��Ϊ�٣�����Ĳ�������;
							��ǰ��Ϊ�棬��������Ҫ����
			��·��||ǰ���Ϊ�棬����Ĳ�������;
							��ǰ��Ϊ�٣���������Ҫ����
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
		
		
		//��ֵ: = += -= *= /= %=
		int q = 1;
		q += 3;	//��ͬ��q = q + 3
		byte r = 2;
				//r = r + 3;�ᱨ����������ķ���
		r += 3;	//���������Զ����и�ֵת��
		System.out.println(q);
		System.out.println(r);
		
		//λ�� <<(����) >>(����) ~(��λ����) &(��λ��) |(��λ��) ^(��λ���) <<(�޷�������)
			//��������2��3�η��ķ�ʽ  2 << 2
		System.out.println(2 << 2);
			
		
		//��Ŀ������� ? :
		
			/*�� ���ʽ1 ? ���ʽ2 �����ʽ3
			���ʽ1 ��ֵΪtrue�����ս��Ϊ���ʽ2 �Ľ����
			���ʽ1 ��ֵΪflose�����ս��Ϊ���ʽ3 �Ľ��
			
			ע�����ʽ2�ͱ��ʽ3�Ľ�����ͱ�����ͬ�����
			*/
		int s = 1 < 2?3:4;
		int t = 1 > 2?3:4;
		System.out.println(s);
		System.out.println(t);
	}
}