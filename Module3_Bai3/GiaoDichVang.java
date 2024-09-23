package Module3_Bai3;


public class GiaoDichVang extends QLDS {
	public String LoaiVang,NgayGiaoDich;

	public GiaoDichVang(String mgd, String ngd, double dg, int sl, String lv) {
		super(mgd,ngd,dg,sl);
		this.LoaiVang=lv;
	}
	public double TinhThanhTien() {
		return super.getSoLuong()*super.getDonGia();
	}
	public String toString() {
		return "Giao dịch vàng\n"+super.toString()+"\tLoại vàng:"+this.LoaiVang+"\tTính thành tiền:"+this.TinhThanhTien()+"\n";
	}
	

}
