package Module3_Bai3;


public class GiaoDichTienTe extends QLDS {
	private double Tigia;
	private String LoaiTien;
	
	public GiaoDichTienTe(String mgd, String ngd, double dg, int sl,double tg, String lt) {
		super(mgd,ngd,dg,sl);
		this.Tigia=tg;
		this.LoaiTien=lt;
		
	}
	public double tinhThanhTien() {
		if(LoaiTien.equals("USD")||LoaiTien.equals("Euro")) {
			return super.getSoLuong()*super.getDonGia()*Tigia;			
		}else {
			if(LoaiTien.equals("VN")) {
				return super.getSoLuong()*super.getDonGia();
			}else {
				return 0;
			}
		}
	}
	public String toString() {
		return "Giao dịch tiền tệ\n"+super.toString()+"\tTỉ giá:"+this.Tigia+"\tLoại tiền:"+this.LoaiTien+"\t Thành Tiền:"+this.tinhThanhTien()+"\n";
	}

}
