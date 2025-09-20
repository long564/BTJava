public class TaiLieu {
    private String maTaiLieu_325;
    private String tenNhaXuatBan_325;
    private int soBanPhatHanh_325;

    public TaiLieu(String maTaiLieu_325, String tenNhaXuatBan_325, int soBanPhatHanh_325) {
        this.maTaiLieu_325 = maTaiLieu_325;
        this.tenNhaXuatBan_325 = tenNhaXuatBan_325;
        this.soBanPhatHanh_325 = soBanPhatHanh_325;
    }

    public String getMaTaiLieu_325() {
        return maTaiLieu_325;
    }

    public void hienThiThongTin_325() {
        System.out.println("Ma TL: " + maTaiLieu_325);
        System.out.println("Nha XB: " + tenNhaXuatBan_325);
        System.out.println("So ban phat hanh: " + soBanPhatHanh_325);
    }
}
