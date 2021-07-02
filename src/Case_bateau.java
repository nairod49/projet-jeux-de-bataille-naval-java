import java.awt.Color;

import javax.swing.JButton;

public class Case_bateau extends Case {
	
	public JButton bouton;
	Joueur A;
	Joueur B;
	
	public Case_bateau(int x, int y, String val,Joueur A,Joueur B) {
		
		super(x, y, val);
		this.bouton=new JButton();
		
		this.A=A;
		this.B=B;
		
		
			bouton.setBackground(Color.blue);
		
			
		
		bouton.setEnabled(true);
		

		
		
		
	}
	public void set_val(String val) { this.val=val;}
	
	public String get_val() {
		if(val=="o") {return "o";}
		if(val=="b") {return "b";}
		if(val=="t") {return "t";}
		if(val=="d") {return "d";}
		return null;
	}

	public void setcouleur() {
		String aux=A.tabb.tabb[x][y].get_val();
		
		if (aux=="o")
			bouton.setBackground(Color.blue);
		if(aux=="b")
			bouton.setBackground(Color.orange);
	}
	
	public  JButton get_Button() {
		return this.bouton;
	}
}
