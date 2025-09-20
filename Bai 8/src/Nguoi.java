import java.util.ArrayList;
import java.util.Scanner;
class Nguoi {
    private String hoTen325;
    private String ngaySinh325;
    private String queQuan325;

    public void nhapThongTin325(Scanner sc325) {
        System.out.print("Nhap ho ten: ");
        hoTen325 = sc325.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh325 = sc325.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan325 = sc325.nextLine();
    }

    public void hienThiThongTin325() {
        System.out.println("Ho ten: " + hoTen325 +
                           ", Ngay sinh: " + ngaySinh325 +
                           ", Que quan: " + queQuan325);
    }
}