package bori;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class First extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public First() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(249, 240, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel h = new JLabel("Calculator");
		h.setForeground(new Color(255, 190, 111));
		h.setFont(new Font("Bitstream Vera Sans", Font.BOLD, 20));
		h.setBounds(182, 12, 117, 24);
		contentPane.add(h);
		
		JLabel Lablea = new JLabel("A");
		Lablea.setForeground(new Color(51, 209, 122));
		Lablea.setBackground(new Color(51, 209, 122));
		Lablea.setFont(new Font("Dialog", Font.ITALIC, 14));
		Lablea.setBounds(167, 53, 40, 20);
		contentPane.add(Lablea);
		
		tfa = new JTextField();
		tfa.setBounds(263, 53, 114, 21);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel Lableb = new JLabel("B");
		Lableb.setForeground(new Color(51, 209, 122));
		Lableb.setBounds(162, 104, 8, 17);
		contentPane.add(Lableb);
		
		tfb = new JTextField();
		tfb.setBounds(263, 102, 114, 21);
		contentPane.add(tfb);
		tfb.setColumns(10);
		
		JLabel result = new JLabel("Result");
		result.setForeground(new Color(51, 209, 122));
		result.setBounds(147, 158, 60, 17);
		contentPane.add(result);
		
		tfr = new JTextField();
		tfr.setBounds(263, 156, 114, 21);
		contentPane.add(tfr);
		tfr.setColumns(10);
		
		JButton ADD = new JButton("ADD");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to add
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				
				int res = var1 + var2;
				
				String result = String.valueOf(res);
							tfr.setText(result);
			}
		});
		ADD.setBounds(19, 212, 60, 27);
		contentPane.add(ADD);
		
		JButton SUB = new JButton("SUB");
		SUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic to sub
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				
				int res = var1 - var2;
				
				String result = String.valueOf(res);
							tfr.setText(result);
			}
		});
		SUB.setBounds(112, 212, 58, 27);
		contentPane.add(SUB);
		
		JButton MUL = new JButton("MUL");
		MUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to mul
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				
				int res = var1 * var2;
				
				String result = String.valueOf(res);
							tfr.setText(result);
			}
		});
		MUL.setBounds(204, 212, 61, 27);
		contentPane.add(MUL);
		
		JButton DIV = new JButton("DIV");
		DIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to div
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				
				float var1 = Float.valueOf(data1);
				float var2 = Float.valueOf(data2);
				
				float res = var1 / var2;
				
				String result = String.valueOf(res);
							tfr.setText(result);
			}
		});
		DIV.setBounds(297, 212, 56, 27);
		contentPane.add(DIV);
		
		JButton REM = new JButton("REM");
		REM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				
				int res = var1 % var2;
				
				String result = String.valueOf(res);
							tfr.setText(result);
			}
			//logic to rem
			
		});
		REM.setBounds(378, 212, 60, 27);
		contentPane.add(REM);
	}
}
