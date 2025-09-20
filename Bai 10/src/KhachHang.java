import java.util.Scanner;

public class KhachHang {
    private String hoTen325;
    private String soNha325;
    private String maCongTo325;

    // Nhap thong tin khach hang
    public void nhapThongTin325(Scanner sc325) {
        System.out.print("Nhap ho ten chu ho: ");
        hoTen325 = sc325.nextLine();
        System.out.print("Nhap so nha: ");
        soNha325 = sc325.nextLine();
        System.out.print("Nhap ma cong to: ");
        maCongTo325 = sc325.nextLine();
    }

    // Hien thi thong tin khach hang
    public void hienThiThongTin325() {
        System.out.println("Ho ten: " + hoTen325 +
                           ", So nha: " + soNha325 +
                           ", Ma cong to: " + maCongTo325);
    }
}
