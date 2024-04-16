package DTO;

import java.util.Date;

public class ChiTietThueDichVuDTO {
    private String maCTT;
    private String maDV;
    private Date ngaySuDung;
    private int giaDV;
    private int soLuong;

    public ChiTietThueDichVuDTO() {
    }

    public ChiTietThueDichVuDTO(String maCTT, String maDV, Date ngaySuDung, int giaDV, int soLuong) {
        this.maCTT = maCTT;
        this.maDV = maDV;
        this.ngaySuDung = ngaySuDung;
        this.giaDV = giaDV;
        this.soLuong = soLuong;
    }

    public String getMaCTT() {
        return maCTT;
    }

    public void setMaCTT(String maCTT) {
        this.maCTT = maCTT;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public Date getNgaySuDung() {
        return ngaySuDung;
    }

    public void setNgaySuDung(Date ngaySuDung) {
        this.ngaySuDung = ngaySuDung;
    }

    public int getGiaDV() {
        return giaDV;
    }

    public void setGiaDV(int giaDV) {
        this.giaDV = giaDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
