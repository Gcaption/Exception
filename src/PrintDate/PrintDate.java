/*
@author:����
@file:PrintData.java
@package:PrintDate
@project:�ȱ�дһ��������������ʽΪ��yyyy/mm/dd����ʽ�������ַ���ת��Ϊ���ڶ����������ַ������������Ϲ涨�����׳��쳣������main�����ж��������쳣����������ַ����ֱ������֤�������ת��������ڶ��� 
@date:2017��11��14��
@location:https://github.com/Gcaption/Exception.git
*/
package PrintDate;  
public class PrintDate {  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        try{  
            //�õ�StrToDate�����  
            Class cs=Class.forName("PrintDate.StrToDate");  
            //�õ�ʵ�������ٿ��ٿռ�  
            StrToData strtodate=(StrToData)cs.newInstance();  
            strtodate.Convert();  
        }  
        catch(Exception e){  
            System.out.println("�����ַ������Ȳ��ԣ����ܼ���StrToDate��"+e.getMessage());  
        }  
    }  
  
}  