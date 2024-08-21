package bai_tap_doc_gia;

import java.util.Scanner;

public class DocGia_NguoiLon  extends  DocGia{
    private String so_CCCD;

    public DocGia_NguoiLon() {
        this.setGia(10000);
    }

    public String getSo_CCCD() {
        return so_CCCD;
    }

    public void setSo_CCCD(String so_CCCD) {
        this.so_CCCD = so_CCCD;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so CCCD: ");
        this.so_CCCD = sc.nextLine();
        super.nhap();
    }
    @Override
    public void xuat(){
        System.out.print("So CCCD: " + this.so_CCCD);
        super.xuat();
    }

    @Override
    public long tongGia() {
        return this.getGia() * this.getThang();
    }
}
