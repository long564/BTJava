import java.util.ArrayList;
import java.util.Scanner;

// Lop Nguoi
class Nguoi {
    private String hoTen_325;
    private String ngaySinh_325;
    private String queQuan_325;

    public Nguoi(String hoTen_325, String ngaySinh_325, String queQuan_325) {
        this.hoTen_325 = hoTen_325;
        this.ngaySinh_325 = ngaySinh_325;
        this.queQuan_325 = queQuan_325;
    }

    public String getHoTen_325() {
        return hoTen_325;
    }

    public String getNgaySinh_325() {
        return ngaySinh_325;
    }

    public String getQueQuan_325() {
        return queQuan_325;
    }

    public void hienThiThongTin_325() {
        System.out.println("Ho ten: " + hoTen_325);
        System.out.println("Ngay sinh: " + ngaySinh_325);
        System.out.println("Que quan: " + queQuan_325);
    }
}
