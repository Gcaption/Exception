/*
@author:����
@file:NumberException.java
@package:PrintDate
@project:�ȱ�дһ��������������ʽΪ��yyyy/mm/dd����ʽ�������ַ���ת��Ϊ���ڶ����������ַ������������Ϲ涨�����׳��쳣������main�����ж��������쳣����������ַ����ֱ������֤�������ת��������ڶ��� 
@date:2017��11��14��
@location:https://github.com/Gcaption/Exception.git
*/
package PrintDate;  
public class NumberException extends Exception{  
  
    String msg;  
    public NumberException(String m){  
        msg="��������ַ���"+m+"�ꡢ�¡���λ�ô��з������ַ�";  
    }  
    public String toString(){  
        return msg;  
    }  
}  