package Module3_Bai3;

import java.util.Date;

public class MainQLDS {

	public static void main(String[] args) {
		QLDS[] arrDS=new QLDS[6];
		//vang
		arrDS[0]=new GiaoDichVang("MGD001","23-09-2024" , 500000000, 15, "9999");
		arrDS[1]=new GiaoDichVang("MGD002","24-09-2024", 550000000, 20, "SJC");
		arrDS[2]=new GiaoDichVang("MGD003","25-09-2024" , 2000000000, 25, "24K");
		//tien te
		arrDS[3]=new GiaoDichTienTe("TT001","23-10-2024" , 23000, 100, 1.3, "USD");
		arrDS[4]=new GiaoDichTienTe("TT002","24-10-2024" , 33000, 150, 1.5, "Euro");
		arrDS[5]=new GiaoDichTienTe("TT003","25-10-2024" , 43000, 200, 1, "VN");
		//tong so luong cho tung loai
		int tongGDV=0;
		int tongGDTT=0;
		int soluong=0;
		double tongtien=0;
		for(QLDS ds:arrDS) {
			if(ds instanceof GiaoDichVang) {
				tongGDV+=ds.getSoLuong();
			}else if(ds instanceof GiaoDichTienTe) {
				tongGDTT+=ds.getSoLuong();
				tongtien+=ds.tinhThanhTien();
				soluong++;			
			}
				
		}
	
		System.out.println("Tổng số lượng giao dịch vàng:"+tongGDV);
		System.out.println("Tổng số lượng giao dịch tiền tệ:"+tongGDTT);
		System.out.println("Trung bình thành tiền của giao dịch tiền tệ:"+tongtien);
		//trung binh thanh tien cua tien te
		double Trungbinh=tongtien/soluong;
		for(QLDS ds : arrDS) {
			if(ds.getDonGia()>1000000000)
				System.out.println(ds);
		}
		
		
	
		
		
		
		
		
	
		

	}

}
