package model;

import controller.SoLuongException;
import java.io.Serializable;

public class BangDiem implements Serializable{
    private SinhVien sinhvien;
    private MonHoc monhoc;
    private double diem;
    public Object[] toObject(){
        return new Object[]{
          sinhvien.getMaSV(),sinhvien.getTenSV(),
            monhoc.getMaMH(),monhoc.getTenMH(),diem
        };
    }

    public BangDiem(SinhVien sinhvien, MonHoc monhoc, double diem)throws SoLuongException{
        if(diem<0||diem>10) throw new SoLuongException();
        this.sinhvien = sinhvien;
        this.monhoc = monhoc;
        this.diem = diem;
    }

    public BangDiem() {
    }

    public SinhVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SinhVien sinhvien) {
        this.sinhvien = sinhvien;
    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    
}
