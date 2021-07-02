import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.w3c.dom.events.EventException;

import java.io.File; 
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {



	public static void reset(Joueur A,Joueur B,Fenetre W) throws InterruptedException {
		
		String n=A.get_nom();
		W.setVisible(false);
		
		
		
		Fenetre WO=new Fenetre();
		Fenetre WB=new Fenetre();
		
		GridBagConstraints variables;
		variables=new GridBagConstraints();
		ImageIcon img=new  ImageIcon("icon.png");
		Joueur AA=new Joueur (n,0,WO);
		Joueur BB=new Joueur ("ordi",1,WB);
		AA.setj(BB);
		BB.setj(AA);
		AA.place();
		BB.place();
		WB.affichage(BB, AA);
		WO.affichage(AA,BB);
		
		WO.setVisible(true);
		System.out.println("test4");

		while(A.get_perdu()==false && B.get_perdu()==false){





			int J=(int) (Math.random()*2);

			WO.ajoutconsol("Le joueur "+(J+1)+" commence\n");


			while(A.get_perdu()==false && B.get_perdu()==false) {
				int aux=0;
				if(J==0) {
					A.ajoue=true;


					WO.ajoutconsol(A.nomjoueur+" a vous de jouez\n");
					while(A.ajoue==true) {
						aux=aux+1;

					}

					J=1;
				}

				else {

					W.ajoutconsol("A l'ordinateur de joué \n");

					B.ordi(A.tabb,A);
					J=0;
				}
				if (B.get_perdu()==true) {
					JFrame Fin=new JFrame("Fin de partie");
					Fin.setSize(300,300);
					Fin.setVisible(true);
					Fin.setLocationRelativeTo(null);
					Fin.setIconImage(img.getImage());
					Fin.setLayout(new GridBagLayout());
					JLabel vainc=new JLabel("Bravo "+A.get_nom()+" ,vous avez gagner \n");
					variables.gridx=0;
					variables.gridy=0;
					Fin.add(vainc,variables);


					Fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



				}
				if(A.get_perdu()==true) {
					JFrame Fin=new JFrame("Fin de partie");
					Fin.setSize(300,300);
					Fin.setIconImage(img.getImage());
					Fin.setLocationRelativeTo(null);
					Fin.setVisible(true);
					Fin.setLayout(new GridBagLayout());
					JLabel vainc=new JLabel("Dommage vous avez perdu contre l'ordinateur");
					variables.gridx=0;
					variables.gridy=0;
					Fin.add(vainc);
					JLabel reco=new JLabel("Souhaitez vous recommencer:");
					variables.gridx=0;
					variables.gridy=1;
					Fin.add(reco,variables);





					Fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}}

	}






	public static void main(String[] args) throws InterruptedException {
		Fenetre W;
		Fenetre WT;
		GridBagConstraints variables;
		variables=new GridBagConstraints();
		W=new Fenetre();
		WT=new Fenetre();
		Joueur A=new Joueur("test", 1,W);;
		Joueur B=new Joueur("ordinateur",2,WT);

		A.setj(B);
		B.setj(A);
		A.place();
		B.place();



		ImageIcon img=new  ImageIcon("icon.png");
		JFrame M=new JFrame("Menu");
		M.setSize(400,300);
		M.setLayout(new GridBagLayout());
		M.setIconImage(img.getImage());

		JPanel menu=new JPanel();
		menu.setLayout(new GridBagLayout());
		JLabel titre=new JLabel("Bataille Navale");
		variables.gridx=0;
		variables.gridy=0;
		menu.add(titre,variables);
		JButton Jeu=new JButton("Nouvelle Partie");
		variables.gridx=0;
		variables.gridy=1;
		menu.add(Jeu,variables);
		JButton charger=new JButton("Charger une Partie");
		variables.gridx=0;
		variables.gridy=2;
		menu.add(charger,variables);
		JButton credit=new JButton("Crédit");
		variables.gridx=0;
		variables.gridy=3;
		menu.add(credit,variables);
		JButton quit=new JButton("Quitter");
		variables.gridx=0;
		variables.gridy=4;
		menu.add(quit,variables);
		M.setLocationRelativeTo(null);
		M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				M.dispose();

			}});

		credit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				JFrame Cre=new JFrame("Crédit");
				Cre.setSize(400,300);
				Cre.setLayout(new GridBagLayout());
				Cre.setIconImage(img.getImage());
				Cre.setVisible(true);
				Cre.setLocationRelativeTo(null);
				Cre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JLabel credit=new JLabel("Bataille Navale ");
				variables.gridx=0;
				variables.gridy=0;
				Cre.add(credit,variables);
				JLabel credit2=new JLabel("Développé par Dorian Letort");
				variables.gridx=0;
				variables.gridy=1;
				Cre.add(credit2,variables);
				JLabel credit3=new JLabel("Projet effectué lors du semestre 4 MPCIE Angers");
				variables.gridx=0;
				variables.gridy=2;
				Cre.add(credit3,variables);
				JLabel credit4=new JLabel("2019 - 2020 ");
				variables.gridx=0;
				variables.gridy=3;
				Cre.add(credit4,variables);
				JButton source=new JButton("Retour");
				variables.gridx=0;
				variables.gridy=4;
				Cre.add(source,variables);
				source.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evenement) {
						Cre.setVisible(false);


					}});	
			}});
		charger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {

				JFrame C=new JFrame("Charger Partie");
				C.setSize(600,400);
				C.setIconImage(img.getImage());
				C.setLayout(new GridBagLayout());
				C.setLocationRelativeTo(null);
				JLabel titre=new JLabel("En cours de devellopement");
				variables.gridx=0;
				variables.gridy=0;
				C.add(titre,variables);
				C.setVisible(true);
				JButton source=new JButton("Retour");
				variables.gridx=0;
				variables.gridy=1;
				C.add(source,variables);
				source.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evenement) {
						C.setVisible(false);


					}});	
				C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}});

		Jeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				boolean O=true;
				JFrame F=new JFrame("Nouvelle partie");
				F.setSize(400,400);
				F.setIconImage(img.getImage());
				F.setLayout(new GridBagLayout());
				JLabel titre=new JLabel("Bataille Navale");
				variables.gridx=0;
				variables.gridy=0;
				F.add(titre,variables);
				JLabel t=new JLabel("Votre nom:");
				variables.gridx=0;
				variables.gridy=1;
				F.add(t,variables);
				JTextField nom=new JTextField(15);
				variables.gridx=0;
				variables.gridy=2;
				F.add(nom,variables);
				JButton Go=new JButton("Valider");
				variables.gridx=0;
				variables.gridy=3;
				F.add(Go,variables);
				JPanel option=new JPanel();
				option.setLayout(new GridBagLayout());
				JLabel text=new JLabel("Voulez vous les bombes specials : ");
				variables.gridx=0;
				variables.gridy=4;
				F.add(text,variables);
				
				JRadioButton yes=new JRadioButton("oui");
				yes.setMnemonic(KeyEvent.VK_Y);
				yes.setActionCommand("yes");
				yes.setSelected(true);
				JRadioButton no=new JRadioButton("non");
				no.setMnemonic(KeyEvent.VK_N);
				no.setActionCommand("no");
				
				
				
				
				ButtonGroup group=new ButtonGroup();
				group.add(yes);
				group.add(no);
				
				variables.gridx=0;
				variables.gridy=0;
				option.add(yes,variables);
				variables.gridx=1;
				variables.gridy=0;
				option.add(no,variables);
				
				
				variables.gridx=0;
				variables.gridy=5;
				F.add(option,variables);
				
				variables.gridx=0;
				variables.gridy=3;
				F.add(Go,variables);
				
				F.setLocationRelativeTo(null);
				F.setVisible(true);
				F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Go.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evenement) {
						
						String j=nom.getText();
						A.set_nom(j);
						F.setVisible(false);
						M.setVisible(false);
						F.dispose();
						M.dispose();
						WT.affichage(B, A);
						W.affichage(A, B);
						if(no.isSelected()==true) {
							A.Bh=0;
							A.Bc=0;
							A.Bv=0;
							A.W.verti.setEnabled(false);
							A.W.hori.setEnabled(false);
							A.W.croix.setEnabled(false);
							B.Bh=0;
							B.Bc=0;
							B.Bv=0;
							B.W.verti.setEnabled(false);
							B.W.hori.setEnabled(false);
							B.W.croix.setEnabled(false);
						}
						W.setVisible(true);



					}});
			}});



		M.add(menu);
		M.setVisible(true);

		JPanel S=new JPanel();
		S.setLayout(new GridBagLayout());
		JButton sauv=new JButton("Sauvergarder");
		variables.gridx=0;
		variables.gridy=0;
		S.add(sauv,variables);
		JButton RE=new JButton("réinitialise");
		variables.gridx=0;
		variables.gridy=1;
		S.add(RE,variables);
		variables.gridx=1;
		variables.gridy=3;
		W.add(S,variables);

		sauv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				
					PrintWriter out;
					try {
						out = new PrintWriter(new FileWriter("sauv.txt"));
						out.print(A.affiche());
						out.print(B.affiche());
						out.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						
					
			}
		});

		RE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement){

		/*	try {
			//	reset(A,B,W);
			} catch (InterruptedException e) {
				 TODO Auto-generated catch block
				e.printStackTrace();
			}
*/
			}});	

		while(A.get_perdu()==false && B.get_perdu()==false){
			Thread.sleep(20);
			if(M.isVisible()==false && W.isVisible()==true) {



				int J=(int) (Math.random()*2);

				W.ajoutconsol("Le joueur "+(J+1)+" commence\n");


				while(A.get_perdu()==false && B.get_perdu()==false) {

					if(J==0) {A.ajoue=true;

					W.ajoutconsol(A.nomjoueur+" a vous de jouez\n");
					while(A.ajoue==true) {
						Thread.sleep(300);

					}

					J=1;
					}

					else {

						W.ajoutconsol("A l'ordinateur de joué \n");

						B.ordi(A.tabb,A);
						J=0;
					}
					if (B.get_perdu()==true) {
						
					
							
						JFrame Fin=new JFrame("Fin de partie");
						Fin.setSize(300,300);
						Fin.setVisible(true);
						Fin.setLocationRelativeTo(null);
						Fin.setIconImage(img.getImage());
						Fin.setLayout(new GridBagLayout());
						JLabel vainc=new JLabel("Bravo "+A.get_nom()+" ,vous avez gagner \n");
						variables.gridx=0;
						variables.gridy=0;
						Fin.add(vainc,variables);
						Thread.sleep(5000);
						reset(A,B,W);
						Fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



					}
					if(A.get_perdu()==true) {
					
						JFrame Fin=new JFrame("Fin de partie");
						Fin.setSize(300,300);
						Fin.setIconImage(img.getImage());
						Fin.setLocationRelativeTo(null);
						Fin.setVisible(true);
						Fin.setLayout(new GridBagLayout());
						JLabel vainc=new JLabel("Dommage vous avez perdu contre l'ordinateur");
						variables.gridx=0;
						variables.gridy=0;
						Fin.add(vainc);
						





						Fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				}





			}}



	}
}








