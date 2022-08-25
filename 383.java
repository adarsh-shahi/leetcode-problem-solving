class omkay {
  public static void main(String[] args) {
    System.out.println(canConstruct("aa", "aab"));
  }

  public static boolean canConstruct(String ransomNote, String magazine) {
    for(int i = 0; i < ransomNote.length(); i++){
        boolean isFound = false;
        for(int j = 0 ; j < magazine.length(); j++){
            if(ransomNote.charAt(i) == magazine.charAt(j)){
                magazine = magazine.substring(0,j) + '1' + magazine.substring(j+1);
                isFound = true;
                break;
            }
        }
        if(!isFound) return false; 
    }
    return true;
}
}