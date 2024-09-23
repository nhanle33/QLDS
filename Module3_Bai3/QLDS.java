package Module3_Bai3;


public class QLDS {
	private String MaGiaoDich;
	private String NgayGiaoDich;
	private double DonGia;
	private int SoLuong;
	//constructor
	public QLDS() {
		MaGiaoDich="";
		NgayGiaoDich="";
		DonGia=0;
		SoLuong=0;
		
	}
	public QLDS(String mgd, String ngd, double dg, int sl) {
		this.MaGiaoDich=mgd;
		this.NgayGiaoDich=ngd;
		this.DonGia=dg;
		this.SoLuong=sl;
		
	}
	//set
	public void setMaGiaoDich(String mgd){
		this.MaGiaoDich=mgd;
	}
	public void setNgayGiaoDich(String ngd) {
		this.NgayGiaoDich=ngd;
	}
	public void setDonGia(double dg) {
		this.DonGia=dg;
	}
	public void setSoLuong(int sl) {
		this.SoLuong=sl;
	}
	//get
	public String getMaGiaoDich() {
		return MaGiaoDich;
	}
	public String getNgayGiaoDich() {
		return NgayGiaoDich;
	}
	public double getDonGia() {
		return DonGia;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public double tinhThanhTien() {
		return 0;
	}
	//toString 
	public String toString(){
		return "Mã giao dịch:" + this.MaGiaoDich+"\tNgày giao dịch:"+this.NgayGiaoDich+
				"\tĐơn giá:"+this.DonGia+"\tSố lượng:"+this.SoLuong;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
