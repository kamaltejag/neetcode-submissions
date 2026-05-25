class Solution {

    public String encode(List<String> strs) {
        StringBuilder hashedStr = new StringBuilder();
        for(String str : strs){
            hashedStr.append(str.length());
            hashedStr.append('#');
            hashedStr.append(str);
        }
        return hashedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            j++;

            String word = str.substring(j, j + len);
            i = j + len;
            result.add(word);
        }
        return result;
    }
}
