package ro.ugal.student.magazin;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ro.ugal.student.magazin.models.Lampa;
import ro.ugal.student.magazin.models.LampaSmartExterior;
import ro.ugal.student.magazin.models.LampaSmartInterior;
import ro.ugal.student.magazin.models.Prelungitoare;
import ro.ugal.student.magazin.models.SursaIluminat;
import ro.ugal.student.magazin.models.db.ListLampSmartExterior;
import ro.ugal.student.magazin.models.db.ListLampSmartInterior;
import ro.ugal.student.magazin.models.db.ListLampa;
import ro.ugal.student.magazin.models.db.ListPrelungitoare;
import ro.ugal.student.magazin.models.db.ListSursaIluminat;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class StartWindow {

	private JFrame frame;
	private JTable table;

	ListLampa listaLampa = new ListLampa();
	ListLampSmartExterior listLampSmartExterior = new ListLampSmartExterior();
	ListLampSmartInterior listLampSmartInterior = new ListLampSmartInterior();
	ListPrelungitoare listPrelungitoare = new ListPrelungitoare();
	ListSursaIluminat listSursaIluminat = new ListSursaIluminat();
	private JTextField textPret;
	private JTextField textGarantie;
	private JTextField textCod;
	private JTextField textTipIntrerupator;
	private JTextField textPretExt;
	private JTextField textGarantieExt;
	private JTextField textCodExt;
	private JTextField textTipIntrerupatorExt;
	private JTextField textPretInt;
	private JTextField textIntrerupatorInt;
	private JTextField textCodInt;
	private JTextField textGarantieInt;
	private JTextField textPretPrelungitor;
	private JTextField textGarantiePrelungitor;
	private JTextField textCodPrelungitor;
	private JTextField textIntrerupatorPrelungitor;
	private JTextField textPretSursa;
	private JTextField textGarantieSursa;
	private JTextField textCodSursa;
	private JTextField textIntrerupatorSursa;
	private JTextField textFormaExt;
	private JTextField textFunctiiExt;
	private JTextField textTensiuneExt;
	private JTextField textPutereExt;
	private JTextField textTemperaturaExt;
	private JTextField textSurseExt;
	private JTextField textAutonomieExt;
	private JTextField textDurataIncarcareExt;
	private JComboBox<Object> comboBoxTipAcumulatorExt;
	private JTextField textPutereSursa;
	private JTextField textFormaInt;
	private JTextField textFunctiiInt;
	private JTextField textPutereWInt;
	private JTextField textSurseIluminatInt;
	private JTextField textNumarPrizePrelungitor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartWindow window = new StartWindow();
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
	public StartWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1022, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ComboBoxModel<Object> daNuModel = new DefaultComboBoxModel<>(new String[] {"Da", "Nu"});
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1008, 568);
		frame.getContentPane().add(tabbedPane);
		
		table = new JTable();
		table.setBounds(10, 124, 983, 407);
		
		JPanel panelView = new JPanel();
		tabbedPane.addTab("View", null, panelView, null);
		panelView.setLayout(null);
		
		JButton btnLampi = new JButton("Lampi");
		btnLampi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLampi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TableModel tm = new DefaultTableModel(15, 6);
				tm.setValueAt("COD", 0, 0);
				tm.setValueAt("Pret", 0, 1);
				tm.setValueAt("Garantie (luni)", 0, 2);
				tm.setValueAt("Tip Intrerupator", 0, 3);
				tm.setValueAt("Deschidere Colet", 0, 4);
				tm.setValueAt("Retur", 0, 5);
				
				int index = 1;
				for(Lampa lampa : listaLampa.getLampLista()) {
					tm.setValueAt(lampa.getCodProdus(), index, 0);
					tm.setValueAt(lampa.getPret(), index, 1);
					tm.setValueAt(lampa.getGarantie(), index, 2);
					tm.setValueAt(lampa.getTipIntrerupator(), index, 3);
					tm.setValueAt(lampa.isDeschidereColet() ? "Da" : "Nu", index, 4);
					tm.setValueAt(lampa.isRetur()  ? "Da" : "Nu", index, 5);
					index++;
					
				}
				
				table.setModel(tm);
			}
		});
		btnLampi.setBounds(10, 10, 185, 100);
		panelView.add(btnLampi);
		
		JButton btnLampiSExt = new JButton("Lampi S. Ext");
		btnLampiSExt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLampiSExt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TableModel tm = new DefaultTableModel(15, 21);
				int counter = 0;
				tm.setValueAt("Cod", 0, counter++);
				tm.setValueAt("Pret", 0, counter++);
				tm.setValueAt("Garantie (luni)", 0, counter++);
				tm.setValueAt("Tip Intrerupator", 0, counter++);
				tm.setValueAt("Deschidere Colet", 0, counter++);
				tm.setValueAt("Retur", 0, counter++);
				tm.setValueAt("Tip Montare", 0, counter++);
				tm.setValueAt("Stil", 0, counter++);
				tm.setValueAt("Forma", 0, counter++);
				tm.setValueAt("Material", 0, counter++);
				tm.setValueAt("Culoare", 0, counter++);
				tm.setValueAt("Functii", 0, counter++);
				tm.setValueAt("Tip Bec", 0, counter++);
				tm.setValueAt("Tip Lumina", 0, counter++);
				tm.setValueAt("Tip Acumulator", 0, counter++);
				tm.setValueAt("Tip Alimentare", 0, counter++);
				tm.setValueAt("Putere", 0, counter++);
				tm.setValueAt("Temperatura", 0, counter++);
				tm.setValueAt("Nr Surse", 0, counter++);
				tm.setValueAt("Autonomie", 0, counter++);
				tm.setValueAt("Durata incarcare", 0, counter++);
				
				
				int index = 1;
				for(LampaSmartExterior lampa : listLampSmartExterior.getLampaSmartExteriors()) {
					counter = 0;
					tm.setValueAt(lampa.getCodProdus(), index, counter++);
					tm.setValueAt(lampa.getPret(), index, counter++);
					tm.setValueAt(lampa.getGarantie(), index, counter++);
					tm.setValueAt(lampa.getTipIntrerupator(), index, counter++);
					tm.setValueAt(lampa.isDeschidereColet() ? "Da" : "Nu", index, counter++);
					tm.setValueAt(lampa.isRetur()  ? "Da" : "Nu", index, counter++);
					tm.setValueAt(lampa.getTipmontare(), index, counter++);
					tm.setValueAt(lampa.getStil(), index, counter++);
					tm.setValueAt(lampa.getForma(), index, counter++);
					tm.setValueAt(lampa.getMaterial(), index, counter++);
					tm.setValueAt(lampa.getCuloare(), index, counter++);
					tm.setValueAt(lampa.getFunctii(), index, counter++);
					tm.setValueAt(lampa.getTipbec(), index, counter++);
					tm.setValueAt(lampa.getTiplumina(), index, counter++);
					tm.setValueAt(lampa.getTipaacumulator(), index, counter++);
					tm.setValueAt(lampa.getTensiunealimentare(), index, counter++);
					tm.setValueAt(lampa.getPutere(), index, counter++);
					tm.setValueAt(lampa.getTemperaturaculoare(), index, counter++);
					tm.setValueAt(lampa.getNrsurseiluminat(), index, counter++);
					tm.setValueAt(lampa.getAutonomie(), index, counter++);
					tm.setValueAt(lampa.getDurataincarcare(), index, counter++);

					index++;
					
				}
				
				table.setModel(tm);
			}
		});
		btnLampiSExt.setBounds(205, 10, 185, 100);
		panelView.add(btnLampiSExt);
		
		JButton btnLampiSInt = new JButton("Lampi S. Int");
		btnLampiSInt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLampiSInt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TableModel tm = new DefaultTableModel(15, 16);
				int counter = 0;
				
				tm.setValueAt("Cod", 0, counter++);
				tm.setValueAt("Pret", 0, counter++);
				tm.setValueAt("Garantie (luni)", 0, counter++);
				tm.setValueAt("Tip Intrerupator", 0, counter++);
				tm.setValueAt("Deschidere Colet", 0, counter++);
				tm.setValueAt("Retur", 0, counter++);
				tm.setValueAt("Tip Montare", 0, counter++);
				tm.setValueAt("Stil", 0, counter++);
				tm.setValueAt("Forma", 0, counter++);
				tm.setValueAt("Material", 0, counter++);
				tm.setValueAt("Culoare", 0, counter++);
				tm.setValueAt("Functii", 0, counter++);
				tm.setValueAt("Clasa Eficienta", 0, counter++);
				tm.setValueAt("Putere (W)", 0, counter++);
				tm.setValueAt("Tip Bec", 0, counter++);
				tm.setValueAt("Nr Surse", 0, counter++);
				
				
				int index = 1;
				for(LampaSmartInterior lampa : listLampSmartInterior.getLampaSmartInteriors()) {
					counter = 0;
					tm.setValueAt(lampa.getCodProdus(), index, counter++);
					tm.setValueAt(lampa.getPret(), index, counter++);
					tm.setValueAt(lampa.getGarantie(), index, counter++);
					tm.setValueAt(lampa.getTipIntrerupator(), index, counter++);
					tm.setValueAt(lampa.isDeschidereColet() ? "Da" : "Nu", index, counter++);
					tm.setValueAt(lampa.isRetur()  ? "Da" : "Nu", index, counter++);
					tm.setValueAt(lampa.getTipmontareint(), index, counter++);
					tm.setValueAt(lampa.getStilint(), index, counter++);
					tm.setValueAt(lampa.getFormaint(), index, counter++);
					tm.setValueAt(lampa.getMaterialint(), index, counter++);
					tm.setValueAt(lampa.getCuloareint(), index, counter++);
					tm.setValueAt(lampa.getFunctiiint(), index, counter++);
					tm.setValueAt(lampa.getClasaeficienta(), index, counter++);
					tm.setValueAt(lampa.getPutereW(), index, counter++);
					tm.setValueAt(lampa.getTipbecint(), index, counter++);
					tm.setValueAt(lampa.getSurseiluminatint(), index, counter++);
					

					index++;
					
				}
				
				table.setModel(tm);
			}
		});
		btnLampiSInt.setBounds(400, 10, 185, 100);
		panelView.add(btnLampiSInt);
		
		JButton btnPrelungitoare = new JButton("Prelungitoare");
		btnPrelungitoare.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPrelungitoare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TableModel tm = new DefaultTableModel(15, 13);
				int counter = 0;
				
				tm.setValueAt("Cod", 0, counter++);
				tm.setValueAt("Pret", 0, counter++);
				tm.setValueAt("Garantie (luni)", 0, counter++);
				tm.setValueAt("Tip Intrerupator", 0, counter++);
				tm.setValueAt("Deschidere Colet", 0, counter++);
				tm.setValueAt("Retur", 0, counter++);
				
				tm.setValueAt("Amperaj (A)", 0, counter++);
				tm.setValueAt("Culoare", 0, counter++);
				tm.setValueAt("lungime", 0, counter++);
				tm.setValueAt("Material", 0, counter++);
				tm.setValueAt("Nr Prize", 0, counter++);
				tm.setValueAt("Protectii", 0, counter++);
				tm.setValueAt("Putere (W)", 0, counter++);
				
				
				int index = 1;
				for(Prelungitoare lampa : listPrelungitoare.getPrelungitoareLista()) {
					counter = 0;
					tm.setValueAt(lampa.getCodProdus(), index, counter++);
					tm.setValueAt(lampa.getPret(), index, counter++);
					tm.setValueAt(lampa.getGarantie(), index, counter++);
					tm.setValueAt(lampa.getTipIntrerupator(), index, counter++);
					tm.setValueAt(lampa.isDeschidereColet() ? "Da" : "Nu", index, counter++);
					tm.setValueAt(lampa.isRetur()  ? "Da" : "Nu", index, counter++);
					
					tm.setValueAt(lampa.getAmperaj(), index, counter++);
					tm.setValueAt(lampa.getCuloareprelungitor(), index, counter++);
					tm.setValueAt(lampa.getLungimecablu(), index, counter++);
					tm.setValueAt(lampa.getMaterial(), index, counter++);
					tm.setValueAt(lampa.getNumarprize(), index, counter++);
					tm.setValueAt(lampa.getProtectii(), index, counter++);
					tm.setValueAt(lampa.getPuteremaxima(), index, counter++);
					
					

					index++;
					
				}
				
				table.setModel(tm);
			}
		});
		btnPrelungitoare.setBounds(595, 10, 185, 100);
		panelView.add(btnPrelungitoare);
		
		JButton btnSurseIluminat = new JButton("Surse Iluminat");
		btnSurseIluminat.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSurseIluminat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TableModel tm = new DefaultTableModel(15, 11);
				int counter = 0;
				
				tm.setValueAt("Cod", 0, counter++);
				tm.setValueAt("Pret", 0, counter++);
				tm.setValueAt("Garantie (luni)", 0, counter++);
				tm.setValueAt("Tip Intrerupator", 0, counter++);
				tm.setValueAt("Deschidere Colet", 0, counter++);
				tm.setValueAt("Retur", 0, counter++);
				
				tm.setValueAt("Protectie (IP)", 0, counter++);
				tm.setValueAt("Culoare", 0, counter++);
				tm.setValueAt("Material", 0, counter++);
				tm.setValueAt("Putere (W)", 0, counter++);
				tm.setValueAt("Stil", 0, counter++);
				
				
				int index = 1;
				for(SursaIluminat lampa : listSursaIluminat.getSursaLista() ) {
					counter = 0;
					tm.setValueAt(lampa.getCodProdus(), index, counter++);
					tm.setValueAt(lampa.getPret(), index, counter++);
					tm.setValueAt(lampa.getGarantie(), index, counter++);
					tm.setValueAt(lampa.getTipIntrerupator(), index, counter++);
					tm.setValueAt(lampa.isDeschidereColet() ? "Da" : "Nu", index, counter++);
					tm.setValueAt(lampa.isRetur()  ? "Da" : "Nu", index, counter++);
					
					tm.setValueAt(lampa.getClsprotectie(), index, counter++);
					tm.setValueAt(lampa.getCuloaresursa(), index, counter++);
					tm.setValueAt(lampa.getMaterialsursa(), index, counter++);
					tm.setValueAt(lampa.getPuteresursamax(), index, counter++);
					tm.setValueAt(lampa.getStilsursa(), index, counter++);
					

					index++;
					
				}
				
				table.setModel(tm);
			}
		});
		btnSurseIluminat.setBounds(790, 10, 185, 100);
		panelView.add(btnSurseIluminat);
		panelView.add(table);
		
		JPanel panelAdd = new JPanel();
		panelAdd.setBackground(new Color(255, 200, 0));
		tabbedPane.addTab("Add", null, panelAdd, null);
		panelAdd.setLayout(null);
		
		JToggleButton tglbtnNewLamp = new JToggleButton("New Lamp");
		tglbtnNewLamp.setBackground(new Color(240, 240, 240));
		tglbtnNewLamp.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		tglbtnNewLamp.setSelected(true);
		tglbtnNewLamp.setBounds(10, 25, 300, 80);
		panelAdd.add(tglbtnNewLamp);
		
		JToggleButton tglbtnNewLampExterior = new JToggleButton("New Lamp Exterior");
		tglbtnNewLampExterior.setFont(new Font("Tahoma", Font.PLAIN, 28));
		tglbtnNewLampExterior.setBounds(10, 120, 300, 80);
		panelAdd.add(tglbtnNewLampExterior);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(330, 10, 650, 500);
		panelAdd.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelNewLamp = new JPanel();
		panelNewLamp.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Definire Lampa Generala", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane.add(panelNewLamp, "name_1565397497307200");
		panelNewLamp.setVisible(true);
		panelNewLamp.setLayout(null);
		
		JLabel label = new JLabel("Pret:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(50, 65, 130, 30);
		panelNewLamp.add(label);
		
		textPret = new JTextField();
		textPret.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPret.setColumns(10);
		textPret.setBounds(240, 65, 100, 30);
		panelNewLamp.add(textPret);
		
		textGarantie = new JTextField();
		textGarantie.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textGarantie.setColumns(10);
		textGarantie.setBounds(240, 145, 100, 30);
		panelNewLamp.add(textGarantie);
		
		textCod = new JTextField();
		textCod.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCod.setColumns(10);
		textCod.setBounds(240, 260, 100, 30);
		panelNewLamp.add(textCod);
		
		JLabel label_1 = new JLabel("Garantie:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(50, 145, 130, 30);
		panelNewLamp.add(label_1);
		
		JLabel label_2 = new JLabel("Cod:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(50, 260, 130, 30);
		panelNewLamp.add(label_2);
		
		JLabel label_3 = new JLabel("Retur:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(50, 225, 130, 30);
		panelNewLamp.add(label_3);
		
		JComboBox<Object> comboBoxRetur = new JComboBox<Object>();
		comboBoxRetur.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxRetur.setBounds(240, 225, 100, 30);
		comboBoxRetur.setModel(new DefaultComboBoxModel<Object>(new String [] { "Da" , "Nu"}));
		panelNewLamp.add(comboBoxRetur);
		
		textTipIntrerupator = new JTextField();
		textTipIntrerupator.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textTipIntrerupator.setColumns(10);
		textTipIntrerupator.setBounds(240, 105, 100, 30);
		panelNewLamp.add(textTipIntrerupator);
		
		JComboBox<Object> comboBoxDeschidere = new JComboBox<Object>();
		comboBoxDeschidere.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxDeschidere.setBounds(240, 185, 100, 30);
		comboBoxDeschidere.setModel(new DefaultComboBoxModel<Object>(new String [] { "Da" , "Nu"}));
		panelNewLamp.add(comboBoxDeschidere);
		
		JLabel label_4 = new JLabel("Deschidere:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(50, 185, 130, 30);
		panelNewLamp.add(label_4);
		
		JLabel label_5 = new JLabel("Intrerupator:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_5.setBounds(50, 105, 130, 30);
		panelNewLamp.add(label_5);
		
		JButton anulare = new JButton("Anulare");
		anulare.setFont(new Font("Tahoma", Font.PLAIN, 40));
		anulare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPret.setText("");
				comboBoxDeschidere.setSelectedItem("Nu");
				textCod.setText("");
				textGarantie.setText("");
				comboBoxRetur.setSelectedItem("Nu");
				textTipIntrerupator.setText("");
			}
		});
		anulare.setBounds(35, 356, 250, 119);
		panelNewLamp.add(anulare);
		
		JButton salvare = new JButton("Salvare");
		salvare.setFont(new Font("Tahoma", Font.PLAIN, 40));
		salvare.setBounds(312, 356, 328, 119);
		panelNewLamp.add(salvare);
		
		
		JPanel panelNewLampExterior = new JPanel();
		panelNewLampExterior.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Definire Lampa Smart Exterior", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		layeredPane.add(panelNewLampExterior, "name_1565397547544900");
		panelNewLampExterior.setLayout(null);
		
		JLabel label_6 = new JLabel("Pret:");
		label_6.setBounds(30, 20, 100, 25);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(label_6);
		
		textPretExt = new JTextField();
		textPretExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPretExt.setBounds(190, 20, 80, 25);
		textPretExt.setColumns(10);
		panelNewLampExterior.add(textPretExt);
		
		textGarantieExt = new JTextField();
		textGarantieExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textGarantieExt.setBounds(190, 50, 80, 25);
		textGarantieExt.setColumns(10);
		panelNewLampExterior.add(textGarantieExt);
		
		textCodExt = new JTextField();
		textCodExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textCodExt.setBounds(190, 80, 80, 25);
		textCodExt.setColumns(10);
		panelNewLampExterior.add(textCodExt);
		
		JLabel label_7 = new JLabel("Garantie:");
		label_7.setBounds(30, 50, 100, 25);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(label_7);
		
		JLabel label_8 = new JLabel("Cod:");
		label_8.setBounds(30, 80, 100, 25);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(label_8);
		
		JLabel label_9 = new JLabel("Retur:");
		label_9.setBounds(30, 110, 100, 25);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(label_9);
		
		JComboBox<Object> comboBoxReturExt = new JComboBox<Object>();
		comboBoxReturExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxReturExt.setBounds(190, 110, 80, 25);
		comboBoxReturExt.setModel(daNuModel);
		panelNewLampExterior.add(comboBoxReturExt);
		
		textTipIntrerupatorExt = new JTextField();
		textTipIntrerupatorExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textTipIntrerupatorExt.setBounds(190, 140, 80, 25);
		textTipIntrerupatorExt.setColumns(10);
		panelNewLampExterior.add(textTipIntrerupatorExt);
		
		JComboBox<Object> comboBoxDeschidereExt = new JComboBox<Object>();
		comboBoxDeschidereExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxDeschidereExt.setBounds(190, 170, 80, 25);
		comboBoxDeschidereExt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Da", "Nu"}));
		panelNewLampExterior.add(comboBoxDeschidereExt);
		
		JLabel label_10 = new JLabel("Deschidere:");
		label_10.setBounds(30, 170, 100, 25);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(label_10);
		
		JLabel label_11 = new JLabel("Intrerupator:");
		label_11.setBounds(30, 140, 110, 25);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(label_11);
		
		JButton anulareExt = new JButton("Anulare");
		
		anulareExt.setFont(new Font("Tahoma", Font.PLAIN, 35));
		anulareExt.setBounds(149, 386, 169, 77);
		panelNewLampExterior.add(anulareExt);
		
		JComboBox<Object> comboBoxCuloareExt = new JComboBox<Object>();
		comboBoxCuloareExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxCuloareExt.setBounds(190, 320, 80, 25);
		comboBoxCuloareExt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Rosu", "Galben", "Albastru", "Verde", "Portocaliu"}));
		panelNewLampExterior.add(comboBoxCuloareExt);
		
		JButton salvareExt = new JButton("Salvare");
		salvareExt.setFont(new Font("Tahoma", Font.PLAIN, 35));
		salvareExt.setBounds(345, 386, 264, 77);
		panelNewLampExterior.add(salvareExt);
		
	
		
		JLabel lblTipMontare = new JLabel("Tip montare:");
		lblTipMontare.setBounds(30, 200, 110, 25);
		lblTipMontare.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblTipMontare);
		
		JLabel lblStil = new JLabel("Stil");
		lblStil.setBounds(30, 230, 100, 25);
		lblStil.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblStil);
		
		JLabel lblForma = new JLabel("Forma");
		lblForma.setBounds(30, 260, 100, 25);
		lblForma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblForma);
		
		JLabel lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(30, 290, 100, 25);
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblMaterial);
		
		JLabel lblCuloare = new JLabel("Culoare");
		lblCuloare.setBounds(30, 320, 100, 25);
		lblCuloare.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblCuloare);
		
		JLabel lblFunctii = new JLabel("Functii");
		lblFunctii.setBounds(345, 20, 100, 25);
		lblFunctii.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblFunctii);
		
		JLabel lblTipBec = new JLabel("Tip Bec");
		lblTipBec.setBounds(345, 50, 100, 25);
		lblTipBec.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblTipBec);
		
		JLabel lblTipLumina = new JLabel("Tip Lumina");
		lblTipLumina.setBounds(345, 80, 100, 25);
		lblTipLumina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblTipLumina);
		
		JLabel lblTipAcumulator = new JLabel("Tip Acumulator");
		lblTipAcumulator.setBounds(345, 230, 120, 25);
		lblTipAcumulator.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblTipAcumulator);
		
		JLabel lblTensiuneAlimentare = new JLabel("Tensiune A");
		lblTensiuneAlimentare.setBounds(345, 140, 100, 25);
		lblTensiuneAlimentare.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblTensiuneAlimentare);
		
		JLabel lblPutere = new JLabel("Putere");
		lblPutere.setBounds(345, 170, 100, 25);
		lblPutere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblPutere);
		
		JLabel lblTemperaturaCuloare = new JLabel("Temp Culoare");
		lblTemperaturaCuloare.setBounds(345, 110, 120, 25);
		lblTemperaturaCuloare.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblTemperaturaCuloare);
		
		JLabel lblSurseIluminat = new JLabel("Nr Surse");
		lblSurseIluminat.setBounds(345, 260, 100, 25);
		lblSurseIluminat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblSurseIluminat);
		
		JLabel lblAutonomie = new JLabel("Autonomie");
		lblAutonomie.setBounds(345, 200, 100, 25);
		lblAutonomie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblAutonomie);
		
		JLabel lblDurataIncarcare = new JLabel("Durata incarcare");
		lblDurataIncarcare.setBounds(345, 290, 120, 25);
		lblDurataIncarcare.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNewLampExterior.add(lblDurataIncarcare);
		
		textFormaExt = new JTextField();
		textFormaExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFormaExt.setBounds(190, 260, 80, 25);
		textFormaExt.setText("");
		panelNewLampExterior.add(textFormaExt);
		textFormaExt.setColumns(10);
		
		JComboBox<Object> comboBoxMaterialExt = new JComboBox<Object>();
		comboBoxMaterialExt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Hartie", "Plastic", "Metal", "Sulf", "Argila", "Marmura"}));
		comboBoxMaterialExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxMaterialExt.setBounds(190, 290, 80, 25);
		panelNewLampExterior.add(comboBoxMaterialExt);
		
		textFunctiiExt = new JTextField();
		textFunctiiExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFunctiiExt.setBounds(485, 20, 80, 25);
		panelNewLampExterior.add(textFunctiiExt);
		textFunctiiExt.setColumns(10);
		
		JComboBox<Object> comboBoxTipBecExt = new JComboBox<Object>();
		comboBoxTipBecExt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Led", "Filament", "Halogen"}));
		comboBoxTipBecExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxTipBecExt.setBounds(485, 50, 80, 25);
		panelNewLampExterior.add(comboBoxTipBecExt);
		
		JComboBox<Object> comboBoxTipLuminaExt = new JComboBox<Object>();
		comboBoxTipLuminaExt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Alb rece", "Alb", "Naturala", "Galbena"}));
		comboBoxTipLuminaExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxTipLuminaExt.setBounds(485, 80, 80, 25);
		panelNewLampExterior.add(comboBoxTipLuminaExt);
		
		comboBoxTipAcumulatorExt = new JComboBox<Object>();
		comboBoxTipAcumulatorExt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Li-Ion", "NiMH", "NiCD"}));
		comboBoxTipAcumulatorExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxTipAcumulatorExt.setBounds(485, 230, 80, 25);
		panelNewLampExterior.add(comboBoxTipAcumulatorExt);
		
		textTensiuneExt = new JTextField();
		textTensiuneExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textTensiuneExt.setBounds(485, 140, 80, 25);
		panelNewLampExterior.add(textTensiuneExt);
		textTensiuneExt.setColumns(10);
		
		textPutereExt = new JTextField();
		textPutereExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPutereExt.setBounds(485, 170, 80, 25);
		panelNewLampExterior.add(textPutereExt);
		textPutereExt.setColumns(10);
		
		textTemperaturaExt = new JTextField();
		textTemperaturaExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textTemperaturaExt.setBounds(485, 110, 80, 25);
		panelNewLampExterior.add(textTemperaturaExt);
		textTemperaturaExt.setColumns(10);
		
		textSurseExt = new JTextField();
		textSurseExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textSurseExt.setBounds(485, 260, 80, 25);
		panelNewLampExterior.add(textSurseExt);
		textSurseExt.setColumns(10);
		
		textAutonomieExt = new JTextField();
		textAutonomieExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textAutonomieExt.setBounds(485, 200, 80, 25);
		panelNewLampExterior.add(textAutonomieExt);
		textAutonomieExt.setColumns(10);
		
		textDurataIncarcareExt = new JTextField();
		textDurataIncarcareExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textDurataIncarcareExt.setBounds(485, 289, 80, 25);
		panelNewLampExterior.add(textDurataIncarcareExt);
		textDurataIncarcareExt.setColumns(10);
		
		JComboBox<Object> comboBoxTipMontareExt = new JComboBox<Object>();
		comboBoxTipMontareExt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Perete", "Agatare", "Sol", "Treapta", "Plutire"}));
		comboBoxTipMontareExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxTipMontareExt.setBounds(190, 200, 80, 25);
		panelNewLampExterior.add(comboBoxTipMontareExt);
		
		JComboBox<Object> comboBoxStilExt = new JComboBox<Object>();
		comboBoxStilExt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Modern", "Contemporan", "Vechi", "Medieval", "Antic"}));
		comboBoxStilExt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxStilExt.setBounds(190, 230, 80, 25);
		panelNewLampExterior.add(comboBoxStilExt);
		
		JPanel panelNewLampInterior = new JPanel();
		panelNewLampInterior.setBorder(new TitledBorder(null, "Definire Lampa Smart Interior", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane.add(panelNewLampInterior, "name_1565886746188800");
		panelNewLampInterior.setLayout(null);
		
		JLabel lblPretInt = new JLabel("Pret:");
		lblPretInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPretInt.setBounds(30, 20, 120, 30);
		panelNewLampInterior.add(lblPretInt);
		
		textPretInt = new JTextField();
		textPretInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPretInt.setColumns(10);
		textPretInt.setBounds(180, 20, 100, 30);
		panelNewLampInterior.add(textPretInt);
		
		textIntrerupatorInt = new JTextField();
		textIntrerupatorInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textIntrerupatorInt.setColumns(10);
		textIntrerupatorInt.setBounds(180, 180, 100, 30);
		panelNewLampInterior.add(textIntrerupatorInt);
		
		textCodInt = new JTextField();
		textCodInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textCodInt.setColumns(10);
		textCodInt.setBounds(180, 140, 100, 30);
		panelNewLampInterior.add(textCodInt);
		
		JLabel lblGarantieInt = new JLabel("Garantie:");
		lblGarantieInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGarantieInt.setBounds(30, 60, 120, 30);
		panelNewLampInterior.add(lblGarantieInt);
		
		JLabel lblCodInt = new JLabel("Cod:");
		lblCodInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodInt.setBounds(30, 140, 120, 30);
		panelNewLampInterior.add(lblCodInt);
		
		JLabel lblReturInt = new JLabel("Retur:");
		lblReturInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReturInt.setBounds(30, 220, 120, 30);
		panelNewLampInterior.add(lblReturInt);
		
		JComboBox<Object> comboBoxDeschidereInt = new JComboBox<Object>();
		comboBoxDeschidereInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxDeschidereInt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Da", "Nu"}));
		comboBoxDeschidereInt.setBounds(180, 100, 100, 30);
		panelNewLampInterior.add(comboBoxDeschidereInt);
		
		textGarantieInt = new JTextField();
		textGarantieInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textGarantieInt.setColumns(10);
		textGarantieInt.setBounds(180, 60, 100, 30);
		panelNewLampInterior.add(textGarantieInt);
		
		JComboBox<Object> comboBoxReturInt = new JComboBox<Object>();
		comboBoxReturInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxReturInt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Da", "Nu"}));
		comboBoxReturInt.setBounds(180, 220, 100, 30);
		panelNewLampInterior.add(comboBoxReturInt);
		
		JLabel lblDeschidereInt = new JLabel("Deschidere:");
		lblDeschidereInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDeschidereInt.setBounds(30, 100, 120, 30);
		panelNewLampInterior.add(lblDeschidereInt);
		
		JLabel lblIntrerupatorInt = new JLabel("Intrerupator:");
		lblIntrerupatorInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIntrerupatorInt.setBounds(30, 180, 120, 30);
		panelNewLampInterior.add(lblIntrerupatorInt);
		
		JButton anulareInt = new JButton("Anulare");
		
		anulareInt.setFont(new Font("Tahoma", Font.PLAIN, 35));
		anulareInt.setBounds(200, 385, 169, 77);
		panelNewLampInterior.add(anulareInt);
		
		JButton salvareInt = new JButton("Salvare");
		
		salvareInt.setFont(new Font("Tahoma", Font.PLAIN, 35));
		salvareInt.setBounds(432, 385, 169, 77);
		panelNewLampInterior.add(salvareInt);
		
		JLabel lblTipMontareInt = new JLabel("Tip Montare");
		lblTipMontareInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipMontareInt.setBounds(30, 260, 120, 30);
		panelNewLampInterior.add(lblTipMontareInt);
		
		JLabel lblStilInt = new JLabel("Stil");
		lblStilInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStilInt.setBounds(30, 300, 120, 30);
		panelNewLampInterior.add(lblStilInt);
		
		JComboBox<Object> comboBoxTipMontareInt = new JComboBox<Object>();
		comboBoxTipMontareInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxTipMontareInt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Perete", "Agatare", "Sol", "Treapta", "Plutire"}));
		comboBoxTipMontareInt.setBounds(180, 260, 100, 30);
		panelNewLampInterior.add(comboBoxTipMontareInt);
		
		JComboBox<Object> comboBoxStilInt = new JComboBox<Object>();
		comboBoxStilInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxStilInt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Modern", "Contemporan", "Vechi", "Medieval", "Antic"}));
		comboBoxStilInt.setBounds(180, 300, 100, 30);
		panelNewLampInterior.add(comboBoxStilInt);
		
		JLabel lblFormaInt = new JLabel("Forma");
		lblFormaInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFormaInt.setBounds(360, 20, 120, 30);
		panelNewLampInterior.add(lblFormaInt);
		
		JLabel lblMaterialInt = new JLabel("Material");
		lblMaterialInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaterialInt.setBounds(360, 60, 120, 30);
		panelNewLampInterior.add(lblMaterialInt);
		
		JLabel lblCuloareInt = new JLabel("Culoare");
		lblCuloareInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCuloareInt.setBounds(360, 100, 120, 30);
		panelNewLampInterior.add(lblCuloareInt);
		
		JLabel lblFunctiiInt = new JLabel("Functii");
		lblFunctiiInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFunctiiInt.setBounds(360, 140, 120, 30);
		panelNewLampInterior.add(lblFunctiiInt);
		
		JLabel lblClasaEficientaInt = new JLabel("Clasa Eficienta");
		lblClasaEficientaInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClasaEficientaInt.setBounds(360, 180, 120, 30);
		panelNewLampInterior.add(lblClasaEficientaInt);
		
		JLabel lblPutereWInt = new JLabel("PuterteW");
		lblPutereWInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPutereWInt.setBounds(360, 220, 120, 30);
		panelNewLampInterior.add(lblPutereWInt);
		
		JLabel lblTipBecInt = new JLabel("Tip Bec");
		lblTipBecInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipBecInt.setBounds(360, 260, 120, 30);
		panelNewLampInterior.add(lblTipBecInt);
		
		JLabel lblSurseIluminatInt = new JLabel("Surse Iluminat");
		lblSurseIluminatInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSurseIluminatInt.setBounds(360, 300, 120, 30);
		panelNewLampInterior.add(lblSurseIluminatInt);
		
		textFormaInt = new JTextField();
		textFormaInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFormaInt.setBounds(510, 20, 100, 30);
		panelNewLampInterior.add(textFormaInt);
		textFormaInt.setColumns(10);
		
		JComboBox<Object> comboBoxMaterialInt = new JComboBox<Object>();
		comboBoxMaterialInt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Hartie", "Plastic", "Metal", "Sulf", "Argila", "Marmura"}));
		comboBoxMaterialInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxMaterialInt.setBounds(510, 60, 100, 30);
		panelNewLampInterior.add(comboBoxMaterialInt);
		
		JComboBox<Object> comboBoxCuloareInt = new JComboBox<Object>();
		comboBoxCuloareInt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Rosu", "Galben", "Albastru", "Verde", "Portocaliu"}));
		comboBoxCuloareInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxCuloareInt.setBounds(510, 100, 100, 30);
		panelNewLampInterior.add(comboBoxCuloareInt);
		
		textFunctiiInt = new JTextField();
		textFunctiiInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFunctiiInt.setBounds(510, 140, 100, 30);
		panelNewLampInterior.add(textFunctiiInt);
		textFunctiiInt.setColumns(10);
		
		JComboBox<Object> comboBoxClasaEficientaInt = new JComboBox<Object>();
		comboBoxClasaEficientaInt.setModel(new DefaultComboBoxModel<Object>(new String[] {"A+++", "A++", "A+", "A", "B", "C", "D"}));
		comboBoxClasaEficientaInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxClasaEficientaInt.setBounds(510, 180, 100, 30);
		panelNewLampInterior.add(comboBoxClasaEficientaInt);
		
		textPutereWInt = new JTextField();
		textPutereWInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPutereWInt.setBounds(510, 220, 100, 30);
		panelNewLampInterior.add(textPutereWInt);
		textPutereWInt.setColumns(10);
		
		JComboBox<Object> comboBoxTipBecInt = new JComboBox<Object>();
		comboBoxTipBecInt.setModel(new DefaultComboBoxModel<Object>(new String[] {"Led", "Filament", "Halogen"}));
		comboBoxTipBecInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxTipBecInt.setBounds(510, 260, 100, 30);
		panelNewLampInterior.add(comboBoxTipBecInt);
		
		textSurseIluminatInt = new JTextField();
		textSurseIluminatInt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textSurseIluminatInt.setBounds(510, 300, 100, 30);
		panelNewLampInterior.add(textSurseIluminatInt);
		textSurseIluminatInt.setColumns(10);
		
		JPanel panelNewPrelungitor = new JPanel();
		panelNewPrelungitor.setBorder(new TitledBorder(null, "Definire Prelungitoare", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane.add(panelNewPrelungitor, "name_1565888663212800");
		panelNewPrelungitor.setLayout(null);
		
		JLabel lblPretPrelungitor = new JLabel("Pret:");
		lblPretPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPretPrelungitor.setBounds(30, 20, 120, 40);
		panelNewPrelungitor.add(lblPretPrelungitor);
		
		textPretPrelungitor = new JTextField();
		textPretPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPretPrelungitor.setColumns(10);
		textPretPrelungitor.setBounds(200, 20, 100, 40);
		panelNewPrelungitor.add(textPretPrelungitor);
		
		textGarantiePrelungitor = new JTextField();
		textGarantiePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textGarantiePrelungitor.setColumns(10);
		textGarantiePrelungitor.setBounds(200, 80, 100, 40);
		panelNewPrelungitor.add(textGarantiePrelungitor);
		
		textCodPrelungitor = new JTextField();
		textCodPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textCodPrelungitor.setColumns(10);
		textCodPrelungitor.setBounds(200, 140, 100, 40);
		panelNewPrelungitor.add(textCodPrelungitor);
		
		JLabel lblGarantiePrelungitor = new JLabel("Garantie:");
		lblGarantiePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGarantiePrelungitor.setBounds(30, 80, 120, 40);
		panelNewPrelungitor.add(lblGarantiePrelungitor);
		
		JLabel lblCodPrelungitor = new JLabel("Cod:");
		lblCodPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodPrelungitor.setBounds(30, 140, 120, 40);
		panelNewPrelungitor.add(lblCodPrelungitor);
		
		JLabel lblReturPrelungitor = new JLabel("Retur:");
		lblReturPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReturPrelungitor.setBounds(30, 200, 120, 40);
		panelNewPrelungitor.add(lblReturPrelungitor);
		
		JComboBox<Object> comboBoxReturPrelungitor = new JComboBox<Object>();
		comboBoxReturPrelungitor.setModel(new DefaultComboBoxModel<Object>(new String[] {"Da", "Nu"}));
		comboBoxReturPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxReturPrelungitor.setBounds(200, 200, 100, 40);
		panelNewPrelungitor.add(comboBoxReturPrelungitor);
		
		textIntrerupatorPrelungitor = new JTextField();
		textIntrerupatorPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textIntrerupatorPrelungitor.setColumns(10);
		textIntrerupatorPrelungitor.setBounds(200, 260, 100, 40);
		panelNewPrelungitor.add(textIntrerupatorPrelungitor);
		
		JComboBox<Object> comboBoxDeschiderePrelungitor = new JComboBox<Object>();
		comboBoxDeschiderePrelungitor.setModel(new DefaultComboBoxModel<Object>(new String[] {"Da", "Nu"}));
		comboBoxDeschiderePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxDeschiderePrelungitor.setBounds(200, 320, 100, 40);
		panelNewPrelungitor.add(comboBoxDeschiderePrelungitor);
		
		JLabel lblDeschiderePrelungitor = new JLabel("Deschidere:");
		lblDeschiderePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDeschiderePrelungitor.setBounds(30, 320, 120, 40);
		panelNewPrelungitor.add(lblDeschiderePrelungitor);
		
		JLabel lblIntrerupatorPrelungitor = new JLabel("Intrerupator:");
		lblIntrerupatorPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIntrerupatorPrelungitor.setBounds(30, 260, 120, 40);
		panelNewPrelungitor.add(lblIntrerupatorPrelungitor);
		
		JButton anularePrelungitor = new JButton("Anulare");
		
		anularePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		anularePrelungitor.setBounds(281, 419, 141, 64);
		panelNewPrelungitor.add(anularePrelungitor);
		
		JButton salvarePrelungitor = new JButton("Salvare");
		
		salvarePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		salvarePrelungitor.setBounds(455, 419, 132, 67);
		panelNewPrelungitor.add(salvarePrelungitor);
		
		JLabel lblNumarPrizePrelungitor = new JLabel("Numar Prize");
		lblNumarPrizePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumarPrizePrelungitor.setBounds(350, 30, 120, 40);
		panelNewPrelungitor.add(lblNumarPrizePrelungitor);
		
		JLabel lblProtectiiPrelungitor = new JLabel("Protectii");
		lblProtectiiPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProtectiiPrelungitor.setBounds(350, 80, 120, 40);
		panelNewPrelungitor.add(lblProtectiiPrelungitor);
		
		JLabel lblMaterialPrelungitor = new JLabel("Material");
		lblMaterialPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaterialPrelungitor.setBounds(350, 140, 120, 40);
		panelNewPrelungitor.add(lblMaterialPrelungitor);
		
		JLabel lblCuloarePrelungitor = new JLabel("Culoare");
		lblCuloarePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCuloarePrelungitor.setBounds(350, 200, 120, 40);
		panelNewPrelungitor.add(lblCuloarePrelungitor);
		
		JLabel lblPutereMaximaPrelungitor = new JLabel("Putere Maxima");
		lblPutereMaximaPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPutereMaximaPrelungitor.setBounds(350, 260, 120, 40);
		panelNewPrelungitor.add(lblPutereMaximaPrelungitor);
		
		JLabel lblAmperajPrelungitor = new JLabel("Amperaj");
		lblAmperajPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAmperajPrelungitor.setBounds(350, 320, 120, 40);
		panelNewPrelungitor.add(lblAmperajPrelungitor);
		
		textNumarPrizePrelungitor = new JTextField();
		textNumarPrizePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textNumarPrizePrelungitor.setBounds(500, 30, 100, 40);
		panelNewPrelungitor.add(textNumarPrizePrelungitor);
		textNumarPrizePrelungitor.setColumns(10);
		
		JComboBox<Object> comboBoxProtectiiPrelungitor = new JComboBox<Object>();
		comboBoxProtectiiPrelungitor.setModel(new DefaultComboBoxModel<Object>(new String[] {"supraincalzire ", " copii\t"}));
		comboBoxProtectiiPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxProtectiiPrelungitor.setBounds(500, 80, 100, 40);
		panelNewPrelungitor.add(comboBoxProtectiiPrelungitor);
		
		JComboBox<Object> comboBoxMaterialPrelungitor = new JComboBox<Object>();
		comboBoxMaterialPrelungitor.setModel(new DefaultComboBoxModel<Object>(new String[] {"Plastic", "Nichel"}));
		comboBoxMaterialPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxMaterialPrelungitor.setBounds(500, 140, 100, 40);
		panelNewPrelungitor.add(comboBoxMaterialPrelungitor);
		
		JComboBox<Object> comboBoxCuloarePrelungitor = new JComboBox<Object>();
		comboBoxCuloarePrelungitor.setModel(new DefaultComboBoxModel<Object>(new String[] {"Rosu", "Galben", "Albastru", "Verde", "Portocaliu"}));
		comboBoxCuloarePrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxCuloarePrelungitor.setBounds(500, 200, 100, 40);
		panelNewPrelungitor.add(comboBoxCuloarePrelungitor);
		
		JComboBox<Object> comboBoxPutereMaximaPrelungitor = new JComboBox<Object>();
		comboBoxPutereMaximaPrelungitor.setModel(new DefaultComboBoxModel<Object>(new String[] {"3600", "3680", "2300"}));
		comboBoxPutereMaximaPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxPutereMaximaPrelungitor.setBounds(500, 260, 100, 40);
		panelNewPrelungitor.add(comboBoxPutereMaximaPrelungitor);
		
		JComboBox<Object> comboBoxAmperajPrelungitor = new JComboBox<Object>();
		comboBoxAmperajPrelungitor.setModel(new DefaultComboBoxModel<Object>(new String[] {"10", "16"}));
		comboBoxAmperajPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxAmperajPrelungitor.setBounds(500, 320, 100, 40);
		panelNewPrelungitor.add(comboBoxAmperajPrelungitor);
		
		JPanel panelNewSursaIluminat = new JPanel();
		panelNewSursaIluminat.setBorder(new TitledBorder(null, "Definire Surse Iluminat", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane.add(panelNewSursaIluminat, "name_1565890728234300");
		panelNewSursaIluminat.setLayout(null);
		
		JLabel lblPretSursa = new JLabel("Pret:");
		lblPretSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPretSursa.setBounds(30, 40, 100, 30);
		panelNewSursaIluminat.add(lblPretSursa);
		
		textPretSursa = new JTextField();
		textPretSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPretSursa.setColumns(10);
		textPretSursa.setBounds(180, 40, 100, 30);
		panelNewSursaIluminat.add(textPretSursa);
		
		textGarantieSursa = new JTextField();
		textGarantieSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textGarantieSursa.setColumns(10);
		textGarantieSursa.setBounds(180, 80, 100, 30);
		panelNewSursaIluminat.add(textGarantieSursa);
		
		textCodSursa = new JTextField();
		textCodSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textCodSursa.setColumns(10);
		textCodSursa.setBounds(180, 120, 100, 30);
		panelNewSursaIluminat.add(textCodSursa);
		
		JLabel lblGarantieSursa = new JLabel("Garantie:");
		lblGarantieSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGarantieSursa.setBounds(30, 80, 130, 30);
		panelNewSursaIluminat.add(lblGarantieSursa);
		
		JLabel lblCodSursa = new JLabel("Cod:");
		lblCodSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodSursa.setBounds(30, 120, 130, 30);
		panelNewSursaIluminat.add(lblCodSursa);
		
		JLabel lblReturSursa = new JLabel("Retur:");
		lblReturSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReturSursa.setBounds(30, 160, 100, 30);
		panelNewSursaIluminat.add(lblReturSursa);
		
		JComboBox<Object> comboBoxReturSursa = new JComboBox<Object>();
		comboBoxReturSursa.setModel(new DefaultComboBoxModel<Object>(new String[] {"Da", "Nu"}));
		comboBoxReturSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxReturSursa.setBounds(180, 160, 100, 30);
		panelNewSursaIluminat.add(comboBoxReturSursa);
		
		textIntrerupatorSursa = new JTextField();
		textIntrerupatorSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textIntrerupatorSursa.setColumns(10);
		textIntrerupatorSursa.setBounds(180, 200, 100, 30);
		panelNewSursaIluminat.add(textIntrerupatorSursa);
		
		JComboBox<Object> comboBoxDeschidereSursa = new JComboBox<Object>();
		comboBoxDeschidereSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxDeschidereSursa.setModel(new DefaultComboBoxModel<Object>(new String[] {"Da", "Nu"}));
		comboBoxDeschidereSursa.setBounds(180, 240, 100, 30);
		panelNewSursaIluminat.add(comboBoxDeschidereSursa);
		
		JLabel lblDeschidereSursa = new JLabel("Deschidere:");
		lblDeschidereSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDeschidereSursa.setBounds(30, 240, 130, 30);
		panelNewSursaIluminat.add(lblDeschidereSursa);
		
		JLabel lblIntrerupatorSursa = new JLabel("Intrerupator:");
		lblIntrerupatorSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIntrerupatorSursa.setBounds(30, 200, 130, 30);
		panelNewSursaIluminat.add(lblIntrerupatorSursa);
		
		JButton anulareSursa = new JButton("Anulare");
		
		anulareSursa.setFont(new Font("Tahoma", Font.PLAIN, 40));
		anulareSursa.setBounds(30, 358, 246, 110);
		panelNewSursaIluminat.add(anulareSursa);
		
		JButton salvareSursa = new JButton("Salvare");
		
		salvareSursa.setFont(new Font("Tahoma", Font.PLAIN, 40));
		salvareSursa.setBounds(309, 358, 316, 110);
		panelNewSursaIluminat.add(salvareSursa);
		
		JLabel lblStilSursa = new JLabel("Stil");
		lblStilSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStilSursa.setBounds(310, 40, 120, 30);
		panelNewSursaIluminat.add(lblStilSursa);
		
		JLabel lblMaterialSursa = new JLabel("Material");
		lblMaterialSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaterialSursa.setBounds(310, 80, 120, 30);
		panelNewSursaIluminat.add(lblMaterialSursa);
		
		JLabel lblCuloareSursa = new JLabel("Culoare");
		lblCuloareSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCuloareSursa.setBounds(310, 120, 120, 30);
		panelNewSursaIluminat.add(lblCuloareSursa);
		
		JLabel lblClasaProtectieSursa = new JLabel("Clasa Protectie");
		lblClasaProtectieSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClasaProtectieSursa.setBounds(310, 160, 120, 30);
		panelNewSursaIluminat.add(lblClasaProtectieSursa);
		
		JLabel lblPutereMaximaSursa = new JLabel("Putere Maxima");
		lblPutereMaximaSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPutereMaximaSursa.setBounds(310, 200, 120, 30);
		panelNewSursaIluminat.add(lblPutereMaximaSursa);
		
		JComboBox<Object> comboBoxStilSursa = new JComboBox<Object>();
		comboBoxStilSursa.setModel(new DefaultComboBoxModel<Object>(new String[] {"Industrial", "Casnic"}));
		comboBoxStilSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxStilSursa.setBounds(460, 40, 100, 30);
		panelNewSursaIluminat.add(comboBoxStilSursa);
		
		JComboBox<Object> comboBoxMatertialSursa = new JComboBox<Object>();
		comboBoxMatertialSursa.setModel(new DefaultComboBoxModel<Object>(new String[] {"Plastic", "Metal"}));
		comboBoxMatertialSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxMatertialSursa.setBounds(460, 80, 100, 30);
		panelNewSursaIluminat.add(comboBoxMatertialSursa);
		
		JComboBox<Object> comboBoxCuloareSursa = new JComboBox<Object>();
		comboBoxCuloareSursa.setModel(new DefaultComboBoxModel<Object>(new String[] {"Rosu", "Galben", "Albastru", "Verde", "Portocaliu"}));
		comboBoxCuloareSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxCuloareSursa.setBounds(460, 120, 100, 30);
		panelNewSursaIluminat.add(comboBoxCuloareSursa);
		
		JComboBox<Object> comboBoxClasaProtectieSursa = new JComboBox<Object>();
		comboBoxClasaProtectieSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxClasaProtectieSursa.setModel(new DefaultComboBoxModel<Object>(new String[] {"68", "67", "66", "65", "64", "63", "62", "61", "60"}));
		comboBoxClasaProtectieSursa.setBounds(460, 160, 100, 30);
		panelNewSursaIluminat.add(comboBoxClasaProtectieSursa);
		
		textPutereSursa = new JTextField();
		textPutereSursa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPutereSursa.setBounds(460, 200, 100, 30);
		panelNewSursaIluminat.add(textPutereSursa);
		textPutereSursa.setColumns(10);
		
		JToggleButton tglbtnNewLampInterior = new JToggleButton("New Lamp Interior");
		tglbtnNewLampInterior.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		tglbtnNewLampInterior.setBounds(10, 215, 300, 80);
		panelAdd.add(tglbtnNewLampInterior);
		
		JToggleButton tglbtnNewPrelungitor = new JToggleButton("New Prelungitor");
		tglbtnNewPrelungitor.setFont(new Font("Tahoma", Font.PLAIN, 28));
		tglbtnNewPrelungitor.setBounds(10, 305, 300, 80);
		panelAdd.add(tglbtnNewPrelungitor);
		
		JToggleButton tglbtnNewSursaIluminat = new JToggleButton("New Sursa Iluminat");
		tglbtnNewSursaIluminat.setFont(new Font("Tahoma", Font.PLAIN, 28));
		tglbtnNewSursaIluminat.setBounds(10, 405, 300, 75);
		panelAdd.add(tglbtnNewSursaIluminat);
		panelNewLampExterior.setVisible(false);
		
		
		
		tglbtnNewLamp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewLamp.setVisible(true);
				panelNewLampExterior.setVisible(false);
				panelNewLampInterior.setVisible(false);
				panelNewPrelungitor.setVisible(false);
				panelNewSursaIluminat.setVisible(false);
				
				tglbtnNewLamp.setSelected(true);
				tglbtnNewLampInterior.setSelected(false);
				tglbtnNewLampExterior.setSelected(false);
				tglbtnNewPrelungitor.setSelected(false);
				tglbtnNewSursaIluminat.setSelected(false);
				
				
			}
		});
		tglbtnNewLampExterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewLamp.setVisible(false);
				panelNewLampExterior.setVisible(true);
				panelNewLampInterior.setVisible(false);
				panelNewPrelungitor.setVisible(false);
				panelNewSursaIluminat.setVisible(false);
				
				tglbtnNewLampExterior.setSelected(true);
				tglbtnNewLamp.setSelected(false);
				tglbtnNewPrelungitor.setSelected(false);
				tglbtnNewLampInterior.setSelected(false);
				tglbtnNewSursaIluminat.setSelected(false);
			}
		});
		
		tglbtnNewLampInterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewLamp.setVisible(false);
				panelNewLampExterior.setVisible(false);
				panelNewLampInterior.setVisible(true);
				panelNewPrelungitor.setVisible(false);
				panelNewSursaIluminat.setVisible(false);
				
				tglbtnNewLampInterior.setSelected(true);
				tglbtnNewPrelungitor.setSelected(false);
				tglbtnNewLampExterior.setSelected(false);
				tglbtnNewLamp.setSelected(false);
				tglbtnNewSursaIluminat.setSelected(false);
				
			}
		});
		
		tglbtnNewPrelungitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewLamp.setVisible(false);
				panelNewLampExterior.setVisible(false);
				panelNewLampInterior.setVisible(false);
				panelNewPrelungitor.setVisible(true);
				panelNewSursaIluminat.setVisible(false);
				
				tglbtnNewPrelungitor.setSelected(true);
				tglbtnNewLampInterior.setSelected(false);
				tglbtnNewLampExterior.setSelected(false);
				tglbtnNewLamp.setSelected(false);
				tglbtnNewSursaIluminat.setSelected(false);
				
			}
		});
		
		tglbtnNewSursaIluminat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewLamp.setVisible(false);
				panelNewLampExterior.setVisible(false);
				panelNewLampInterior.setVisible(false);
				panelNewPrelungitor.setVisible(false);
				panelNewSursaIluminat.setVisible(true);
				
				tglbtnNewPrelungitor.setSelected(false);
				tglbtnNewLampInterior.setSelected(false);
				tglbtnNewLampExterior.setSelected(false);
				tglbtnNewLamp.setSelected(false);
				tglbtnNewSursaIluminat.setSelected(true);
				
				
			}
		});
		
		salvare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lampa lamp = new Lampa();
				lamp.setPret(Integer.valueOf(textPret.getText()));
				lamp.setDeschidereColet(comboBoxDeschidere.getSelectedItem().equals("Da") ? true : false );
				lamp.setCodProdus(textCod.getText());
				lamp.setGarantie(Integer.valueOf(textGarantie.getText()));
				lamp.setRetur(comboBoxRetur.getSelectedItem().equals("Da") ? true : false );
				lamp.setTipIntrerupator(textTipIntrerupator.getText());
				
				listaLampa.add(lamp);
				
				textPret.setText("");
				comboBoxDeschidere.setSelectedItem("Nu");
				textCod.setText("");
				textGarantie.setText("");
				comboBoxRetur.setSelectedItem("Nu");
				textTipIntrerupator.setText("");
				
			}
		});
		
		salvareExt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LampaSmartExterior lse = new LampaSmartExterior();
				
				lse.setPret(Integer.valueOf(textPretExt.getText()));
				lse.setGarantie(Integer.valueOf(textGarantieExt.getText()));
				lse.setCodProdus(textCodExt.getText());
				lse.setTipIntrerupator(textTipIntrerupatorExt.getText());
				lse.setRetur(comboBoxReturExt.getSelectedItem().equals("Da") ? true : false );
				lse.setDeschidereColet(comboBoxDeschidereExt.getSelectedItem().equals("Da") ? true : false );
				lse.setCuloare(comboBoxCuloareExt.getSelectedItem().toString());
				lse.setAutonomie(Integer.valueOf(textAutonomieExt.getText()));
				lse.setDurataincarcare(Integer.valueOf(textDurataIncarcareExt.getText()));
				lse.setForma(textFormaExt.getText());
				lse.setFunctii(textFunctiiExt.getText());
				lse.setMaterial(comboBoxMaterialExt.getSelectedItem().toString());
				lse.setNrsurseiluminat(Integer.valueOf(textSurseExt.getText()));
				lse.setPutere(Integer.valueOf(textPutereExt.getText()));
				lse.setStil(comboBoxStilExt.getSelectedItem().toString());
				lse.setTemperaturaculoare(Integer.valueOf(textTemperaturaExt.getText()));
				lse.setTensiunealimentare(Integer.valueOf(textTensiuneExt.getText()));
				lse.setTipaacumulator(comboBoxTipAcumulatorExt.getSelectedItem().toString());
				lse.setTipbec(comboBoxTipBecExt.getSelectedItem().toString());
				lse.setTiplumina(comboBoxTipLuminaExt.getSelectedItem().toString());
				lse.setTipmontare(comboBoxTipMontareExt.getSelectedItem().toString());
			
				
				listLampSmartExterior.add(lse);
				textPretExt.setText("");
				textGarantieExt.setText("");
				textCodExt.setText("");
				textTipIntrerupatorExt.setText("");
				textAutonomieExt.setText("");
				textDurataIncarcareExt.setText("");
				textFormaExt.setText("");
				textFunctiiExt.setText("");
				textSurseExt.setText("");
				textPutereExt.setText("");
				textTemperaturaExt.setText("");
				textTensiuneExt.setText("");
				
			}
		});
		
		
		anulareExt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textPretExt.setText("");
				textGarantieExt.setText("");
				textCodExt.setText("");
				textTipIntrerupatorExt.setText("");
				textAutonomieExt.setText("");
				textDurataIncarcareExt.setText("");
				textFormaExt.setText("");
				textFunctiiExt.setText("");
				textSurseExt.setText("");
				textPutereExt.setText("");
				textTemperaturaExt.setText("");
				textTensiuneExt.setText("");
			}
		});
		salvarePrelungitor.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
						
						Prelungitoare prl = new Prelungitoare();
						prl.setCodProdus(textCodPrelungitor.getText());
						prl.setDeschidereColet(comboBoxDeschiderePrelungitor.getSelectedItem().equals("Da") ? true : false );
						prl.setGarantie(Integer.valueOf(textGarantiePrelungitor.getText()));
						prl.setPret(Integer.valueOf(textPretPrelungitor.getText()));
						prl.setRetur(comboBoxReturPrelungitor.getSelectedItem().equals("Da") ? true : false );
						prl.setTipIntrerupator(textIntrerupatorPrelungitor.getText());
						prl.setCuloareprelungitor(comboBoxCuloarePrelungitor.getSelectedItem().toString());
						
						prl.setMaterial(comboBoxMaterialPrelungitor.getSelectedItem().toString());
						prl.setNumarprize(Integer.valueOf(textNumarPrizePrelungitor.getText()));
						prl.setProtectii(comboBoxProtectiiPrelungitor.getSelectedItem().toString());
						prl.setAmperaj(Integer.valueOf( comboBoxAmperajPrelungitor.getSelectedItem().toString()));
						prl.setPuteremaxima(Integer.valueOf(comboBoxPutereMaximaPrelungitor.getSelectedItem().toString()));
						
						
						listPrelungitoare.add(prl);
						textCodPrelungitor.setText("");
						textGarantiePrelungitor.setText("");
						textPretPrelungitor.setText("");
						textIntrerupatorPrelungitor.setText("");
						textNumarPrizePrelungitor.setText("");
								
					
					
					}
				});
		
		
		anularePrelungitor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCodPrelungitor.setText("");
				textGarantiePrelungitor.setText("");
				textPretPrelungitor.setText("");
				textIntrerupatorPrelungitor.setText("");
				textNumarPrizePrelungitor.setText("");
				
			}
		});
		
		
		
		
		salvareInt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				LampaSmartInterior lsi = new LampaSmartInterior();
				lsi.setCodProdus(textCodInt.getText());
				lsi.setDeschidereColet(comboBoxDeschidereInt.getSelectedItem().equals("Da") ? true : false);
				lsi.setGarantie(Integer.valueOf(textGarantieInt.getText()));
				lsi.setPret(Integer.valueOf(textPretInt.getText()));
				lsi.setRetur(comboBoxReturInt.getSelectedItem().equals("Da") ? true : false);
				lsi.setTipIntrerupator(textIntrerupatorInt.getText());
				lsi.setClasaeficienta(comboBoxClasaEficientaInt.getSelectedItem().toString());
				lsi.setCuloareint(comboBoxCuloareInt.getSelectedItem().toString());
				lsi.setFormaint(textFormaInt.getText());
				lsi.setFunctiiint(textFunctiiInt.getText());
				lsi.setMaterialint(comboBoxMaterialInt.getSelectedItem().toString());
			    lsi.setPutereW(Integer.valueOf(textPutereWInt.getText()));
			    lsi.setStilint(comboBoxStilInt.getSelectedItem().toString());
			    lsi.setSurseiluminatint(Integer.valueOf(textSurseIluminatInt.getText()));
			    lsi.setTipbecint(comboBoxTipBecInt.getSelectedItem().toString());
			    lsi.setTipmontareint(comboBoxTipMontareInt.getSelectedItem().toString());
			   
			    listLampSmartInterior.add(lsi);
			    textCodInt.setText("");
			    textGarantieInt.setText("");
			    textPretInt.setText("");
			    textIntrerupatorInt.setText("");
			    textFormaInt.setText("");
			    textFunctiiInt.setText("");
			    textPutereWInt.setText("");
			    textSurseIluminatInt.setText("");
			    
			}
		});
		
		anulareInt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				   textCodInt.setText("");
				    textGarantieInt.setText("");
				    textPretInt.setText("");
				    textIntrerupatorInt.setText("");
				    textFormaInt.setText("");
				    textFunctiiInt.setText("");
				    textPutereWInt.setText("");
				    textSurseIluminatInt.setText("");
			}
		});
		
			salvareSursa.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					SursaIluminat sil = new SursaIluminat();
					sil.setCodProdus(textCodSursa.getText());
					sil.setDeschidereColet(comboBoxDeschidereSursa.getSelectedItem().equals("Da") ? true : false);
					sil.setGarantie(Integer.valueOf(textGarantieSursa.getText()));
					sil.setPret(Integer.valueOf(textPretSursa.getText()));
					sil.setRetur(comboBoxReturSursa.getSelectedItem().equals("Da") ? true : false);
					sil.setTipIntrerupator(textIntrerupatorSursa.getText());
					
					sil.setClsprotectie(Integer.valueOf(comboBoxClasaProtectieSursa.getSelectedItem().toString()));
					sil.setCuloaresursa(comboBoxCuloareSursa.getSelectedItem().toString());
					sil.setMaterialsursa(comboBoxMatertialSursa.getSelectedItem().toString());
					sil.setPuteresursamax(Integer.valueOf(textPutereSursa.getText()));
					sil.setStilsursa(comboBoxStilSursa.getSelectedItem().toString());
					
					listSursaIluminat.add(sil);
					textGarantieSursa.setText("");
					textCodSursa.setText("");
					textPretSursa.setText("");
					textIntrerupatorSursa.setText("");
					textPutereSursa.setText("");
				}
			});
			
			anulareSursa.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					textGarantieSursa.setText("");
					textCodSursa.setText("");
					textPretSursa.setText("");
					textIntrerupatorSursa.setText("");
					textPutereSursa.setText("");
				
				}
			});
	
		
	}
}
