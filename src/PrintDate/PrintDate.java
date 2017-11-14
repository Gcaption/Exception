/*
@author:杨兰
@file:PrintData.java
@package:PrintDate
@project:先编写一个方法，它将格式为“yyyy/mm/dd”形式的日期字符串转化为日期对象。若日期字符串不符合以上规定，则抛出异常。再在main方法中对正常和异常输入的日期字符串分别进行验证，并输出转换后的日期对象。 
@date:2017年11月14日
@location:https://github.com/Gcaption/Exception.git
*/
package PrintDate;  
public class PrintDate {  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        try{  
            //得到StrToDate类对象  
            Class cs=Class.forName("PrintDate.StrToDate");  
            //得到实例，开辟开辟空间  
            StrToData strtodate=(StrToData)cs.newInstance();  
            strtodate.Convert();  
        }  
        catch(Exception e){  
            System.out.println("输入字符串长度不对，不能加载StrToDate类"+e.getMessage());  
        }  
    }  
  
}  