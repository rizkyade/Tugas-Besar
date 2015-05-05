import java.util.Scanner;

public class Control {

	Model kelas = new Model();

	Scanner in = new Scanner(System.in);

	// ade start coding
	public void inputIdentitasRuang(){
		System.out.println("Input nama ruang : ");
		kelas.setNamaRuang(in.nextLine());
		System.out.println("Input lokasi ruang : ");
		kelas.setLokasiRuang(in.nextLine());
		System.out.println("Input Program Studi : ");
		kelas.setProgramStudi(in.nextLine());
	}
	
	public void inputKursiPintuJendela(){
		System.out.println("Input jumlah kursi");
		kelas.setJumlahKursi(in.nextInt());in.nextLine();
		System.out.println("Input jumlah Pintu");
		kelas.setJumlahPintu(in.nextInt());in.nextLine();
		System.out.println("Input Jumlah jendela");
		kelas.setJumlahJendela(in.nextInt());
	}
	
	public void inputKondisiRuang(){
		System.out.println("Input Panjang ruang");
		kelas.setPanjangKelas(in.nextDouble());
		System.out.println("Input Lebar Ruag");
		kelas.setLebarKelas(in.nextDouble());
		
	}
	
	public void inputSarana() {
		System.out.println("Masukan jumlah steker");
		kelas.setSteker(in.nextInt());
		in.nextLine();
		System.out.println("Berapa jumlah steker berfungsi?");
		kelas.setKondisiSteker(in.nextInt());
		in.nextLine();
		System.out.println("Di mana posisi steker?");
		kelas.setPosisiSteker(in.nextLine());

		System.out.println("Masukan Jumlah kabel LCD");
		kelas.setKabelLCD(in.nextInt());
		in.nextLine();
		System.out.println("Bagaimana kondisi kabel?");
		kelas.setKondisiKabelLCD(in.nextLine());
		System.out.println("Di mana posisi kabel?");
		kelas.setPosisiKabelLCD(in.nextLine());

		System.out.println("Masukan jumlah lampu");
		kelas.setLampu(in.nextInt());
		in.nextLine();
		System.out.println("Berapa jumlah lampu berfungsi?");
		kelas.setLampuBerfungsi(in.nextInt());
		in.nextLine();
		System.out.println("Di mana posisi lampu?");
		kelas.setPosisiLampu(in.nextLine());

		System.out.println("Masukan jumlah kipas");
		kelas.setKipas(in.nextInt());
		in.nextLine();
		System.out.println("Berapa jumlah kipas berfungsi?");
		kelas.setKipasBerfungsi(in.nextInt());
		in.nextLine();
		System.out.println("Di mana posisi kipas?");
		kelas.setPosisiKipas(in.nextLine());

		System.out.println("Masukan jumlah AC");
		kelas.setAC(in.nextInt());
		in.nextLine();
		System.out.println("Bagaimana kondisi AC?");
		kelas.setKondisiAC(in.nextLine());
		System.out.println("DI mana posisi AC?");
		kelas.setPosisiAC(in.nextLine());

		System.out.println("Masukan nama SSID");
		kelas.setSSID(in.nextLine());

		System.out.println("Masukan jumlah CCTV");
		kelas.setCCTV(in.nextInt());
		in.nextLine();
		System.out.println("berapa CCTV yang berfungsi?");
		kelas.setJumlahCCTVberfungsi(in.nextInt());
		in.nextLine();
		System.out.println("Di mana posisi CCTV");
		kelas.setPosisiCCTV(in.nextLine());
		
		
	}
	//ade stop coding
	
	//tri putra start coding
	void InputKebersihan (){
		System.out.println("Masukan Kondisi lantai : ");
		kelas.setKondisiLantai (in.nextLine());
		System.out.println("Masukan Kondisi Dinding : ");
		kelas.setKondisiDinding (in.nextLine());
		System.out.println("Masukan Kondisi Atap : ");
		kelas.setKondisiAtap (in.nextLine());
		System.out.println("Masukan Kondisi Pintu : ");
		kelas.setKondisiPintu (in.nextLine());
		System.out.println("Masukan Kondisi Jendela : ");
		kelas.setKondisiJendela (in.nextLine());
	}
		
