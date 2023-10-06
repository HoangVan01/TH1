package Bai11;

import java.util.Scanner;

public class main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in); 
		//Khai bao
		float banKinh;
		float pi = (float) 3.14;
		//Nhap ban kinh
		System.out.println("Nhap ban kinh : ");
		banKinh = sc.nextFloat();
		//Tinh toan
		float chuvi = pi*banKinh*2;
		float dientich = banKinh*banKinh*pi;
		//In kqua
		System.out.println("Chu vi hinh tron la : "+chuvi);
		System.out.println("Dien tich hinh tron la : "+dientich);
	}

}
