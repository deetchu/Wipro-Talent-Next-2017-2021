import java.io.*;
import  java.util.*;
class UserMainCode{
  public int SecondLastDigitOf(int input1){
  if(input1 < 10 && input1 > -10){
			return -1;
		}
		return((Math.abs(input1)/10)%10);
	}
}
