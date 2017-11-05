
public class Monde {
    //variables
    int i=0;
    int j=0;
    int accPapiers=0;
    Boolean a=false;

    //nb de lignes
    int nbL=10;


    //nb de colones
    int nbC=10;

    //matrice
    Boolean[][] map;

    //CONSTRUCTEUR
    public Monde(){
        map = new Boolean[nbL][nbC];
    }

    //GETTERS

    public int getNbL() {
        return nbL;
    }

    public int getNbC() {
        return nbC;
    }

    //METHODES
    /**
     *
     * @param a
     * @return
     */
    public void toString(Boolean a){
        if (a==true){
            System.out.print(" O ");
        }
        else{
            System.out.print(" . ");
        }
    }

    /**
     *
     * @param i
     * @param j
     */
    public void metPapierGras(int i, int j){
        map[i][j]=true;
    }

    /**
     *
     * @param i
     * @param j
     */
    public void prendPapierGras(int i, int j){
        map[i][j]=false;
    }

    /**
     *
     * @param i
     * @param j
     * @return
     */
    public Boolean estSale(int i, int j){
        //Si la case est sale, renvoi true
        if (map[i][j]==true){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *
     * @return
     */
    public int nbPapiersGras(){
        for(i=0;i<nbL;i++){
            for(j=0;j<nbC;j++){
                if (map[i][j]==true){
                    accPapiers=accPapiers=1;
                }
            }
        }
        return accPapiers;
    }
    
    //remplir la matrice 
    public void rempliMap() {
    	for(i=0; i<map.length; i++) {
    		for(j=0; j<map[i].length; j++) {
    			map[i][j]=false;
    			
    			
    		}
    	}
    }

    //affiche matrice
    public void affMap(){
        // Affichage de la matrice
    	for(i=0; i<map.length; i++) {
    		for(j=0; j<map[i].length; j++) {
    			a=map[i][j];
    			if(a==false) {
    				System.out.print(" . ");
    			}
    			else {
    				System.out.print(" O ");
    			}
    			
    		}
    		System.out.println();
    	}
    }
    
    
    
    


}
