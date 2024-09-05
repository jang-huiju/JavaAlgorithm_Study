package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 만들수없는금액 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		//배열크기
		int n=Integer.parseInt(st.nextToken());
		 st=new StringTokenizer(bf.readLine());
		 //최소값
		 int result=1;
		 //배열입력
		 int[] arr=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 //오름차순 정렬
		 Arrays.sort(arr);
		 for(int i : arr) {
			 //최솟값이 i보다 작을 경우 
			 if(result<i) {
				 break;
			 }
			 //아닐경우 i 더하기
			 result+=i;
		 }
		 System.out.println(result);
	}

}