package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ���ڿ������� {

	public static void main(String[] args) throws IOException {
		//���ڿ� �߰�,�����Ҽ��ִ� �Լ�
		StringBuilder sb = new StringBuilder();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// String ���ڿ���  char�� �迭�� �ٲ��� =>toCharArray()
		char[] str;
		//���ڿ� �Է¹ޱ�
		str=br.readLine().toCharArray();
		//�������� ����
		Arrays.sort(str);
		//����
		int sum=0;
		for(int i=0;i<str.length;i++) {
			//���ڸ� �Ǵ��ϴ� �Լ� �����̸�  true  �ƴϸ� false
			if(Character.isDigit(str[i])){
				sum+=str[i]-'0';
			}else {
				//���ڿ��߰�
				sb.append(str[i]);
			}
		}
		System.out.println(sb.toString()+sum);
		

	}

}
