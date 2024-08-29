/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DE02;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLCauThu qlCauThu = new QLCauThu();
        Scanner sc = new Scanner(System.in);
        int namHienHanh = 2024;
        while(true){
             System.out.println("Menu:");
            System.out.println("1. Xem danh sach cau thu");
            System.out.println("2. Them cau thu");
            System.out.println("3. Tim cau thu co luong thuc lanh thap nhat");
            System.out.println("4. Sap xep danh sach cau thu theo luong thuc lanh giam dan");
            System.out.println("5.Tinh do tuoi trung binh cua cac cau thu:");
            System.out.println("6. Thoat");
            System.out.print("Chon chuc nang: ");
            int chon  = sc.nextInt();
            switch (chon) {
               case 1:
                    qlCauThu.xuatDanhSachCauThu();
                    break;
                case 2:
                    System.out.print("Nhap so ao: ");
                    int soao = sc.nextInt();
                    sc.nextLine(); // Đọc dòng còn lại
                    System.out.print("Nhap ho ten: ");
                    String hoten = sc.nextLine();
                    System.out.print("Nhap nam sinh: ");
                    int namsinh = sc.nextInt();
                    System.out.print("Nhap luong cung: ");
                    double luongcung = sc.nextDouble();
                    System.out.print("Nhap tien thuong: ");
                    double tienthuong = sc.nextDouble();
                    System.out.print("Nhap tien phat: ");
                    double tienphat = sc.nextDouble();
                    sc.nextLine(); // Đọc dòng còn lại
                    CauThu cauThu = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
                    qlCauThu.themCauThu(cauThu);
                    break;
                case 3:
                    qlCauThu.timCauThuLuongThapNhat();
                    break;
                case 4:
                    qlCauThu.sapXepTheoLuongThucLanh();
                    break;
                case 5:
                    qlCauThu.tinhDoTuoiTrungBinh(namHienHanh);
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Chọn không hợp lệ");
                    break;
            }
            
    }
 
                 }    
}


