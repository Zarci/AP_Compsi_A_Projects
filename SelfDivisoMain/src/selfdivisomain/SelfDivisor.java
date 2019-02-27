/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfdivisomain;

/**
 *
 * @author 213061
 */
public class SelfDivisor {
    
    
    
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
    
}
