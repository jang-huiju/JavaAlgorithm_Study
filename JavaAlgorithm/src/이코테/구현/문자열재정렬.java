package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 문자열재정렬 {

	public static void main(String[] args) throws IOException {
		//문자열 추가,수정할수있는 함수
		StringBuilder sb = new StringBuilder();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// String 문자열을  char형 배열로 바꿔줌 =>toCharArray()
		char[] str;
		//문자열 입력받기
		str=br.readLine().toCharArray();
		//오름차순 정렬
		Arrays.sort(str);
		//총합
		int sum=0;
		for(int i=0;i<str.length;i++) {
			//숫자를 판단하는 함수 숫자이면  true  아니면 false
			if(Character.isDigit(str[i])){
				sum+=str[i]-'0';
			}else {
				//문자열추가
				sb.append(str[i]);
			}
		}
		System.out.println(sb.toString()+sum);
		

	}

}