package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ���������� {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		//�迭ũ���Է�
		int n=Integer.parseInt(st.nextToken());
		//���� �ִ� ����
		int m=Integer.parseInt(st.nextToken());
		//����� ��
		int result=0;
		int[] arr=new int[n];
		st=new StringTokenizer(bf.readLine());
		//�迭�Է�
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n-1;i++) {
			//i+1���� n���� ����
			for(int j=i+1;j<n;j++) {
			//���԰� �����ʴٸ� ���ϱ�
			if(arr[i]!=arr[j]) {
				result++;
			}
			}
		}
		System.out.println(result);
	}

}
