class solve{
	
	public static void main(String args[]){
		permutations("", "abc");
	
	}

	static void permutations(String p,String word){
	
		if(word.length() == 0){
			System.out.println(p);
			return;
		}

		char ch = word.charAt(0);

		for(int i = 0; i <=  p.length(); ++i){
			
			String f = p.substring(0,i);
			String l = p.substring(i);
			permutations(f + ch + l, word.substring(1));
			 
		}
	}
}

