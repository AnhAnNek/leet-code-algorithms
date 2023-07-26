package com.vanannek.firstoccurrenceinstring;

public class EfficientSolver implements FirstOccurrenceString {
    @Override
    public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        if (lenH < lenN) return -1;
        int i = 0, j = 0;
        while (i <= lenH - lenN) {
            if (j < lenN && needle.charAt(j) != haystack.charAt(i + j)) {
                j = 0;
                i++;
            } else {
                j++;
            }
            if (j == lenN) {
                return i;
            }
        }
        return -1;
    }
}
