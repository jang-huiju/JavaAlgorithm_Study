package greedy;

import java.util.Scanner;

;

public class ���ϱ�Ȥ�����ϱ� {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//����ū��
		int result=1;
		for(int i=0;i<str.length();i++) {
			//���ڷ� ��ȯ
			int num=str.charAt(i)-'0';
			//����� 1�϶� ���ڰ� 1�����϶� ���ϱ�
			if(num<=1 || num<=1 ) {
				result+=num;
			//�ƴҶ� ���ϱ�
			}else {
				result*=num;
			}
		}
		System.out.println(result);
	}

}
