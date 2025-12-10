import java.util.Arrays;

class ContainsAnagram  {
   
    public boolean isAnagram(String s, String t) {
        
       if(s.length() != t.length()) return false; 
    

        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray(); 
        Arrays.sort(tchar);
        Arrays.sort(schar);

        return Arrays.equals(tchar, schar);
    }
}
    
