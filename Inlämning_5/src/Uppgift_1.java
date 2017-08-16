
public class Uppgift_1 {

	
	public static int rekursiv(int n){		//Uppgift 1_1;
		if(n>0){
			System.out.println(n);
			rekursiv(n-1);
			return (n-1);
		}
		System.out.println(0);
		return 0;
	}
	
	public static boolean palindrom(String word){		//Uppgift 1_2
		word = word.toLowerCase();
		word = word.replace(" ", "");
		if(word.length()>1){
			if(word.charAt(0) == word.charAt(word.length()-1)){
				if(palindrom(word.substring(1, word.length()-1))){
					return true;
				}else
					return false;
			}else
				return false;
			
			
		}
		return true;
	}
	
	public static int exponent(int b, int e){		//uppgift 1_3
		if(e>1){
			return b * (exponent(b, e-1));
			
		}
		
		return b;
	}
	
	public static void main(String[] args){
		//rekursiv(310);
		//System.out.println(palindrom("A Santa dog lived as a devil God at NASA"));
		System.out.println(exponent(4,8));

		//update
		
	}
	
	
	
}
