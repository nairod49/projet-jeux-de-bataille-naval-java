import bateau.Contre_torpilleurs;
import bateau.Croiseur;
import bateau.Porte_Avion;
import bateau.Torpilleur;

public class Game_bateau {

	public Case_bateau[][] tabb=new Case_bateau[10][10];
	public Joueur A;
	public Joueur B;

	public Game_bateau(Joueur A) {
		this.A=A;

		for(int i=0;i<10;i++) {
			for(int y=0;y<10;y++) {
				tabb[i][y]=new Case_bateau(i,y,"o",A,B);
			}
		}
	}

	public String affiche() {

		String fin="   |A|B|C|D|E|F|G|H|I|J|\n";
		for (int i=0;i<10;i++) {
			if(i<9) {
				fin=fin+"|"+(i+1)+" ";}
			else 
				fin=fin+"|"+(i+1);
			for(int j=0;j<10;j++) {
				fin=fin+"|"+tabb[i][j].val;
			}
			fin=fin+"|\n";
		}
		return (fin);
	}

	public void set_b(int x,int y) {
		tabb[x][y].set_val("b");

	}

	public void setcouleur() {
		for(int i=0;i<10;i++)
			for(int y=0;y<10;y++) {
				tabb[i][y].setcouleur();
			}
	}

	public void disposition_P(Porte_Avion B) {
		int x=B.get_xa();
		int y=B.get_ya();
		set_b(x,y);

		x=B.get_xb();
		y=B.get_yb();
		set_b(x,y);

		x=B.get_xc();
		y=B.get_yc();
		set_b(x,y);

		x=B.get_xd();
		y=B.get_yd();
		set_b(x,y);

		x=B.get_xe();
		y=B.get_ye();
		set_b(x,y);


	}



	public void disposition_CT(Contre_torpilleurs B) {
		int x=B.get_xa();
		int y=B.get_ya();
		set_b(x,y);
		x=B.get_xb();
		y=B.get_yb();
		set_b(x,y);
		x=B.get_xc();
		y=B.get_yc();
		set_b(x,y);

	}

	public void disposition_C(Croiseur B) {
		int x=B.get_xa();
		int y=B.get_ya();
		set_b(x,y);
		x=B.get_xb();
		y=B.get_yb();
		set_b(x,y);
		x=B.get_xc();
		y=B.get_yc();
		set_b(x,y);
		x=B.get_xd();
		y=B.get_yd();
		set_b(x,y);

	}

	public void disposition_T(Torpilleur B) {
		int x=B.get_xa();
		int y=B.get_ya();
		set_b(x,y);
		x=B.get_xb();
		y=B.get_yb();
		set_b(x,y);

	}

	public boolean testcolleP(Porte_Avion B) {
		int x=B.get_xa();
		int y=B.get_ya();
		if( (x<=-1 || x>=10) || (y<=-1 || y>=10))
		{return true;}

		x=B.get_xb();
		y=B.get_yb();
		if( (x<=-1 || x>=10) || (y<=-1 || y>=10))
		{return true;}

		x=B.get_xc();
		y=B.get_yc();
		if( (x<=-1 || x>=10) || (y<=-1 || y>=10))
		{return true;}

		x=B.get_xd();
		y=B.get_yd();
		if( (x<=-1 || x>=10) || (y<=-1 || y>=10))
		{return true;}

		x=B.get_xe();
		y=B.get_ye();
		if( (x<=-1 || x>=10) || (y<=-1 || y>=10))
		{return true;}

		return false;
	}



	public boolean testcolleC(Croiseur B) {
		int x=B.get_xa();
		int y=B.get_ya();
		if (x<=-1 || x>=10 || y>=10 || y<=-1 )
			return true;
		if( (x>=0 && x<=9) && (y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}

		x=B.get_xb();
		y=B.get_yb();
		if (x<=-1 || x>=10 || y>=10 || y<=-1 )
			return true;
		if( (x>=0 && x<=9) &&  (y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}

		x=B.get_xc();
		y=B.get_yc();
		if (x<=-1 || x>=10 || y>=10 || y<=-1 )
			return true;
		if( (x>=0 && x<=9) && (y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}

		x=B.get_xd();
		y=B.get_yd();
		if (x<=-1 || x>=10 || y>=10 || y<=-1 )
			return true;
		if( (x>=0 && x<=9) &&(y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}

		return false;

	}


	public boolean testcolleCT(Contre_torpilleurs B) {
		int x=B.get_xa();
		int y=B.get_ya();
		if( (x>=0 && x<=9) && (y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}else return true;

		x=B.get_xb();
		y=B.get_yb();
		if( (x>=0 && x<=9) && (y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}else return true;

		x=B.get_xc();
		y=B.get_yc();
		if( (x>=0 && x<=9) && (y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}else return true;


		return false;

	}



	public boolean testcolleT(Torpilleur B) {
		int x=B.get_xa();
		int y=B.get_ya();
		if( (x>=0 && x<=9) && (y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}else return true;

		x=B.get_xb();
		y=B.get_yb();
		if( (x>=0 && x<=9) && (y<=9 && y>=0))
		{
			if(tabb[x][y].val=="b"){
				return true;}
			if(x-1>=0) {if(tabb[x-1][y].val=="b")return true;}
			if(x+1<=9) {if(tabb[x+1][y].val=="b")return true;}
			if(y-1>=0) {if(tabb[x][y-1].val=="b")return true;}
			if(y+1<=9) {if(tabb[x][y+1].val=="b")return true;}

		}else return true;

		return false;

	}

}


