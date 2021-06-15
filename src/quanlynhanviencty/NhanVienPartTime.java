package quanlynhanviencty;

public class NhanVienPartTime extends NhanVien {
    private double soGioLamViec;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public NhanVienPartTime(int maNhanVien, String hoVaTen, int age, int phoneNumber, String email, double soGioLamViec) {
        super(maNhanVien, hoVaTen, age, phoneNumber, email);
        this.soGioLamViec = soGioLamViec;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public String toString() {
        return "Thông tin NhanVienPartTime là:{" +
                "soGioLamViec=" + soGioLamViec + super.toString()+
                '}';
    }
}
