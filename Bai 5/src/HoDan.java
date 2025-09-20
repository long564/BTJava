import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private int soThanhVien_325;
    private String soNha_325;
    private ArrayList<Nguoi> thanhVien_325 = new ArrayList<>();

    public void nhapHoDan_325(Scanner sc_325) {
        System.out.print("Nhap so nha: ");
        soNha_325 = sc_325.nextLine();

        System.out.print("Nhap so thanh vien: ");
        soThanhVien_325 = sc_325.nextInt();
        sc_325.nextLine();

        for (int i_325 = 0; i_325 < soThanhVien_325; i_325++) {
            System.out.println("Nhap thong tin thanh vien thu " + (i_325 + 1));
            System.out.print("Ho ten: ");
            String ten_325 = sc_325.nextLine();
            System.out.print("Nam sinh: ");
            int namSinh_325 = sc_325.nextInt();
            sc_325.nextLine();
            System.out.print("Nghe nghiep: ");
            String nghe_325 = sc_325.nextLine();

            thanhVien_325.add(new Nguoi(ten_325, namSinh_325, nghe_325));
        }
    }

    public boolean coNguoiThuongTho_325(int namHienTai_325) {
        for (Nguoi n_325 : thanhVien_325) {
            if (n_325.getTuoi_325(namHienTai_325) >= 80) {
                return true;
            }
        }
        return false;
    }

    public void hienThiHoDan_325() {
        System.out.println("So nha: " + soNha_325 + ", So thanh vien: " + soThanhVien_325);
        for (Nguoi n_325 : thanhVien_325) {
            n_325.hienThiThongTin_325();
        }
    }
}
