package bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node{
	int x;
	int y;
	
	public Node(int x,int y) {
		this.x=x;
		this.y=y;
	}
}

public class 미로탈출 {
	
	static int n;
	static int m;
	static int[][]map;
	//상,하,좌,우
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		//배열크기
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		//맵 정보 저장
		map=new int[n][m];
		for(int i=0;i<n;i++) {
			String[] str=bf.readLine().split("");
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(str[j]);
			}
		}
		System.out.println(bfs(0,0));
	}
	static int bfs(int x, int y) {
		//큐사용
		Queue<Node> q=new LinkedList<>();
		//값추가-삽입시  true, 실패시  false 반환
		q.offer(new Node(x,y));
		//큐가 비어있지않을때까지
		while(!q.isEmpty()) {
			//삭제 반환,반환값 공백이면  null값반환
			Node node=q.poll();
			x=node.x;
			y=node.y;
			//상,하,좌,우 돌기
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				//범위에 벗어났을때
				if(nx<0 || nx>=n || ny<0 || ny>=m) {
					continue;
				}
				//벽이라면
				if(map[nx][ny]==0) {
					continue;
				}
				//처음 방문할 경우
				if(map[nx][ny]==1) {
					//최단 경로 거리 계산
					map[nx][ny]=map[x][y]+1;
					//그 다음 좌표 큐에 삽입
					q.offer(new Node(nx,ny));
				}
			}
		}
		//마지막 노드가 최단 경로 거리값
		return map[n-1][m-1];
	}

}
