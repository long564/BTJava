import java.util.Scanner;

class KhachSan {
    private Nguoi nguoi325;  
    private int soNgayTro325;
    private String loaiPhong325;
    private double giaPhong325;

    public void nhapThongTin325(Scanner sc325) {
        nguoi325 = new Nguoi();
        nguoi325.nhapThongTin325(sc325);

        System.out.print("Nhap so ngay tro: ");
        soNgayTro325 = Integer.parseInt(sc325.nextLine());

        System.out.print("Nhap loai phong: ");
        loaiPhong325 = sc325.nextLine();

        System.out.print("Nhap gia phong (1 ngay): ");
        giaPhong325 = Double.parseDouble(sc325.nextLine());
    }

    public void hienThiThongTin325() {
        nguoi325.hienThiThongTin325();
        System.out.println("So ngay tro: " + soNgayTro325 +
                           ", Loai phong: " + loaiPhong325 +
                           ", Gia phong/ngay: " + giaPhong325);
    }

    public String getSoCMND325() {
        return nguoi325.getSoCMND325();
    }

    public double tinhTien325() {
        return soNgayTro325 * giaPhong325;
    }
}
