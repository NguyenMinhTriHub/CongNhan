package th4_NguyenMinhTri;
import java.util.Scanner;
public class TestCN {
	public static void TestCN(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ma cong nhan:");
		String maCN=sc.nextLine();
		System.out.println("Ho cong nhan:");
		String mHo=sc.nextLine();
		System.out.println("Ten cong nhan:");
		String mTen=sc.nextLine();
		System.out.println("So san pham:");
		double mSP=sc.nextDouble();
	}

	public static void main(String[] args) {
		ListCN lsCN=new ListCN(5);
		for(int i=0;i<lsCN.count;i++) {
			System.out.println(lsCN.getAll()[i]);
		}	
		System.out.println("Xoa xong");
		lsCN.XoaCN(null);
		for(int i=0;i<lsCN.count;i++) {
			System.out.println( lsCN.getAll()[i]);
		}
		
	}

}
