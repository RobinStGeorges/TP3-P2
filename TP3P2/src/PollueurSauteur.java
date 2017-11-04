
public class PollueurSauteur extends RobotPollueur {

	//Attributs

	public int deltax;
	public int acc;


	//Constructeurs

	public PollueurSauteur(Monde m, int x, int deltax) {
		super(m, x);
		// TODO Auto-generated constructor stub
		this.deltax=deltax;

	}

	//METHODES

	@Override
	//pose un papier gras sur la case du robot
	public void polluer() {
		monde.metPapierGras(this.getPosx(), this.getPosy());

	}
	@Override
	//fait bouger le robot
	public void parcourir() {
		this.vaEN(0,this.getPosy());
		for(int i = 0;i < 10;i++) {
			
			this.polluer();
			if(isPair(i)) {
				//si le robot saute en dehors de la zone
				if((this.getPosy()+deltax)>9){
					this.vaEN(i+1,this.getPosy()-deltax);
				}
				
				else{
					this.vaEN(i+1,this.getPosy()+deltax);
				}
			}
			else {
				this.vaEN(i+1,this.getPosy()-deltax);
			}

		}

	}

	public Boolean isPair(int a) {
		if(a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
