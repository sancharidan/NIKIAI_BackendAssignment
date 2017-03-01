package nikiai;
import java.util.*;
/**
 *
 * @author Sanchari
 */
public class NikiAI {

    /*This program counts the number of bit strings of length
     *n which don't have two contiguous zeroes in them.
     *It was observed that for n=2, the result is 3; for n=3, it is 5; 
     *for n=4, it is 8 and for n=5,the result is 13.
     *Hence, the total number of such bitstring are in fibonacci sequence.
    */
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//number of testcases
        for (int i=0;i<t;i++)
        {
            long n=sc.nextLong();//input number of bits
            System.out.println(countBitStrings(n));
        }
    }
        
        public static long countBitStrings(long n)
        {
            long m=1000000007;//10^9+7
            long res=0;//stores the answer
            long a=2, b=3;//stores the first two numbers of the series
            if (n==1)
                res=a;
            if (n==2)
                res=b;
            long cnt=3;
            while (cnt<=n)//generating the sequence till n
            {
                res=(a%m+b%m)%m;//(a+b)%m=(a%m+b%m)%m
                a=b%m;
                b=res%m;
                cnt++;
            }
            return res;//returns long value res
        }
        
    }//end of class
    
    

