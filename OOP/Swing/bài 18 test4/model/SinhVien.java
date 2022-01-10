/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Son
 */
//(mã SV, Họ tên, Địa chỉ, Ngày sinh, Lớp)
public class SinhVien implements  Serializable{
    private int maSV;
    private String tenSV,diachi,ngaysinh,lop;
    private static int sma=10000;
    public Object[] toObject(){
        return new Object[]{
          maSV,tenSV,diachi,ngaysinh,lop
        };
    }

    public SinhVien() {
    }

    public SinhVien(String tenSV, String diachi, String ngaysinh, String lop) throws TrongException,DienThoaiException{
        if(tenSV.isEmpty()) throw new TrongException();
        if(!lop.matches("^[D]\\d{2}\\w{4}\\d{2}$")) throw new DienThoaiException();
        this.maSV = sma++;
        this.tenSV = tenSV;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SinhVien.sma = sma;
    }
    

    
    
}
