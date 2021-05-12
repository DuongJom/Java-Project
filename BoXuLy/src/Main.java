import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static void nhapDS(List<BoXuLy> a, int n) {
		for(int i=0;i<n;i++) {
			System.out.println("- Nhap thong tin bo xu ly thu "+(i+1)+":");
			BoXuLy b = new BoXuLy();
			b.input();
			a.add(b);
		}
	}
	static void xuatDS(List<BoXuLy> a) {
		for(int i=0;i<a.size();i++) {
			System.out.println("\n- Thong tin bo xu ly thu "+(i+1)+":");
			a.get(i).display();
		}
	}
	static void Sua(List<BoXuLy> a) {
		sc.nextLine();
		System.out.print("Nhap ten bo xu ly can sua: ");
		String ten = sc.nextLine();
		boolean flag=false;
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getTenBXL().equals(ten)) {
				System.out.println("Ban muon sua thong tin gi?");
				System.out.println("1. Ten bo xu ly");
				System.out.println("2. So luong nhan");
				System.out.println("3. Xung nhip");
				System.out.print("Moi chon thong tin can sua: ");
				int chon = sc.nextInt();
				sc.nextLine();
				switch(chon) {
				case 1:
					System.out.print("Nhap ten moi: ");
					a.get(i).setTenBXL(sc.nextLine());
					break;
				case 2:
					System.out.print("Nhap so luong moi: ");
					a.get(i).setSoLuongNhan(sc.nextInt());
					break;
				case 3:
					System.out.print("Nhap xung nhip moi: ");
					a.get(i).setXungNhip(sc.nextDouble());
					break;
				default:
					System.out.println("Khong co thong tin ban can!");
					break;
				}
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Khong tim thay bo xu ly can sua");
		xuatDS(a);
		sc.nextLine();
	}
	static void Xoa(List<BoXuLy> a) {
		System.out.print("Nhap ten bo xu ly can xoa: ");
		String ten = sc.nextLine();
		boolean flag=false;
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getTenBXL().equals(ten)) {
				a.remove(i);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Khong tim thay bo xu ly can xoa");
		xuatDS(a);
	}
	static void sapXep(List<BoXuLy> a) {
		BoXuLy[] b = new BoXuLy[a.size()];
		for(int i=0;i<a.size();i++) {
			b[i]=a.get(i);
		}
		for(int i=0;i<b.length-1;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i].getSoLuongNhan()*b[i].getXungNhip()>b[j].getSoLuongNhan()*b[j].getXungNhip()) {
					BoXuLy tmp = b[i];
					b[i]=b[j];
					b[j]=tmp;
				}
			}
		}
		int j=1;
		for(BoXuLy i:b) {
			System.out.println("- Thong tin bo xu ly thu "+j+":");
			i.display();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============================NHAP DANH SACH BO XU LY========================");
		System.out.print("Nhap so luong bo xu ly: ");
		int n = sc.nextInt();
		List<BoXuLy> a = new ArrayList<BoXuLy>();
		nhapDS(a,n);
		System.out.println("============================SUA THONG TIN BO XU LY========================");
		Sua(a);
		//sc.nextLine();
		System.out.println("=================================XOA BO XU LY=============================");
		Xoa(a);
		System.out.println("===========================SAP XEP DANH SACH BO XU LY========================");
		sapXep(a);
	}

}
