import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> danhSach_325 = new ArrayList<>();
    private Scanner sc_325 = new Scanner(System.in);

    // Them can bo moi
    public void themCanBo() {
        System.out.println("Chon loai can bo: 1. Cong nhan  2. Ky su  3. Nhan vien");
        int loai_325 = Integer.parseInt(sc_325.nextLine());

        System.out.print("Nhap ho ten: ");
        String hoTen_325 = sc_325.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh_325 = sc_325.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh_325 = sc_325.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi_325 = sc_325.nextLine();

        CanBo cb_325 = null;

        if (loai_325 == 1) {
            System.out.print("Nhap bac cong nhan: ");
            int bac_325 = Integer.parseInt(sc_325.nextLine());
            cb_325 = new CongNhan(hoTen_325, ngaySinh_325, gioiTinh_325, diaChi_325, bac_325);
        } else if (loai_325 == 2) {
            System.out.print("Nhap nganh dao tao: ");
            String nganh_325 = sc_325.nextLine();
            cb_325 = new KySu(hoTen_325, ngaySinh_325, gioiTinh_325, diaChi_325, nganh_325);
        } else if (loai_325 == 3) {
            System.out.print("Nhap cong viec: ");
            String congViec_325 = sc_325.nextLine();
            cb_325 = new NhanVien(hoTen_325, ngaySinh_325, gioiTinh_325, diaChi_325, congViec_325);
        }

        if (cb_325 != null) {
            danhSach_325.add(cb_325);
            System.out.println("Them can bo thanh cong!");
        }
    }

    // Tim kiem theo ho ten
    public void timKiemTheoTen(String ten_325) {
        boolean timThay_325 = false;
        for (CanBo cb_325 : danhSach_325) {
            if (cb_325.getHoTen().equalsIgnoreCase(ten_325)) {
                cb_325.hienThiThongTin();
                timThay_325 = true;
            }
        }
        if (!timThay_325) {
            System.out.println("Khong tim thay can bo co ten: " + ten_325);
        }
    }

    // Hien thi toan bo danh sach
    public void hienThiDanhSach() {
        for (CanBo cb_325 : danhSach_325) {
            cb_325.hienThiThongTin();
            System.out.println("--------------------");
        }
    }
}
