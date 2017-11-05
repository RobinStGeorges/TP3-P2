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

		// TEST DES ROBOT POLLUEURS





		//Test 2 robots pollueursToutDroit
		Robot robotPTD=new PollueurToutDroit(map,8);

		robotPTD.parcourir();

		//Test 2 robots pollueursSauteur
		Robot robotPS=new PollueurSauteur(map,3,2);

		robotPS.parcourir();



		System.out.println("après passage des robots pollueurs");
		map.affMap();

		// TEST DES ROBOTS NOTTOYEURS

		//PASSAGE ROBOT NETTOYEUR DISTRAIT

		Robot robotND = new NettoyeurDistrait(map);

		robotND.parcourir();

		System.out.println("après passage du robot nettoyeur distrait");
		map.affMap();
		
		//PASSAGE ROBOT NETTOYEUR

		Robot robotN = new RobotNettoyeur(map);

		robotN.parcourir();

		System.out.println("après passage du robot nettoyeur ");
		map.affMap();




	}


}