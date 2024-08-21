import bai_tap_doc_gia.DanhSachDocGia;
import oop.SinhVien;
import oop.SinhVienNN;
import oop.SinhVienVN;

public class Main {
    public static void main(String[] args) {
//        SinhVien a = new SinhVien("Le Meo", 5.6f, 7.5f);
//        a.xuat();
//
//        SinhVien b = new SinhVien();
//        b.setName("Le Tho");
//        b.setToan(7.4f);
//        b.setVan(9.5f);
//        b.xuat();
//
//        System.out.println("Diem trung binh: " + a.dtb());
//        System.out.println("Diem trung binh 2 sinh vien: " + a.dtb(b));

        SinhVienVN s1 = new SinhVienVN();
        s1.xuat();

        SinhVienNN s2 = new SinhVienNN();
        s2.noiNhieu();
        s2.suDungDienThoai();

        DanhSachDocGia ds = new DanhSachDocGia();
        ds.nhap();
        ds.xuat();
        System.out.println("Tồng tiền của các độc giả: " + ds.tongTien());
        System.out.println("So doc gia tre em: " + ds.soDocGiaTreEm());
    }
}