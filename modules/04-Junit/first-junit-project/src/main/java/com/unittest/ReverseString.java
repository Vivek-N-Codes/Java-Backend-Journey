package com.unittest;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public String reverse(String str) {

    List<String> string = new ArrayList<>();

    for (char c : str.toCharArray()) {
        string.add(String.valueOf(c));
    }

    List<String> revString = new ArrayList<>();

    int n = string.size();

    for (int i = n - 1; i >= 0; i--) {
        revString.add(string.get(i));
    }

    StringBuilder rev = new StringBuilder();

    for (String s : revString) {
        rev.append(s);
    }

    return rev.toString();
}
}
