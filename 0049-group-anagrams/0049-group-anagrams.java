class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            int[] c = new int[26];
            
            for (char ch: str.toCharArray()) {
                c[ch - 'a']++;
            }

            String integerString = Arrays.stream(c).mapToObj(String::valueOf).collect(Collectors.joining("*"));

            if (!map.containsKey(integerString)) {
                map.put(integerString, new ArrayList<>());
            }

            map.get(integerString).add(str);
        }

        return new ArrayList<>(map.values());
    }
}