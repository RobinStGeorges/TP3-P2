
public class NettoyeurDistrait extends Robot {



	//ATTRIBUTS

	//pos sont initialisés a 0 car  un robot nettoyeur commence tjr à 0
	int posx=0;
	int posy=0;
	int cptNetoyage=0;


	//CONSTRUCTEUR

	public NettoyeurDistrait(Monde m) {
		super(m);
	}

	//METHODES

	@Override
	//déplace le robot
	/**
	 * 
	 */
	public void parcourir() {
		int v = this.getPosy();
		for(int i =0;i < 10;i++){
			if(i%2==0){
				for(int b =0;b < 10;b++){
					this.vaEN(b, v);

					this.nettoyer();
				}
			}else{
				for(int c = this.getPosx();c >= 0;c--){
					this.vaEN(c , v);				
					this.nettoyer();
				}
			}
			v++;		
		}

	}

	//nettoyer une case
	/**
	 * 
	 */
	public void nettoyer() {
		//Regarde si la position est sale
		if(this.monde.estSale(this.getPosx(),this.getPosy())){
			//nettoie une fois sur deux 
			if (cptNetoyage%2==0){
				monde.prendPapierGras(this.getPosx(), this.getPosy());
			}
			cptNetoyage++;
		}
	}

}



