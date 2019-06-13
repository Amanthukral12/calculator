package calculator;

import javax.swing.*;
import java.awt.event.*; 
 
class Calc implements ActionListener
{
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,be,bdiv,bfac,bmul,bsub,badd,bper,brtd,bdtr,bpow,bpi,bdec,beq,bdel,bclr,bsqrt;
	
	static double a=0,b=0,result=0,degree,radian;
	static int operator=0;
 
	Calc()
	{
		f=new JFrame("Calculator");
		t=new JTextField();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		be=new JButton("e");
		bdiv=new JButton("/");
		bmul=new JButton("*");
		bsub=new JButton("-");
		badd=new JButton("+");
		bdec=new JButton(".");
		bpow=new JButton("^");
		beq=new JButton("=");
		bper=new JButton("%");
		bpi=new JButton("Pi");
		bsqrt=new JButton("Sqrt");
		bfac=new JButton("x!");
		bdtr=new JButton("DtoR");
		brtd=new JButton("RtoD");
		bdel=new JButton("Delete");
		bclr=new JButton("Clear");
		
		t.setBounds(40,40,280,30);
		b7.setBounds(50,100,70,60);
		b8.setBounds(130,100,70,60);
		b9.setBounds(210,100,70,60);
		bdiv.setBounds(290,100,70,60);
		
		b4.setBounds(50,170,70,60);
		b5.setBounds(130,170,70,60);
		b6.setBounds(210,170,70,60);
		bmul.setBounds(290,170,70,60);
		
		b1.setBounds(50,240,70,60);
		b2.setBounds(130,240,70,60);
		b3.setBounds(210,240,70,60);
		bsub.setBounds(290,240,70,60);
		
		bdec.setBounds(50,310,70,60);
		b0.setBounds(130,310,70,60);
		beq.setBounds(210,310,70,60);
		badd.setBounds(290,310,70,60);
		bper.setBounds(370,100,70,60);
		bfac.setBounds(450,100,70,60);
		bpow.setBounds(370,170,70,60);
		bdtr.setBounds(450,170,70,60);
		bpi.setBounds(370,240,70,60);
		brtd.setBounds(450,240,70,60);
		bsqrt.setBounds(370,310,70,60);
		be.setBounds(450,310,70,60);
		bdel.setBounds(130,380,100,40);
		bclr.setBounds(250,380,100,40);
		
		f.add(t);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bdiv);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bmul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(be);
		f.add(bsub);
		f.add(bdec);
		f.add(b0);
		f.add(beq);
		f.add(badd);
		f.add(bdel);
		f.add(bclr);
		f.add(bpow);
		f.add(bper);
		f.add(bpi);
		f.add(bsqrt);
		f.add(bfac);
		f.add(bdtr);
		f.add(brtd);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		be.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bdec.addActionListener(this);
		bpow.addActionListener(this);
		bper.addActionListener(this);
		bpi.addActionListener(this);
		bsqrt.addActionListener(this);
		bfac.addActionListener(this);
		bdtr.addActionListener(this);
		brtd.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
	}
 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			t.setText(t.getText().concat("1"));
		
		if(e.getSource()==b2)
			t.setText(t.getText().concat("2"));
		
		if(e.getSource()==b3)
			t.setText(t.getText().concat("3"));
		
		if(e.getSource()==b4)
			t.setText(t.getText().concat("4"));
		
		if(e.getSource()==b5)
			t.setText(t.getText().concat("5"));
		
		if(e.getSource()==b6)
			t.setText(t.getText().concat("6"));
		
		if(e.getSource()==b7)
			t.setText(t.getText().concat("7"));
		
		if(e.getSource()==b8)
			t.setText(t.getText().concat("8"));
		
		if(e.getSource()==b9)
			t.setText(t.getText().concat("9"));
		
		if(e.getSource()==b0)
			t.setText(t.getText().concat("0"));
		
		if(e.getSource()==bdec)
			t.setText(t.getText().concat("."));
		
		if(e.getSource()==badd)
		{
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		} 
		
		if(e.getSource()==bsub)
		{
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		
		if(e.getSource()==bmul)
		{
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		
		if(e.getSource()==bdiv)
		{
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}
		if(e.getSource()==bpow)
		{
			a=Double.parseDouble(t.getText());
			operator=5;
			t.setText("");
		}
		if(e.getSource()==bper)
		{
			a=Double.parseDouble(t.getText());
			operator=6;
			t.setText("");
		}
		if(e.getSource()==bpi)
		{
			a=Double.parseDouble(t.getText());
			operator=7;
			t.setText("");
		}
		if(e.getSource()==bsqrt)
		{
			a=Double.parseDouble(t.getText());
			operator=8;
			t.setText("");
		}
		if(e.getSource()==bfac)
		{
			a=Double.parseDouble(t.getText());
			operator=9;
			t.setText("");
		}
		if(e.getSource()==bdtr)
		{
			degree=Double.parseDouble(t.getText());
			operator=10;
			t.setText("");
		}
		if(e.getSource()==brtd)
		{
			radian=Double.parseDouble(t.getText());
			operator=11;
			t.setText("");
		}
		if(e.getSource()==be)
		{
			a=Double.parseDouble(t.getText());
			operator=12;
			t.setText("");
		}
		if(e.getSource()==beq)
		{
		
			switch(operator)
			{
				case 1:
				{
					b=Double.parseDouble(t.getText());
					result=a+b;
					break;
				}
				case 2:
				{
					b=Double.parseDouble(t.getText());
					result=a-b;
					break;
				}
				case 3: 
				{
					b=Double.parseDouble(t.getText());
					result=a*b;
					break;
				}
				case 4: 
				{
					b=Double.parseDouble(t.getText());
					result=a/b;
					break;
				}	
				case 5: 
				{
					b=Double.parseDouble(t.getText());
					result=Math.pow(a, b);
					break;
				}	
				
				case 6:
				{
					b=Double.parseDouble(t.getText());
					result=a*(b/100);
					break;
				}
				case 7: 
				{
					b=1;
					result=3.141*a;
					break;
				}
				case 8:
				{
					b=1;
					result=Math.sqrt(a);
					break;
				}
				case 9:
				{
					double fact=1;
					b=1;
					for(int i=1;i<=a;i++)
					{
						fact=fact*i;
					}
					result=fact;
					break;
				}
				case 10:
				{
					radian = degree*(3.141592/180);
					result= radian;
					break;
				}
				case 11:
				{
					degree=radian*(180/3.141592);
					result=degree;
					break;
				}
				case 12:
				{
					b=1;
					result=2.718*a;
					break;
				}
			}
			
			t.setText(""+result);	
		}
		
		if(e.getSource()==bclr)
		{
			t.setText("");
		}
		if(e.getSource()==bdel)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}		
	}
 
	public static void main(String...s)
	{
		new Calc();
	}
}
