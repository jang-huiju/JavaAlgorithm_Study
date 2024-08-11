package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 모험가길드 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		//배열의크기
		int n=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		st=new StringTokenizer(bf.readLine());
		int currentCnt=0; //현재인원수
		int result=0; //최대그룹수
		//배열입력
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		System.out.println(st.countTokens());
		//오름차순 정렬
		Arrays.sort(arr);
		//
		for(int i=arr.length-1;i>0;i--) {
			//인원추가
			currentCnt++;
			//공포도 크기가 현재 인원보다 작을경우
			if (arr[i]<=currentCnt) {
				//그룹 수 추가
				++result;
				//인원수 초기화
				currentCnt=0;
			}
		}
		System.out.println(result);

	}

}
