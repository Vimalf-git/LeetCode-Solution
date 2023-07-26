class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = i; j < s.length(); j++) {
				if (sb.indexOf(String.valueOf((s.charAt(j)))) != -1) {
					break;
				}
				sb.append(s.charAt(j));				
			}
			if(sb.length()>maxLength) {
				maxLength=sb.length();
			}
		}
		return maxLength;
    }
}
