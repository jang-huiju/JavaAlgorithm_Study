package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1이될때까지 {

	public static void main(String[] args) throws IOException {
	    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(bf.readLine());
	    int n=Integer.parseInt(st.nextToken());
	    int k=Integer.parseInt(st.nextToken());
	    //횟수
	    int count=0;
	    //임의값
	    int temp=0;
	    //n이 1이 될때까지 반복
	while(n>1) {
	    //나누어지게 만들기
	    temp=(n/k)*k;
	    //나머지는 1씩 빼주니까 횟수로 치환
	    count+=(n-temp);
	    n=temp;
	    //k로 더이상 나눌수없을때 break
	    if(n<k) {
	        break;
	    }
	    //n를 나누어 횟수 추가
	    n=n/k;
	    count+=1;
	}
	System.out.println(count);
	}
	}