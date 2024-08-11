package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 볼링공고르기 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		//배열크기입력
		int n=Integer.parseInt(st.nextToken());
		//공의 최대 무게
		int m=Integer.parseInt(st.nextToken());
		//경우의 수
		int result=0;
		int[] arr=new int[n];
		st=new StringTokenizer(bf.readLine());
		//배열입력
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n-1;i++) {
			//i+1부터 n까지 조사
			for(int j=i+1;j<n;j++) {
			//무게가 같지않다면 더하기
			if(arr[i]!=arr[j]) {
				result++;
			}
			}
		}
		System.out.println(result);
	}

}
