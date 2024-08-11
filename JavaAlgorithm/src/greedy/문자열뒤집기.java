package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 문자열뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		//문자를 int형으로 첫번째 원소
		int n=str.charAt(0)-'0';
		int count_1=0; //1로 바꾸는 경우
		int count_0=0; //0로 바꾸는 경우
		if(n=='1') { //첫번째 원소 처리
			count_0++; 
		}else {
			count_1++;
		}
		for(int i=0;i<str.length()-1;i++) {
			// i번째 원소와 i+1원소가 같지않다면
			if(str.charAt(i)!=str.charAt(i+1)) {
				//0일경우 1로 바꾸는 횟수 중가
				 if(str.charAt(i+1)=='0') {
					 count_1++;
				//1일경우 0으로 바꾸는 횟수 증가
				 }else {
					 count_0++;
				 }
			}
		}
		System.out.println(Math.min(count_1, count_0));
	}

}
