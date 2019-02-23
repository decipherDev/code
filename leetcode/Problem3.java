public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        char[] ch = s.toCharArray();
        int[] node = new int[256];
        
        int currentCount=0;
        int maxCount=0;
        int startIndex=0;
        for(int i=0; i < ch.length; i++) {
            if(node[ch[i]]==0) {
               node[ch[i]] = i+1;
            } else {
                startIndex = node[ch[i]];
                node[ch[i]] = i+1;
            }   
            currentCount = i - startIndex;
            maxCount = maxCount > currentCount ? maxCount : currentCount;
        }
        return ++maxCount;
    }