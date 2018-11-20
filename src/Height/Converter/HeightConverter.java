package Height.Converter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class HeightConverter extends JFrame {

	private JPanel contentPane;
	private JTextField ftTxField;
	private JTextField inchTxField;
	private JTextField cmTxField;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeightConverter frame = new HeightConverter();
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
	public HeightConverter() {
		setTitle("Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel ftLabel = new JLabel("Feet");
		ftLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		ftLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		ftLabel.setBounds(84, 12, 46, 14);
		panel.add(ftLabel);
		
		JLabel InLabel = new JLabel("Inches");
		InLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		InLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		InLabel.setBounds(44, 61, 86, 14);
		panel.add(InLabel);
		
		ftTxField = new JTextField();
		ftTxField.setBounds(144, 11, 123, 20);
		panel.add(ftTxField);
		ftTxField.setColumns(10);
		
		inchTxField = new JTextField();
		inchTxField.setBounds(144, 60, 123, 20);
		panel.add(inchTxField);
		inchTxField.setColumns(10);
		
		JButton convertBtn = new JButton("Convert");
		convertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double feet, inches, centimeters;
				feet = Double.parseDouble(ftTxField.getText());
				inches = Double.parseDouble(inchTxField.getText());
				centimeters = (feet * 12 + inches)*2.54;
				cmTxField.setText(String.valueOf(centimeters));

			}
		});
		convertBtn.setForeground(Color.WHITE);
		convertBtn.setBackground(Color.BLUE);
		convertBtn.setFont(new Font("Verdana", Font.BOLD, 24));
		convertBtn.setBounds(10, 122, 353, 39);
		panel.add(convertBtn);
		
		cmTxField = new JTextField();
		cmTxField.setEditable(false);
		cmTxField.setHorizontalAlignment(SwingConstants.TRAILING);
		cmTxField.setBounds(144, 219, 123, 20);
		panel.add(cmTxField);
		cmTxField.setColumns(10);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ftTxField.setText("");
				cmTxField.setText("");
				inchTxField.setText("");
			}
		});
		clearBtn.setForeground(Color.WHITE);
		clearBtn.setBackground(Color.MAGENTA);
		clearBtn.setFont(new Font("Verdana", Font.BOLD, 18));
		clearBtn.setBounds(84, 303, 98, 31);
		panel.add(clearBtn);
		
		JLabel cmLabel = new JLabel("Centimeters");
		cmLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		cmLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		cmLabel.setBounds(0, 220, 130, 14);
		panel.add(cmLabel);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setBackground(Color.MAGENTA);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.setFont(new Font("Verdana", Font.BOLD, 18));
		exitBtn.setBounds(204, 303, 98, 31);
		panel.add(exitBtn);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
