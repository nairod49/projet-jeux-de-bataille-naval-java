import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class Fenetre extends JFrame {
	JTextArea consol;
	JRadioButton normal;
	JRadioButton hori;
	JRadioButton croix;
	JRadioButton verti;
	JPanel P;
	JPanel B1;
	JPanel test1;
	JPanel test2;
	JPanel bomb;
	JPanel text;
	JLabel PA;
	JLabel CTA;
	JLabel CA;
	JLabel TA;
	JLabel PB;
	JLabel CTB;
	JLabel CB;
	JLabel TB;
	
	
	public GridBagConstraints variables;
	Joueur A;
	Joueur B;
	ImageIcon img=new  ImageIcon("icon.png");
	
	public Fenetre() {
		this.setIconImage(img.getImage());
		variables=new GridBagConstraints();
		setTitle("Bataille navale");
		setSize(800,600);
		setLayout(new GridBagLayout());

		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}



	

	public void affichage (Joueur A,Joueur B) {
		

		this.A=A;
		this.B=B;
		
		
		
		P=new JPanel();
		P.setSize(150,150);



		P.setLayout(new GridLayout(11,11));
		JLabel Col=new JLabel(" ");
		P.add(Col);
		JLabel row1=new JLabel("A");
		P.add(row1);
		JLabel row2=new JLabel("B");
		P.add(row2);
		JLabel row3=new JLabel("C");
		P.add(row3);
		JLabel row4=new JLabel("D");
		P.add(row4);
		JLabel row5=new JLabel("E");
		P.add(row5);
		JLabel row6=new JLabel("F");
		P.add(row6);
		JLabel row7=new JLabel("G");
		P.add(row7);
		JLabel row8=new JLabel("H");
		P.add(row8);
		JLabel row9=new JLabel("I");
		P.add(row9);
		JLabel row10=new JLabel("J");
		P.add(row10);


		JLabel Col1=new JLabel("1");
		P.add(Col1);


		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[0][i].get_Button());
		}



		JLabel Col2=new JLabel("2");
		P.add(Col2);

		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[1][i].get_Button());
		}

		JLabel Col3=new JLabel("3");
		P.add(Col3);

		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[2][i].get_Button());
		}

		JLabel Col4=new JLabel("4");
		P.add(Col4);
		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[3][i].get_Button());
		}

		JLabel Col5=new JLabel("5");
		P.add(Col5);
		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[4][i].get_Button());
		}

		JLabel Col6=new JLabel("6");
		P.add(Col6);
		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[5][i].get_Button());
		}

		JLabel Col7=new JLabel("7");
		P.add(Col7);
		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[6][i].get_Button());
		}

		JLabel Col8=new JLabel("8");
		P.add(Col8);
		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[7][i].get_Button());
		}

		JLabel Col9=new JLabel("9");
		P.add(Col9);
		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[8][i].get_Button());
		}

		JLabel Col10=new JLabel("10");
		P.add(Col10);
		for (int i=0;i<10;i++) {
			P.add(A.tabtir.tabtir[9][i].get_Button());
		}

		variables.gridx=0;
		variables.gridy=1;
		this.add(P,variables);





		B1=new JPanel();
		B1.setSize(150,150);


		B1.setLayout(new GridLayout(11,11));

		JLabel ColB=new JLabel(" ");
		B1.add(ColB);
		JLabel rowB1=new JLabel("A");
		B1.add(rowB1);
		JLabel rowB2=new JLabel("B");
		B1.add(rowB2);
		JLabel rowB3=new JLabel("C");
		B1.add(rowB3);
		JLabel rowB4=new JLabel("D");
		B1.add(rowB4);
		JLabel rowB5=new JLabel("E");
		B1.add(rowB5);
		JLabel rowB6=new JLabel("F");
		B1.add(rowB6);
		JLabel rowB7=new JLabel("G");
		B1.add(rowB7);
		JLabel rowB8=new JLabel("H");
		B1.add(rowB8);
		JLabel rowB9=new JLabel("I");
		B1.add(rowB9);
		JLabel rowB10=new JLabel("J");
		B1.add(rowB10);


		JLabel Col1b=new JLabel("1");
		B1.add(Col1b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[0][i].get_Button());
		}
		JLabel Col2b=new JLabel("2");
		B1.add(Col2b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[1][i].get_Button());
		}

		JLabel Col3b=new JLabel("3");
		B1.add(Col3b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[2][i].get_Button());
		}

		JLabel Col4b=new JLabel("4");
		B1.add(Col4b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[3][i].get_Button());
		}

		JLabel Col5b=new JLabel("5");
		B1.add(Col5b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[4][i].get_Button());
		}

		JLabel Col6b=new JLabel("6");
		B1.add(Col6b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[5][i].get_Button());
		}

		JLabel Col7b=new JLabel("7");
		B1.add(Col7b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[6][i].get_Button());
		}

		JLabel Col8b=new JLabel("8");
		B1.add(Col8b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[7][i].get_Button());
		}

		JLabel Col9b=new JLabel("9");
		B1.add(Col9b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[8][i].get_Button());
		}

		JLabel Col10b=new JLabel("10");
		B1.add(Col10b);
		for (int i=0;i<10;i++) {
			B1.add(A.tabb.tabb[9][i].get_Button());
		}

		B1.setSize(200,200);
		variables.gridx=0;
		variables.gridy=2;			
		this.add(B1,variables);


		JPanel BateauA=new JPanel();
		
		BateauA.setLayout(new GridBagLayout());
		JLabel titA=new JLabel("Effectif de votre flotte naval ");
		variables.gridx=0;
		variables.gridy=0;
		BateauA.add(titA,variables);
		PA=new JLabel("Porte_Avion :1 ");
		variables.gridx=0;
		variables.gridy=1;
		BateauA.add(PA,variables);
		CA=new JLabel("Croisseur :1 ");
		variables.gridx=1;
		variables.gridy=1;
		BateauA.add(CA,variables);
		CTA=new JLabel("Contre-torpilleurs :2 ");
		variables.gridx=0;
		variables.gridy=2;
		BateauA.add(CTA,variables);
		TA=new JLabel("Torpilleur :1 ");
		variables.gridx=1;
		variables.gridy=2;
		BateauA.add(TA,variables);
		variables.gridx=0;
		variables.gridy=0;
		this.add(BateauA,variables);
		
