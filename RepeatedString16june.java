package com.company.warmup.challenge;

import com.sun.javafx.binding.StringFormatter;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RepeatedString16june {
    public static void main(String[] args) throws IOException {

        //System.out.println( repeatedString( "a",1000000000000L ));
        //System.out.println( repeatedString( "x",970770 ));
       System.out.println( repeatedString( "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm",736778906400L ));
      //  System.out.println( repeatedString( "aba",10));

    }

    static long repeatedString(String s, long n) {
        // repeat string only if has "a"
        if(s.contains( "a" )) {
            StringBuilder stringBuilder = new StringBuilder( s );
            String infiniteString = "";
            if(stringBuilder.length() < n) {
                infiniteString    = infiniteString(s, n);
            }
            int count = 0;
            char[] stringArray = infiniteString.toCharArray();
            for (int i = 0; i < n; i++) {

                char a = 'a';
                if (stringArray[i] == a) {
                    count++;
                }
            }
            return count;
        }
        else
            return 0;
    }

    static String infiniteString(StringBuilder stringBuilder, Long n){
        try {
            for(int i=0; i<=n; i++){
                stringBuilder.append( stringBuilder);
                System.out.println("Length:"+ stringBuilder.length());
                //*if(stringBuilder.length() == n || stringBuilder.length() > 100)*//*
                if(stringBuilder.length() == n)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  stringBuilder.toString();
    }

    static String infiniteString(String strInput, Long n){
        //StringWriter stringWriter = new StringWriter(  );
        StringBuilder stringBuilder = new StringBuilder(  );
            for(int i=0; i<=n; i++){
                //stringWriter.write( strInput );
                stringBuilder.append( strInput);
                System.out.println("Length:"+ String.valueOf( stringBuilder ).length());
                /*if(stringBuilder.length() == n || stringBuilder.length() > 100)*/
                if(String.valueOf( stringBuilder).length() == n)
                    break;
            }

        return  String.valueOf( stringBuilder);
    }
}
