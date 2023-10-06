package Bai7;

import java.util.Scanner;

public class main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//Khai báo
	int a,b;
//	String c;
	//Nhập dữ liệu từ bàn phím;
	System.out.println("Xin mời nhập số a");
	a = sc.nextInt();
	System.out.println("Xin mời nhập số b");
	b = sc.nextInt();

	//Tính toán 
	int tong = a+b;
	int hieu = a-b;
	int tich = a*b;
	float thuong = (float)a/b;
	//Thuật toán
	sc.nextLine();
	System.out.println("Xin mời nhập ký tự c");
	String c = sc.nextLine();
	if(c.equals("A")) {
		System.out.println("Tổng của 2 số là : "+tong);
	}
	else if(c.equals("S")) {
		System.out.println("Hiệu của 2 số là : " +hieu);
	}
	else if(c.equals("M")) {
		System.out.println("Tích của 2 số là : "+tich);
	}
	else if(c.equals("D")) {
		System.out.println("Thương của 2 số là : " +thuong);
	}

}
}
