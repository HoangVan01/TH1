package Bai6;

import java.util.Scanner;

public class main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//Khai báo 2 số nguyên A, B
	int a, b, tong, tich, hieu;

	//Nhập 2 số
	System.out.println("Xin mời nhập số nguyên A");
	a = sc.nextInt();
	System.out.println("Xin mời nhập số nguyên B");
	b = sc.nextInt();
	//Tính tổng hiệu tích thương
	tong = a+b;
	hieu = a-b;
	tich = a*b;
	float thuong =(float)a/b;
	//In ra màn hình
	System.out.println("Tổng của 2 số là : "+tong);
	System.out.println("Hiệu của 2 số là : "+hieu);
	System.out.println("Tích của 2 số là : "+tich);
	System.out.println("Thương của 2 số là : "+thuong);
}
}
