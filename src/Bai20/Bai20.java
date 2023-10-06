package Bai20;

import java.util.Scanner;

public class Bai20 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//Khai bao
	double doC, doF;
	//Nhap do C
	System.out.println("Xin moi nhap so do C");
	doC = sc.nextDouble();
	//Quy doi
	doF = (doC*1.8)+32;
	System.out.println("Do F = "+doF);
}
}
