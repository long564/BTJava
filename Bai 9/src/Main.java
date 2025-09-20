import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc325 = new Scanner(System.in);
        ArrayList<TheMuon> danhSach325 = new ArrayList<>();

        System.out.print("Nhap so luong the muon: ");
        int n325 = Integer.parseInt(sc325.nextLine());

        for (int i = 0; i < n325; i++) {
            System.out.println("\n--- Nhap the muon thu " + (i + 1) + " ---");
            TheMuon tm325 = new TheMuon();
            tm325.nhapThongTin325(sc325);
            danhSach325.add(tm325);
        }

        System.out.println("\n=== Danh sach sinh vien can tra sach cuoi thang ===");
        for (TheMuon tm325 : danhSach325) {
            if (tm325.isHanTraCuoiThang325()) {
                tm325.getSinhVien325().hienThiThongTin325();
                System.out.println("Sach muon: " + tm325.getSoHieuSach325());
                System.out.println("Han tra: " + tm325.getHanTra325());
                System.out.println("-------------------------");
            }
        }

        sc325.close();
    }
}
