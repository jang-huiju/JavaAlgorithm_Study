package 구현;

import java.util.Scanner;

public class 왕실의나이트 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//위치입력받기
		String str=sc.nextLine();
		//체스말 움직일수있는 좌표
		int[][] direction= {{-2,-1},{-2,1},{2,-1},{2,1},{-1,-2},{1,-2},{-1,2},{1,2}};
		//결과값 : 이동할수있는 경우의 수
		int result=0;
		//행
		int x=(int)(str.charAt(0)-'a')+1;
		//열
		int y=str.charAt(1)-'0';
		for(int i=0;i<direction.length;i++) {
				//열
				int col=y+direction[i][1];
				//행
				int row=x+direction[i][0];
				//범위에 벗어나지않는다면 경우의수 +1추가
				if((col>0 && col<=8) &(row>0 && row<=8)) {
					//System.out.println(col+": "+row);
					result++;
				}
				
		}
		System.out.println(result);
	}

}
