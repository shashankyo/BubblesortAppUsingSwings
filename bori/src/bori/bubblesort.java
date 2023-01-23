package bori;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bubblesort extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bubblesort frame = new bubblesort();
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
	public bubblesort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 171, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sorting = new JLabel("SORTING");
		sorting.setForeground(new Color(26, 95, 180));
		sorting.setFont(new Font("Dialog", Font.BOLD, 14));
		sorting.setBounds(195, 12, 62, 20);
		contentPane.add(sorting);
		
		JLabel la = new JLabel("Enter the number series");
		la.setForeground(new Color(224, 27, 36));
		la.setBounds(56, 53, 144, 17);
		contentPane.add(la);
		
		JTextArea tx1 = new JTextArea();
		tx1.setBounds(248, 53, 149, 17);
		contentPane.add(tx1);
		
		JLabel lb = new JLabel("Number after sorting");
		lb.setForeground(new Color(224, 27, 36));
		lb.setBounds(72, 100, 128, 17);
		contentPane.add(lb);
		
		JTextArea tx2 = new JTextArea();
		tx2.setBounds(248, 100, 152, 17);
		contentPane.add(tx2);
		
		JButton sort = new JButton("BUBBLE SORT");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic of sorting
				String sentence = tx1.getText();
				String arr[] = sentence.split(" ");
				String help;
				String result = "";
				
				for(int i = 0;i<=arr.length-2;i++)
				{
					for(int j=0;j<=arr.length-2-i;j++)
					{
						if(Integer.valueOf(arr[j]) > Integer.valueOf(arr[j+1]))
								{
									help = arr[j];
									arr[j] = arr[j+1];
									arr[j+1] = help;
									
								}
					}
				}
					for(int i=0;i<=arr.length-1;i++)
					{
						result = result + arr[i]+" ";
						
					}
					
						tx2.setText(result);
								
			}
		});
		sort.setBackground(new Color(246, 211, 45));
		sort.setForeground(new Color(224, 27, 36));
		sort.setBounds(173, 171, 116, 27);
		contentPane.add(sort);
	}
}
