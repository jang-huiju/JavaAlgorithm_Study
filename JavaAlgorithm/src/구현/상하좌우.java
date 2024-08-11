package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class �����¿� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //�迭ũ�� �Է�
	        int n = Integer.parseInt(br.readLine());
	        //�Է��� ���� �������� �� �迭�� ����
	        String[] plans = br.readLine().split(" ");
	        //������ġ��ǥ
	        int x = 1, y = 1;

	        int[] dx = {0, 0, -1, 1}; // �¿���� x��ǥ
	        int[] dy = {-1, 1, 0, 0}; // �¿���� y��ǥ
	        String[] moveTypes = {"L", "R", "U", "D"};

	        for (String plan : plans) {
	            for (int i = 0; i < moveTypes.length; i++) {
	                if (plan.equals(moveTypes[i])) {
	                    int nx = x + dx[i];
	                    int ny = y + dy[i];

	                    // ������ ����� ����
	                    if (nx < 1 || ny < 1 || nx > n || ny > n) {
	                        continue;
	                    }

	                    // �̵� ����
	                    x = nx;
	                    y = ny;
	                }
	            }
	        }

	        System.out.println(x + " " + y);
	}

}
