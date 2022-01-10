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
//mã môn, tên môn, số đvht, loại môn)
public class MonHoc implements  Serializable{
    private int maMH;
    private String tenMH,dvht,loaiMH;
    private static int sma=100;
    public Object[] toObject(){
        return new Object[]{
          maMH,tenMH,dvht,loaiMH
        };
    }

    public MonHoc(int maMH, String tenMH, String dvht, String loaiMH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.dvht = dvht;
        this.loaiMH = loaiMH;
    }

    public MonHoc(String tenMH, String dvht, String loaiMH) throws TrongException,DienThoaiException{
        if(tenMH.isEmpty()) throw new TrongException();
        if(!dvht.matches("\\d+")) throw new DienThoaiException();
        this.maMH = sma;
        this.tenMH = tenMH;
        this.dvht = dvht;
        this.loaiMH = loaiMH;
    }

    public MonHoc() {
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getDvht() {
        return dvht;
    }

    public void setDvht(String dvht) {
        this.dvht = dvht;
    }

    public String getLoaiMH() {
        return loaiMH;
    }

    public void setLoaiMH(String loaiMH) {
        this.loaiMH = loaiMH;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }

    


    
    
}
