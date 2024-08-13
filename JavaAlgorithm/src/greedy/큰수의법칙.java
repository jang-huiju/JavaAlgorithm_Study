package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 큰수의법칙 {

	public static void main(String[] args) throws IOException {
	    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(bf.readLine());
	    int n=Integer.parseInt(st.nextToken());
	    int m=Integer.parseInt(st.nextToken());
	    int k=Integer.parseInt(st.nextToken());
	    int[] arr=new int[n];
	    st=new StringTokenizer(bf.readLine());
	    //배열 입력
	    for(int i=0;i<n;i++) {
	        arr[i]=Integer.parseInt(st.nextToken());
	    }
	    //오름차순 정렬
	    Arrays.sort(arr);
	    int first=arr[arr.length-1];
	    int second=arr[arr.length-2];
	    int result=0;
	    //횟수가 0이 안될때까지 반복
	    while(m!=0) {
	        //가장 큰수 k 번 더함
	        for(int i=0;i<k;i++) {
	            result+=first;
	            m--;
	        }
	        //k횟수 넘으면 두번째로 가장 큰수 한번 더하기
	        result+=second;
	        //한번 더할때마다 빼기
	        m--;
	    }
	    System.out.println(result);
	}

}