import java.util.HashMap;

public class validAnagram {
    public static boolean isAnangram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Anagrams must have the same length
        }

        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count characters in string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check characters in string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                if (count == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, count - 1);
                }
            } else {
                return false; // Character not found in s
            }
        }

        return map.isEmpty(); // If map is empty, it means both strings are anagrams
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(isAnangram(s, t));
    }
}
