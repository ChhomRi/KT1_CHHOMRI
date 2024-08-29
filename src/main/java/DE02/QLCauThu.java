/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE02;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author ADMIN
 */
public class QLCauThu {
    private ArrayList<CauThu> dsct;
    
    
    public QLCauThu(){
        dsct = new ArrayList<>();
         dsct.add(new CauThu(1, "Le Thi Man", 1992, 2200, 400, 150));
         dsct.add(new CauThu(5, "Tran Quang Nhu", 1993, 2220, 320, 120));
         dsct.add(new CauThu(6, "Le Thi Thu", 1994, 2400, 500, 110));
         dsct.add(new CauThu(7, "Nguyen Thanh Tu", 1995, 3200, 400, 150));
         dsct.add(new CauThu(2, "Nguyen Xuan An", 1992, 2200, 400, 150));
         dsct.add(new CauThu(15, "Luong Xuan Truong", 1997, 2200, 400, 150));
         dsct.add(new CauThu(8, "Le Thi Nha", 1996, 2200, 400, 150));
         dsct.add(new CauThu(9, "Kim Thi Chung", 1992, 2200, 400, 150));
         dsct.add(new CauThu(11, "Hoang Hieu", 1972, 2200, 400, 150));
         dsct.add(new CauThu(12, "Chhom Ri", 1982, 2200, 400, 150));
         dsct.add(new CauThu(14, "Van nhat", 1999, 2200, 400, 150));
    }
    public void themCauThu(CauThu cauThu) {
        // Kiểm tra số áo có trùng lặp không
        for (CauThu ct : dsct) {
            if (ct.getSoao() == cauThu.getSoao()) {
                System.out.println("So ao da ton tai. Khong the  them cau thu.");
                return;
            }
            dsct.add(cauThu);
    
        }
    }    

  
    public void xuatDanhSachCauThu() {
        double tongluong = 0;
        System.out.println("Danh sách cầu thủ:");
        for (CauThu cauThu : dsct) {
            System.out.println(cauThu);
            tongluong += cauThu.tinhLuongThucLanh();
        }
             System.out.println("Tong tien luong CLB phai tra" + tongluong);
      
    
    }
    public void timCauThuLuongThapNhat() {
        if (dsct.isEmpty()) {
            System.out.println("Danh Sach Cau Thu Trong.");
            return;
        }
         CauThu cauThuLuongThapNhat =dsct.stream()
                .min(Comparator.comparingDouble(CauThu::tinhLuongThucLanh))
                .orElse(null);
        System.out.println("Cau thu co luong thuc lanh thap nhat:");
        if (cauThuLuongThapNhat != null) {
            System.out.println(cauThuLuongThapNhat);
        
    
        }
    }
    public void sapXepTheoLuongThucLanh() {
        dsct.sort(Comparator.comparingDouble(CauThu::tinhLuongThucLanh).reversed());
        System.out.println("Danh sach cau thu sau khi sap xep theo luong thuc lanh:");
        xuatDanhSachCauThu();
    }
    public void tinhDoTuoiTrungBinh(int namHienHanh) {
        if (dsct.isEmpty()) {
            System.out.println("Danh sach cau thu trong.");
            return;
        }
        double tongTuoi = 0;
        for (CauThu cauThu : dsct) {
            tongTuoi += cauThu.getTuoi(namHienHanh);
        }
        double tuoiTrungBinh = tongTuoi / dsct.size();
        System.out.printf("Đo tuoi trung binh cua các cau thu: ", tuoiTrungBinh);
    }
    
         
}

