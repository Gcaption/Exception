/*
@author:����
@file:Main.java
@package:default
@project:�ȴӼ�������һ��ʮ�����������ٽ���ת��Ϊʮ��������Ȼ�������������Ĳ���һ����Ч��ʮ�������������׳��쳣��
@date:2017��11��14��
@location:https://github.com/Gcaption/Exception.git
*/
import java.util.*;

public class Main {
 public static void main(String[] args){
//@SuppressWarnings("resource")
Scanner in = new Scanner(System.in);
System.out.println("������һ��ʮ��������:");
 try{
	 while(in.hasNext()){
		 int val = in.nextInt(16);
		 System.out.println(val);
		 }
	 }
 catch(InputMismatchException e){
	 e.printStackTrace();
	 }
 }
}