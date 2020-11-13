/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.attempmysql;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author fullm
 */
public class Connect {
    
    public static void main(String[] args) {
        
        Queue<String> languages = new LinkedList<>();
        
        String[] langs = {"Node", "Java", "Python", "PHP"};
        
        for (int i = 0; i < 4; i  ++) {
            languages.add(langs[i]);
        }
        
        int index = 1;
        
        while (!languages.isEmpty()) {
            Language ln = new Language(index, languages.peek());
            System.out.println("---------------------------------------");
            String language = ln.createLanguage();
            System.out.println(language);
            language = ln.getLanguage();
            System.out.println(language);
            language = ln.updateLanguage();
            System.out.println(language);
            language = ln.deleteLanguage();
            System.out.println(language);
            System.out.println("---------------------------------------");
            System.out.println("\n");
            index++;
            languages.remove();
        }
    }    
}
