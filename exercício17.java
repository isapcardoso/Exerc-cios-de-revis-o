package pctExercíciosRevisão;

public class exercício17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double francisco = 1.10;
        double sara = 1.50;
        int anos = 0;

        while (francisco <= sara) {
            francisco = francisco + 0.03; 
            sara = sara + 0.02; 
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos.");
        System.out.printf("Altura de Francisco: %.2f m%n", francisco);
        System.out.printf("Altura de Sara: %.2f m%n", sara);
		
	}

}
