/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DienThoaiException;
import controller.SoLuongException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Son
 */
/*
Xưởng sản xuất (mã xưởng, tên xưởng, mô tả, Hệ số công việc), mã xưởng là một số
nguyên có 3 chữ số, tự động tăng. Hệ số công việc là một số thực từ trong khoảng từ 1 đến 20, cho 
biết mức đánh giá chung về các công việc trong xưởng đó đảm nhiệm.
*/
public class XuongSX implements  Serializable{
    private int maX;
    private String tenX,mota;
    private double heso;
    private static int sma=100;
    public Object[] toObject(){
        return new Object[]{
          maX,tenX,mota,heso
        };
    }

    public XuongSX() {
    }

    public XuongSX(String tenX, String mota, Double heso) throws TrongException,SoLuongException{
        if(tenX.isEmpty()) throw  new TrongException();
        if(heso<=0 || heso>20) throw new SoLuongException();
        this.maX = sma++;
        this.tenX = tenX;
        this.mota = mota;
        this.heso = heso;
    }

    public XuongSX(int maX, String tenX, String mota, Double heso) {
        this.maX = maX;
        this.tenX = tenX;
        this.mota = mota;
        this.heso = heso;
    }

    public int getMaX() {
        return maX;
    }

    public void setMaX(int maX) {
        this.maX = maX;
    }

    public String getTenX() {
        return tenX;
    }

    public void setTenX(String tenX) {
        this.tenX = tenX;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Double getHeso() {
        return heso;
    }

    public void setHeso(Double heso) {
        this.heso = heso;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        XuongSX.sma = sma;
    }

    

    


    
    
}
