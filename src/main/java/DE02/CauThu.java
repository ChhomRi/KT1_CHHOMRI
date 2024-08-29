/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE02;

/**
 *
 * @author ADMIN
 */
public class CauThu {
    private int soao;
    private String hoTen;
    private int namsinh;
    private double luongcung;
    private double tienthuong;
    private double tienphat;

    public CauThu(int soao, String hoTen, int namsinh, double luongcung, double tienthuong, double tienphat) {
        this.soao = soao;
        this.hoTen = hoTen;
        this.namsinh = namsinh;
        this.luongcung = luongcung;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }

    public int getSoao() {
        return soao;
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }
    public double tinhLuongThucLanh() {
        return luongcung + tienthuong - tienphat;
    }

    @Override
    public String toString() {
        return "CauThu{" + "soao=" + soao + ", hoTen=" + hoTen + ", namsinh=" + namsinh + ", luongcung=" + luongcung + ", tienthuong=" + tienthuong + ", tienphat=" + tienphat + '}';
    }
    public int getTuoi(int namHienHanh) {
        return namHienHanh - namsinh;
    }

    
    
}
