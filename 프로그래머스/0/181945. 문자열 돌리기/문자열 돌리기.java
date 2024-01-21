import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aArray = a.toCharArray();
        
        for(char b : aArray){
            System.out.println(b);
        }
    }
}