import java.util.ArrayList;
import java.util.Scanner;
class HSHocSinh extends Nguoi {
    private String lop_325;
    private String khoaHoc_325;
    private String kyHoc_325;

    public HSHocSinh(String hoTen_325, String ngaySinh_325, String queQuan_325,
                     String lop_325, String khoaHoc_325, String kyHoc_325) {
        super(hoTen_325, ngaySinh_325, queQuan_325);
        this.lop_325 = lop_325;
        this.khoaHoc_325 = khoaHoc_325;
        this.kyHoc_325 = kyHoc_325;
    }

    public String getLop_325() {
        return lop_325;
    }

    @Override
    public void hienThiThongTin_325() {
        super.hienThiThongTin_325();
        System.out.println("Lop: " + lop_325);
        System.out.println("Khoa hoc: " + khoaHoc_325);
        System.out.println("Ky hoc: " + kyHoc_325);
    }
}