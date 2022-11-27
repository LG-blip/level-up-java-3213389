package com.linkedin.javacodechallenges;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean isPassworComplex(String Password){
        if(Password.length() < 6){
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for(int i=0; i<Password.length(); i++){
            char ch = Password.charAt(i);
            if(Character.isDigit(ch)){
                hasDigit = true;
            }
            if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
        }

        return hasDigit && hasLowerCase && hasUpperCase ;

    }
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println(isPassworComplex(password));
        sc.close();
    }
}
