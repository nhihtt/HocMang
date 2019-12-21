package tonhi.com;

import java.util.Random;
import java.util.Scanner;



public class TestMang4 {
	static void xuatMang(int []M) 
	{
		for (int i=0; i<M.length;i++) 
		{
			System.out.print(M[i]+" ");
		}
	}
	public static void main(String[] args) {
		// 1. Viết hàm nhập giá trị từ bàn phím cho mảng M , yêu cầu nhập tăng dần ,nếu nhập sai quy cách bắt nhập lại
		//2.viết hàm nhập giá trị ngẫu nhiên cho mảng M theo nguyên tắc tăng dần và không trùng nhau
		int[]M;
		System.out.println("Bạn muốn mảng bao nhiêu phần tử ?");
		Scanner sc= new Scanner(System.in);
		int soPT =sc.nextInt();
		M= new int[soPT];
		System.out.println(" Hãy nhập giá trị cho các phần tử (nhập theo thứ tự tawg dần)");
		int tam=0;
		System.out.println("M[0]=");
		tam=  sc.nextInt();
		M[0]=tam;
		for(int i=0; i< M.length-1;i++) {
			System.out.println("M["+i+"]="+M[i]);
			System.out.println("M["+(i+1)+"]=");
			tam=sc.nextInt();
			M[i+1]=tam;
			if(tam<M[i])
				{
				System.out.println("Giá trị bạn nhập nhỏ hơn giá trị trước .Hãy nhập lại giá trị!!!");
				System.out.println("M["+(i+1)+"]=");
				tam=sc.nextInt();
				M[i+1]=tam;
				}
		}
		System.out.println("Mảng của bạn là");
		xuatMang(M);
	}

}
