public class RechercherScoreMin {

	public static void main(String [] args){
		
		int scores[] = { 28 , 20 , 35 , 18 , 25 } ;
		int scoreMin = 1000 ; 
		
		for(int i = 0 ; i < scores.length ; i ++){
			if( scores[i] < scoreMin){
				scoreMin = scores[i] ; 
				}
			}
		System.out.println("Le score minimal est " + scoreMin ) ;  
		
	}

}
