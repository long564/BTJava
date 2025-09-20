import java.util.Scanner;

class Nguoi {
    private String hoTen325;
    private String ngaySinh325;
    private String soCMND325;

    public void nhapThongTin325(Scanner sc325) {
        System.out.print("Nhap ho ten: ");
        hoTen325 = sc325.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh325 = sc325.nextLine();
        System.out.print("Nhap so CMND: ");
        soCMND325 = sc325.nextLine();
    }

    public void hienThiThongTin325() {
        System.out.println("Ho ten: " + hoTen325 + 
                           ", Ngay sinh: " + ngaySinh325 + 
                           ", CMND: " + soCMND325);
    }

    public String getSoCMND325() {
        return soCMND325;
    }
}
