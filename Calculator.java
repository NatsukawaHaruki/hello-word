/**
 * 
 */
/**
 * @author LX
 *
 */
package a;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator {
	Calculator(){
		JFrame frame = new JFrame("计算器");
		Container ctpn =frame.getContentPane();
		ctpn.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu optionMenu = new JMenu("帮助");
		JMenuItem Item1 = new JMenuItem("菜单1");
		JMenuItem Item2 = new JMenuItem("菜单2");
		JMenuItem Item3 = new JMenuItem("菜单3");
		optionMenu.add(Item1);
		optionMenu.add(Item2);
		optionMenu.add(Item3);
		menuBar.add(optionMenu);
		//Item1.addActionListener((ActionListener) Item1);
		//Item2.addActionListener((ActionListener) Item2);
		//Item3.addActionListener((ActionListener) Item3);
		Item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        		String msg = "菜单1已打开！";
        		String title = "菜单1";
        		int type = JOptionPane.INFORMATION_MESSAGE;
        		JOptionPane.showMessageDialog(optionMenu, msg,title,type);
            }
        });
		Item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        		String msg = "菜单2已打开！";
        		String title = "菜单2";
        		int type = JOptionPane.INFORMATION_MESSAGE;
        		JOptionPane.showMessageDialog(optionMenu, msg,title,type);
            }
        });
		Item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        		String msg = "菜单3已打开！";
        		String title = "菜单2";
        		int type = JOptionPane.INFORMATION_MESSAGE;
        		JOptionPane.showMessageDialog(optionMenu, msg,title,type);
            }
        });
		

		
		
		JTextField text1=new JTextField("0",80);
		text1.setHorizontalAlignment(SwingConstants.RIGHT);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.setBorder(BorderFactory.createEtchedBorder());
		panel2.add(text1);
		
		JPanel panel3=new JPanel();
		panel3.setLayout(new BorderLayout());
		
		JPanel panel4=new JPanel(new GridLayout(1,2));
		panel4.setLayout(new GridLayout(1,2));
		
		JPanel panel5=new JPanel();
		panel5.setLayout(new BorderLayout());/////new GridLayout(2,1)
		
		JPanel panel7=new JPanel(new GridLayout(1,3));
		panel7.setBorder(BorderFactory.createEtchedBorder());
		JRadioButton rb1 = new JRadioButton("十进制");

		JRadioButton rb2 = new JRadioButton("八进制");

		JRadioButton rb3 = new JRadioButton("二进制");
		panel7.add(rb1);
		panel7.add(rb2);
		panel7.add(rb3);
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		panel5.add(panel7,BorderLayout.NORTH);////panel5.add(panel7)
		
		JPanel panel6=new JPanel();
		panel6.setLayout(new BorderLayout());//GridLayout(2,1)
		
		JPanel panel8=new JPanel(new GridLayout(1,3));
		panel8.setBorder(BorderFactory.createEtchedBorder());
		JCheckBox cb1=new JCheckBox("JAVA");
		JCheckBox cb2=new JCheckBox("C++");
		JCheckBox cb3=new JCheckBox("Delphi");
		panel8.add(cb1);
		panel8.add(cb2);
		panel8.add(cb3);
		panel6.add(panel8,BorderLayout.NORTH);
		
		JPanel panel9=new JPanel();
		panel9.setLayout(new GridLayout(4,4));
		JButton p9b0 = new JButton("0");
		p9b0.setEnabled(true);
		panel9.add(p9b0);
		p9b0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="0";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b1 = new JButton("1");
		p9b1.setEnabled(true);
		panel9.add(p9b1);
		p9b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="1";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b2 = new JButton("2");
		p9b2.setEnabled(true);
		panel9.add(p9b2);
		p9b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="2";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b3 = new JButton("3");
		p9b3.setEnabled(true);
		panel9.add(p9b3);
		p9b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="3";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b4 = new JButton("4");
		p9b4.setEnabled(true);
		panel9.add(p9b4);
		p9b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="4";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b5 = new JButton("5");
		p9b5.setEnabled(true);
		panel9.add(p9b5);
		p9b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="5";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b6 = new JButton("6");
		p9b6.setEnabled(true);
		panel9.add(p9b6);
		p9b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="6";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b7 = new JButton("7");
		p9b7.setEnabled(true);
		panel9.add(p9b7);
		p9b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="7";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b8 = new JButton("8");
		p9b8.setEnabled(true);
		panel9.add(p9b8);
		p9b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="8";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b9 = new JButton("9");
		p9b9.setEnabled(true);
		panel9.add(p9b9);
		p9b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="9";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b10 = new JButton("+");
		p9b10.setEnabled(true);
		panel9.add(p9b10);
		p9b10.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent event) {
		        Double n=Double.parseDouble(text1.getText());
		        Double m=Double.parseDouble(text2.getText());
		        Double sum=n+m;
		        text3.setText(sum.toString());
		    }
		});
		
		JButton p9b11 = new JButton("-");
		p9b11.setEnabled(true);
		panel9.add(p9b11);
		p9b11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="1";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
       		}else{
        			text1.setText(old_num+str_num);
        		}
           }
		});
		
		JButton p9b12 = new JButton("*");
		p9b12.setEnabled(true);
		panel9.add(p9b12);
		p9b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		String str_num="1";
        		String old_num=text1.getText();
        		if(old_num.equals("0") || old_num ==""){
        			text1.setText(str_num);
        		}else{
        			text1.setText(old_num+str_num);
        		}
            }
		});
		
		JButton p9b13 = new JButton("/");
		p9b13.setEnabled(true);
		panel9.add(p9b13);
		p9b13.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent event) {
		        Double n=Double.parseDouble(text1.getText());
		        Double m=Double.parseDouble(text2.getText());
		        if(m == 0) {
		            text3.setText("除数不能为0");
		        } else {
		            Double result = n/m;
		            text3.setText(result.toString());
		        }
		    }
		}); 
		
		JButton p9b14 = new JButton("C");
		p9b14.setEnabled(true);
		panel9.add(p9b14);
		p9b14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        		text1.setText(null);;
            }
		});
		
		JButton p9b15 = new JButton("=");
		p9b15.setEnabled(true);
		panel9.add(p9b15);
		p9b15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				
			}
		});
		
