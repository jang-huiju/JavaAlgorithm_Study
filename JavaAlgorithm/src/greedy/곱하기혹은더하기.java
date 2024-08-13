package greedy;

import java.util.Scanner;

;

public class 곱하기혹은더하기 {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//가장큰수
		int result=1;
		for(int i=0;i<str.length();i++) {
			//숫자로 변환
			int num=str.charAt(i)-'0';
			//결과가 1일때 숫자가 1이하일때 더하기
			if(num<=1 || num<=1 ) {
				result+=num;
			//아닐때 곱하기
			}else {
				result*=num;
			}
		}
		System.out.println(result);
	}

}