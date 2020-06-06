import java.io.*;
import  java.util.*;
class UserMainCode{
  public int isExactMultiple(int input1,input2){
  int rem=input1%input2;
		if(rem ==0){
			return 2;
		}
		else if(input1==0 || input2==0){
			return 3;
		}
		else{
			return 1;
		}
	}
}
