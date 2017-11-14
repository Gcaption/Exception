/*
@author:杨兰
@file:Main.java
@package:default
@project:先从键盘输入一个十六进制数，再将其转化为十进制数，然后输出。若输入的不是一个有效的十六进制数，则抛出异常。
@date:2017年11月14日
@location:https://github.com/Gcaption/Exception.git
*/
import java.util.*;

public class Main {
 public static void main(String[] args){
//@SuppressWarnings("resource")
Scanner in = new Scanner(System.in);
System.out.println("请输入一个十六进制数:");
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