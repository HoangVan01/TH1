package Bai22;

import java.util.Scanner;

public interface Bai22 {

	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Xin moi nhap so phan tu cua mang");
		n = sc.nextInt();
		int[] arr = new int[n];
		for	(int i=0; i<n;i++) {
			System.out.printf("a[%d]=",i);
			arr[i] = sc.nextInt();
		}
		System.out.println("Cac phan tu cua mang la` : ");
		show(arr);
		
	}
	public static void show(int [] arr) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			
			total = total+arr[i];
			System.out.println(arr[i]+"");
		}
		System.out.println("KQ la : "+total);
	}
}
