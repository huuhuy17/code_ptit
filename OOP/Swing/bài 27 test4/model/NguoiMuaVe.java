
package model;

import controller.TrongException;
import java.io.Serializable;

public class NguoiMuaVe implements Serializable{
    private int ma;
    private String hoTen, diaChi, Loai;
    private static int sma = 10000;

    public NguoiMuaVe() {
    }

    public NguoiMuaVe(int ma, String hoTen, String diaChi, String Loai) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.Loai = Loai;
    }

    public NguoiMuaVe(String hoTen, String diaChi, String Loai) throws TrongException{
        if(hoTen.isEmpty() || diaChi.isEmpty() || Loai.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.Loai = Loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NguoiMuaVe.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, hoTen, diaChi, Loai
        };
    }
    
}
