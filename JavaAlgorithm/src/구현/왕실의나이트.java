package ����;

import java.util.Scanner;

public class �ս��ǳ���Ʈ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//��ġ�Է¹ޱ�
		String str=sc.nextLine();
		//ü���� �����ϼ��ִ� ��ǥ
		int[][] direction= {{-2,-1},{-2,1},{2,-1},{2,1},{-1,-2},{1,-2},{-1,2},{1,2}};
		//����� : �̵��Ҽ��ִ� ����� ��
		int result=0;
		//��
		int x=(int)(str.charAt(0)-'a')+1;
		//��
		int y=str.charAt(1)-'0';
		for(int i=0;i<direction.length;i++) {
				//��
				int col=y+direction[i][1];
				//��
				int row=x+direction[i][0];
				//������ ������ʴ´ٸ� ����Ǽ� +1�߰�
				if((col>0 && col<=8) &(row>0 && row<=8)) {
					//System.out.println(col+": "+row);
					result++;
				}
				
		}
		System.out.println(result);
	}

}
