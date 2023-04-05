import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class Calculator extends JFrame {
	/*
	 * 		Utku Murat Atasoy / 211401019
	 * 		Yapay Zeka Muhendisligi
	 * 
	 * 
	 * 		Bu kod sayiyi girerken 2.haneyi ekledigimizde ekrani guncellemiyor fakat 3.hane girildigi takdirde sayiyi buradan itibaren basmaya devam ediyor.
	 *		Koddaki actionListener'lar duzgun calisiyor bu yuzden GUI ile ilgili bir sorun oldugunu dusunuyorum fakat tam olarak ne oldugunu bulamadim.
	 * 
	 */

	public JPanel contentPane;
	public JTextField textField;
	public JPanel panel;
	public MyGraphicPanel yeniEkran;
	
	private JButton sifirNumara;
	private JButton birNumara;
	private JButton ikiNumara;
	private JButton ucNumara;
	private JButton dortNumara;
	private JButton besNumara;
	private JButton altiNumara;
	private JButton yediNumara;
	private JButton sekizNumara;
	private JButton dokuzNumara;
	
	private JButton sifirlama;
	private JButton toplama;
	private JButton cikarma;
	private JButton carpma;
	private JButton bolme;
	private JButton esittir;
	private JButton nokta;
	private String yazilanRakam="";
	private boolean toplamaYap = false;
	private boolean cikarmaYap = false;
	private boolean carpmaYap = false;
	private boolean bolmeYap = false;
	
	private double ilkSayi;
	private double ikinciSayi;
	
	public Calculator() {
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800,1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel ekran = new JPanel();
		ekran.setBounds(10, 10, 770, 120);
		contentPane.add(ekran);
		ekran.setLayout(new BorderLayout(0, 0));
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 40));
		ekran.add(textField, BorderLayout.CENTER);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		textField.setEditable(false);
		textField.setVisible(false);
		panel = new JPanel();
		panel.setBounds(20, 138, 766, 697);
		contentPane.add(panel);
		
		ekran.removeAll();
		yeniEkran = new MyGraphicPanel("",1,1);
		yeniEkran.setBounds(10, 10, 770, 120);
		yeniEkran.setLayout(new BorderLayout(0, 0));
		ekran.add(yeniEkran, BorderLayout.CENTER);
		
		
		sifirlama = new JButton("C");
		sifirlama.setFont(new Font("Arial", Font.PLAIN, 20));
		sifirlama.setForeground(Color.WHITE);
		sifirlama.setBackground(Color.BLUE);
		sifirlama.setBounds(10, 10, 746, 30);
		sifirlama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Sifirlama islemi.");
				textField.setText("");
	            toplamaYap = false;
	            cikarmaYap = false;
	            carpmaYap = false;
	            bolmeYap = false;
	            ilkSayi = 0;
	            ikinciSayi = 0;
	            textField.setVisible(false);
	            
	        		ekran.remove(yeniEkran);
	        		yeniEkran = new MyGraphicPanel("",1,1);
	                yeniEkran.setBounds(10, 10, 770, 120);
	                yeniEkran.setLayout(new BorderLayout(0, 0));
	        		ekran.add(yeniEkran, BorderLayout.CENTER);
	        		yeniEkran.repaint();
	        		contentPane.add(ekran);
	        		
			}
		});
		panel.setLayout(null);
		panel.add(sifirlama);
		
		sifirNumara = new JButton("0");
		sifirNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "0");
	            yazilanRakam+="0";
	            
	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
			}
		});
		sifirNumara.setForeground(Color.WHITE);
		sifirNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		sifirNumara.setBackground(Color.BLUE);
		sifirNumara.setBounds(50, 530, 150, 150);
		panel.add(sifirNumara);
		
		nokta = new JButton(".");
		nokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 yazilanRakam = textField.getText();
		            textField.setText(yazilanRakam + ".");
		            yazilanRakam+=".";
		            ekran.remove(yeniEkran);
	        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
	                yeniEkran.setBounds(10, 10, 770, 120);
	                yeniEkran.setLayout(new BorderLayout(0, 0));
	        		ekran.add(yeniEkran, BorderLayout.CENTER);
	        		yeniEkran.repaint();
	        		contentPane.add(ekran);
			}
		});
		nokta.setForeground(Color.WHITE);
		nokta.setFont(new Font("Arial", Font.PLAIN, 30));
		nokta.setBackground(Color.BLUE);
		nokta.setBounds(210, 531, 150, 150);
		panel.add(nokta);
		
		birNumara = new JButton("1");
		birNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "1");
	            yazilanRakam+="1";

	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
			}
		});
		
		
		birNumara.setForeground(Color.WHITE);
		birNumara.setBackground(Color.BLUE);
		birNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		birNumara.setBounds(50, 370, 150, 150);
		panel.add(birNumara);
		
		
		ikiNumara = new JButton("2");
		ikiNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "2");
	            yazilanRakam+="2";
	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
			}
		});
		ikiNumara.setForeground(Color.WHITE);
		ikiNumara.setBackground(Color.BLUE);
		ikiNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		ikiNumara.setBounds(210, 371, 150, 150);
		panel.add(ikiNumara);
		
		ucNumara = new JButton("3");
		ucNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "3");
	            yazilanRakam+="3";

	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
			}
		});
		ucNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		ucNumara.setBounds(370, 371, 150, 150);
		ucNumara.setBackground(Color.BLUE);
		ucNumara.setForeground(Color.WHITE);
		panel.add(ucNumara);
		
		dortNumara = new JButton("4");
		dortNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "4");
	            yazilanRakam+="4";

	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
			}
		});
		dortNumara.setForeground(Color.WHITE);
		dortNumara.setBackground(Color.BLUE);
		dortNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		dortNumara.setBounds(50, 210, 150, 150);
		panel.add(dortNumara);
		
		besNumara = new JButton("5");
		besNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "5");
	            yazilanRakam+="5";

	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
			}
		});
		besNumara.setForeground(Color.WHITE);
		besNumara.setBackground(Color.BLUE);
		besNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		besNumara.setBounds(210, 211, 150, 150);
		panel.add(besNumara);
		
		altiNumara = new JButton("6");
		altiNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "6");
	            yazilanRakam+="6";

	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
			}
		});
		altiNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		altiNumara.setForeground(Color.WHITE);
		altiNumara.setBackground(Color.BLUE);
		altiNumara.setBounds(370, 211, 150, 150);
		panel.add(altiNumara);
		
		yediNumara = new JButton("7");
		yediNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		yediNumara.setForeground(Color.WHITE);
		yediNumara.setBackground(Color.BLUE);
		yediNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "7");
	            yazilanRakam+="7";

	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
        		
			}
		});
		yediNumara.setBounds(50, 50, 150, 150);
		panel.add(yediNumara);
		
		sekizNumara = new JButton("8");
		sekizNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		sekizNumara.setForeground(Color.WHITE);
		sekizNumara.setBackground(Color.BLUE);
		sekizNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "8");
	            yazilanRakam+="8";

	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
        		
			}
		});
		sekizNumara.setBounds(210, 50, 150, 150);
		panel.add(sekizNumara);
		
		dokuzNumara = new JButton("9");
		dokuzNumara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            yazilanRakam = textField.getText();
	            textField.setText(yazilanRakam + "9");
	            yazilanRakam+="9";
	            
	            ekran.remove(yeniEkran);
        		yeniEkran = new MyGraphicPanel(yazilanRakam+"",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
        		
        		
			}
		});
		dokuzNumara.setForeground(Color.WHITE);
		dokuzNumara.setBackground(Color.BLUE);
		dokuzNumara.setFont(new Font("Arial", Font.PLAIN, 30));
		dokuzNumara.setBounds(370, 50, 150, 150);
		panel.add(dokuzNumara);
		
		
		
		
		
		
		

		
		
		
		
		// ISLEMLER
		toplama = new JButton("+");
		toplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            ilkSayi = Double.parseDouble(textField.getText());
	            textField.setText("");
	            toplamaYap = true;
	            yazilanRakam="";
	            ekran.remove(yeniEkran);
	            yeniEkran = new MyGraphicPanel("",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
			}
		});
		toplama.setFont(new Font("Arial", Font.PLAIN, 35));
		toplama.setForeground(Color.WHITE);
		toplama.setBackground(Color.BLUE);
		toplama.setBounds(567, 50, 150, 150);
		panel.add(toplama);
		
		
		cikarma = new JButton("-");
		cikarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            ilkSayi = Double.parseDouble(textField.getText());
	            textField.setText("");
	            cikarmaYap = true;
	            yazilanRakam="";
	            ekran.remove(yeniEkran);
	            yeniEkran = new MyGraphicPanel("",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
			}
		});
		cikarma.setFont(new Font("Arial", Font.PLAIN, 35));
		cikarma.setForeground(Color.WHITE);
		cikarma.setBackground(Color.BLUE);
		cikarma.setBounds(567, 209, 150, 150);
		panel.add(cikarma);
		
		
		carpma = new JButton("×");
		carpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            ilkSayi = Double.parseDouble(textField.getText());
	            textField.setText("");
	            carpmaYap = true;
	            yazilanRakam="";
	            ekran.remove(yeniEkran);
	            yeniEkran = new MyGraphicPanel("",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
			}
		});
		carpma.setFont(new Font("Arial", Font.PLAIN, 30));
		carpma.setBackground(Color.BLUE);
		carpma.setForeground(Color.WHITE);
		carpma.setBounds(567, 369, 150, 150);
		panel.add(carpma);
		
		
		
		bolme = new JButton("÷");
		bolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            ilkSayi = Double.parseDouble(textField.getText());
	            textField.setText("");
	            bolmeYap = true;
	            yazilanRakam="";
	            ekran.remove(yeniEkran);
	            yeniEkran = new MyGraphicPanel("",1,1);
                yeniEkran.setBounds(10, 10, 770, 120);
                yeniEkran.setLayout(new BorderLayout(0, 0));
        		ekran.add(yeniEkran, BorderLayout.CENTER);
        		yeniEkran.repaint();
        		contentPane.add(ekran);
	            
			}
		});
		bolme.setForeground(Color.WHITE);
		bolme.setFont(new Font("Arial", Font.PLAIN, 30));
		bolme.setBackground(Color.BLUE);
		bolme.setBounds(567, 529, 150, 150);
		panel.add(bolme);
		
		
		
		
		
		esittir = new JButton("=");
		esittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            ikinciSayi = Double.parseDouble(textField.getText());
	            if (toplamaYap) {
	                ikinciSayi=ilkSayi+ikinciSayi;
	                System.out.println(ikinciSayi);
	                
	                ekran.remove(yeniEkran);
	        		yeniEkran = new MyGraphicPanel(ikinciSayi+"",1,1);
                    yeniEkran.setBounds(10, 10, 770, 120);
                    yeniEkran.setLayout(new BorderLayout(0, 0));
            		ekran.add(yeniEkran, BorderLayout.CENTER);
            		yeniEkran.repaint();
            		contentPane.add(ekran);
	            }
	            else if (cikarmaYap) {
	                ikinciSayi=ilkSayi-ikinciSayi;
	                System.out.println(ikinciSayi);
	                
	                
	                ekran.remove(yeniEkran);
	        		yeniEkran = new MyGraphicPanel(ikinciSayi+"",1,1);
                    yeniEkran.setBounds(10, 10, 770, 120);
                    yeniEkran.setLayout(new BorderLayout(0, 0));
            		ekran.add(yeniEkran, BorderLayout.CENTER);
            		yeniEkran.repaint();
            		contentPane.add(ekran);
	            }
	            else if (carpmaYap) {
	                ikinciSayi = ilkSayi*ikinciSayi;
	                System.out.println(ikinciSayi);
	                textField.setText(Double.toString(ikinciSayi));

	        		
	                ekran.remove(yeniEkran);
	        		yeniEkran = new MyGraphicPanel(ikinciSayi+"",1,1);
                    yeniEkran.setBounds(10, 10, 770, 120);
                    yeniEkran.setLayout(new BorderLayout(0, 0));
            		ekran.add(yeniEkran, BorderLayout.CENTER);
            		yeniEkran.repaint();
            		contentPane.add(ekran);
	            }
	            else if (bolmeYap) {
	            	ikinciSayi = ilkSayi / ikinciSayi;
	            	System.out.println(ikinciSayi);
	           
	            	ekran.remove(yeniEkran);
	        		yeniEkran = new MyGraphicPanel(ikinciSayi+"",1,1);
                    yeniEkran.setBounds(10, 10, 770, 120);
                    yeniEkran.setLayout(new BorderLayout(0, 0));
            		ekran.add(yeniEkran, BorderLayout.CENTER);
            		yeniEkran.repaint();
            		contentPane.add(ekran);
	            }
	            
	            textField.setText(Double.toString(ikinciSayi));
	            toplamaYap = false;
	            cikarmaYap = false;
	            carpmaYap = false;
	            bolmeYap = false;
			}
		});
		esittir.setForeground(Color.WHITE);
		esittir.setFont(new Font("Arial", Font.PLAIN, 30));
		esittir.setBackground(Color.BLUE);
		esittir.setBounds(370, 531, 150, 150);
		panel.add(esittir);
		
	}
}