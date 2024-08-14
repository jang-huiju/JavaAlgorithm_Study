package bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class 특정거리의도시찾기 {


	//도시정보 이차원 리스트
	static List<List<Integer>> roads;
	//최단거리정보
	static int [] distance;
	public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());

    //입력 값 받기
    //도시의 개수 
    int N=Integer.parseInt(st.nextToken());
    //도로의 개수
    int M=Integer.parseInt(st.nextToken());
    //최단 거리정보
    int K=Integer.parseInt(st.nextToken());
    //출발도시의 번호
    int X=Integer.parseInt(st.nextToken());

    roads=new ArrayList<>();
    distance=new int[N+1];
    //리스트 M의 갯수만큼 추가
    for(int i=0;i<=N;i++) {
        roads.add(new ArrayList<>());
    }
    for(int i=0;i<M;i++) {
        st=new StringTokenizer(br.readLine());
        //도시번호
        int a=Integer.parseInt(st.nextToken());
        //연결된 도시 번호
        int b=Integer.parseInt(st.nextToken());
        //리스트에 값 넣어주기
        roads.get(a).add(b);
    }
    //distance 배열에 -1로 모두 초기화
    Arrays.fill(distance, -1);
    //System.out.println(roads);
    //bfs 함수실행
    bfs(X);
    //최단경로있는지 체크 하기
    boolean check=false;
    for(int i=1;i<=N;i++) {
        //최단경로가 K와 같다면
        if(distance[i]==K) {
            System.out.println(i);
            check=true;
        }
    }
    //false라면 -1 출력
    if(!check) {
        System.out.println("-1");
    	}

	}
	//bfs수행
	static void bfs(int start) {
		//큐실행
		Queue<Integer> q=new LinkedList<>();
		//처음에 거리가 0
		distance[start]=0;
		//큐에 도시추가
		q.offer(start);
		//비어있지않는동안
		while(!(q.isEmpty())) {
			//삭제
			int current=q.poll();
			//start와 연결된 도시정보 출력
			for(int next : roads.get(current)) {
				//방문하지않았다면
				if(distance[next]==-1) {
					//거리값 계산
					distance[next]=distance[current]+1;
					//큐에 추가
					q.offer(next);
				}
			}
		}
	}
}