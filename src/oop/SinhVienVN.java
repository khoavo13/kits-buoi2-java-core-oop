package oop;

public class SinhVienVN extends SinhVien{
    private float trietHoc;
    public SinhVienVN (){
        super();
    }
    public SinhVienVN(float trietHoc) {
        super();
        this.trietHoc = trietHoc;
    }

    public SinhVienVN(String name, float toan, float van, float trietHoc) {
        super(name, toan, van);
        this.trietHoc = trietHoc;
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Triết học: " + this.trietHoc);
    }

}
