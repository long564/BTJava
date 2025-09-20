public class Nguoi {
    private String hoTen_325;
    private int namSinh_325;
    private String ngheNghiep_325;

    public Nguoi(String hoTen_325, int namSinh_325, String ngheNghiep_325) {
        this.hoTen_325 = hoTen_325;
        this.namSinh_325 = namSinh_325;
        this.ngheNghiep_325 = ngheNghiep_325;
    }

    public int getTuoi_325(int namHienTai_325) {
        return namHienTai_325 - namSinh_325;
    }

    public void hienThiThongTin_325() {
        System.out.println("Ho ten: " + hoTen_325 
            + ", Nam sinh: " + namSinh_325 
            + ", Nghe nghiep: " + ngheNghiep_325);
    }
}
