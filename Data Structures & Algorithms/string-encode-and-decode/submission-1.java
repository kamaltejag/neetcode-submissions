class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String str : strs){
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedValues =  new ArrayList();
        int i=0;
        for(int j=0; j < str.length(); j++){
            if(str.charAt(j) == '#'){
                i = j + 1 + Integer.valueOf(str.substring(i, j));
                decodedValues.add(str.substring(j+1, i));
                j=i;
            }
        }
        return decodedValues;
    }
}