	void InputPencahayaan (){
		System.out.println("Masukan Kondisi Pencahayaan : ");
		kelas.setPencahayaan (in.nextInt());
	}
	
	void InputSirkulasi (){
		System.out.println("Masukan Sirkulasi : ");
		kelas.setSirkulasiudara (in.nextLine());
	}
	
	void InputSuhu (){
		System.out.println("Masukan Suhu : ");
		kelas.setSuhu (in.nextInt());
	}

	void InputKelembapan (){
		System.out.println("Masukan Kondisi Kelembapan : ");
		kelas.setKelembapan (in.nextInt());
	}
	//tri putra stop coding
	
	//sandy start coding
	void inputKeamananRuangKelas() {

		System.out.print("\n1.kokoh" + "\n2.Tidak kokoh");
		System.out.println("\nTingkant kekokohan \t:");
		kelas.setKekokohan(in.nextInt());

		System.out.print("\n1.ada" + "\n2.Tidak ada");
		System.out.println("\n ada pintu Cendala  \t:");
		kelas.setKuncipintudanjendela(in.nextInt());

		System.out.print("\n1.Bahaya" + "\n2.Tidak Bahaya");
		System.out.println("\nTingkant bahaya \t:");
		kelas.setBahaya(in.nextInt());

	}

	void inputKenyamananRuangKelas() {

		System.out.print("\n1.bising" + "\n2.Tidak Bising");
		System.out.println("\nTingkant kebisingan \t:");
		kelas.setKebisingan(in.nextInt());

		System.out.print("\n1.bau" + "\n2.Tidak Bau");
		System.out.println("\nTingkant Bau Ruangan \t:");
		kelas.setBau(in.nextInt());

		System.out.print("\n1.bocor" + "\n2.Tidak Bocor");
		System.out.println("\nTingkant kebocoran kelas \t:");
		kelas.setKebocoran(in.nextInt());

		System.out.print("\n1.rusak" + "\n2.Tidak Rusak");
		System.out.println("\nTingkat kerusakan kelas \t:");
		kelas.setKerusakan(in.nextInt());

		System.out.print("\n1.aus" + "\n2.Tidak aus");
		System.out.println("\nTingkant keausan \t:");
		kelas.setKeausan(in.nextInt());

	}
	
	void analisisKeamananRuangKelas() {
		if (kelas.getKekokohan() == 1)
			System.out.println("Tingkant kekokohan \t:Sesuai");
		else if (kelas.getKekokohan() == 2)
			System.out.println("Tingkant kekokohan \t:Tidak sesuai");
		if (kelas.getKuncipintudanjendela() == 1)
			System.out.println("pintu Cendala  \t\t:Sesuai");
		else if (kelas.getKuncipintudanjendela() == 2)
			System.out.println("\n pintu Cendala  \t\t:Tidak Sesuai");
		if (kelas.getBahaya() == 1)
			System.out.println("Tingkant Bahaya \t: Tidak Sesuai");
		else if (kelas.getBahaya() == 2)
			System.out.println("Tingkant bahaya \t:Sesuai");
	}

	void analisisKenyamananRuangKelas() {
		if (kelas.getKebisingan() == 1)
			System.out.print("Tingkat Kebisingan \t:Tidak Sesuai\n");
		else if (kelas.getKebisingan() == 2)
			System.out.print("Tingkat Kebisingan \t:Sesuai\n");

		if (kelas.getBau() == 1)
			System.out.print("Tingkat Bau \t:Tidak Sesuai\n");
		else if (kelas.getBau() == 2)
			System.out.print("Tingkat Bau \t:Sesuai\n");

		if (kelas.getKebocoran() == 1)
			System.out.print("Tingkat Kebocoran \t:Tidak Sesuai\n");
		else if (kelas.getKebocoran() == 2)
			System.out.print("Tingkat Kebocoran \t:Sesuai\n");

		if (kelas.getKerusakan() == 1)
			System.out.print("Tingkat Kerusakan \t:Tidak Sesuai\n");
		else if (kelas.getKerusakan() == 2)
			System.out.print("Tingkat Kerusakan \t:Sesuai\n");

		if (kelas.getKerusakan() == 1)
			System.out.print("Tingkat Kerusakan \t:Tidak Sesuai\n");
		else if (kelas.getKerusakan() == 2)
			System.out.print("Tingkat Kerusakan \t:Sesuai\n");

		if (kelas.getKeausan() == 1)
			System.out.print("Tingkat Keausan \t:Tidak Sesuai\n");
		else if (kelas.getKeausan() == 2)
			System.out.print("Tingkat Keausan \t:Sesuai\n");
	}
	//sandy stop coding

