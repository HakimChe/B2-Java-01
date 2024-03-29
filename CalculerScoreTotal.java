public class CalculerScoreTotal {

	public static void main(String [] args){
		
		int scores[] = { 28 , 20 , 35 , 18 , 25 } ;
		
		// Votre code ici
		int cpt = 0 ; 
		for(int i = 0 ; i < scores.length ; i ++){
			cpt += scores[i] ; 
			}
		System.out.println("Le score total est de " + cpt) ; 
	}

}
