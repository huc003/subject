package com.huc.subject;

/**
 * �����������������Ȼ��a, b, c��
 *
 * a2 + b2 = c2 (a < b < c)
 * ���磬32 + 42 = 9 + 16 = 25 = 52��
 *
 * �ִ���Ψһ�Ĺ�������a, b, c����a + b + c = 1000����������������ĳ˻���
 * Created by hucheng on 2017/2/25.
 */
public class Problem9 {
    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    if(i+j+k==1000&&i*i+j*j==k*k&&i<j&&j<k){
                        if(i!=0&&j!=0&&k!=0){
                            System.out.println("a = "+i+",b = "+j+",c = "+k);
                            System.out.println("a*b*c="+i*j*k);
                        }
                    }
                }
            }
        }
    }
}
