class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        int[] array = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            String strs = str.substring(i, i + 1);
            array[i] = Integer.parseInt(strs);
        }
        
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            answer += array[i];
        }
        
        return Long.parseLong(answer);
    }
}