	//ade start coding
	String kondisiRuangKelas(){
		String result = "Kondisi ruang kelas Tidak sesuai";
		double luas = kelas.getPanjangKelas()*kelas.getPanjangKelas();
		System.out.println("Luas Kelas adalah : "+luas);
		if(kelas.getPanjangKelas()!=kelas.getLebarKelas()){
			System.out.println("Bentuk kelas Sesuai");
			if(luas/kelas.getJumlahKursi()>=0.5){
				System.out.println("Rasio Kelas sesuai");
				if(kelas.getJumlahPintu()>=2&&kelas.getJumlahJendela()>=1){
					System.out.println("Jumlah pintu dan jendela sesuai");
					result = "Kondisi ruang kelas Sesuai";
				}
				else System.out.println("Jumlah pintu dan jendela tidak sesuai");
			}
			else System.out.println("Rasio tidak sesuai");
		}
		else System.out.println("Bentuk kelas tidak sesuai");
		
		return result;
	}

	
	String analisisKelistrikan() {
		String result = "Kelistrikan tidak sesuai";
		if (kelas.getSteker() >= 4) {
			System.out.println("Jumlah Steker Sesuai");
			if (kelas.getKondisiSteker() >= 4) {
				System.out.println("Kondisi Steker Sesuai");
				if (kelas.getPosisiSteker().equals("pojok dekat dosen")) {
					result = "Kelistrikan Sesuai";
					System.out.println("Posisi Steker Sesuai");
				}
				else System.out.println("Posisi Steker tidak Sesuai");
			}
			else System.out.println("Kondisi Steker tidak Sesuai");

		}
		else System.out.println("Jumlah Steker tidak Sesuai");
		return result;
	}

	String analisisLCD() {
		String result = "LCD tidak sesuai";
		if (kelas.getKabelLCD() >= 1) {
			System.out.println("Jumlah kabel LCD sesuai");
			if (kelas.getKondisiKabelLCD().equals("berfungsi")) {
				System.out.println("Kabel berfungsi");
				if (kelas.getPosisiKabelLCD().equals("pojok dekat dosen")) {
					System.out.println("Posisi kabel Sesuai");
					result = "Kabel LCD sesuai";
				}
				else System.out.println("Posisi kabel Tidak Sesuai");
			}
			else System.out.println("Kabel Tidak bergungsi");

		}
		else System.out.println("Jumlah kabel LCD tidak Sesuai");
		return result;
	}

	String analisisLampu() {
		String result = "Lampu Tidak Sesuai";
		if (kelas.getLampu() >= 18) {
			System.out.println("Jumlah Lampu sesuai");
			if (kelas.getLampuBerfungsi() >= 18) {
				System.out.println("Kondisi Lampu baik sesuai");
				if (kelas.getPosisiLampu().equals("Langit langit ruangan")) {
					System.out.println("Posisi Lampu Sesuai");
					result = "Lampu sesuai";
				}
				else System.out.println("Posisi lampu tidak sesuai");
			}
			else System.out.println("Kondisi lampu tidak sesuai");
		}
		else System.out.println("Jumlah lampu tidak sesuai");
		
		return result;
	}

	String analisisKipas() {
		String result = "Kipas tidak sesuai";
		if (kelas.getKipas() >= 2) {
			System.out.println("Jumlah kipas sesuai");
			if (kelas.getKipasBerfungsi() >= 2) {
				System.out.println("Jumlah kipas berfungsi sesuai");
				if (kelas.getPosisiKipas().equals("Langit langit ruangan")) {
					System.out.println("Posisi kipas Sesuai");
					result = "Kipas Sesuai";
				}
				else System.out.println("Posisi kipas sesuai");
			}
			else System.out.println("Jumlah kipas berfungsi tidak sesuai");
		}
		else System.out.println("Jumlah kipas tidak sesuai");
		return result;
	}

