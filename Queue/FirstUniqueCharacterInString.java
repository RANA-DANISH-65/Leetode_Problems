public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        int[] hashmap = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashmap[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashmap[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
