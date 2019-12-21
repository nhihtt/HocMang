package tonhi.com;

import java.util.Random;

public class TestMang {

	public static void main(String[] args) {
		//Khai báo mảng M có kiểu int
		int[] M;
		//Cấp phát 5 phần tử cho mảng M dể M quản lý
		M=new int[30];
		// Vậy mảng M chiếm một dung lượng trong thanh RAM là 
		int dl= Integer.BYTES*5;
		System.out.println(" M chiếm "+dl+" bytes");
		//bây giờ ta thay đổi giá trị các ô nhơ smaf M đg quản lý'
		Random rd =new Random();
		for(int i=0; i<M.length;i++) 
		{
			M[i]=rd.nextInt(100);
		}
		//bây giờ ta xuất ra màn hình
		for(int i= 0; i<M.length;i++) 
		{
			System.out.print(M[i]+" ");
		}
		
	}

}
