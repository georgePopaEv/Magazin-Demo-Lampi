package ro.ugal.student.magazin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import ro.ugal.student.magazin.models.Lampa;
import ro.ugal.student.magazin.models.db.ListLampa;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Font;

public class MainWindow {

	private JFrame frame;
	private JTextField lampaFieldPret;
	private JTextField LampaFieldGarantie;
	private JTextField lampaFieldCod;
	private JTextField lampaFieldTipIntrerupator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(240, 240, 240));
		frame.setFont(null);
		frame.getContentPane().setForeground(Color.RED);
		ListLampa lampi = new ListLampa();
		
		frame.setBounds(100, 100, 815, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel textDisplay = new JPanel();
		textDisplay.setBounds(10, 184, 781, 299);
		frame.getContentPane().add(textDisplay);
		textDisplay.setLayout(null);
	
		JTextArea productsDisplayArea = new JTextArea();
		productsDisplayArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		productsDisplayArea.setForeground(Color.BLUE);
		productsDisplayArea.setBounds(10, 10, 761, 289);
		textDisplay.add(productsDisplayArea);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Definire Lampa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 770, 128);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPret = new JLabel("Pret:");
		lblPret.setBounds(10, 20, 29, 13);
		panel.add(lblPret);
		
		lampaFieldPret = new JTextField();
		lampaFieldPret.setBounds(52, 17, 96, 19);
		panel.add(lampaFieldPret);
		lampaFieldPret.setColumns(10);
		
		
		
		JComboBox<Object> lampaFieldRetur = new JComboBox<Object>();
		lampaFieldRetur.setModel(new DefaultComboBoxModel<Object>(new String[] {"Da", "Nu"}));
		lampaFieldRetur.setBounds(396, 16, 43, 21);
		panel.add(lampaFieldRetur);
		
		JComboBox<Object> lampaFieldDeschidere = new JComboBox<Object>();
		lampaFieldDeschidere.setModel(new DefaultComboBoxModel<Object>(new String[] {"DA", "NU"}));
		lampaFieldDeschidere.setBounds(698, 16, 48, 21);
		panel.add(lampaFieldDeschidere);
		
		JLabel lblGarantie = new JLabel("Garantie:");
		lblGarantie.setBounds(158, 20, 57, 13);
		panel.add(lblGarantie);
		
		JButton btnSalvareLampa = new JButton("Salvare");
		btnSalvareLampa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Lampa lampa = new Lampa();
				
				lampa.setPret(Integer.valueOf(lampaFieldPret.getText()));
				lampa.setRetur(lampaFieldRetur.getSelectedItem().toString().equals("Da") ? true : false);
				lampa.setDeschidereColet(lampaFieldDeschidere.getSelectedItem().toString().equals("DA") ? true : false);
				lampa.setGarantie(Integer.valueOf(LampaFieldGarantie.getText()));
				lampa.setCodProdus(lampaFieldCod.getText());
				lampa.setTipIntrerupator(lampaFieldTipIntrerupator.getText());
				lampi.add(lampa);
				lampaFieldPret.setText("");
				lampaFieldCod.setText("");
				LampaFieldGarantie.setText("");
				lampaFieldTipIntrerupator.setText("");
				productsDisplayArea.setText(lampi.toString());
			}
		});
		btnSalvareLampa.setBounds(675, 57, 85, 21);
		panel.add(btnSalvareLampa);
		
		LampaFieldGarantie = new JTextField();
		LampaFieldGarantie.setBounds(204, 17, 29, 19);
		panel.add(LampaFieldGarantie);
		LampaFieldGarantie.setColumns(10);
		
		JLabel lblCod = new JLabel("Cod:");
		lblCod.setBounds(243, 20, 29, 13);
		panel.add(lblCod);
		
		lampaFieldCod = new JTextField();
		lampaFieldCod.setBounds(274, 17, 74, 19);
		panel.add(lampaFieldCod);
		lampaFieldCod.setColumns(10);
		
		JLabel lblRetur = new JLabel("Retur:");
		lblRetur.setBounds(358, 20, 35, 13);
		panel.add(lblRetur);
		
		JLabel lblTip = new JLabel("Intrerupator:");
		lblTip.setBounds(449, 20, 74, 13);
		panel.add(lblTip);
		
		lampaFieldTipIntrerupator = new JTextField();
		lampaFieldTipIntrerupator.setBounds(525, 17, 96, 19);
		panel.add(lampaFieldTipIntrerupator);
		lampaFieldTipIntrerupator.setColumns(10);
		
		JLabel lblDeschidere = new JLabel("Deschidere:");
		lblDeschidere.setBounds(631, 20, 57, 13);
		panel.add(lblDeschidere);
		
	}
}
