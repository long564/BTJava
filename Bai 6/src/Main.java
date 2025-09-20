import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc325 = new Scanner(System.in);
        ArrayList<KhachSan> danhSach325 = new ArrayList<>();

        System.out.print("Nhap so luong khach tro: ");
        int n325 = Integer.parseInt(sc325.nextLine());

        for (int i = 0; i < n325; i++) {
            System.out.println("\n--- Nhap thong tin khach tro thu " + (i+1) + " ---");
            KhachSan ks325 = new KhachSan();
            ks325.nhapThongTin325(sc325);
            danhSach325.add(ks325);
        }

        System.out.println("\n--- Danh sach khach tro ---");
        for (KhachSan ks325 : danhSach325) {
            ks325.hienThiThongTin325();
            System.out.println("-------------------------");
        }

        System.out.print("\nNhap so CMND khach muon tra phong: ");
        String cmnd325 = sc325.nextLine();
        KhachSan khachCanXoa325 = null;
        for (KhachSan ks325 : danhSach325) {
            if (ks325.getSoCMND325().equals(cmnd325)) {
                System.out.println("Khach nay can tra so tien: " + ks325.tinhTien325());
                khachCanXoa325 = ks325;
                break;
            }
        }
        if (khachCanXoa325 != null) {
            danhSach325.remove(khachCanXoa325);
            System.out.println("Da xoa khach co CMND: " + cmnd325);
        } else {
            System.out.println("Khong tim thay khach voi CMND: " + cmnd325);
        }

        System.out.println("\n--- Danh sach khach tro con lai ---");
        for (KhachSan ks325 : danhSach325) {
            ks325.hienThiThongTin325();
            System.out.println("-------------------------");
        }

        sc325.close();
    }
}
