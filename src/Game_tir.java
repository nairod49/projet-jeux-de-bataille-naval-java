

public class Game_tir {

	public Case_tir [][] tabtir=new Case_tir[10][10];
	public Joueur A;
	public Joueur B;

	public Game_tir(Joueur A) {
		this.A=A;
		
		for(int i=0;i<10;i++) {
			for(int y=0;y<10;y++) {
				tabtir[i][y]=new Case_tir(i,y,"o",A,B);
			}
		}
	}
	
	public void setcouleur() {
		for(int i=0;i<10;i++)
			for(int y=0;y<10;y++) {
				tabtir[i][y].setcouleur();
			}
	}

	public String affiche() {
		String fin="   |A|B|C|D|E|F|G|H|I|J|\n";
		for (int i=0;i<10;i++) {
			if(i < 9) {
			fin=fin+"|"+(i+1)+" ";}
			else
				fin=fin+"|"+(i+1);
			for(int j=0;j<10;j++) {
				
				fin=fin+"|"+tabtir[i][j].get_val();
				
			}
			fin=fin+"|\n";
		}
		return fin;
	}
	
	
}
