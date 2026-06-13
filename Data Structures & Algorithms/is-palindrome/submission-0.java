class Solution {
    public boolean isPalindrome(String s) {
        String modified = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = modified.length() - 1;
        while (i < j){
            if(modified.charAt(i) != modified.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
