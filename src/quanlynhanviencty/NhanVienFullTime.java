package quanlynhanviencty;

public class NhanVienFullTime extends NhanVien{
    private double soTienThuong;
    private double soTienPhat;
    private double luongCung;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(double soTienThuong, double soTienPhat, double luongCung) {
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public NhanVienFullTime(int maNhanVien, String hoVaTen, int age, int phoneNumber, String email, double soTienThuong, double soTienPhat, double luongCung) {
        super(maNhanVien, hoVaTen, age, phoneNumber, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public double getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(double soTienThuong) {
        this.soTienThuong = soTienThuong;
    }

    public double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public String toString() {
        return "Thông Tin NhanVienFullTime là{" +
                "soTienThuong=" + soTienThuong +
                ", soTienPhat=" + soTienPhat +
                ", luongCung=" + luongCung + super.toString()+
                '}';
    }
}
