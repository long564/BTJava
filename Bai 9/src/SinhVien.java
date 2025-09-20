import java.util.Scanner;

public class SinhVien {
    private String hoTen325;
    private String maSV325;
    private String ngaySinh325;
    private String lop325;

    public void nhapThongTin325(Scanner sc325) {
        System.out.print("Nhap ho ten: ");
        hoTen325 = sc325.nextLine();
        System.out.print("Nhap ma SV: ");
        maSV325 = sc325.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh325 = sc325.nextLine();
        System.out.print("Nhap lop: ");
        lop325 = sc325.nextLine();
    }

    public void hienThiThongTin325() {
        System.out.println("Ho ten: " + hoTen325);
        System.out.println("Ma SV: " + maSV325);
        System.out.println("Ngay sinh: " + ngaySinh325);
        System.out.println("Lop: " + lop325);
    }

    public String getHoTen325() {
        return hoTen325;
    }
}
