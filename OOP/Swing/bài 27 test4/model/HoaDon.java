
package model;

import java.io.Serializable;

public class HoaDon implements Serializable{
    private NguoiMuaVe nguoimuave;
    private LoaiVe loaive;

    public HoaDon() {
    }

    public HoaDon(NguoiMuaVe nguoimuave, LoaiVe loaive) {
        this.nguoimuave = nguoimuave;
        this.loaive = loaive;
    }

    public NguoiMuaVe getNguoimuave() {
        return nguoimuave;
    }

    public void setNguoimuave(NguoiMuaVe nguoimuave) {
        this.nguoimuave = nguoimuave;
    }

    public LoaiVe getLoaive() {
        return loaive;
    }

    public void setLoaive(LoaiVe loaive) {
        this.loaive = loaive;
    }
    
    public Object[] toObject(){
        return new Object[]{
            nguoimuave, loaive
        };
    }
}
