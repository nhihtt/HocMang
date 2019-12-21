package tonhi.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TetsMang2 {
	static void nhapMang(int[]M) //=> tham số hình thức
	{
		Random rd= new Random();
		for(int i=0 ; i<M.length;i++) 
		{
			M[i]=rd.nextInt(100);
		}
	}
	/**
	 * Đây là hàm xuất mảng có kiểu int
	 * @param M
	 */
	static void xuatMang(int []M) 
	{
		for (int i=0; i<M.length;i++) 
		{
			System.out.print(M[i]+" ");
		}
	}
	/**
	 * Tìm phần tử x có tồn tai trong mảng M ko
	 * @param M
	 * @param x
	 * @return -1 nếu ko thấy x, !=0 là vị trí tìm thấy x
	 */
	static int timTuyenTinh(int[]M,int x) 
	{
		for(int i=0; i<M.length;i++) {
			if(M[i]==x)
				return i;		
		}
		return -1;
	}
	public static void main(String[] args)
	{  /* do 
		{
		int[]M;
		int n;
		System.out.println("Bạn muốn bao nhiêu pt?");
		n= new Scanner(System.in).nextInt();
		M=new int[n];
		nhapMang(M);
		System.out.println("Mảng sau khi nhập:");
		xuatMang(M);
		}
		while(true);
		*/
		for(;;) {
		int[]M;
		int n;
		System.out.println("Bạn muốn bao nhiêu pt?");
		n= new Scanner(System.in).nextInt();
		M=new int[n];
		nhapMang(M);
		System.out.println("Mảng sau khi nhập:");
		xuatMang(M);
		System.out.println("Muốn tìm gì");
		int k= new Scanner(System.in).nextInt();
		int kq= timTuyenTinh(M, k);
		if (kq==-1)
			System.out.println("không tìm thấy "+k);
		else
			System.out.println(k+" nằm ở vi trí "+kq);
		System.out.println("Mảng sau khi sắp xếp");
		Arrays.sort(M);
		xuatMang(M);
		System.out.println();
		//vì mảng đã sắp xếp nên có thể dùng giải thuật tìm kiếm nhị phân
		int z=113;
		
		int kqz= Arrays.binarySearch(M, z);
		if (kqz>=0)
			System.out.println(k+" nằm ở vi trí "+kqz);
			
		else
			System.out.println("không tìm thấy "+z);
		
		}
		
	}

}
