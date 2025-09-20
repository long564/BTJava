import java.util.Scanner;

public class BienLai {
    private KhachHang khach325;
    private int chiSoCu325;
    private int chiSoMoi325;

    // Nhap thong tin bien lai
    public void nhapThongTin325(Scanner sc325) {
        khach325 = new KhachHang();
        khach325.nhapThongTin325(sc325);

        System.out.print("Nhap chi so cu: ");
        chiSoCu325 = Integer.parseInt(sc325.nextLine());

        System.out.print("Nhap chi so moi: ");
        chiSoMoi325 = Integer.parseInt(sc325.nextLine());
    }

    // Hien thi thong tin bien lai
    public void hienThiThongTin325() {
        khach325.hienThiThongTin325();
        System.out.println("Chi so cu: " + chiSoCu325 +
                           ", Chi so moi: " + chiSoMoi325 +
                           ", So tien phai tra: " + tinhTien325());
    }

    // Tinh tien dien
    public int tinhTien325() {
        return (chiSoMoi325 - chiSoCu325) * 750;
    }
}
