package oop;

public class SinhVien {
    private String name;
    private float toan;
    private float van;

    public SinhVien() {
    }

    public SinhVien(String name, float toan, float van) {
        this.name = name;
        this.toan = toan;
        this.van = van;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public void xuat(){
        System.out.println("Ho ten: " + this.name + " , diem van: "+ this.van + " , diem toan: " + this.toan);
    }

    // overloading
    // Tinh diem trung binh cho chinh sinh vien do
    public float dtb(){
        return (this.toan + this.van)/2;
    }
    // Tính diem trung binh 2 sinh vien
    public float dtb(SinhVien s1){
        return (this.dtb() + s1.dtb())/2;
    }
}
