import java.util.*;
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		for(int i = 1;i <= 100;i++){
			if(i == 8){
				break;	//��������ʱ ��ǰ������ǰͬ����ѭ��	
			}
		}
		
		abc:for(int i = 1;i <= 100;i++){
			if(i == 8){	//��ǰ����
				break abc;	//�ڲ�ִ��ʱͬʱ����������ͬ��ѭ������֪���������Ƽ�ʹ��
			}
		}
		
		for(int i = 1;i <= 10;i++){
			if(i == 9){
				continue;	//�������������� ���� ѭ��
			}
		}
		
		
    }
}
