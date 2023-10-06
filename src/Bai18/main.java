package Bai18;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("xin moi nhap so nguyen N");
	n = sc.nextInt();
	int check = prime(n);
	if(check==1) {
		System.out.println("La so nguyen to");
	}
	else {
		System.out.println("Khong la so nguyen to");
	}
	

}
public static int prime(int n) {
	int flag = 1;
	if(n<2) {
		return flag = 0;
	}
	int i = 2 ;
	while(i<n) {
		if(n%i==0) {
			flag = 0;
			break;
		}
		i++;
	}
	return flag;
}
}
