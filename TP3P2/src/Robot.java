
public abstract class Robot {
	//ATTRIBUTS

	int posx;
	int posy;

	Monde monde;

	//GETTERS

	public int getPosx() {
		return posx;
	}

	public int getPosy() {
		return posy;
	}

	public Monde getMonde() {
		return monde;
	}

	//CONSTRUCTEUR 1

	public Robot(Monde m, int x,int y) {
		this.monde=m;
		this.posx=x;
		this.posy=y;
	}

	//CONTRUCTEURS 2 

	public Robot(Monde m) {
		//appel du constructeur 1
		this(m,(int)Math.random()*10,(int)Math.random()*10);

	}
	
	public Robot(Monde m, int x) {
		// TODO Auto-generated constructor stub
		this(m,0,x);
	}

	//methodes

	

	//Methode vaEn -> positionne le robot au coordonnées x-y
	public void vaEN(int x , int y) {
		this.posx=x;
		this.posy=y;
	}

	public abstract void parcourir();
	

}
