package com.company;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        in.close();
        boolean ret =anagram(A,B);
        System.out.print(ret? "Angramm" : "Not anagramm");

    }
        public static boolean anagram(String A, String B){

            boolean isAnagramm=false;
            if(A.length()==B.length()) {

                char[] first = A.replaceAll("^[a-zA-Z]$","").toCharArray();
                char[] second = B.replaceAll("^[a-zA-Z]$", "").toCharArray();

                Arrays.sort(first);
                Arrays.sort(second);

                StringBuilder reverse = new StringBuilder(A).reverse();


                if(B.equals(reverse.toString()) || A.equalsIgnoreCase(B))
                {
                    isAnagramm = true;
                }
                else isAnagramm = false;
            }
            return isAnagramm;
        }

    }

