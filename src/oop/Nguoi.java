package oop;

public interface Nguoi {
     void noiNhieu();
     default void suDungDienThoai(){
        System.out.println("Su dung dien thoai");
    }
}
