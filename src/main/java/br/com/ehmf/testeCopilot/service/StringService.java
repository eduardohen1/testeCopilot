package br.com.ehmf.testeCopilot.service;

public class StringService {

    //método para verificar se é palíndromo
    public boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    //método para contar qte de caracteres
    public int countChars(String str) {
        return str.length();
    }

}