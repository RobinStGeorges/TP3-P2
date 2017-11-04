public class TestRobot {
	public static void main(String[] args) {
		Monde map=new Monde();
		int c=map.getNbC();
		int l=map.getNbL();
		int i=0;
		int j=0;
		Boolean a= false;

		//Initialisation de la map
		map.rempliMap();




		//        //test met papier gras
		//        map.metPapierGras(0, 0);
		//        map.metPapierGras(1,1);
		//        map.metPapierGras(2,2);
		//        map.metPapierGras(3,3);
		//        map.metPapierGras(4,4);
		//        
		//        //test retire papier gras 
		//        map.prendPapierGras(1, 1);
		//        map.prendPapierGras(3, 3);


		//Test 2 robots pollueursToutDroit
		PollueurToutDroit robotPTD=new PollueurToutDroit(map,3);

		robotPTD.parcourir();

		//Test 2 robots pollueursSauteur
		PollueurSauteur robotPS=new PollueurSauteur(map,1,1);

		robotPS.parcourir();



		System.out.println("après passage des robots pollueurs");
		map.affMap();
		
		RobotNettoyeur robotN = new RobotNettoyeur(map);
		
		robotN.parcourir();

		System.out.println("après passage des robots nettoyeurs");
		map.affMap();


	}
	

}