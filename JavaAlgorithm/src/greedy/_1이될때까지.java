package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1�̵ɶ����� {

	public static void main(String[] args) throws IOException {
	    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(bf.readLine());
	    int n=Integer.parseInt(st.nextToken());
	    int k=Integer.parseInt(st.nextToken());
	    //Ƚ��
	    int count=0;
	    //���ǰ�
	    int temp=0;
	    //n�� 1�� �ɶ����� �ݺ�
	while(n>1) {
	    //���������� �����
	    temp=(n/k)*k;
	    //�������� 1�� ���ִϱ� Ƚ���� ġȯ
	    count+=(n-temp);
	    n=temp;
	    //k�� ���̻� ������������ break
	    if(n<k) {
	        break;
	    }
	    //n�� ������ Ƚ�� �߰�
	    n=n/k;
	    count+=1;
	}
	System.out.println(count);
	}
	}

