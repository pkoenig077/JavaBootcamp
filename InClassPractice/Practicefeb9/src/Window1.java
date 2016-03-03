import java.awt.EventQueue;
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class Window1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window1 window = new Window1();
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
	public Window1() {
		initialize();
	}
	JTextPane textPane = new JTextPane();
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnButton = new JButton("Load");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				JOptionPane.showMessageDialog(null, "Loaded from file");
				String fName = "myText.txt";
				Path p = Paths.get(fName);
				Path absPath =p.toAbsolutePath();
				if(Files.notExists(absPath)){
					try {
						Files.createFile(absPath);
						
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "File Creation error");
					}
				}
				try {
					File myTextFile = absPath.toFile();
					FileReader fReader = new FileReader(myTextFile);
					BufferedReader reader = new BufferedReader(fReader);
					String line = reader.readLine();
					while (line !=null){
						textPane.setText(textPane.getText()+line+"\n");
						line = reader.readLine();
					}
					
					reader.close();
					fReader.close();
				} catch(IOException e1){
					JOptionPane.showMessageDialog(null, "Error Loading from file");
				}
						
			}
		});
		btnButton.setBounds(10, 206, 89, 23);
		frame.getContentPane().add(btnButton);
		
		
		textPane.setBounds(10, 11, 414, 173);
		frame.getContentPane().add(textPane);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fName = "myText.txt";
				Path p = Paths.get(fName);
				Path absPath =p.toAbsolutePath();
				if(Files.notExists(absPath)){
					try {
						Files.createFile(absPath);
						
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "File Creation error");
					}
				}
				try{
				File myTextFile = absPath.toFile();
				
				PrintWriter writer = new PrintWriter(myTextFile);
				writer.write(textPane.getText());
				writer.close();
				} catch(IOException e1){
					JOptionPane.showMessageDialog(null,"File error");
				}
			}
		});
		btnSave.setBounds(109, 206, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Task1 t1 = new Task1();
				Thread d1 = new Thread(t1);
				d1.start();
				
			}
		});
		btnShow.setBounds(208, 206, 89, 23);
		frame.getContentPane().add(btnShow);
	}
}
