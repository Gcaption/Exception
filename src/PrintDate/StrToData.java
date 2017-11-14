/*
@author:杨兰
@file:StrToData.java
@package:PrintDate
@project:先编写一个方法，它将格式为“yyyy/mm/dd”形式的日期字符串转化为日期对象。若日期字符串不符合以上规定，则抛出异常。再在main方法中对正常和异常输入的日期字符串分别进行验证，并输出转换后的日期对象。 
@date:2017年11月14日
@location:https://github.com/Gcaption/Exception.git
*/
package PrintDate;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class StrToData {
	private char []arrays;
	String str;
	public void Convert(){
		Scanner in=new Scanner(System.in);
		System.out.println(" 若输入的字符串不是十位，则不能加载类                 ");
		System.out.println(" 若非xxxx/xx/xx格式，则抛出格式异常                     ");
		System.out.println(" 若输入的‘x’非数字字符，则抛出数字异常              ");
		System.out.println("请选择日期  1 输出系统时间  2 从键盘输入时间（格式必须为xxxx/xx/xx格式）:");
		int xuanze=in.nextInt();
		if(xuanze==1){
			printSystemTime();
		}else if(xuanze==2){

			System.out.println(" 请输入日期字符串(格式为xxxx/xx/xx):                    ");
			str=in.next();
			arrays=str.toCharArray();
			try{		
				setForm(str);
				setNumber(str);
				System.out.println(" 请选择输出格式 1 为xxxx/xx/xx格式  2 为xxxx-xx-xx格式: ");
				int geshi=in.nextInt();
				switch(geshi){
				case 1:form1();break;
				case 2:form2();break;
				default:
					System.out.println("格式标志输入错误");
				}
			}
			catch(NumberException e){
				System.out.println(e.toString());
			}
			catch(MyException e){
				System.out.println(e.toString());
			}
		}else{
			System.out.println("输入错误，请看以上提示");
		}


	}
	public void setForm(String str) throws MyException{
		if(arrays[4]!='/'||arrays[7]!='/'){
			throw new MyException(str);
		}
	}
	public void setNumber(String str) throws NumberException{
		if((arrays[0]&arrays[1]&arrays[2]&arrays[3]&arrays[5]&arrays[6]&arrays[8]&arrays[9])<48||(arrays[0]&arrays[1]&arrays[2]&arrays[3]&arrays[5]&arrays[6]&arrays[8]&arrays[9])>57){
			throw new NumberException(str);
		}
	}
	private void form1(){
		Date date=new Date();
		SimpleDateFormat form=new SimpleDateFormat("日期为:"+str);
		String timePattern=form.format(date);
		System.out.println(timePattern);
	}
	private void form2(){
		Date date=new Date();
		String str1=str.replaceAll("/", "-"); 
		SimpleDateFormat form=new SimpleDateFormat("日期为:"+str1);
		String timePattern=form.format(date);
		System.out.println(timePattern);
	}
	private void printSystemTime(){
		Date date=new Date();
		SimpleDateFormat form=new SimpleDateFormat("'日期为:'y年M月d日");
		String timePattern=form.format(date);
		System.out.println(timePattern);
	}
}