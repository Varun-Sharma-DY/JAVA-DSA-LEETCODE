package LEETCODE;

import java.util.Scanner;

class pf {

    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {

            while(!strs[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

public class prefixfinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = new String[4];

        System.out.println("Enter 4 words:");

        for(int i = 0; i < 4; i++) {
            words[i] = sc.nextLine();
        }

        pf obj = new pf();

        String result = obj.longestCommonPrefix(words);

        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}