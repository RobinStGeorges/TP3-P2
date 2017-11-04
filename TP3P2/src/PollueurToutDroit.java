
public class PollueurToutDroit extends RobotPollueur {
	Monde monde =this.getMonde();

	//CONSTRUCTEUR
	//x = ligne de début du robot
	public PollueurToutDroit(Monde m, int x) {
		super(m,x);

		// TODO Auto-generated constructor stub
	}

	//METHODES
	
	@Override
	//Pose un papier à l'enplacment du robot
	/**
	 * 
	 */
	public void polluer() {
		monde.metPapierGras(this.getPosx(), this.getPosy());
	}
	@Override
	//deplace le robot
	/**
	 * 
	 */
	public void parcourir() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 10;i++) {
			this.polluer();
			this.vaEN(i+1,this.getPosy());
			
		}

	}

}
