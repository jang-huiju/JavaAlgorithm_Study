package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 모험가길드 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		//諛곗뿴�겕湲곗엯�젰
		int n=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		st=new StringTokenizer(bf.readLine());
		int currentCnt=0; // �쁽�옱 洹몃９�닔
		int result=0; //珥� 洹몃９�닔
		//諛곗뿴 �엯�젰
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		//�삤由꾩감�닚 �젙�젹
		Arrays.sort(arr);
		//�겙�닔遺��꽣 鍮꾧탳
		for(int i=arr.length-1;i>0;i--) {
			//�쁽�옱 �뱾�뼱媛��엳�뒗 �씤�썝�닔
			currentCnt++;
			//�쁽�옱�뱾�뼱媛��엳�뒗 洹몃：�닔媛� 怨듯룷�룄媛믨낵 媛숆굅�굹 �겢 寃쎌슦
			if (arr[i]<=currentCnt) {
				//洹몃９ 媛��닔 異붽�
				++result;
				//�뱾�뼱媛��엳�뒗 �씤�썝�닔 珥덇린�솕
				currentCnt=0;
			}
		}
		System.out.println(result);

	}

}
