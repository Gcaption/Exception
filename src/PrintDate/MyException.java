/*
@author:杨兰
@file:MyException.java
@package:PrintDate
@project:先编写一个方法，它将格式为“yyyy/mm/dd”形式的日期字符串转化为日期对象。若日期字符串不符合以上规定，则抛出异常。再在main方法中对正常和异常输入的日期字符串分别进行验证，并输出转换后的日期对象。 
@date:2017年11月14日
@location:https://github.com/Gcaption/Exception.git
*/
package PrintDate;  
public class MyException extends Exception{  
  
    String msg;  
    public MyException(String m){  
        msg="日期字符串"+m+"格式输入不正确";  
    }  
    public String toString(){  
        return msg;  
    }  
}  