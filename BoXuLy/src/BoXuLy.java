import java.util.Scanner;

public class BoXuLy {

	static Scanner sc = new Scanner(System.in);
	
	private String tenBXL;
	private int soLuongNhan;
	private double xungNhip;
	
	public BoXuLy() {}
	public BoXuLy(String ten, int soLuong, double xungNhip) {
		this.tenBXL=ten;
		this.soLuongNhan=soLuong;
		this.xungNhip=xungNhip;
	}
	public String getTenBXL() {
		return tenBXL;
	}
	public void setTenBXL(String tenBXL) {
		this.tenBXL = tenBXL;
	}
	public int getSoLuongNhan() {
		return soLuongNhan;
	}
	public void setSoLuongNhan(int soLuongNhan) {
		this.soLuongNhan = soLuongNhan;
	}
	public double getXungNhip() {
		return xungNhip;
	}
	public void setXungNhip(double xungNhip) {
		this.xungNhip = xungNhip;
	}
	public void input() {
		System.out.print("\t+Nhap ten bo xu ly: ");
		this.tenBXL = sc.nextLine();
		System.out.print("\t+Nhap so luong nhan: ");
		this.soLuongNhan = sc.nextInt();
		System.out.print("\t+Nhap xung nhip: ");
		this.xungNhip=sc.nextDouble();
		sc.nextLine();
	}
	public void display() {
		System.out.println("\t+Ten bo xu ly: "+tenBXL+"\n\t+So luong nhan: "+soLuongNhan+"\n\t+Xung nhip: "+xungNhip);
	}
}
