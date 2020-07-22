package tester1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("I am test1 one workin on master branch");
		
		//pull the changes from the remote repository
		
		// pull test2.txt changes from the remote repo(github)
<<<<<<< Updated upstream
	}
=======
		
		// we neeed to have a clean working three in order to pull,push ,merge
		
		//System.out.println("OOO"+);
		
		int u = 0;
		while(u<10 && u>2) {
			System.out.println(randomIdentifier());
			
		}
		
>>>>>>> Stashed changes

}
	
	// class variable
	static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

	static java.util.Random rand = new java.util.Random();

	// consider using a Map<String,Boolean> to say whether the identifier is being used or not 
	static Set<String> identifiers = new HashSet<String>();

	public static String randomIdentifier() {
	    StringBuilder builder = new StringBuilder();
	    while(builder.toString().length() == 0) {
	        int length = rand.nextInt(5)+5;
	        for(int i = 0; i < length; i++) {
	            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
	        }
	        if(identifiers.contains(builder.toString())) {
	            builder = new StringBuilder();
	        }
	    }
	    return builder.toString();
	}
	
	
}
