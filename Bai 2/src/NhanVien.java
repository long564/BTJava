import java.util.ArrayList;
import java.util.Scanner;
public class NhanVien extends CanBo {
    private String congViec_325;

    public NhanVien(String hoTen_325, String ngaySinh_325, String gioiTinh_325, String diaChi_325, String congViec_325) {
        super(hoTen_325, ngaySinh_325, gioiTinh_325, diaChi_325);
        this.congViec_325 = congViec_325;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cong viec: " + congViec_325);
    }
}
