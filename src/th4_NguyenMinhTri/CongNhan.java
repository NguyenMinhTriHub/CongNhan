package th4_NguyenMinhTri;

public class CongNhan {
	private String MaCN;
	private String mHo;
	private String mTen;
	private double mSP;
	public String getMaCN() {
		return MaCN;
	}
	public void setMaCN(String maCN) throws Exception {
		if(maCN!=null) {
			this.MaCN = maCN;
		}else {
			throw new Exception("Loi");
		}
		
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public double getmSP() {
		return mSP;
	}
	public void setmSP(double mSP) {
		this.mSP = mSP;
	}
	public CongNhan() {
		
	}
	public CongNhan(String maCN, String mHo, String mTen, double mSP) {
		
		this.MaCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSP = mSP;
	}
	public double getTinhLuong() {
		if(getmSP()>=600) {
			return getmSP()*0.65;
		}
		if(getmSP()>=400) {
			return getmSP()*0.6;
		}
		if(getmSP()>=200) {
			return getmSP()*0.55;
		}else {
			return getmSP()*0.5;
		}
	}
	public String toString() {
		String s=String.format("%10s,%10s,%10s,%10s,%10s",getMaCN(),getmHo(),getmTen(),getmSP(),getTinhLuong());
		return s;
	}
	
}
