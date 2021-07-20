/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int T;
	    Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		if(T >= 1 && T <= 10)
		{
		  int N;
		  N = sc.nextInt();
		  String S = sc.nextLine();
          char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'}; 
          if(N == S.length()){
		  if(N >= 4 && N <= 64){
		      if(N%4 == 0){
		          int x = N/4;
		          List<String> sl = new ArrayList<String>(); 
		          for(int i=0;i<N;i++){
		              String c = "";
		              for(int j=0;j<4;j++){
		                  c = c + S.charAt(i);
		                  i++;
		                  if(j == 3){
		                      i--;
		                      sl.add(c);
		                  }
		              }
		          }
		          String decode = "";
		           for(String z : sl){
		                int y =Integer.parseInt(z,2);
		                decode = decode + alpha[y];
		           }
		           System.out.println(decode);
		      }
		  }
          }
		}
	}
}
