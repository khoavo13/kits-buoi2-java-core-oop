package bai_tap_doc_gia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachDocGia {
    private List<DocGia> arr;
    public DanhSachDocGia() {
        this.arr = new ArrayList<>();
    }

    public void nhap(){
        System.out.println("1: Doc gia tre em");
        System.out.println("2: Doc gia nguoi lon");
        System.out.println("3: Thoat");

        while (true){
            System.out.print("Lua chon: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            DocGia d;
            if (option == 1){
                d = new DocGia_TreEm();

            }
            else if (option == 2){
                d = new DocGia_NguoiLon();

            }
            else {
                break;
            }
            d.nhap();
            arr.add(d);
        }
    }

    public void xuat(){
        for (DocGia d : arr){
            d.xuat();
        }
    }
    public long tongTien(){
        long tong = 0;
        for (DocGia d : this.arr){
            tong += d.tongGia();
        }
        return tong;
    }

    public int soDocGiaTreEm(){
        int count = 0;
        for (DocGia d : this.arr){
            if (d instanceof DocGia_TreEm){
                count++;
            }
        }
        return count;
    }
}
