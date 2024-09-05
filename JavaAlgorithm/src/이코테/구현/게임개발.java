package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 게임개발 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//가로,세로 배열 크기
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		//처음 x,y좌표
		st=new StringTokenizer(bf.readLine());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		//방향
		int dr=Integer.parseInt(st.nextToken());
		
		int[] dx= {-1,0,1,0};
		int[] dy= {0,1,0,-1};
		
		//배열저장
		//1일때 바다 0일때 육지
		int[][] map=new int[n][m];
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int[][] visited=new int[n][m]; //0이면 방문X 1이면 방문O
		//처음방문처리
		visited[x][y]=1;
		//처음 방문 count 증가
		int count=1;
		//회전횟수
		int turnTime=0;
		while(true) {
			dr=(dr+3)%4;
			int nx=x+dx[dr];
			int ny=y+dy[dr];
			//회전 한후 정면에 가보지않은 칸이 존재하는 경우 이동
			if(visited[nx][ny]==0 && map[nx][ny]==0) {
				visited[nx][ny]=1;
				x=nx;
				y=ny;
				count++;
				turnTime=0;
				continue;
			}
			//회전한 후 정면에 가보지않은 칸이 없거나 바디인 경우
			else {
				turnTime++;
			}
			//네 방향 모두 갈 수 없다면
			if(turnTime==4) {
				nx=x-dx[dr];
				ny=y-dy[dr];
				//뒤로 갈수있다면
				if(map[nx][ny]==0) {
					x=nx;
					y=ny;
				//뒤로 바다라면
				}else {
					break;
				}
				turnTime=0;
			}
		}
		//방문한 칸 수
		System.out.println(count);
	}

}