JPanel BateauB=new JPanel();
		
		BateauB.setLayout(new GridBagLayout());
		JLabel titB=new JLabel("Effectif de la flotte adverse ");
		variables.gridx=0;
		variables.gridy=0;
		BateauB.add(titB,variables);
		PB=new JLabel("Porte_Avion :1 ");
		variables.gridx=0;
		variables.gridy=1;
		BateauB.add(PB,variables);
		CB=new JLabel("Croisseur :1 ");
		variables.gridx=1;
		variables.gridy=1;
		BateauB.add(CB,variables);
		 CTB=new JLabel("Contre-torpilleurs :2 ");
		variables.gridx=0;
		variables.gridy=2;
		BateauB.add(CTB,variables);
		TB=new JLabel("Torpilleur :1 ");
		variables.gridx=1;
		variables.gridy=2;
		BateauB.add(TB,variables);
		variables.gridx=1;
		variables.gridy=0;
		this.add(BateauB,variables);
	
		text=new JPanel();
		consol=new JTextArea(10,20);
		JScrollPane scroll=new JScrollPane(consol);
		consol.setEditable(false);

		text.add(scroll);
		variables.gridx=1;
		variables.gridy=1;			
		this.add(text,variables);



		bomb=new JPanel();
		bomb.setLayout(new GridLayout(2,2));

		normal=new JRadioButton("Bomb normal (*)");
		normal.setMnemonic(KeyEvent.VK_N);
		normal.setActionCommand("normal");
		normal.setSelected(true);
		

		hori=new JRadioButton("Bomb Horizontal (1)");
		hori.setMnemonic(KeyEvent.VK_H);
		hori.setActionCommand("horizontal");

		verti=new JRadioButton("Bomb Verticale (1)");
		verti.setMnemonic(KeyEvent.VK_V);
		verti.setActionCommand("Verti");

		croix=new JRadioButton("Bomb en croix (1)");
		croix.setMnemonic(KeyEvent.VK_C);
		croix.setActionCommand("croix");

		normal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				A.Bomb="normal";
			}
		});

		hori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				A.Bomb="hori";
			}
		});

		verti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				A.Bomb="verti";
			}
		});

		croix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				A.Bomb="croix";
			}
		});
		ButtonGroup group=new ButtonGroup();
		group.add(normal);
		group.add(hori);
		group.add(verti);
		group.add(croix);

			
		bomb.add(normal);
		
		bomb.add(hori);
		bomb.add(verti);
		bomb.add(croix);

		variables.gridx=1;
		variables.gridy=2;			
		this.add(bomb,variables);

	
		
		
		JButton help=new JButton("Aide");
		variables.gridx=4;
		variables.gridy=0;
		this.add(help);
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				JFrame F=new JFrame("Aide");
				F.setSize(400,400);
				F.setIconImage(img.getImage());
				F.setLayout(new GridBagLayout());
			F.setLocationRelativeTo(null);
			F.setVisible(true);
			F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel titre=new JLabel("Ecran d'aide et règle du jeu ");
			variables.gridx=0;
			variables.gridy=0;
			F.add(titre,variables);
		
		
			
			
			JLabel r1=new JLabel("Pour gagner il faut détruire tout les bateaux adverses");
			variables.gridx=0;
			variables.gridy=2;
			F.add(r1,variables);
			JLabel r2=new JLabel("Pour cela vous avez à votre disposition 4 bombes");
			variables.gridx=0;
			variables.gridy=3;
			F.add(r2,variables);
			JLabel r2b=new JLabel(" différentes :");
			variables.gridx=0;
			variables.gridy=4;
			F.add(r2b,variables);
			JLabel r3=new JLabel("-normale qui attaque une case  ");
			variables.gridx=0;
			variables.gridy=5;
			F.add(r3,variables);
			JLabel r4=new JLabel("-horizontal qui attaque toutes les cases de la ligne ");
			variables.gridx=0;
			variables.gridy=6;
			F.add(r4,variables);
			JLabel r5=new JLabel("-verticale qui attaque toutes les cases de la collogne");
			variables.gridx=0;
			variables.gridy=7;
			F.add(r5,variables);
			JLabel r6=new JLabel("-Croix qui attaque en forme de croix");
			variables.gridx=0;
			variables.gridy=8;
			F.add(r6,variables);
			JLabel r7=new JLabel("Legendes des couleurs :");
			variables.gridx=0;
			variables.gridy=9;
			F.add(r7,variables);
			JLabel r8=new JLabel("-Rouge bateau touché");
			variables.gridx=0;
			variables.gridy=10;
			F.add(r8,variables);
			JLabel r9=new JLabel("-Gris pour tir qui n'a rien touché");
			variables.gridx=0;
			variables.gridy=11;
			F.add(r9,variables);
			JLabel r10=new JLabel("-Orange pour un bateau ");
			variables.gridx=0;
			variables.gridy=12;
			F.add(r10,variables);
			
			
			
			
			
			
			
			}});
		
		
		
	}
		
		
	
	void ajoutconsol(String aux) {
		consol.append(aux);
		consol.selectAll();
		consol.setCaretPosition(consol.getSelectionEnd());
	}




}
