package br.com.ehmf.testeCopilot.utils;

public class StringUtils {

    //método para reverse de uma string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //método para upperCase de uma string
    public String upperCase(String str) {
        return str.toUpperCase();
    }

    //método para lowerCase de uma string
    public String lowerCase(String str) {
        return str.toLowerCase();
    }

}
