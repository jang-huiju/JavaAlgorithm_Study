

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int x, y;


		public Node(int x, int y) {
			
			this.x = x;
			this.y = y;
		}

	}

	static int N, M;
	static int[][] array;
	static int cnt,year;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		year=0;
		array = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//빙산 상태를 매년 확인
		while(true) {
			//덩어리수
			cnt = 0;
			visited = new boolean[N][M];
			//덩어리수 계산
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (!visited[i][j] && array[i][j]>0) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			if(cnt==0) {
				System.out.println(0);
				break;
			}else if(cnt>=2) {
				System.out.println(year);
				break;
			}
			melt();
			year++;
		}
		

	}

	static void bfs(int x, int y) {
	    Queue<Node> q = new ArrayDeque<>();
	    visited[x][y] = true;
	    q.add(new Node(x, y));

	    while (!q.isEmpty()) {
	        Node current = q.poll();
	        int cx = current.x;
	        int cy = current.y;

	        for (int i = 0; i < 4; i++) {
	            int nx = cx + dx[i];
	            int ny = cy + dy[i];

	           
	            if (nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny]) {
	                continue;
	            }

	            if (array[nx][ny] > 0) {
	                q.add(new Node(nx, ny));
	                visited[nx][ny] = true;
	            }
	        }
	    }
	}

	static void melt() {
		
		//녹은 결과를 저장할 임시 배열
		 int[][] temp=new int[N][M];
		
		 //4방향 탐색
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				//빙산이 있는경우
				if(array[i][j]>0) {
					//주변바다개수
					int seaCnt=0;
					
					for(int k=0;k<4;k++) {
						int nx=i+dx[k];
						int ny=j+dy[k];
						
						if(nx>=0 && ny>=0 && nx<N && ny<M && array[nx][ny]==0) {
							//바다개수 증가
							seaCnt++;
						}
					}
					//녹은 빙산 높이 계산
					temp[i][j]=Math.max(array[i][j]-seaCnt, 0);
				}
			}
		}
		//원본 배열에 녹은 결과 적용
		array=temp;
	}

}
