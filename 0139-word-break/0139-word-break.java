class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
         int size = s.length(); 
        Set<String> dict = new HashSet<>(wordDict); 
        
        //Size must be size + 1 to hold the result for the full string length
        boolean[] dynamicPro = new boolean[size + 1]; 
        dynamicPro[0] = true; 
        
        for (int i = 1; i <= size; i++) { 
            for (int j = 0; j < i; j++) { 
                if (dynamicPro[j] && dict.contains(s.substring(j, i))) { 
                    dynamicPro[i] = true; 
                    break; 
                } 
            } 
        } 
        return dynamicPro[size]; 
    }
}