	String analisisAC() {
		String result = "AC tidak sesuai";
		if (kelas.getAC() >= 1) {
			System.out.println("Jumlah AC sesuai");
			if (kelas.getKondisiAC().equals("baik")) {
				System.out.println("Fungsi AC sesuai");
				if (kelas.getPosisiAC().equals("Belakang")
						|| kelas.getPosisiAC().equals("Samping")) {
					System.out.println("Posisi AC Sesuai");
					result = "AC sesuai";
				}
				else System.out.println("posisi AC tidak sesuai");
			}
			else System.out.println("kondisi AC tidak sesuai");
		}
		else System.out.println("Jumlah AC tidak sesuai");
		return result;
	}

	String analisisInternet() {
		String result = "Internet tidak sesuai";
		if (kelas.getSSID().equals("UMM Hotspot")) {
			System.out.println("SSID sesuai");
			if (kelas.isLoginState()) {
				System.out.println("Login sukses");
				result = "Internet sesuai";
			}
			else System.out.println("Gagal login");
		}
		else System.out.println("SSID tidak sesuai");
		return result;
	}

	String analisisCCTV() {
		String result = "CCTV tidak sesuai";
		if (kelas.getCCTV() >= 2) {
			System.out.println("Jumlah CCTV sesuai");
			if (kelas.getJumlahCCTVberfungsi() == 2) {
				System.out.println("fungsi CCTV sesuai");
				if (kelas.getPosisiCCTV().equals("Belakang")
						|| kelas.getPosisiCCTV().equals("Depan")) {
					System.out.println("Posisi CCTV Sesuai");
					result = "CCTV sesuai";
				}
				else System.out.println("Posisi CCTV tidak sesuai");
			}
			else System.out.println("CCTV yang berfungsi tidak sesuai");
		}
		else System.out.println("Jumlah CCTV tidak sesuai");
		return result;
	}
	// ade stop coding

	//tri putra start coding
	String AnalisisKebersihan() {
		int NilaiBersih = 0;
		String result;

		if (kelas.getKondisiLantai().equals("Baik"))
			NilaiBersih += 1;
		if (kelas.getKondisiDinding().equals("Baik"))
			NilaiBersih += 1;
		if (kelas.getKondisiAtap().equals("Baik"))
			NilaiBersih += 1;
		if (kelas.getKondisiPintu().equals("baik"))
			NilaiBersih += 1;
		if (kelas.getKondisiJendela().equals("Baik"))
			NilaiBersih += 1;
		if (NilaiBersih >= 3) {
			//int nilai = (JOptionPane.showMessageDialog(null,"sesuai"+NilaiBersih)) ;
			result = "Sesuai";
		} else {
			result = "tidak sesuai";
		}
		return result;
	}

	String AnalisisSirkulasi() {
		String result ;
		if (kelas.getSirkulasiudara().equals("Baik")) {
			result = "Sesuai";
		} else {
		result = "Tidak Sesuai";

		}
		return result;

	}

	int AnalisisPencahayaan() {
		int result = 0;
		if (kelas.getPencahayaan() >= 250 && kelas.getPencahayaan() <= 350) {
			 System.out.println ("Sesuai");
		} else {
			System.out.println ("Tidak Sesuai");

		}
		return result ;
		

	}

	String AnalisisKelembapan() {
		String result ;
		if (kelas.getKelembapan() >= 70 && kelas.getKelembapan() <= 80) {
			result = "Sesuai";
		} else {
			result = "Tidak Sesuai";

		}
		return result ;
	}

	int AnalisisSuhu() {
		int result = 0 ;
		if (kelas.getSuhu() >= 25 && kelas.getSuhu() <= 30) {
			System.out.println ("Sesuai");
		} else {
			System.out.println ("Tidak Sesuai");

		}
		return result ;
	}

}
//tri putra stop coding
