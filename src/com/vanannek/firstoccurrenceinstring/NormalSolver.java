package com.vanannek.firstoccurrenceinstring;

public class NormalSolver implements FirstOccurrenceString {
    @Override
    public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        if (lenH < lenN) return -1;
        for (int i = 0; i <= lenH - lenN; i++) {
            int j = 0;
            while (j < lenN && needle.charAt(j) == haystack.charAt(i + j))
                j++;
            if (j == lenN) return i;
        }
        return -1;
    }
}
