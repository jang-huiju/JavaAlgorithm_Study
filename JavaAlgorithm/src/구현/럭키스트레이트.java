package ����;

import java.util.Scanner;

public class ��Ű��Ʈ����Ʈ {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str=sc.nextLine();
		 int mid=str.length()/2;
		 int l_result=0;
		 int r_result=0;
		 for(int i=0;i<str.length();i++) {
			 if(mid<i+1) {
				 r_result+=str.charAt(i)-'0';
				 
			 }else {
				 l_result+=str.charAt(i)-'0';
			 }
		 }
		 if(l_result==r_result) {
			 System.out.println("LUCKY");
		 }else {
			 System.out.println("READY");
		 }
	}

}
