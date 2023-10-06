package Bai12;

import java.util.Scanner;

public class main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//Khai bao 
	double diem;
	//nhap diem
	System.out.println("Moi nhap so diem can xep loai  :");
	diem = sc.nextDouble();
	//xep loai
	if(diem<50) {
		System.out.println("Xep loai F");
	}
	else if (diem <70) {
		System.out.println("Xep loai D");
	}
	else if (diem <80) {
		System.out.println("Xep loai C");
	}
	else if (diem<90) {
		System.out.println("Xep loai B");
	}
	else if(diem<100) {
		System.out.println("Xep loai A");
	}
	else {
		System.out.println("So diem nhap vao khong hop le");
	}
}
}
