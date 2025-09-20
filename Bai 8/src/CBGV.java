import java.util.ArrayList;
import java.util.Scanner;
class CBGV extends Nguoi {
    private double luongCung325;
    private double thuong325;
    private double phat325;

    public void nhapThongTin325(Scanner sc325) {
        super.nhapThongTin325(sc325);
        System.out.print("Nhap luong cung: ");
        luongCung325 = Double.parseDouble(sc325.nextLine());
        System.out.print("Nhap thuong: ");
        thuong325 = Double.parseDouble(sc325.nextLine());
        System.out.print("Nhap phat: ");
        phat325 = Double.parseDouble(sc325.nextLine());
    }

    public void hienThiThongTin325() {
        super.hienThiThongTin325();
        System.out.println("Luong cung: " + luongCung325 +
                           ", Thuong: " + thuong325 +
                           ", Phat: " + phat325 +
                           ", Luong thuc linh: " + tinhLuongThucLinh325());
    }

    public double tinhLuongThucLinh325() {
        return luongCung325 + thuong325 - phat325;
    }
}