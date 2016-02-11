import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JList;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class CountryListApp {

	private JFrame frame;
	private JTextField textField;
	private JTextArea textArea;
	static String fName = "CountryList.txt";
	static Path p = Paths.get(fName);
	static Path absPath =p.toAbsolutePath();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountryListApp window = new CountryListApp();
					window.frame.setVisible(true);
					getCountryFile();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CountryListApp() {
		initialize();
	}
/**
 * method for loading text from file into the list
 */
	public void load(){
		try {
			File myTextFile = absPath.toFile();
			FileReader fReader = new FileReader(myTextFile);
			BufferedReader reader = new BufferedReader(fReader);
			String line = reader.readLine();
			while (line !=null){
				textArea.setText(textArea.getText()+line+"\n");
				line = reader.readLine();
			}
			reader.close();
		} catch(IOException e1){
			JOptionPane.showMessageDialog(null, "Error Loading from file");
		}
	}
/**
 * method for creating txt file CountryList if it doesn't exist	
 */
	public static void getCountryFile(){
		
		if(Files.notExists(absPath)){
			try {
				Files.createFile(absPath);
				
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "File Creation error");
			}
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("Enter a Country, then hit Add");
		textField.setBounds(56, 181, 160, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCountry = new JLabel("Countries");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCountry.setBounds(296, 11, 63, 23);
		frame.getContentPane().add(lblCountry);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try{
					File myTextFile = absPath.toFile();
					
					PrintWriter writer = new PrintWriter(myTextFile);
					writer.write(textArea.getText()+"\n"+textField.getText());
					writer.close();
					} catch(IOException e1){
						JOptionPane.showMessageDialog(null,"File error");
					}
			}
		});
		btnAdd.setBounds(10, 209, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				load();
						
			}
		});
		btnLoad.setBounds(127, 209, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(226, 45, 198, 156);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				load();
						
			}
		});
		mnFile.add(mntmLoad);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			save();
			}
		});
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Good Bye");
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
	}
/**
 * method for saving list to file
 */
	public  void save() {
		try{
			File myTextFile = absPath.toFile();
			
			PrintWriter writer = new PrintWriter(myTextFile);
			writer.write(textArea.getText());
			writer.close();
			} catch(IOException e1){
				JOptionPane.showMessageDialog(null,"File error");
			}
	}
}
