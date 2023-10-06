package Bai10;

import java.util.Scanner;

public class main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	//Khai báo 2 cạnh HCN
	float cd,cr;
	//Nhập 2 cạnh hcn
	System.out.println("Nhập chiều dài ");
	cd = sc.nextFloat();
	System.out.println("Nhập chiều rộng");
	cr = sc.nextFloat();
	//Tinh toan
	float chuvi = (cd+cr)*2;
	float dientich = cd*cr;
	//In ra man hinh
	System.out.println("Chu vi hinh chu nhat la :"+chuvi);
	System.out.println("Dien tich hinh chu nhat la : "+dientich);
}
}
