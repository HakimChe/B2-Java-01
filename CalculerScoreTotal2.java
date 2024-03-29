public class CalculerScoreTotal2 {

	public static void main(String [] args){
		
		int scores[] = { 28 , 20 , 35 , 18 , 25 } ;
		int scoreTotal = 0 ;
		
		for(int score : scores){
			scoreTotal = scoreTotal + score ; 
		}
		System.out.println( "Le score total est de " + scoreTotal ) ; 
	}

}
