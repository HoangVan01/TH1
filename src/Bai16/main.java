package Bai16;

import java.util.Scanner;

public class main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//Khai bao
	int n;
	int kq=1;
	//Nhap so nguyen n
	System.out.println("Nhap so nguyen n");
	n = sc.nextInt();
	//Tinh toan
	for	(int i = 1; i<=n; i++) {
		 kq *=i;
		
	}
	System.out.println("KQ = "+kq);
		
	
}
}
