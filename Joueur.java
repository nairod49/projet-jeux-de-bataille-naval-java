import java.awt.Color;
import java.util.Random;
import bateau.Contre_torpilleurs;
import bateau.Croiseur;
import bateau.Porte_Avion;
import bateau.Torpilleur;

public class Joueur {
	String Bomb;
	Fenetre W;
	int Bnor=0;
	int Bh=1;
	int Bv=1;
	int Bc=1;
	int score =0;
	
	Game_bateau tabb=new Game_bateau(this);
	Game_tir tabtir=new Game_tir(this);

	Porte_Avion B1;
	Croiseur B2;
	Contre_torpilleurs B3;
	Contre_torpilleurs B4;
	Torpilleur B5;
	Joueur B;
	public String nomjoueur;
	private int numjoueur;

	private boolean perdu;
	public boolean ajoue;
	public void set_perdu(boolean t) {this.perdu=t;}
	public String get_nom() {return this.nomjoueur;}
	public int get_num() {return this.numjoueur;}

	public boolean get_perdu() {return this.perdu;}

	public Joueur(String name,int num,Fenetre w) {
		this.nomjoueur=name;
		this.numjoueur=num;
		
		this.perdu=false;
		this.W=w;

		this.Bomb="normal";
	}

	public void set_nom(String a) {
		this.nomjoueur=a;
	}
	
	public void setj(Joueur adver) {
		this.B=adver;
	}

	

	public String affiche() {
		String T="Tableau de tir\n";
		T=T+tabtir.affiche();
		T=T+"\n---------------------------------------\nTableau des bateau\n";
		T=T+tabb.affiche();
		T=T+"\n Bh="+this.Bh+"  Bv="+this.Bv+" Bc="+this.Bc+" \n";
		return T;
	}



	public void ordi(Game_bateau B,Joueur A) {

		Random random= new Random(); 
		int x=0;
		int y=0;
		int bi=(int) (Math.random()*2);
		
		boolean possible=false;
		if(bi==0) {
		while(possible==false) {
			x= random.nextInt(10);
			y=random.nextInt(10);
			if(this.tabtir.tabtir[x][y].get_val()=="o") {
				possible=true;
			}
		}
		this.attaque(x,y);
		}
		else {
			x= random.nextInt(10);
			y=random.nextInt(10);
			
			bi=(int) (Math.random()*3);
			if(bi==0 && this.Bh==1) {
				for(int i=0;i<10;i++) {
					this.attaque(x,i);
				}
				this.Bh=0;
			}else { if(this.Bh==0 && bi==0)
			{ while(possible==false) {
				x= random.nextInt(10);
				y=random.nextInt(10);
				if(this.tabtir.tabtir[x][y].get_val()=="o") {
					possible=true;
				}
			}
			this.attaque(x,y);
				
			}
			}
			
			
			
			
			if(bi==1 && this.Bv==1) {
				for(int i=0;i<10;i++) {
					this.attaque(i,y);

				}
				this.Bv=0;
			}else { if(this.Bv==0 && bi==1)
			{ while(possible==false) {
				x= random.nextInt(10);
				y=random.nextInt(10);
				if(this.tabtir.tabtir[x][y].get_val()=="o") {
					possible=true;
				}
			}
			this.attaque(x,y);
				
			}
			}
			
			
			
			if(bi==2 && this.Bc==1) {
				
				this.attaque(x, y);
				if(x-1>=0)
				this.attaque(x-1, y);
				if(x+1<=9)
				this.attaque(x+1, y);
				if(y-1>=0)
				this.attaque(x, y-1);
				if(y+1<=9)
				this.attaque(x, y+1);
				this.Bc=0;
			}else { if(this.Bc==0 && bi==2)
			{ while(possible==false) {
				x= random.nextInt(10);
				y=random.nextInt(10);
				if(this.tabtir.tabtir[x][y].get_val()=="o") {
					possible=true;
				}
			}
			this.attaque(x,y);
				
			}
			}
			
		}
	}

