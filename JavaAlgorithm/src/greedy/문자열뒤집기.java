package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ���ڿ������� {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		//���ڸ� int������ ù��° ����
		int n=str.charAt(0)-'0';
		int count_1=0; //1�� �ٲٴ� ���
		int count_0=0; //0�� �ٲٴ� ���
		if(n=='1') { //ù��° ���� ó��
			count_0++; 
		}else {
			count_1++;
		}
		for(int i=0;i<str.length()-1;i++) {
			// i��° ���ҿ� i+1���Ұ� �����ʴٸ�
			if(str.charAt(i)!=str.charAt(i+1)) {
				//0�ϰ�� 1�� �ٲٴ� Ƚ�� �߰�
				 if(str.charAt(i+1)=='0') {
					 count_1++;
				//1�ϰ�� 0���� �ٲٴ� Ƚ�� ����
				 }else {
					 count_0++;
				 }
			}
		}
		System.out.println(Math.min(count_1, count_0));
	}

}
