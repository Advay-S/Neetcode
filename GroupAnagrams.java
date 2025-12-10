import java.util.*;

public class GroupAnagrams {

        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List> lettersTOList = new HashMap();
            for (String s : strs) {
                StringBuilder b = new StringBuilder();
                char[] xyz = s.toCharArray();
                Arrays.sort(xyz);
                b.append(xyz);
                String key = b.toString();
                if (!lettersTOList.containsKey(key)) {
                    lettersTOList.put(key, new ArrayList());
                }
                lettersTOList.get(key).add(s);
            }
            return new ArrayList(lettersTOList.values());
        }
    }