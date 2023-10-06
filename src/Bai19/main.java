package Bai19;

import java.util.Scanner;

public class main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//Khai bao
	double gio,phut,giay,quyDoi;
	//Nhap so gio phut giay
	System.out.println("Nhap so gio");
	gio = sc.nextDouble();
	System.out.println("Nhap so phut");
	phut = sc.nextDouble();
	System.out.println("Nhap so giay");
	giay = sc.nextDouble();
	//Quy doi
	quyDoi = gio*60*60 + phut*60 + giay;
	System.out.println("Ket qua sau khi quy doi"+quyDoi);
}
}
