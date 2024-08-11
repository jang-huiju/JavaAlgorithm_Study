package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 상하좌우 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //배열크기 입력
	        int n = Integer.parseInt(br.readLine());
	        //입력한 문자 공백제거 후 배열에 저장
	        String[] plans = br.readLine().split(" ");
	        //현재위치좌표
	        int x = 1, y = 1;

	        int[] dx = {0, 0, -1, 1}; // 좌우상하 x좌표
	        int[] dy = {-1, 1, 0, 0}; // 좌우상하 y좌표
	        String[] moveTypes = {"L", "R", "U", "D"};

	        for (String plan : plans) {
	            for (int i = 0; i < moveTypes.length; i++) {
	                if (plan.equals(moveTypes[i])) {
	                    int nx = x + dx[i];
	                    int ny = y + dy[i];

	                    // 범위를 벗어나면 무시
	                    if (nx < 1 || ny < 1 || nx > n || ny > n) {
	                        continue;
	                    }

	                    // 이동 수행
	                    x = nx;
	                    y = ny;
	                }
	            }
	        }

	        System.out.println(x + " " + y);
	}

}
