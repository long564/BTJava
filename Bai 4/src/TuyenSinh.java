import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<ThiSinh> danhSach_325 = new ArrayList<>();
    private Scanner sc_325 = new Scanner(System.in);

    // 1. Nhap thong tin thi sinh
    public void nhapThiSinh_325() {
        System.out.println("Chon khoi thi: 1. Khoi A  2. Khoi B  3. Khoi C");
        int loai_325 = sc_325.nextInt();
        sc_325.nextLine();

        System.out.print("Nhap so bao danh: ");
        String sbd_325 = sc_325.nextLine();
        System.out.print("Nhap ho ten: ");
        String ten_325 = sc_325.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi_325 = sc_325.nextLine();
        System.out.print("Nhap uu tien: ");
        String uuTien_325 = sc_325.nextLine();

        switch (loai_325) {
            case 1:
                danhSach_325.add(new ThiSinhKhoiA(sbd_325, ten_325, diaChi_325, uuTien_325));
                break;
            case 2:
                danhSach_325.add(new ThiSinhKhoiB(sbd_325, ten_325, diaChi_325, uuTien_325));
                break;
            case 3:
                danhSach_325.add(new ThiSinhKhoiC(sbd_325, ten_325, diaChi_325, uuTien_325));
                break;
            default:
                System.out.println("Loai khong hop le!");
        }
    }

    // 2. Hien thi thong tin 1 thi sinh (vi du: thi sinh dau tien trong danh sach)
    // 2. Hien thi thong tin mot thi sinh (nguoi dung chon vi tri)
public void hienThiMotThiSinh_325() {
    if (danhSach_325.isEmpty()) {
        System.out.println("Danh sach trong!");
        return;
    }

    System.out.println("Danh sach co " + danhSach_325.size() + " thi sinh.");
    System.out.print("Nhap vi tri thi sinh muon hien thi (1 - " + danhSach_325.size() + "): ");
    int viTri_325 = sc_325.nextInt();
    sc_325.nextLine(); 

    if (viTri_325 >= 1 && viTri_325 <= danhSach_325.size()) {
        System.out.println("Thong tin thi sinh thu " + viTri_325 + ":");
        danhSach_325.get(viTri_325 - 1).hienThiThongTin_325();
    } else {
        System.out.println("Vi tri khong hop le!");
    }
}


    // 3. Tim kiem theo SBD
    public void timKiemThiSinh_325(String sbd_325) {
        for (ThiSinh ts_325 : danhSach_325) {
            if (ts_325.getSoBaoDanh_325().equals(sbd_325)) {
                System.out.println("Da tim thay thi sinh:");
                ts_325.hienThiThongTin_325();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co SBD: " + sbd_325);
    }
}
