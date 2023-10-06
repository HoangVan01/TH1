package Bai13;

import java.util.Scanner;

public class main {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	//Khai bao
	double gia,khuyenmai;
	//Nhap gia va % khuyen mai
	System.out.println("Xin moi nhap gia ban cua mat hang ");
	gia = sc.nextDouble();
	System.out.println("Xin moi nhap % khuyen mai");
	khuyenmai = sc.nextDouble();
	//Tinh gia sau khuyen mai
Double	giaSauKM = gia - ((gia/100)*khuyenmai);
//In ra man hinh
	System.out.println("Gia sau khuyen mai la : "+giaSauKM);
}
}
