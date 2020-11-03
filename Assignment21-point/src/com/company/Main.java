package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(((((test)))))"));
    }

    public static String removeOuterParentheses(String str) {
        String one = removeFirst(str);
        String two = removeLast(one);
        return two;
    }

    public static String removeFirst(String s) {
        int charPos = 0;
        if (charPos < 0) {
            return s;
        }
        return s.substring(0, charPos) + s.substring(charPos + 1, s.length());
    }

    public static String removeLast(String s) {
        int charPos = s.length();
        if (charPos < 0) {
            return s;
        }
        return s.substring(0, charPos - 1) + s.substring(charPos, s.length());
    }
}