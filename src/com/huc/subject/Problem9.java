package com.huc.subject;

/**
 * 勾股数组就是三个自然数a, b, c：
 *
 * a2 + b2 = c2 (a < b < c)
 * 例如，32 + 42 = 9 + 16 = 25 = 52。
 *
 * 现存在唯一的勾股数组a, b, c，且a + b + c = 1000。请求出这三个数的乘积。
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
