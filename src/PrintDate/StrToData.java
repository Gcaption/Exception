/*
@author:����
@file:StrToData.java
@package:PrintDate
@project:�ȱ�дһ��������������ʽΪ��yyyy/mm/dd����ʽ�������ַ���ת��Ϊ���ڶ����������ַ������������Ϲ涨�����׳��쳣������main�����ж��������쳣����������ַ����ֱ������֤�������ת��������ڶ��� 
@date:2017��11��14��
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
		System.out.println(" ��������ַ�������ʮλ�����ܼ�����                 ");
		System.out.println(" ����xxxx/xx/xx��ʽ�����׳���ʽ�쳣                     ");
		System.out.println(" ������ġ�x���������ַ������׳������쳣              ");
		System.out.println("��ѡ������  1 ���ϵͳʱ��  2 �Ӽ�������ʱ�䣨��ʽ����Ϊxxxx/xx/xx��ʽ��:");
		int xuanze=in.nextInt();
		if(xuanze==1){
			printSystemTime();
		}else if(xuanze==2){

			System.out.println(" �����������ַ���(��ʽΪxxxx/xx/xx):                    ");
			str=in.next();
			arrays=str.toCharArray();
			try{		
				setForm(str);
				setNumber(str);
				System.out.println(" ��ѡ�������ʽ 1 Ϊxxxx/xx/xx��ʽ  2 Ϊxxxx-xx-xx��ʽ: ");
				int geshi=in.nextInt();
				switch(geshi){
				case 1:form1();break;
				case 2:form2();break;
				default:
					System.out.println("��ʽ��־�������");
				}
			}
			catch(NumberException e){
				System.out.println(e.toString());
			}
			catch(MyException e){
				System.out.println(e.toString());
			}
		}else{
			System.out.println("��������뿴������ʾ");
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
		SimpleDateFormat form=new SimpleDateFormat("����Ϊ:"+str);
		String timePattern=form.format(date);
		System.out.println(timePattern);
	}
	private void form2(){
		Date date=new Date();
		String str1=str.replaceAll("/", "-"); 
		SimpleDateFormat form=new SimpleDateFormat("����Ϊ:"+str1);
		String timePattern=form.format(date);
		System.out.println(timePattern);
	}
	private void printSystemTime(){
		Date date=new Date();
		SimpleDateFormat form=new SimpleDateFormat("'����Ϊ:'y��M��d��");
		String timePattern=form.format(date);
		System.out.println(timePattern);
	}
}