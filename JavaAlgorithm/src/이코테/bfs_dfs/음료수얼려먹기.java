package bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 음료수얼려먹기 {
	
	static int N;
	static int M;
	static int[][] array;
	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		//배열크기
		StringTokenizer st=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		//배열 입력
		array=new int[N][M];
		for(int i=0;i<N;i++) {
			String[] num=bf.readLine().split("");
			for(int j=0;j<M;j++) {
				array[i][j]=Integer.parseInt(num[j]);
			}
		}
		//아이스크림 갯수
		int count=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(dfs(i,j)) {
					count++;
				}
			}
		}
		System.out.println(count);
		

	}
	static boolean dfs(int x,int y) {
		//범위벗어나면
		if((x<0 || y<0) || (x>=N || y>=M)) {
			return false;
		}
		//방문하지않거나 구멍이 뚫려있다면
		if(array[x][y]==0) {
			array[x][y]=1;
		//상하좌우
		dfs(x-1,y);
		dfs(x+1,y);
		dfs(x,y-1);
		dfs(x,y+1);
		return true;
		}
		return false;
	}

}