//		panel9.add(new JButton("1"));
		panel6.add(panel9);
		
		JPanel panel10=new JPanel();
		panel10.setLayout(new GridLayout(4,4));
		JButton p10b1 = new JButton("Sin");
		p10b1.setEnabled(false);
		JButton p10b2 = new JButton("And");
		p10b2.setEnabled(false);
		JButton p10b3 = new JButton("(");
		p10b3.setEnabled(false);
		JButton p10b4 = new JButton(")");
		p10b4.setEnabled(false);
		JButton p10b5 = new JButton("Cos");
		p10b5.setEnabled(false);
		JButton p10b6 = new JButton("Or");
		p10b6.setEnabled(false);
		JButton p10b7 = new JButton("Exp");
		p10b7.setEnabled(false);
		JButton p10b8 = new JButton("Ln");
		p10b8.setEnabled(false);
		JButton p10b9 = new JButton("tan");
		p10b9.setEnabled(false);
		JButton p10b10 = new JButton("Xor");
		p10b10.setEnabled(false);
		JButton p10b11 = new JButton("x^y");
		p10b11.setEnabled(false);
		JButton p10b12 = new JButton("log");
		p10b12.setEnabled(false);
		JButton p10b13 = new JButton("e");
		p10b13.setEnabled(false);
		JButton p10b14 = new JButton("Not");
		p10b14.setEnabled(false);
		JButton p10b15 = new JButton("x^3");
		p10b15.setEnabled(false);
		JButton p10b16 = new JButton("n!");
		p10b16.setEnabled(false);
		
		panel10.add(p10b1);
		panel10.add(p10b2);
		panel10.add(p10b3);
		panel10.add(p10b4);
		panel10.add(p10b5);
		panel10.add(p10b6);
		panel10.add(p10b7);
		panel10.add(p10b8);
		panel10.add(p10b9);
		panel10.add(p10b10);
		panel10.add(p10b11);
		panel10.add(p10b12);
		panel10.add(p10b13);
		panel10.add(p10b14);
		panel10.add(p10b15);
		panel10.add(p10b16);
		panel5.add(panel10);
		
		
		panel4.add(panel5);
		panel4.add(panel6);
		panel3.add(panel2,BorderLayout.NORTH);
		panel3.add(panel4,BorderLayout.CENTER);
		ctpn.add(panel1,BorderLayout.NORTH);
		ctpn.add(panel3,BorderLayout.CENTER);
		
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
		
		frame.setSize(600, 400);
		frame.setLocation(500, 500);
		frame.setVisible(true);
		
		rb1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	p9b0.setEnabled(true);
		    	p9b1.setEnabled(true);
	            p9b2.setEnabled(true);
	            p9b3.setEnabled(true);
	            p9b4.setEnabled(true);
	            p9b5.setEnabled(true);
	            p9b6.setEnabled(true);
	            p9b7.setEnabled(true);
	            p9b8.setEnabled(true);
	            p9b9.setEnabled(true);
		    }
		});
		
		rb2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (rb2.isSelected()) {
		        	p9b0.setEnabled(true);
			    	p9b1.setEnabled(true);
		            p9b2.setEnabled(true);
		            p9b3.setEnabled(true);
		            p9b4.setEnabled(true);
		            p9b5.setEnabled(true);
		            p9b6.setEnabled(true);
		            p9b7.setEnabled(true);
		            p9b8.setEnabled(false);
		            p9b9.setEnabled(false);
		        }
		    }
		});
		
		rb3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (rb3.isSelected()) {
		        	p9b0.setEnabled(true);
			    	p9b1.setEnabled(true);
		            p9b2.setEnabled(false);
		            p9b3.setEnabled(false);
		            p9b4.setEnabled(false);
		            p9b5.setEnabled(false);
		            p9b6.setEnabled(false);
		            p9b7.setEnabled(false);
		            p9b8.setEnabled(false);
		            p9b9.setEnabled(false);
		        }
		    }
		});
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
	}

}