import java.io.*;
import java.util.*;

class LCS {

    static int findLCS(String str1, String str2, int len1, int len2) {
        if (len1 == 0 || len2 == 0)
            return 0;
        if (str1.charAt(len1 - 1) == str2.charAt(len2 - 1))
            return 1 + findLCS(str1, str2, len1 - 1, len2 - 1);
        else
            return Math.max(findLCS(str1, str2, len1, len2 - 1),
                            findLCS(str1, str2, len1 - 1, len2));
    }

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        int len1 = str1.length();
        int len2 = str2.length();

        System.out.println("Length of LCS is " + findLCS(str1, str2, len1, len2));
    }
}