	public void destruction(int x,int y,Joueur B) {
		if (B.B1.get_xa()==x && B.B1.get_ya()==y) {
			B.B1.set_a();
			B.B1.set_coule();
		}
		if (B.B2.get_xa()==x && B.B2.get_ya()==y) {
			B.B2.set_a();
			B.B2.set_coule();
		}
		B.B2.set_coule();
		if (B.B3.get_xa()==x && B.B3.get_ya()==y) 
		{
			B.B3.set_a();
			B.B3.set_coule();
		}
		if (B.B4.get_xa()==x && B.B4.get_ya()==y) 
		{
			B.B4.set_a();
			B.B4.set_coule();
		}
		if (B.B5.get_xa()==x && B.B5.get_ya()==y) 
		{
			B.B5.set_a();
			B.B5.set_coule();
		}
		if (B.B1.get_xb()==x && B.B1.get_yb()==y) {
			B.B1.set_b();
			B.B1.set_coule();
		}
		if (B.B2.get_xb()==x && B.B2.get_yb()==y) 
		{B.B2.set_b();
		B.B2.set_coule(); }
		if (B.B3.get_xb()==x && B.B3.get_yb()==y) 
		{
			B.B3.set_b();
			B.B3.set_coule();
		}
		if (B.B4.get_xb()==x && B.B4.get_yb()==y) 
		{
			B.B4.set_b();
			B.B4.set_coule();
		}
		if (B.B5.get_xb()==x && B.B5.get_yb()==y) 
		{
			B.B5.set_b();
			B.B5.set_coule();
		}
		if (B.B1.get_xc()==x && B.B1.get_yc()==y) {
			B.B1.set_c();
			B.B1.set_coule();
		}
		if (B.B2.get_xc()==x && B.B2.get_yc()==y) 
		{B.B2.set_c();
		B.B2.set_coule();}
		if (B.B3.get_xc()==x && B.B3.get_yc()==y) 
		{
			B.B3.set_c();
			B.B3.set_coule();
		}
		if (B.B4.get_xc()==x && B.B4.get_yc()==y) 
		{
			B.B4.set_c();
			B.B4.set_coule();
		}
		if (B.B1.get_xd()==x && B.B1.get_yd()==y){
			B.B1.set_d();
			B.B1.set_coule();
		}
		if (B.B2.get_xd()==x && B.B2.get_yd()==y) 
		{B.B2.set_d();
		B.B2.set_coule();}
		if (B.B1.get_xe()==x && B.B1.get_ye()==y) {
			B.B1.set_e();
			B.B1.set_coule();
		}


	}

	public void set_perdu(Joueur B) {
		
		
		if(B.B1.get_coule()==true && B.B2.get_coule()==true && B.B3.get_coule()==true && B.B4.get_coule()==true && B.B5.get_coule()==true) {
			B.perdu=true;
		}
	}


	public String conv (int C) {
		switch(C) {
		case 0:return "A";
		case 1 :return "B";
		case 2 :return "C";
		case 3:return "D";
		case 4:return "E";
		case 5:return "F";
		case 6:return"G";
		case 7:return "H";
		case 8:return "I";
		case 9: return "J";
		};

		return null;
	}

	public void attaque(int ligne,int col) {

		if(B.tabb.tabb[ligne][col].get_val()=="o") {

			this.tabtir.tabtir[ligne][col].set_val("t");
			this.tabtir.tabtir[ligne][col].bouton.setBackground(Color.lightGray);
			W.ajoutconsol("rien n'a été touché\nTir effectué en "+(ligne+1)+" "+conv(col)+"\n");
			B.tabb.tabb[ligne][col].set_val("t");
			B.tabb.tabb[ligne][col].bouton.setBackground(Color.lightGray);

		}
		if(B.tabb.tabb[ligne][col].get_val()=="b") {
		W.ajoutconsol("Bravo vous avez touché quelque chose\n");
			W.ajoutconsol("touché en "+(ligne+1)+" "+conv(col)+"\n");
			this.tabtir.tabtir[ligne][col].set_val("d");
			this.tabtir.tabtir[ligne][col].bouton.setBackground(Color.red);
			B.tabb.tabb[ligne][col].bouton.setBackground(Color.red);
			B.tabb.tabb[ligne][col].set_val("d");
			
			
			destruction(ligne,col,B);
			set_perdu(B);
			if(B.B1.get_coule()==true) {
				this.W.PB.setText("Porte-Avions : 0");
				B.W.PA.setText("Porte-Avions : 0");
			}
			if (B.B2.get_coule()==true) {
				this.W.CB.setText("Croisseur : 0");
			B.W.CA.setText("Croisseur : 0");
			}
			if (B.B5.get_coule()==true) {
				this.W.TB.setText("Torpilleur : 0");
			B.W.TA.setText("Torpilleur : 0");
			}
			if(B.B3.get_coule()==true && B.B4.get_coule()==false) {
				this.W.CTB.setText("Contre-torpilleur: 1 ");
				B.W.CTA.setText("Contre-torpilleur: 1 ");
				
			}
			else {
				if(B.B4.get_coule()==true && B.B3.get_coule()==false) {
					this.W.CTB.setText("Contre-torpilleur: 1 ");
					B.W.CTA.setText("Contre-torpilleur: 1 ");
					
				}
				else {
					if(B.B4.get_coule()==true && B.B3.get_coule()==true) {
						this.W.CTB.setText("Contre-torpilleur: 0 ");
						B.W.CTA.setText("Contre-torpilleur: 0 ");
						
					}
				}}
			
			


		}
		if(B.tabb.tabb[ligne][col].get_val()=="t") {


		}


	}

