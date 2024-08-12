package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ���Ӱ��� {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//����,���� �迭 ũ��
		StringTokenizer st=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		//ó�� x,y��ǥ
		st=new StringTokenizer(bf.readLine());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		//����
		int dr=Integer.parseInt(st.nextToken());
		
		int[] dx= {-1,0,1,0};
		int[] dy= {0,1,0,-1};
		
		//�迭����
		//1�϶� �ٴ� 0�϶� ����
		int[][] map=new int[n][m];
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int[][] visited=new int[n][m]; //0�̸� �湮X 1�̸� �湮O
		//ó���湮ó��
		visited[x][y]=1;
		//ó�� �湮 count ����
		int count=1;
		//ȸ��Ƚ��
		int turnTime=0;
		while(true) {
			dr=(dr+3)%4;
			int nx=x+dx[dr];
			int ny=y+dy[dr];
			//ȸ�� ���� ���鿡 ���������� ĭ�� �����ϴ� ��� �̵�
			if(visited[nx][ny]==0 && map[nx][ny]==0) {
				visited[nx][ny]=1;
				x=nx;
				y=ny;
				count++;
				turnTime=0;
				continue;
			}
			//ȸ���� �� ���鿡 ���������� ĭ�� ���ų� �ٵ��� ���
			else {
				turnTime++;
			}
			//�� ���� ��� �� �� ���ٸ�
			if(turnTime==4) {
				nx=x-dx[dr];
				ny=y-dy[dr];
				//�ڷ� �����ִٸ�
				if(map[nx][ny]==0) {
					x=nx;
					y=ny;
				//�ڷ� �ٴٶ��
				}else {
					break;
				}
				turnTime=0;
			}
		}
		//�湮�� ĭ ��
		System.out.println(count);
	}

}
