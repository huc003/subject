package com.huc.subject;
/**
 * ͨ���г�ǰ6�����������ǿ�֪��6��������13��
 * ��ô��10001�������Ƕ����أ�
 * @author huc
 *
 */
public class Problem7 {
	public static void main(String[] args) {
		int n = 2,c = 0;
		for (int i = 1; i < 10; i++) {
			if(n%i==0){
				c++;
			}
		}
		if(c==2){
			System.out.println("������:"+n);
		}else{
			System.out.println("��������:"+n);
		}
	}
	
}
