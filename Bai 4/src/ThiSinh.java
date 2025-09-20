public class ThiSinh {
    private String soBaoDanh_325;
    private String hoTen_325;
    private String diaChi_325;
    private String uuTien_325;

    public ThiSinh(String soBaoDanh_325, String hoTen_325, String diaChi_325, String uuTien_325) {
        this.soBaoDanh_325 = soBaoDanh_325;
        this.hoTen_325 = hoTen_325;
        this.diaChi_325 = diaChi_325;
        this.uuTien_325 = uuTien_325;
    }

    public String getSoBaoDanh_325() {
        return soBaoDanh_325;
    }

    public void hienThiThongTin_325() {
        System.out.println("So bao danh: " + soBaoDanh_325);
        System.out.println("Ho ten: " + hoTen_325);
        System.out.println("Dia chi: " + diaChi_325);
        System.out.println("Uu tien: " + uuTien_325);
    }
}
