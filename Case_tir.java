
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Case_tir extends Case {
	public JButton bouton;
	Joueur A;
	Joueur B;

	public Case_tir(int x,int y,String val,Joueur A,Joueur B) {
		super(x,y,val);


		this.bouton=new JButton();
		bouton.setBackground(Color.blue);
		this.A=A;
		this.B=B;

		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evenement) {
				if(A.ajoue==true)	{
					if(A.Bomb=="normal") {
						A.attaque(x,y);
						A.Bnor++;}
					
					if(A.Bomb=="hori" && A.Bh==1) {
						for(int i=0;i<10;i++) {
							A.attaque(x,i);}
						A.W.normal.setSelected(true);
						A.W.hori.setEnabled(false);
						A.W.hori.setText("Bomb Horizontal (0)");
						A.Bomb="normal";
						A.Bh=0;
					}

					if(A.Bomb=="verti" && A.Bv==1) {
						for(int i=0;i<10;i++) {
							A.attaque(i,y);
							
						}
						A.W.normal.setSelected(true);
						A.W.verti.setEnabled(false);
						A.W.verti.setText("Bomb Verticale (0)");
						A.Bomb="normal";
						A.Bv=0;
					}
					if(A.Bomb=="croix" && A.Bc==1) {
						A.attaque(x, y);
						if(x-1>=0)
						A.attaque(x-1, y);
						if(x+1<=9)
						A.attaque(x+1, y);
						if(y-1>=0)
						A.attaque(x, y-1);
						if(y+1<=9)
						A.attaque(x, y+1);
						A.W.croix.setEnabled(false);
						A.W.croix.setText("Bomb en croix (0)");
						A.Bomb="normal";
						A.Bc=0;
					}

					setcouleur();




					A.ajoue=false;
					bouton.setEnabled(false);
					}
			}});}





	public String get_val() {
		if(val=="o") {return "o";}
		if(val=="d") {return "d";}
		if(val=="t") {return "t";}
		return null;
	}

	public void setcouleur() {
		String aux=A.tabtir.tabtir[x][y].get_val();

		if(aux=="d") {
			bouton.setBackground(Color.red);
		}
		else 
			bouton.setBackground(Color.lightGray);
	}
	public void set_val(String t) {
		this.val=t;
	}
	public  JButton get_Button() {
		return this.bouton;
	}

}
