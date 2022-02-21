package ManagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import com.toedter.calendar.JDateChooser;

public class SchoolManagementSystem {

	private JFrame frame;
	private JTextField jtxtStudentID;
	private JTextField jtxtFirstName;
	private JTextField jtxtSurname;
	private JTextField jtxtIndexNo;
	private JTextField jtxtSubject1;
	private JTextField jtxtSubject2;
	private JTextField jtxtSubject3;
	private JTextField jtxtSubject4;
	private JTextField jtxtSubject5;
	private JTextField jtxtSubject6;
	private JTextField jtxtTotalScore;
	private JTextField jtxtAverage;
	private JTextField jtxtRanking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolManagementSystem window = new SchoolManagementSystem();
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
	public SchoolManagementSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.setBounds(0, 0, 1450, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(70, 125, 225));
		panel.setBorder(new LineBorder(new Color(0, 0, 139), 12));
		panel.setBounds(10, 10, 956, 438);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		jtxtStudentID = new JTextField();
		jtxtStudentID.setBackground(SystemColor.activeCaptionBorder);
		jtxtStudentID.setBounds(226, 46, 198, 19);
		panel.add(jtxtStudentID);
		jtxtStudentID.setColumns(10);
		
		JLabel lblStudentID = new JLabel("Student ID");
		lblStudentID.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentID.setBounds(38, 38, 151, 30);
		panel.add(lblStudentID);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstName.setBounds(38, 155, 151, 30);
		panel.add(lblFirstName);
		
