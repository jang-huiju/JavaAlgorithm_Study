package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ū���ǹ�Ģ {

	public static void main(String[] args) throws IOException {
	    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(bf.readLine());
	    int n=Integer.parseInt(st.nextToken());
	    int m=Integer.parseInt(st.nextToken());
	    int k=Integer.parseInt(st.nextToken());
	    int[] arr=new int[n];
	    st=new StringTokenizer(bf.readLine());
	    //�迭 �Է�
	    for(int i=0;i<n;i++) {
	        arr[i]=Integer.parseInt(st.nextToken());
	    }
	    //�������� ����
	    Arrays.sort(arr);
	    int first=arr[arr.length-1];
	    int second=arr[arr.length-2];
	    int result=0;
	    //Ƚ���� 0�� �ȵɶ����� �ݺ�
	    while(m!=0) {
	        //���� ū�� k �� ����
	        for(int i=0;i<k;i++) {
	            result+=first;
	            m--;
	        }
	        //kȽ�� ������ �ι�°�� ���� ū�� �ѹ� ���ϱ�
	        result+=second;
	        //�ѹ� ���Ҷ����� ����
	        m--;
	    }
	    System.out.println(result);
	}

}
