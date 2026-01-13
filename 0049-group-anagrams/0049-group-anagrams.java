class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            int[] freq = new int[26];
            for (char ch: s.toCharArray()) {
                freq[ch - 'a']++;
            }

            String joinedString = Arrays.stream(freq)
                            .mapToObj(String::valueOf) 
                            .collect(Collectors.joining("*"));

            map.computeIfAbsent(joinedString, k -> new ArrayList<>()).add(s);

        }

        
        return new ArrayList<>(map.values());

    }


}