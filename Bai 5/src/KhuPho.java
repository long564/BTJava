import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> danhSachHo_325 = new ArrayList<>();

    public void nhapKhuPho_325(Scanner sc_325) {
        System.out.print("Nhap so ho dan: ");
        int n_325 = sc_325.nextInt();
        sc_325.nextLine();

        for (int i_325 = 0; i_325 < n_325; i_325++) {
            System.out.println("Nhap thong tin ho dan thu " + (i_325 + 1));
            HoDan ho_325 = new HoDan();
            ho_325.nhapHoDan_325(sc_325);
            danhSachHo_325.add(ho_325);
        }
    }

    public void hienThiThuongTho_325(int namHienTai_325) {
        System.out.println("Cac ho co nguoi thuong tho (>=80 tuoi):");
        for (HoDan ho_325 : danhSachHo_325) {
            if (ho_325.coNguoiThuongTho_325(namHienTai_325)) {
                ho_325.hienThiHoDan_325();
            }
        }
    }
}
