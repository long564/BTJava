import java.util.Scanner;

public class TheMuon {
    private String soPhieuMuon325;
    private String ngayMuon325;
    private String hanTra325;
    private String soHieuSach325;
    private SinhVien sinhVien325;

    public void nhapThongTin325(Scanner sc325) {
        sinhVien325 = new SinhVien();
        System.out.println("=== Nhap thong tin sinh vien ===");
        sinhVien325.nhapThongTin325(sc325);

        System.out.print("Nhap so phieu muon: ");
        soPhieuMuon325 = sc325.nextLine();
        System.out.print("Nhap ngay muon: ");
        ngayMuon325 = sc325.nextLine();
        System.out.print("Nhap han tra: ");
        hanTra325 = sc325.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach325 = sc325.nextLine();
    }

    public void hienThiThongTin325() {
        System.out.println("\n=== Thong tin the muon ===");
        sinhVien325.hienThiThongTin325();
        System.out.println("So phieu muon: " + soPhieuMuon325);
        System.out.println("Ngay muon: " + ngayMuon325);
        System.out.println("Han tra: " + hanTra325);
        System.out.println("So hieu sach: " + soHieuSach325);
    }

    // Kiem tra han tra co phai cuoi thang khong
    public boolean isHanTraCuoiThang325() {
        if (hanTra325.endsWith("30") || hanTra325.endsWith("31")) {
            return true;
        }
        return false;
    }

    public SinhVien getSinhVien325() {
        return sinhVien325;
    }

    public String getSoHieuSach325() {
        return soHieuSach325;
    }

    public String getHanTra325() {
        return hanTra325;
    }
}
