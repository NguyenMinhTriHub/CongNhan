package th4_NguyenMinhTri;

public class ListCN {
	public int count;
	CongNhan[] lsCN;
	public ListCN(int n) {
		lsCN=new CongNhan[n];
		count=0;
	}
	public void TangKT() {
		CongNhan[] tam=new CongNhan[lsCN.length*2];
		lsCN=tam;
	}
	public boolean themCN(CongNhan cn) {
		if(count==lsCN.length) {
			TangKT();
			for(int i=0;i<count;i++) {
				if(lsCN[i].getMaCN().equalsIgnoreCase(lsCN[i].getMaCN())) {
					return false;
				}
			}
			lsCN[count]=cn;
			count++;		
		}
		return true;
	}
	public boolean XoaCN(String ma) {
		int ViTri=-1;
		for(int i=0;i<count;i++) {
			if(lsCN[i].getMaCN().equalsIgnoreCase(ma)) {
				ViTri=i;
			}
		}
		if(ViTri!=1) {
			for(int i=ViTri;i<count-1;i++) {
				lsCN[i]=lsCN[i+1];
				count--;
				return true;
			}			
		}else {
			return false;
		}
		return false;
	}
	public CongNhan[] getAll() {
		return lsCN;
	}
	
	
}
