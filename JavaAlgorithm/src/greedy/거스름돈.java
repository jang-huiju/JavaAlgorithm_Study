package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	    //거스름돈
	    int[] coins= {500,100,50,10};
	    int count=0;
	    //입력받기
	    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(bf.readLine());
	    for(int i=0;i<coins.length;i++) {
	        count+=(n/coins[i]);
	        n=n%coins[i];
	    }
	    System.out.println(count);
	}

}
