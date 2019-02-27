/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfdivisorarray;

import java.util.Scanner;

/**
 *
 * @author 213061
 */
public class SelfDivisorArray {

        public static boolean isSelfDivisor(int number)
    {
   
    int n = number;
    while (n > 0)
    {
      int d = n % 10;
      if (d == 0 || number % d != 0)
        return false;
      n /= 10;
    }
    return true;
    
    }
    
    
    public static int[] firstNumSelfDivisor(int start, int num)
    {
        
        int[] a = new int[num];
    int count = 0;
    int n = start;
    while (count < num)
    {
      if (isSelfDivisor(n))
      {
        a[count] = n;
        count++;
      }
      n++;
    }
        return a;
        
        
        
    }
    
    
    public static void main(String[] args) {

        
        
        int num = 0;
                int num2 = 0;

    Scanner in = new Scanner(System.in);
        System.out.println("Enter An Integer: ");
    num = in.nextInt();
        System.out.println("How Many Numbers? ");
    num2 = in.nextInt();



int[] a = firstNumSelfDivisor(num, num2);

        for (int i : a) {
            
            System.out.println(i);
            
        }
    
    
    
    
    
    
    
    }
    
}
