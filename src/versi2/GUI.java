package versi2;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class GUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField namaRuang;
	private JTextField lokasiRuang;
	private JTextField ProgStudi;
	private JTextField panjangRuangan;
	private JTextField LebarRuangan;
	private JTextField JumlahKursi;
	private JTextField JumlahPintu;
	private JTextField JumlahCendela;
	private JTextField JumlahStopKontak;
	private JTextField JumlahKabelLCD;
	private JTextField JumlahLampu;
	private JTextField LampuYangHidup;
	private JTextField LampuYangMati;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setSize(500,521);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public GUI() {
		setTitle("Inventaris Kelas");
		
		
		getContentPane().setLayout(null);
		
		JLabel lblNamaRuangan = new JLabel("Nama Ruangan");
		lblNamaRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNamaRuangan.setBounds(20, 71, 98, 19);
		getContentPane().add(lblNamaRuangan);
		
		JLabel lblIdentitasRuangKelas = new JLabel("IDENTITAS RUANG KELAS");
		lblIdentitasRuangKelas.setBounds(20, 24, 191, 26);
		getContentPane().add(lblIdentitasRuangKelas);
		
		JLabel label = new JLabel("_____________________________________________________________________");
		label.setBounds(10, 45, 484, 14);
		getContentPane().add(label);
		
		namaRuang = new JTextField();
		namaRuang.setBounds(221, 71, 165, 20);
		getContentPane().add(namaRuang);
		namaRuang.setColumns(10);
		
		JLabel lblLokasiRuang = new JLabel("Lokasi Ruang");
		lblLokasiRuang.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLokasiRuang.setBounds(20, 104, 98, 19);
		getContentPane().add(lblLokasiRuang);
		
		lokasiRuang = new JTextField();
		lokasiRuang.setBounds(221, 104, 165, 20);
		getContentPane().add(lokasiRuang);
		lokasiRuang.setColumns(10);
		
		JLabel lblProgramStudi = new JLabel("Program Studi/Fakultas");
		lblProgramStudi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblProgramStudi.setBounds(20, 134, 142, 19);
		getContentPane().add(lblProgramStudi);
		
		ProgStudi = new JTextField();
		ProgStudi.setBounds(221, 134, 165, 20);
		getContentPane().add(ProgStudi);
		ProgStudi.setColumns(10);
		
		JLabel lblPanjangRuangan = new JLabel("Panjang Ruangan");
		lblPanjangRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPanjangRuangan.setBounds(20, 243, 142, 19);
		getContentPane().add(lblPanjangRuangan);
		
		JLabel label_1 = new JLabel("_____________________________________________________________________");
		label_1.setBounds(10, 203, 484, 14);
		getContentPane().add(label_1);
		
		JLabel lblKondisiRuangKelas = new JLabel("KONDISI RUANG KELAS");
		lblKondisiRuangKelas.setBounds(10, 182, 191, 26);
		getContentPane().add(lblKondisiRuangKelas);
		
		panjangRuangan = new JTextField();
		panjangRuangan.setBounds(221, 243, 165, 20);
		getContentPane().add(panjangRuangan);
		panjangRuangan.setColumns(10);
		
		JLabel lblLebarRuangan = new JLabel("Lebar Ruangan");
		lblLebarRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLebarRuangan.setBounds(20, 288, 142, 19);
		getContentPane().add(lblLebarRuangan);
		
		LebarRuangan = new JTextField();
		LebarRuangan.setBounds(221, 288, 165, 20);
		getContentPane().add(LebarRuangan);
		LebarRuangan.setColumns(10);
		
		JLabel lblJumlahKursi = new JLabel("Jumlah Kursi");
		lblJumlahKursi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahKursi.setBounds(20, 328, 142, 19);
		getContentPane().add(lblJumlahKursi);
		
		JumlahKursi = new JTextField();
		JumlahKursi.setBounds(221, 328, 165, 20);
		getContentPane().add(JumlahKursi);
		JumlahKursi.setColumns(10);
		
		JLabel lblJumlahPintu = new JLabel("Jumlah Pintu");
		lblJumlahPintu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahPintu.setBounds(20, 371, 142, 19);
		getContentPane().add(lblJumlahPintu);
		
		JumlahPintu = new JTextField();
		JumlahPintu.setBounds(221, 371, 165, 20);
		getContentPane().add(JumlahPintu);
		JumlahPintu.setColumns(10);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahJendela.setBounds(20, 410, 142, 19);
		getContentPane().add(lblJumlahJendela);
		
		JumlahCendela = new JTextField();
		JumlahCendela.setBounds(221, 410, 165, 20);
		getContentPane().add(JumlahCendela);
		JumlahCendela.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Frame2_____________________________________________________________________________________________AA
				setTitle("keLAS");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 500, 547);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JLabel lblJumlahStopKontaksteker = new JLabel("Jumlah Stop Kontak/Steker");
				lblJumlahStopKontaksteker.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				lblJumlahStopKontaksteker.setBounds(22, 45, 172, 19);
				contentPane.add(lblJumlahStopKontaksteker);
				
				JumlahStopKontak = new JTextField();
				JumlahStopKontak.setBounds(249, 45, 137, 20);
				contentPane.add(JumlahStopKontak);
				JumlahStopKontak.setColumns(10);
				
				JLabel KondisiStopKontak = new JLabel("Kondisi Stop Kontak/Steker");
				KondisiStopKontak.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				KondisiStopKontak.setBounds(22, 89, 172, 19);
				contentPane.add(KondisiStopKontak);
				
				JLabel label = new JLabel("Jumlah Stop Kontak/Steker");
				label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				label.setBounds(22, 138, 172, 19);
				contentPane.add(label);
				
				JRadioButton rdbtnNewRadioButton = new JRadioButton("Dekat Dosen");
				rdbtnNewRadioButton.setBounds(249, 138, 109, 19);
				contentPane.add(rdbtnNewRadioButton);
				
				JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Dekat Mahasiswa dan dosen");
				rdbtnNewRadioButton_1.setBounds(249, 154, 200, 19);
				contentPane.add(rdbtnNewRadioButton_1);
				
				JRadioButton rdbtnLainlain = new JRadioButton("Lain-Lain");
				rdbtnLainlain.setBounds(249, 170, 109, 19);
				contentPane.add(rdbtnLainlain);
				
				JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Baik");
				rdbtnNewRadioButton_2.setBounds(249, 88, 109, 19);
				contentPane.add(rdbtnNewRadioButton_2);
				
				JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Kurang Baik");
				rdbtnNewRadioButton_3.setBounds(249, 104, 109, 23);
				contentPane.add(rdbtnNewRadioButton_3);
				
				JLabel lblJumlahKabelLcd = new JLabel("Jumlah Kabel LCD");
				lblJumlahKabelLcd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				lblJumlahKabelLcd.setBounds(22, 210, 172, 19);
				contentPane.add(lblJumlahKabelLcd);
				
				JumlahKabelLCD = new JTextField();
				JumlahKabelLCD.setBounds(249, 207, 137, 20);
				contentPane.add(JumlahKabelLCD);
				JumlahKabelLCD.setColumns(10);
				
				JLabel lblKondisiKabelLcd = new JLabel("Kondisi Kabel LCD");
				lblKondisiKabelLcd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				lblKondisiKabelLcd.setBounds(22, 255, 172, 19);
				contentPane.add(lblKondisiKabelLcd);
				
				JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Berfungsi");
				rdbtnNewRadioButton_4.setBounds(249, 251, 109, 23);
				contentPane.add(rdbtnNewRadioButton_4);
				
				JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Tidak Berfungsi");
				rdbtnNewRadioButton_5.setBounds(249, 269, 150, 23);
				contentPane.add(rdbtnNewRadioButton_5);
				
				JLabel lblPosisiKabelLcd = new JLabel("Posisi Kabel LCD");
				lblPosisiKabelLcd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				lblPosisiKabelLcd.setBounds(22, 313, 172, 19);
				contentPane.add(lblPosisiKabelLcd);
				
				JLabel label_1 = new JLabel("_____________________________________________________________________");
				label_1.setBounds(10, 23, 484, 14);
				contentPane.add(label_1);
				
				JLabel lblJumlahkondisiDanPosisi = new JLabel("Jumlah,Kondisi dan Posisi Sarana");
				lblJumlahkondisiDanPosisi.setBounds(10, 20, 184, 14);
				contentPane.add(lblJumlahkondisiDanPosisi);
				
				JRadioButton radioButton = new JRadioButton("Dekat Dosen");
				radioButton.setBounds(249, 313, 109, 19);
				contentPane.add(radioButton);
				
				JRadioButton radioButton_1 = new JRadioButton("Dekat Mahasiswa dan dosen");
				radioButton_1.setBounds(249, 329, 200, 19);
				contentPane.add(radioButton_1);
				
				JRadioButton radioButton_2 = new JRadioButton("Lain-Lain");
				radioButton_2.setBounds(249, 345, 109, 19);
				contentPane.add(radioButton_2);
				
				JLabel lblJumlah = new JLabel("Jumlah Lampu");
				lblJumlah.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				lblJumlah.setBounds(22, 378, 172, 19);
				contentPane.add(lblJumlah);
				
				JumlahLampu = new JTextField();
				JumlahLampu.setBounds(249, 378, 137, 19);
				contentPane.add(JumlahLampu);
				JumlahLampu.setColumns(10);
				
				JLabel lblLampuYangHidup = new JLabel("Lampu yang Hidup");
				lblLampuYangHidup.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				lblLampuYangHidup.setBounds(22, 408, 172, 19);
				contentPane.add(lblLampuYangHidup);
				
				LampuYangHidup = new JTextField();
				LampuYangHidup.setBounds(249, 406, 137, 20);
				contentPane.add(LampuYangHidup);
				LampuYangHidup.setColumns(10);
				
				JLabel lblLampuYangMati = new JLabel("Lampu yang Mati");
				lblLampuYangMati.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				lblLampuYangMati.setBounds(22, 438, 172, 19);
				contentPane.add(lblLampuYangMati);
				
				LampuYangMati = new JTextField();
				LampuYangMati.setBounds(249, 437, 137, 20);
				contentPane.add(LampuYangMati);
				LampuYangMati.setColumns(10);
				
				JButton Next0 = new JButton("Next");
				
				Next0.setBounds(380, 468, 89, 23);
				contentPane.add(Next0);
			}
		});
		btnNext.setBounds(395, 441, 70, 26);
		getContentPane().add(btnNext);
	}


	
	
}
