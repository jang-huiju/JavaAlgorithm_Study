package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최소비용구하기 {
	
	static class Node{
		int arrive,weight;

		public Node(int arrive, int weight) {
			
			this.arrive = arrive;
			this.weight = weight;
		}
		
	}
	
	static int N,M;
	static boolean[] visited;
	static ArrayList<Node>[] map;
	static int startN,finalN;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		M=Integer.parseInt(br.readLine());
		map=new ArrayList[N];
		for(int i=0;i<N;i++) {
			map[i]=new ArrayList<>();
		}
		StringTokenizer st;
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken())-1;
			int y=Integer.parseInt(st.nextToken())-1;
			int amount=Integer.parseInt(st.nextToken());
			map[x].add(new Node(y,amount));
			
		}
		st=new StringTokenizer(br.readLine());
		startN=Integer.parseInt(st.nextToken())-1;
		finalN=Integer.parseInt(st.nextToken())-1;
		
		int result=daik(startN);
		
		System.out.println(result);
		
		
		

	}
	static int daik(int x) {
		
		visited=new boolean[N];
		int[] dist=new int[N];
		Arrays.fill(dist, Integer.MAX_VALUE);
		PriorityQueue<Node>pq=new PriorityQueue<>((w1,w2)->Integer.compare(w1.weight, w2.weight));
		pq.add(new Node(x,0));
		dist[x]=0;
		while(!pq.isEmpty()) {
			Node c=pq.poll();
			int cx=c.arrive;
			
			if (cx == finalN) break;
			if(!visited[cx]) {
				visited[cx]=true;
			}
			for(Node n : map[cx]) {
				
				if(!visited[n.arrive] && dist[n.arrive]>dist[cx]+n.weight) {
					dist[n.arrive]=dist[cx]+n.weight;
					pq.add(new Node(n.arrive,dist[n.arrive]));
					
				}
			}
			
		}
		
		return dist[finalN];
	}

}
