import java.util.ArrayList;
import java.util.Scanner;
public class CanBo {
    private String hoTen_325;
    private String ngaySinh_325;
    private String gioiTinh_325;
    private String diaChi_325;

    public CanBo(String hoTen_325, String ngaySinh_325, String gioiTinh_325, String diaChi_325) {
        this.hoTen_325 = hoTen_325;
        this.ngaySinh_325 = ngaySinh_325;
        this.gioiTinh_325 = gioiTinh_325;
        this.diaChi_325 = diaChi_325;
    }

    public String getHoTen() {
        return hoTen_325;
    }

    public void setHoTen(String hoTen_325) {
        this.hoTen_325 = hoTen_325;
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen_325);
        System.out.println("Ngay sinh: " + ngaySinh_325);
        System.out.println("Gioi tinh: " + gioiTinh_325);
        System.out.println("Dia chi: " + diaChi_325);
    }
}