package com.huc.subject;
/**
 * ͨ���г�ǰ6�����������ǿ�֪��6��������13��
 * ��ô��10001�������Ƕ����أ�
 * @author huc
 *
 */
public class Problem7 {
	public static void main(String[] args) {
		int n = 1;
		for (int j = 2; j < 150000; j++) {
			int c = 0;
			if(n<=10001){
				for (int i = 1; i < 150000; i++) {
					if(j%i==0){
						c++;
					}
					if (c>2){
						break;
					}
				}
				if(c==2){
					System.out.println("������:"+j+"-----������"+n++);
				}
			}
		}
	}
	
}
