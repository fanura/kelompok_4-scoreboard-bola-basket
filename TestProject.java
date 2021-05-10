import java.awt.event.*; 
import javax.swing.*; 
import java.awt.Font;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionListener;

public class TestProject extends Project1 implements ActionListener {
	private JFrame frame;
	private JLabel nama1, nama2;
	private JTextField input1, input2, skor1, skor2;
	private JTextArea note;
	private JScrollPane scroll;
	private JButton n1, n2, n3, m1, m2, m3, reset;
	private int nilai1, nilai2;
	private String teks = "";
	Project1 test;
	
	TestProject(){
		test = new Project1();
		nilai1 = test.getNilai1();
		nilai2 = test.getNilai2();
		
		frame = new JFrame();
		frame.setBounds(200,100,900,500);
		frame.setTitle("PAPAN SKOR");
		nama1 = new JLabel("Nama Tim");
		nama1.setBounds(140,70,100,20);
		frame.add(nama1);
		input1 = new JTextField();
		input1.setBounds(70,90,210,50);
		input1.setHorizontalAlignment(JTextField.CENTER);
		frame.add(input1);
		input1.setFont( new Font("Dialog", 1, 20));
		nama2 = new JLabel("Nama Tim");
		nama2.setBounds(670,70,100,20);
		frame.add(nama2);
		input2 = new JTextField();
		input2.setBounds(600,90,210,50);
		input2.setHorizontalAlignment(JTextField.CENTER);
		frame.add(input2);
		input2.setFont( new Font("Dialog", 1, 20));
		skor1 = new JTextField(""+nilai1);
		skor1.setBounds(70,150,210,150);
		skor1.setHorizontalAlignment(JTextField.CENTER);
		frame.add(skor1);
		skor1.setFont( new Font("Dialog", 1, 72));
		skor2 = new JTextField(""+nilai2);
		skor2.setBounds(600,150,210,150);
		skor2.setHorizontalAlignment(JTextField.CENTER);
		frame.add(skor2);
		skor2.setFont( new Font("Dialog", 1, 72));
		note = new JTextArea();
		scroll = new JScrollPane(note);
		scroll.setBounds(300,90,280,240);
		frame.add(scroll);
		n1 = new JButton("+1");
		frame.add(n1);
		n1.setBounds(80,350,50,50);
		n2 = new JButton("+2");
		frame.add(n2);
		n2.setBounds(150,350,50,50);
		n3 = new JButton("+3");
		frame.add(n3);
		n3.setBounds(220,350,50,50);
		m1 = new JButton("+1");
		frame.add(m1);
		m1.setBounds(600,350,50,50);
		m2 = new JButton("+2");
		frame.add(m2);
		m2.setBounds(670,350,50,50);
		m3 = new JButton("+3");
		frame.add(m3);
		m3.setBounds(740,350,50,50);
		reset = new JButton("Reset");
		frame.add(reset);
		reset.setBounds(400,350,90,50);
		frame.setLayout(null); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		reset.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==n1) {
			int bilangan = (Integer.parseInt(skor1.getText().trim()));
			test.setNilai1();
			nilai1 = test.getNilai1();
			skor1.setText(String.valueOf(nilai1)); 
			String tim = input1.getText().trim();
			teks = teks+test.pesan()+pesan(1,tim);
			note.setText(teks); 
		}
		if(e.getSource()==n2) {
			int bilangan = (Integer.parseInt(skor1.getText().trim()));
			test.setNilai1(2);
			nilai1 = test.getNilai1();
			skor1.setText(String.valueOf(nilai1));
			String tim = input1.getText().trim();
			teks = teks+test.pesan()+pesan(2,tim);
			note.setText(teks);
		}
		if(e.getSource()==n3) {
			int bilangan = (Integer.parseInt(skor1.getText().trim()));
			test.setNilai1(3);
			nilai1 = test.getNilai1();
			skor1.setText(String.valueOf(nilai1));
			String tim = input1.getText().trim();
			teks = teks+test.pesan()+pesan(3,tim);
			note.setText(teks);
		}
		if(e.getSource()==m1) {
			int bilangan = (Integer.parseInt(skor2.getText().trim()));
			test.setNilai2();
			nilai2 = test.getNilai2();
			skor2.setText(String.valueOf(nilai2));
			String tim = input2.getText().trim();
			teks = teks+test.pesan()+pesan(1,tim);
			note.setText(teks);
		}
		if(e.getSource()==m2) {
			int bilangan = (Integer.parseInt(skor2.getText().trim()));
			test.setNilai2(2);
			nilai2 = test.getNilai2();
			skor2.setText(String.valueOf(nilai2));
			String tim = input2.getText().trim();
			teks = teks+test.pesan()+pesan(2,tim);
			note.setText(teks);
		}
		if(e.getSource()==m3) {
			int bilangan = (Integer.parseInt(skor2.getText().trim()));
			test.setNilai2(3);
			nilai2 = test.getNilai2();
			skor2.setText(String.valueOf(nilai2)); 
			String tim = input2.getText().trim();
			teks = teks+test.pesan()+pesan(3,tim);
			note.setText(teks);
		}
		if(e.getSource()==reset) {
			test.reset();
			nilai1 = test.getNilai1();
			nilai2 = test.getNilai2();
			reset();
			input1.setText("");
			input2.setText("");
			skor1.setText(String.valueOf(nilai1));
			skor2.setText(String.valueOf(nilai2));
			note.setText(teks);
			jeda();
		}
	} 
	
	public String pesan(int n, String tim){
		String xyz = "\t"+tim+" mencetak "+n+" poin!!!\n";
		return xyz;
	}
	
	public void reset(){
		teks = "";
	}
	
	public void jeda(){
		try {
            Thread.sleep(2000);
        } 
		catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[]args){
		TestProject a = new TestProject();
	}
}
