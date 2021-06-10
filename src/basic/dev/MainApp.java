package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // 13.1
        int[] arr = new int[10];
        int sum=0;
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu cua mang: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
        }
        for(int i=0;i<10;i++) {
        	sum += arr[i];
        }
        System.out.println("Tong cua day so la: "+sum);
        if(sum %2==0) {
        	System.out.println("Tong chan");
        }
        else System.out.println("Tong le");
        //13.2
        System.out.println("Cac so chan trong  mang: ");
        for(int i=0;i<10;i++) {
        	if(arr[i] % 2==0) {
        		System.out.print(+arr[i]+" ");
        	}
        }
        System.out.print("Cac so le trong  mang: ");
        for(int i=0;i<10;i++) {
        	if(arr[i] % 2==1) {
        		System.out.print(+arr[i]+" ");
        	}
        }
        //13.3
        for (int i = 0; i < 10; i++) {
            for (int j = i; j <= 10; j++) {
                if (arr[i] > arr[j]) {
                    // Thao tác này đổi chỗ 2 giá trị ở 2 vị trí i, j của mảng
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        
	}



	}


