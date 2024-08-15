package bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 경쟁적전염 {
	
	static class Node{
		int x;
		int y;
		int virus;
		int time;
		public Node(int x, int y, int virus, int time) {
			this.x = x;
			this.y = y;
			this.virus = virus;
			this.time = time;
		}
		
	}
	
	//바이러스위치정보
	static ArrayList<Node> virus=new ArrayList<>();
	//상,하,좌,우
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	//배열크기,바이러스 종류갯수,시간
	static int n,k,second;
	//맵 정보
	static int[][]map;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		map=new int[n][n];
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				virus.add(new Node(i,j,map[i][j],0));
			}
		}
		st=new StringTokenizer(br.readLine());
		second=Integer.parseInt(st.nextToken());
		//위치
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		//바이러스 기준으로 재정렬
		Collections.sort(virus,new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.virus-o2.virus;
			}
			
		});
		bfs();
		System.out.println(map[x-1][y-1]);
		
	}
	static void bfs() {
		//큐에 값삽입
		Queue<Node> q=new LinkedList<>(virus);
		//큐가 비어있지않을때까지
		while(!q.isEmpty()) {
			//큐 꺼내기
			Node current=q.poll();
			int x=current.x;
			int y=current.y;
			int vk=current.virus;
			int s=current.time;
			//시간이 같다면 멈추기
			if(s==second) {
				break;
			}
			//상하좌우퍼뜨리기
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<n && map[nx][ny]==0) {
					map[nx][ny]=vk;
					q.add(new Node(nx,ny,map[nx][ny],s+1));
				}
			}
		}
	}

}
