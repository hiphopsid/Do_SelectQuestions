//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
  class Activity{
//    //Implement Activity class here..
      String string1;
      String string2;
     String operator;
//
      Activity(String string1, String string2, String operator)
     {
          super();
          this.string1=string1;
          this.string2=string2;
          this.operator=operator;
      }
//
     public String getString1() {
          return string1;
     }
//
      public void setString1(String string1) {
          this.string1 = string1;
      }
//
      public String getString2() {
          return string2;
      }
//
      public void setString2(String string2) {
          this.string2 = string2;
      }
//
      public String getOperator() {
          return operator;
      }
//
      public void setOperator(String operator) {
         this.operator = operator;
      }
  }
//
//
//
  public class Source {
//    //Implement the two function given in description in here...
      String str = "";
      public String handleException(Activity a)
      {
          try{
              if(a.operator!="+"||a.operator!="-")
              {
                  if(a.string1!=null&& a.string2!=null)
                  {
                      str = "None Exception found";
                  }
              }
              return str;
          }
          catch(NullPointerException e)
          {
          e.printStackTrace();
          }
          catch(Exception e)
          {
          e.printStackTrace();
          }
//
          return null;
      }
//
      public String doOperation(Activity a)
      {
          String output="";
          switch(a.getOperator())
          {
              case "+": output=a.getString1()+a.getString2();
                  break;
              case "-": output=a.getString1().replaceAll(a.getString2(),"");
                  break;
          }
          return output;
      }
//
      public static void main(String args[] ) throws Exception {
          //Write your own main to check the program...
//
      }
  }