	public void place() {
		boolean sens ;

		int s;

		Random random= new Random(); 
		int x;
		int y;
		s=(int) (Math.random()*2);
		if(s==1) {sens=true;}
		else  sens=false;
		x= random.nextInt(10);
		y=random.nextInt(10);
		B1=new Porte_Avion(x,y,sens);
		boolean colle=true;
		while(colle==true) {


			colle=tabb.testcolleP(B1);
			if(colle==true) {
				s=(int) (Math.random()*2);
				if(s==1) {sens=true;}
				else  sens=false;
				x= random.nextInt(10);
				y=random.nextInt(10);
				B1.reset(x,y,sens);
			}


		}
		tabb.disposition_P(B1);


		s=(int) (Math.random()*2);
		if(s==1) {sens=true;}
		else  sens=false;
		x= random.nextInt(10);
		y=random.nextInt(10);
		B2=new Croiseur(x,y,sens);

		colle=true;
		while(colle==true) {


			colle=tabb.testcolleC(B2);
			if(colle==true) {
				s=(int) (Math.random()*2);
				if(s==1) {sens=true;}
				else  sens=false;
				x= random.nextInt(10);
				y=random.nextInt(10);
				B2.reset(x,y,sens);
			}


		}
		if (tabb.testcolleC(B2)==false) {
			tabb.disposition_C(B2);

		}
		else System.out.println("ERROR de placement b2");

		colle=true;
		s=(int) (Math.random()*2);
		if(s==1) {sens=true;}
		else  sens=false;
		x= random.nextInt(10);
		y=random.nextInt(10);
		B3=new Contre_torpilleurs(x,y,sens);

		while(colle==true) {


			colle=tabb.testcolleCT(B3);
			if(colle==true) {
				s=(int) (Math.random()*2);
				if(s==1) {sens=true;}
				else  sens=false;
				x= random.nextInt(10);
				y=random.nextInt(10);
				B3.reset(x,y,sens);
			}


		}
		if (tabb.testcolleCT(B3)==false) {
			tabb.disposition_CT(B3);

		}
		else System.out.println("ERROR de placement b3 ");

		colle=true;
		s=(int) (Math.random()*2);
		if(s==1) {sens=true;}
		else  sens=false;
		x= random.nextInt(10);
		y=random.nextInt(10);
		B4=new Contre_torpilleurs(x,y,sens);

		while(colle==true) {



			colle=tabb.testcolleCT(B4);
			if (colle==true) {
				s=(int) (Math.random()*2);
				if(s==1) {sens=true;}
				else  sens=false;
				x= random.nextInt(10);
				y=random.nextInt(10);
				B4.reset(x,y,sens);
			}

		}
		if (tabb.testcolleCT(B4)==false) {
			tabb.disposition_CT(B4);

		}
		else System.out.println("ERROR de placement b4");

		colle=true;
		s=(int) (Math.random()*2);
		if(s==1) {sens=true;}
		else  sens=false;
		x= random.nextInt(10);
		y=random.nextInt(10);
		B5=new Torpilleur(x,y,sens);
		while(colle==true) {


			colle=tabb.testcolleT(B5);
			if(colle==true) {
				s=(int) (Math.random()*2);
				if(s==1) {sens=true;}
				else  sens=false;
				x= random.nextInt(10);
				y=random.nextInt(10);
				B5.reset(x,y,sens);
			}


		}
		if (tabb.testcolleT(B5)==false) {
			tabb.disposition_T(B5);

		}
		else System.out.println("ERROR de placement b5");



		tabb.setcouleur();


	}

}
