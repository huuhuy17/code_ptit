
package model;

import controller.TrongException;
import java.io.Serializable;

public class LoaiVe implements Serializable{
    private int ma;
    private String Loai, donGia;
    private static int sma = 10000;

    public LoaiVe() {
    }

    public LoaiVe(int ma, String Loai, String donGia) {
        this.ma = ma;
        this.Loai = Loai;
        this.donGia = donGia;
    }

    public LoaiVe(String Loai, String donGia) throws TrongException{
        if(Loai.isEmpty() || donGia.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.Loai = Loai;
        this.donGia = donGia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        LoaiVe.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, Loai, donGia
        };
    }
}
