package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ��������±ݾ� {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		//�迭ũ��
		int n=Integer.parseInt(st.nextToken());
		 st=new StringTokenizer(bf.readLine());
		 //�ּҰ�
		 int result=1;
		 //�迭�Է�
		 int[] arr=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 //�������� ����
		 Arrays.sort(arr);
		 for(int i : arr) {
			 //�ּڰ��� i���� ���� ��� 
			 if(result<i) {
				 break;
			 }
			 //�ƴҰ�� i ���ϱ�
			 result+=i;
		 }
		 System.out.println(result);
	}

}
