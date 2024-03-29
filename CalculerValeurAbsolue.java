public class CalculerValeurAbsolue {

	public static void main(String [] args){
		
		int valeurSaisie ;
		int valeurAbsolue ;

		System.out.print("Saisir une valeur entière : ") ;
		valeurSaisie = Clavier.lireEntier() ;

		if(valeurSaisie < 0){
			valeurAbsolue = -1 * valeurSaisie ;
		}
		else {
			valeurAbsolue = valeurSaisie ;
		}

		System.out.println("Valeur absolue : " + valeurAbsolue) ;
		
	}

}
