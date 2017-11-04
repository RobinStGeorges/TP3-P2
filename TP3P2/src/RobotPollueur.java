
public abstract class RobotPollueur extends Robot {


	//CONSTRUCTEURS

	public RobotPollueur(Monde m) {
		super(m);
		// TODO Auto-generated constructor stub
	}
	public RobotPollueur(Monde m,int x,int y) {
		super(m,x,y);
		// TODO Auto-generated constructor stub
	}

	public RobotPollueur(Monde m, int x) {
		// TODO Auto-generated constructor stub
		super(m,x);
	}
	
	
	//methode abstraite
	public abstract void polluer();
	

}
