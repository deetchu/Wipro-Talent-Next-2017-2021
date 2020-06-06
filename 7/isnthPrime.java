import java.io.*;
import  java.util.*;
Class UserMainCode
{
	public int isPrime(int input1)
	{
		int num=1, count=0;
    while (count < input1){
      num=num+1;
      for (int i = 2; i <= num; i++){ 
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){
        count = count+1;
      }
    }
    return  num;
  }
