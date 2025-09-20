import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> danhSach_325 = new ArrayList<>();
    private Scanner sc_325 = new Scanner(System.in);

    public void nhapTaiLieu_325() {
        System.out.println("Chon loai tai lieu: 1. Sach  2. Tap chi  3. Bao");
        int loai_325 = sc_325.nextInt();
        sc_325.nextLine();

        System.out.print("Nhap ma tai lieu: ");
        String ma_325 = sc_325.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        String nxb_325 = sc_325.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        int soBan_325 = sc_325.nextInt();
        sc_325.nextLine();

        switch (loai_325) {
            case 1:
                System.out.print("Nhap ten tac gia: ");
                String tg_325 = sc_325.nextLine();
                System.out.print("Nhap so trang: ");
                int trang_325 = sc_325.nextInt();
                danhSach_325.add(new Sach(ma_325, nxb_325, soBan_325, tg_325, trang_325));
                break;
            case 2:
                System.out.print("Nhap so phat hanh: ");
                int soPh_325 = sc_325.nextInt();
                System.out.print("Nhap thang phat hanh: ");
                int thang_325 = sc_325.nextInt();
                danhSach_325.add(new TapChi(ma_325, nxb_325, soBan_325, soPh_325, thang_325));
                break;
            case 3:
                sc_325.nextLine();
                System.out.print("Nhap ngay phat hanh: ");
                String ngay_325 = sc_325.nextLine();
                danhSach_325.add(new Bao(ma_325, nxb_325, soBan_325, ngay_325));
                break;
            default:
                System.out.println("Loai khong hop le!");
        }
    }

    public void timKiemTheoLoai_325(int loai_325) {
        for (TaiLieu tl_325 : danhSach_325) {
            if ((loai_325 == 1 && tl_325 instanceof Sach) ||
                (loai_325 == 2 && tl_325 instanceof TapChi) ||
                (loai_325 == 3 && tl_325 instanceof Bao)) {
                tl_325.hienThiThongTin_325();
                System.out.println("---------------------");
            }
        }
    }

    public void timKiemTheoMa_325(String ma_325) {
        for (TaiLieu tl_325 : danhSach_325) {
            if (tl_325.getMaTaiLieu_325().equals(ma_325)) {
                tl_325.hienThiThongTin_325();
                return;
            }
        }
        System.out.println("Khong tim thay tai lieu voi ma: " + ma_325);
    }
}
