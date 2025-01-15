

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st=new StringTokenizer(br.readLine());
		 int n=Integer.parseInt(st.nextToken());
		 int m=Integer.parseInt(st.nextToken());
		
		 int gcdResult = gcd(n, m);
	        int lcmResult = lcm(n, m);

	        System.out.println(gcdResult);
	        System.out.println(lcmResult);
		 
		 

	}
	//최대공약수
	 public static int gcd(int a, int b) {
		 
		 while(b!=0) {
			 int temp=b;
			 b=a%b;
			 a=temp;
		 }
		 return a;
		
	 }
	//최소공배수
	 public static int lcm(int a,int b) {
		 return a*b/gcd(a,b);
	 }

}
