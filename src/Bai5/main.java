package Bai5;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Khai báo biến
	int a;
	float b;
	String c;
	String d;
	//Khai báo lớp Scanner
	Scanner sc = new Scanner(System.in);
		//Nhập số nguyên, 1 số thực, 1 ký tự và 1 chuỗi ký tự
	System.out.println("Xin mời nhập vào số nguyên A");
	a = sc.nextInt();
	System.out.println("Xin mời nhập vào số thực B");
	b= sc.nextFloat();
	System.out.println("Xin mời nhập vào ký tự C \n");
	c = sc.nextLine();
	System.out.println("Xin mời nhập vào ký chuỗi ký tự D");
	d = sc.next();
	//in thông tin vừa nhập ra ngoài màn hình
	System.out.println("Số nguyên A là : "+a);
	System.out.println("Số thực B là : "+b);
	System.out.println("Ký tự C là : "+c);
	System.out.println("Chuỗi ký tự D là : "+d);
}
}
