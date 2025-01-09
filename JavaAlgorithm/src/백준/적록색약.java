package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

//적록색약
//bfs
public class 적록색약 {
	
	static class Node{
		int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};

	static char array[][];
	static int N;
	static boolean[][] visited;
	static int cnt,cnt2;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(br.readLine());
		array=new char[N][N];
		visited=new boolean[N][N];
		//정상일때
		cnt=0;
		//적록색약일때
		cnt2=0;
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<N;j++) {
				array[i][j]=str.charAt(j);
			}
		}
		//정상일때
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {		
					bfs(i,j);
					cnt++;
				}
			}
		}
		//적록색약일때
		visited=new boolean[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {		
					bfs(i,j);
					cnt2++;
				}
			}
		}
		System.out.print(cnt+" "+cnt2);
	}
	static void bfs(int x,int y) {
		
		Queue<Node>q=new ArrayDeque<>();
		q.add(new Node(x,y));
		while(!q.isEmpty()) {
			Node current=q.poll();
			int cx=current.x;
			int cy=current.y;
			for(int i=0;i<4;i++) {
				int nx=cx+dx[i];
				int ny=cy+dy[i];
				if(nx<0 || ny< 0 || nx>=N || ny>=N || array[nx][ny]!=array[cx][cy]) {
					continue;
				}
				if(!visited[nx][ny]) {
					q.add(new Node(nx,ny));
					visited[nx][ny]=true;
				}
			}
			if(array[cx][cy]=='R') {
				array[cx][cy]='G';
			}
		}
		
	}

}
