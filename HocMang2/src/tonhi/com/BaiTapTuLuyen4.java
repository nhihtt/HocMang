package tonhi.com;

import java.util.Scanner;

public class BaiTapTuLuyen4 {
	/**
	 * Đây là hàm đếm số lần xuất hiện trước đó của phần tử trong mảng
	 * @param vitri: vị trí của phần tử
	 * @param M
	 * @return
	 */
	static int soLanXuatHienTruocDoTrongMang(int vitri,int []M) 
	{
		int dem=0;
		for(int i=0;i<vitri;i++) {
			if(M[i]==M[vitri]) dem++;
		}
		return dem;
	}
	/**
	 * Đây là hàm đếm số lần xuất hiện của phần tử trong mảng
	 * @param giatri
	 * @param M
	 * @return
	 */
	static int soLanXuatHienTrongMang(int giatri, int[]M) {
		int dem=0;
		for(int i=0;i<M.length;i++) {
			if(M[i]==giatri) dem++;
		}
		return dem;
	}

	/**
	 * Đây là hàm xuất mảng có đếm các phần tử lặp lại
	 * @param sopt: số phần tử của mảng
	 * @param M
	 */
	static void xuatMang(int sopt,int []M) 
	{
		if(soLanXuatHienTrongMang(M[0], M)>1)
			System.out.print(M[0]+ "("+soLanXuatHienTrongMang(M[0], M)+") ");
		else System.out.print(M[0]+" ");
		
		for (int i=1; i<sopt;i++) 
		{
			if(soLanXuatHienTruocDoTrongMang(i, M)==0)
			{
				if(soLanXuatHienTrongMang(M[i], M)>1)
					System.out.print(M[i]+ "("+soLanXuatHienTrongMang(M[i], M)+") ");
				else System.out.print(M[i]+" ");
			}
			
		}
		
	}
	/**
	 * Đây là hàm xuất mảng không đếm số phần tử lặp
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
	 * Đây là hàm lấy ra các số lẻ trong mảng
	 * @param M
	 */
	static void mangSoLe (int[] M) 
	{	
		int[] soLe=new int[M.length];
		int sopt=0;
		for(int i=0; i<M.length;i++) {
			if(M[i]%2==1)
			{
				soLe[sopt]=M[i];
				sopt++;
			}
		}
	
		System.out.println("Mảng có "+sopt+" số lẻ. ");
		if(sopt!=0)
		{
			System.out.print("Các số lẻ đó là: ");
			xuatMang(sopt,soLe);
			System.out.println();
		}
		
		
	}
	/**
	 * Đây là hàm lấy số chẵn từ mảng gốc
	 * @param M
	 */
	static void mangSoChan (int[] M) 
	{
		int sopt=0;	
		int[] soChan=new int[M.length];
		for(int i=0; i<M.length;i++) {
			if(M[i]%2==0)
			{
				soChan[sopt]=M[i];
				sopt++;
			}
		}
		System.out.println("Mảng có "+sopt+" số chẵn. ");
		if(sopt!=0) {
			System.out.print("Các số chẵn đó là: ");
			xuatMang(sopt,soChan);
			System.out.println();
		}
		
	}
	/**
	 * Đây là hàm kiểm tra 1 số có phải số nguyên tố không
	 * @param a
	 * @return
	 */
	static Boolean kiemTraSoNguyenTo(int a)
	{
		Boolean kq= false;
		int dem=0;
		if(a==1) dem++;
		else
		{
			for(int i=1; i<a;i++)
			{
				if(a%i==0)
					dem++;
			
			}
		}
		if (dem==1) kq= true;		
		return kq;
	}
	/**
	 * Đây là hàm tìm số nguyên tố trong mảng gốc
	 * @param M
	 */
	static void mangSoNguyenTo (int[] M) 
	{
		int sopt=0;	
		int[] soNguyenTo=new int[M.length];
		for(int i=0; i<M.length;i++) 
		{
			if(kiemTraSoNguyenTo(M[i])==true)
			{
				soNguyenTo[sopt]=M[i];
				sopt++;
			}
		}
		System.out.println("Mảng có "+sopt+" số nguyên tố. ");
		if(sopt!=0) {
			System.out.print("Các số nguyên tố đó là: ");
			xuatMang(sopt,soNguyenTo);
			System.out.println();
		}
	}
	/**
	 * Đây là hàm tìm các số không phải số nguyên tố trong mảng gốc
	 * @param M
	 */
	static void mangKhongPhaiSoNguyenTo (int[] M) 
	{
		int sopt=0;	
		int[] khongPhaiSoNguyenTo=new int[M.length];
		for(int i=0; i<M.length;i++) 
		{
			if(kiemTraSoNguyenTo(M[i])==false)
			{
				khongPhaiSoNguyenTo[sopt]=M[i];
				sopt++;
			}
		}
		System.out.println("Mảng có "+sopt+" số không phải là số nguyên tố. ");
		if(sopt!=0) {
			System.out.print("Các số không phải số nguyên tố đó là: ");
			xuatMang(sopt,khongPhaiSoNguyenTo);
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Bạn muốn nhập bao nhiêu phần tử?");
		Scanner sc =new Scanner(System.in);
		int soPT = sc.nextInt();
		int[] M= new int[soPT];
		System.out.println("Hãy nhập giá trị cho các phần tử trong mảng");
		for(int i=0;i<M.length;i++) {
			System.out.print("M["+i+"]= ");
			int tam =sc.nextInt();
			M[i]=tam;
		}
		System.out.println("Mảng của bạn là:");
		xuatMang( M);
		System.out.println();
		mangSoChan(M);
		mangSoLe(M);
		mangSoNguyenTo(M);
		mangKhongPhaiSoNguyenTo(M);
	}

}
