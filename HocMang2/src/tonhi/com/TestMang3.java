package tonhi.com;

public class TestMang3 {

	public static void main(String[] args) {
		int[]M1= {1,2,3};
		int []M2= {4,5,6};
		// lúc này HDH sẽ cấp phát 2 vùng nhớ cho M1 và M2
		M1=M2;//ngôn ngữ nói M1=M2
		// Nhưng máy ko làm như vậy
		// M1 trỏ tới vùng nhớ M2 đg quản lý
		// lúc này xảy ra 2 TH:
		// TH1: Vùng nhớ Y có 2 đối tượng quản lý:M1,M2
		// 		1 vùng nhớ có từ 2 đối tượng tham gia cùng quản lý gọi là ALIAS
		// 		Khi có bất kỳ đối tượng nào thay đổi giá trị trên ô nhớ
		// 		thi đối tượng khác cũng ảnh hưởng
		// TH2: vùng nhớ X ko còn ai tham gia quản lý
		// 		Lúc này HDH sẽ tự thu hồi ô nhớ
		//		gọi là Garbage Collection( cơ chế gom rác tự động)
		// Lưu ý: Với C/C++ phải tự thu hồi ô nhớ, nếu ko nó bị Memory Leak
		
		//ta thử thay đổi M1 hoặcM2
		M1[2]=113;
		System.out.println(M2[2]);
		int D[]=M1;
		D[0]=100;
		System.out.println("M1[0]"+M1[0]);
		System.out.println("M2[0]"+M2[0]);
		
		
		
		
		
	}
}