		jtxtFirstName = new JTextField();
		jtxtFirstName.setBackground(SystemColor.activeCaptionBorder);
		jtxtFirstName.setColumns(10);
		jtxtFirstName.setBounds(226, 163, 198, 19);
		panel.add(jtxtFirstName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSurname.setBounds(38, 195, 151, 30);
		panel.add(lblSurname);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setBackground(SystemColor.activeCaptionBorder);
		jtxtSurname.setColumns(10);
		jtxtSurname.setBounds(226, 203, 198, 19);
		panel.add(jtxtSurname);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSemester.setBounds(38, 78, 151, 30);
		panel.add(lblSemester);
		
		JLabel lblIndexNo = new JLabel("Index No.");
		lblIndexNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIndexNo.setBounds(38, 115, 151, 30);
		panel.add(lblIndexNo);
		
		jtxtIndexNo = new JTextField();
		jtxtIndexNo.setBackground(SystemColor.activeCaptionBorder);
		jtxtIndexNo.setColumns(10);
		jtxtIndexNo.setBounds(226, 123, 198, 19);
		panel.add(jtxtIndexNo);
		
		JLabel lblDoB = new JLabel("DoB");
		lblDoB.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDoB.setBounds(38, 235, 151, 30);
		panel.add(lblDoB);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(38, 317, 151, 30);
		panel.add(lblAddress);
		
		JComboBox cmbSemester = new JComboBox();
		cmbSemester.setMaximumRowCount(9);
		cmbSemester.setBackground(SystemColor.activeCaptionBorder);
		cmbSemester.setModel(new DefaultComboBoxModel(new String[] {"Select", "1st year 1st semester", "1st year 2nd semester", "2nd year 1st semester", "2nd year 2nd semester", "3rd year 1st semester", "3rd year 2nd semester", "4th yaer 1st semester", "4th year 2nd semester"}));
		cmbSemester.setBounds(226, 85, 198, 21);
		panel.add(cmbSemester);
		
		JLabel lblNewLabel_5 = new JLabel("Subject1");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(556, 38, 151, 30);
		panel.add(lblNewLabel_5);
		
		jtxtSubject1 = new JTextField();
		jtxtSubject1.setBackground(SystemColor.activeCaptionBorder);
		jtxtSubject1.setColumns(10);
		jtxtSubject1.setBounds(712, 46, 198, 19);
		panel.add(jtxtSubject1);
		
		JLabel lblSubject = new JLabel("Subject2");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubject.setBounds(556, 75, 151, 30);
		panel.add(lblSubject);
		
		jtxtSubject2 = new JTextField();
		jtxtSubject2.setBackground(SystemColor.activeCaptionBorder);
		jtxtSubject2.setColumns(10);
		jtxtSubject2.setBounds(712, 83, 198, 19);
		panel.add(jtxtSubject2);
		
		JLabel lblSubject_1 = new JLabel("Subject3");
		lblSubject_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubject_1.setBounds(556, 115, 151, 30);
		panel.add(lblSubject_1);
		
		jtxtSubject3 = new JTextField();
		jtxtSubject3.setBackground(SystemColor.activeCaptionBorder);
		jtxtSubject3.setColumns(10);
		jtxtSubject3.setBounds(712, 123, 198, 19);
		panel.add(jtxtSubject3);
		
		JLabel lblSubject_2 = new JLabel("Subject4");
		lblSubject_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubject_2.setBounds(556, 155, 151, 30);
		panel.add(lblSubject_2);
		
		jtxtSubject4 = new JTextField();
		jtxtSubject4.setBackground(SystemColor.activeCaptionBorder);
		jtxtSubject4.setColumns(10);
		jtxtSubject4.setBounds(712, 163, 198, 19);
		panel.add(jtxtSubject4);
		
		JLabel lblSubject_3 = new JLabel("Subject5");
		lblSubject_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubject_3.setBounds(556, 195, 151, 30);
		panel.add(lblSubject_3);
		
		jtxtSubject5 = new JTextField();
		jtxtSubject5.setBackground(SystemColor.activeCaptionBorder);
		jtxtSubject5.setColumns(10);
		jtxtSubject5.setBounds(712, 203, 198, 19);
		panel.add(jtxtSubject5);
		
		JLabel lblSubject_4 = new JLabel("Subject6");
		lblSubject_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubject_4.setBounds(556, 235, 151, 30);
		panel.add(lblSubject_4);
		
		jtxtSubject6 = new JTextField();
		jtxtSubject6.setBackground(SystemColor.activeCaptionBorder);
		jtxtSubject6.setColumns(10);
		jtxtSubject6.setBounds(712, 243, 198, 19);
		panel.add(jtxtSubject6);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotalScore.setBounds(556, 320, 151, 30);
		panel.add(lblTotalScore);
		
		jtxtTotalScore = new JTextField();
		jtxtTotalScore.setBackground(SystemColor.textInactiveText);
		jtxtTotalScore.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtxtTotalScore.setEnabled(false);
		jtxtTotalScore.setColumns(10);
		jtxtTotalScore.setBounds(712, 328, 198, 19);
		panel.add(jtxtTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAverage.setBounds(556, 349, 151, 30);
		panel.add(lblAverage);
		
		jtxtAverage = new JTextField();
		jtxtAverage.setBackground(SystemColor.textInactiveText);
		jtxtAverage.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtxtAverage.setEnabled(false);
		jtxtAverage.setColumns(10);
		jtxtAverage.setBounds(712, 357, 198, 19);
		panel.add(jtxtAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRanking.setBounds(556, 378, 151, 30);
		panel.add(lblRanking);
		
		jtxtRanking = new JTextField();
		jtxtRanking.setBackground(SystemColor.textInactiveText);
		jtxtRanking.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtxtRanking.setEnabled(false);
		jtxtRanking.setColumns(10);
		jtxtRanking.setBounds(712, 386, 198, 19);
		panel.add(jtxtRanking);
		
		final JTextArea jtxtAddress = new JTextArea();
		jtxtAddress.setBackground(SystemColor.activeCaptionBorder);
		jtxtAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jtxtAddress.setBounds(226, 326, 198, 91);
		panel.add(jtxtAddress);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(38, 275, 151, 30);
		panel.add(lblGender);
		
		JComboBox cmbGender = new JComboBox();
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female"}));
		cmbGender.setBackground(SystemColor.activeCaptionBorder);
		cmbGender.setBounds(226, 282, 198, 21);
		panel.add(cmbGender);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBackground(SystemColor.activeCaptionBorder);
		dateChooser.setBounds(226, 246, 198, 19);
		panel.add(dateChooser);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 139), 12));
		panel_1.setBackground(new Color(70, 125, 225));
		panel_1.setBounds(976, 10, 353, 438);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setBackground(SystemColor.controlHighlight);
		jtxtTranscript.setBounds(22, 21, 307, 394);
		panel_1.add(jtxtTranscript);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 139), 12));
		panel_2.setBackground(new Color(70, 125, 225));
		panel_2.setBounds(10, 458, 1319, 98);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnResult = new JButton("RESULT");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double[] R = new double[14];
				R[0]= Double.parseDouble(jtxtSubject1.getText());
				R[1]= Double.parseDouble(jtxtSubject2.getText());
				R[2]= Double.parseDouble(jtxtSubject3.getText());
				R[3]= Double.parseDouble(jtxtSubject4.getText());
				R[4]= Double.parseDouble(jtxtSubject5.getText());
				R[5]= Double.parseDouble(jtxtSubject6.getText());
				
				R[6]= (R[0] + R[1] + R[2] + R[3] + R[4] + R[5]);
				R[7]= (R[0] + R[1] + R[2] + R[3] + R[4] + R[5])/6;
				
				String TotalScore = String.format("%.0f", R[6]);
				jtxtTotalScore.setText(TotalScore);
				
				String Average = String.format("%.0f", R[7]);
				jtxtAverage.setText(Average);
				
				//=============Ranking===================
				if(R[6]>=500)
				{
					jtxtRanking.setText("1st Class");
				}
				else if(R[6]>=400)
				{
					jtxtRanking.setText("2nd Class");
				}
				else if(R[6]>=300)
				{
					jtxtRanking.setText("3rd Class");
				}
				else if(R[6]<300)
				{
					jtxtRanking.setText("Repeat");
				}
				//=========Greater than 100==================
				if(R[0]>100)
				{
					jtxtSubject1.setText("");
					jtxtSubject1.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
				}
				if(R[1]>100)
				{
					jtxtSubject2.setText("");
					jtxtSubject2.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
				}
				if(R[2]>100)
				{
					jtxtSubject3.setText("");
					jtxtSubject3.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
				}
				if(R[3]>100)
				{
					jtxtSubject4.setText("");
					jtxtSubject4.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
				}
				if(R[4]>100)
				{
					jtxtSubject5.setText(""); 
					jtxtSubject5.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
				}
				
				if(R[5]>100)
				{
					jtxtSubject6.setText("");
					jtxtSubject6.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
				}
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnResult.setBounds(95, 28, 128, 46);
		panel_2.add(btnResult);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				@SuppressWarnings("unused")
				MessageFormat header = new MessageFormat("Printing in progress");
				@SuppressWarnings("unused")
				MessageFormat footer = new MessageFormat("Page{0, number, integer}");				
				
				try
				{
					jtxtTranscript.print();
				}
				catch(java.awt.print.PrinterException ev) {
					System.err.format("No printer found", ev.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPrint.setBounds(613, 28, 128, 46);
		panel_2.add(btnPrint);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField temp=null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
					}	
				}/*
			    JTextField temp1=null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("com.toedter.calendar.JDateChooser")) {
						temp1=(JTextField)c;
						temp1.setText(null);
					}	
				}*/
				jtxtTranscript.setText(null);
				jtxtAddress.setText(null);
			}
		});
		btnReset.setBounds(853, 28, 128, 46);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("EXIT");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Result System", 
					JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(1101, 28, 128, 46);
		panel_2.add(btnExit);
		
		JButton btnTranscript = new JButton("TRANSCRIPT");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtTranscript.setText("");
				jtxtTranscript.append("Student Management System\n"
				+"==============================================\n"
				+ "Student ID:\t\t"+jtxtStudentID.getText()
				+"\nFirst Name:\t\t"+jtxtFirstName.getText()
				+"\nSurname:\t\t"+jtxtSurname.getText()
				+"\nIndexNo:\t\t"+jtxtIndexNo.getText()
				+"\nSubject1:\t\t"+jtxtSubject1.getText()
				+"\nSubject2:\t\t"+jtxtSubject2.getText()
				+"\nSubject3:\t\t"+jtxtSubject3.getText()
				+"\nSubject4:\t\t"+jtxtSubject4.getText()
				+"\nSubject5:\t\t"+jtxtSubject5.getText()
				+"\nSubject6:\t\t"+jtxtSubject6.getText()
				+"\n============================================"
				+"\nTotal Score:\t\t"+jtxtTotalScore.getText()
				+"\nAverage:\t\t"+jtxtAverage.getText()
				+"\nRanking:\t\t"+jtxtRanking.getText()+"\n");
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTranscript.setBounds(346, 28, 149, 46);
		panel_2.add(btnTranscript);

	}

}
