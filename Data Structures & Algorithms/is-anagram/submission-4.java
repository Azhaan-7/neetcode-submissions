class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> letterListOfS1 = new HashMap<>();
        for (char letter: s.toCharArray()){
            letterListOfS1.merge(letter, 1, Integer::sum);
        }

        Map<Character, Integer> letterListOfS2 = new HashMap<>();
        for (char letter: t.toCharArray()){
            letterListOfS2.merge(letter, 1, Integer::sum);
        }

        if (letterListOfS1.equals(letterListOfS2)){
            return true;
        }
        else{
            return false;
        }

    }
}
