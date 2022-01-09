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
/*Công nhân gồm các thuộc tính (mã công nhân, Họ tên, Địa chỉ, Số điện thoại, Bậc 
thợ) – trong đó Bậc thợ là một số nguyên từ 1 đến 7. Mã công nhân là một số nguyên có 4 chữ số, 
tự động tăng.*/
public class CongNhan implements  Serializable{
    private int maCN;
    private String tenCN,diachi,sdt,bac;
    private static int sma=1000;
    public Object[] toObject(){
        return new Object[]{
          maCN,tenCN,diachi,sdt,bac
        };
    }

    public CongNhan() {
    }

    public CongNhan(String tenCN, String diachi, String sdt, String bac)throws TrongException,DienThoaiException{
        if(tenCN.isEmpty()) throw new TrongException();
        if(!sdt.matches("\\d+")) throw new DienThoaiException();
        this.maCN = sma++;
        this.tenCN = tenCN;
        this.diachi = diachi;
        this.sdt = sdt;
        this.bac = bac;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CongNhan.sma = sma;
    }

    
    

    
    
}
