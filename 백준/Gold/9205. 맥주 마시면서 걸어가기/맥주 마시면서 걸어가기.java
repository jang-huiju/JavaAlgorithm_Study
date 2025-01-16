

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int x, y;

		public Node(int x, int y) {

			this.x = x;
			this.y = y;
		}

		public int distance(Node node) {
			return Math.abs(this.x - node.x) + Math.abs(this.y - node.y);
		}

	}

	static int n;
	static List<Node> list;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			list = new ArrayList<>();
			//편의점 개수
			n = Integer.parseInt(br.readLine());
			StringTokenizer st=null;
			for (int i = 0; i < n + 2; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				list.add(new Node(x, y));

			}
			System.out.print(bfs() ? "happy\n" : "sad\n");
			
		}

	}
	static boolean bfs() {
		 visited=new boolean[n+2];
		 Queue<Integer>q=new LinkedList<>();
		 
		 //출발점(인덱스) 추가
		 q.add(0);
		 visited[0]=true;
		 while(!q.isEmpty()) {
			 int current=q.poll();
			 
			 //도착지 여부 확인
			 if(current==n+1) {
				 return true;
			 }
			 for(int i=0;i<n+2;i++) {
				 if(visited[i]|| list.get(current).distance(list.get(i))>1000) {
					 continue;
				 }
				 q.add(i);
				 visited[i]=true;
			 }
		 }
		 return false;
		 
	}

}
