import java.io.*; 
import java.util.*; 

class solve{
	
	public static void main(String args[]){
		System.out.print(permutations("", "abc"));
	
	}

	static ArrayList<String> permutations(String p,String word){
	
		if(word.length() == 0){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		char ch = word.charAt(0);

		ArrayList<String> finalList = new ArrayList<>();

		for(int i = 0; i <=  p.length(); ++i){
			
			String f = p.substring(0,i);
			String l = p.substring(i);
			ArrayList<String> currentList = permutations(f + ch + l, word.substring(1));
			finalList.addAll(currentList);
			 
		}
		return finalList;
	}
}

