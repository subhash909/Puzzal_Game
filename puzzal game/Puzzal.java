import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Puzzal implements ActionListener{
	int n;
	String imgstr;
	JFrame jf;
	JTextField tf;
	JButton jb1,jb2;
	JButton jb[];
	JLabel jl,jl1,jl2;;
	JPanel jp;
	ButtonGroup bg;
	JRadioButton jrb[];
	public Puzzal(String s1){
		imgstr="coc";
		jf=new JFrame(s1);
		
		tf=new JTextField();                   //create JTextField for show moves
		tf.setBounds(800,50,50,25);
		jf.add(tf);
		
		
		jp=new JPanel();                       //  JPanel for JButton
		jb=new JButton[9];						//  9 JButton
		for(int k=0;k<8;k++){
			jb[k]=new JButton(new ImageIcon("img\\"+imgstr+(k+1)+".jpeg"));
			jb[k].addActionListener(this);		//   register JButton with ActionListener
			jp.add(jb[k]);
			}
		jb[8]=new JButton("");
		jb[8].addActionListener(this);
		jp.add(jb[8]);
		jp.setBounds(1,1,621,621);
		jp.setLayout(new GridLayout(3,3));
		jf.add(jp);
		
		jb1=new JButton("Reset");				// Reset button for resiting game
		jb1.setBounds(300,625,100,50);
		jb1.addActionListener(this);
		jf.add(jb1);
		
		jb2=new JButton("Next Image");			//Next image button for changing game image
		jb2.setBounds(750,300,100,50);
		jb2.addActionListener(this);
		jf.add(jb2);
		
		jl=new JLabel(new ImageIcon("img\\"+imgstr+"10.jpeg"));		// for show the real image
		jl.setBounds(675,400,250,250);
		jf.add(jl);
		
		jl1=new JLabel();
		jl1.setText("Moves :");
		jl1.setBounds(750,50,50,25);
		jf.add(jl1);
		
		jl2=new JLabel();
		jl2.setText("Select game level :");
		jl2.setBounds(750,150,150,25);
		jf.add(jl2);
		
		bg=new ButtonGroup();
		String str[]={"Easy","Medium","Hard"};				//  JRadioButton for selecting game level
		jrb=new JRadioButton[3];
		for(int i=0;i<3;i++){
			jrb[i]=new JRadioButton(str[i]);
			jrb[i].setBounds(750,175+(25*i),100,25);
			jrb[i].addActionListener(this);
			bg.add(jrb[i]);
			jf.add(jrb[i]);
			}
		
			
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setSize(1000,1000);
		}
	
	
	public static void main(String... s){
		new Puzzal("puzzal");
		}
	
	
	public void actionPerformed(ActionEvent e){
		Icon i1;
		
		if(e.getSource()==jb[0]){						// moving the button icon
			i1=jb[0].getIcon();
			if((jb[1].getIcon())==null){
				jb[0].setIcon(jb[1].getIcon());
				jb[1].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[3].getIcon())==null){
				jb[0].setIcon(jb[3].getIcon());
				jb[3].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb[1]){
			i1=jb[1].getIcon();
			if((jb[0].getIcon())==null){
				jb[1].setIcon(jb[0].getIcon());
				jb[0].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[2].getIcon())==null){
				jb[1].setIcon(jb[2].getIcon());
				jb[2].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[4].getIcon())==null){
				jb[1].setIcon(jb[4].getIcon());
				jb[4].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb[2]){
			i1=jb[2].getIcon();
			if((jb[1].getIcon())==null){
				jb[2].setIcon(jb[1].getIcon());
				jb[1].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[5].getIcon())==null){
				jb[2].setIcon(jb[5].getIcon());
				jb[5].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb[3]){
			i1=jb[3].getIcon();
			if((jb[0].getIcon())==null){
				jb[3].setIcon(jb[0].getIcon());
				jb[0].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[4].getIcon())==null){
				jb[3].setIcon(jb[4].getIcon());
				jb[4].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[6].getIcon())==null){
				jb[3].setIcon(jb[6].getIcon());
				jb[6].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb[4]){
			i1=jb[4].getIcon();
			if((jb[1].getIcon())==null){
				jb[4].setIcon(jb[1].getIcon());
				jb[1].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[3].getIcon())==null){
				jb[4].setIcon(jb[3].getIcon());
				jb[3].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[5].getIcon())==null){
				jb[4].setIcon(jb[5].getIcon());
				jb[5].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[7].getIcon())==null){
				jb[4].setIcon(jb[7].getIcon());
				jb[7].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb[5]){
			i1=jb[5].getIcon();
			if((jb[2].getIcon())==null){
				jb[5].setIcon(jb[2].getIcon());
				jb[2].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[4].getIcon())==null){
				jb[5].setIcon(jb[4].getIcon());
				jb[4].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[8].getIcon())==null){
				jb[5].setIcon(jb[8].getIcon());
				jb[8].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb[6]){
			i1=jb[6].getIcon();
			if((jb[3].getIcon())==null){
				jb[6].setIcon(jb[3].getIcon());
				jb[3].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[7].getIcon())==null){
				jb[6].setIcon(jb[7].getIcon());
				jb[7].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb[7]){
			i1=jb[7].getIcon();
			if((jb[4].getIcon())==null){
				jb[7].setIcon(jb[4].getIcon());
				jb[4].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[6].getIcon())==null){
				jb[7].setIcon(jb[6].getIcon());
				jb[6].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[8].getIcon())==null){
				jb[7].setIcon(jb[8].getIcon());
				jb[8].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb[8]){
			i1=jb[8].getIcon();
			if((jb[5].getIcon())==null){
				jb[8].setIcon(jb[5].getIcon());
				jb[5].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			if((jb[7].getIcon())==null){
				jb[8].setIcon(jb[7].getIcon());
				jb[7].setIcon(i1);
				n+=1;
				tf.setText(String.valueOf(n));
				}
			test();
			}
		
		if(e.getSource()==jb1){						//  reseting the game
				if(jrb[0].isSelected())
					easy();
				if(jrb[1].isSelected())
					medium();
				if(jrb[2].isSelected())
					hard();
			}
		
		if(e.getSource()==jrb[0]){					//   selecting the game level
			easy();
			}
		if(e.getSource()==jrb[1]){
			medium();
			}
		if(e.getSource()==jrb[2]){
			hard();
			}
		
		if(e.getSource()==jb2){						//   next image button for changing image
			if(imgstr.equals("coc"))
				imgstr="coa";
			else{
				if(imgstr.equals("coa"))
					imgstr="cob";
				else
					imgstr="coc";
				}
			nextimg();
			}
				
			
		}
	public void test(){
		if(jb[8].getIcon()==null){
			boolean b=true;
			for(int i=0;(i<8)&&b;i++){
				if(!(jb[i].getIcon().toString()).equals(new ImageIcon("img\\"+imgstr+(i+1)+".jpeg").toString()))
					b=false;
				}
			if(b){
				JOptionPane.showMessageDialog(jf,"!!!you won!!!");
				}
			}
			
		}
	public void easy(){
		n=0;
		tf.setText(String.valueOf(n));
		jb[0].setIcon(new ImageIcon("img\\"+imgstr+"1.jpeg"));
		jb[1].setIcon(new ImageIcon("img\\"+imgstr+"2.jpeg"));
		jb[2].setIcon(new ImageIcon("img\\"+imgstr+"3.jpeg"));
		jb[3].setIcon(new ImageIcon("img\\"+imgstr+"5.jpeg"));
		jb[4].setIcon(null);
		jb[6].setIcon(new ImageIcon("img\\"+imgstr+"4.jpeg"));
		jb[7].setIcon(new ImageIcon("img\\"+imgstr+"7.jpeg"));
		jb[8].setIcon(new ImageIcon("img\\"+imgstr+"8.jpeg"));
		}
	public void medium(){
		n=0;
		tf.setText(String.valueOf(n));
		jb[0].setIcon(null);
		jb[1].setIcon(new ImageIcon("img\\"+imgstr+"1.jpeg"));
		jb[2].setIcon(new ImageIcon("img\\"+imgstr+"3.jpeg"));
		jb[3].setIcon(new ImageIcon("img\\"+imgstr+"5.jpeg"));
		jb[4].setIcon(new ImageIcon("img\\"+imgstr+"2.jpeg"));
		jb[5].setIcon(new ImageIcon("img\\"+imgstr+"6.jpeg"));
		jb[6].setIcon(new ImageIcon("img\\"+imgstr+"4.jpeg"));
		jb[7].setIcon(new ImageIcon("img\\"+imgstr+"7.jpeg"));
		jb[8].setIcon(new ImageIcon("img\\"+imgstr+"8.jpeg"));
		}
	public void hard(){
		n=0;
		tf.setText(String.valueOf(n));
		Icon i;
		i=jb[0].getIcon();
		jb[0].setIcon(jb[2].getIcon());
		jb[2].setIcon(i);
		
		i=jb[1].getIcon();
		jb[1].setIcon(jb[7].getIcon());
		jb[7].setIcon(i);
		
		i=jb[3].getIcon();
		jb[3].setIcon(jb[5].getIcon());
		jb[5].setIcon(i);
		
		i=jb[6].getIcon();
		jb[6].setIcon(jb[8].getIcon());
		jb[8].setIcon(i);
		}
	public void nextimg(){
		n=0;
		tf.setText(String.valueOf(n));
		for(int i=0;i<8;i++){
			jb[i].setIcon(new ImageIcon("img\\"+imgstr+(i+1)+".jpeg"));
			}
		jb[8].setIcon(null);
		jl.setIcon(new ImageIcon("img\\"+imgstr+"10.jpeg"));
		}
	
		
	
	}
	
	