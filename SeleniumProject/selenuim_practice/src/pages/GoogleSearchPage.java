package pages;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String str="my name is sadhana";
        String[] str1=str.split(" ");
String result="";
for(String words: str1){
    String Fletter=str1.substring(0,1).toUpperCase();
    String restString=str1.substring(1) + " ";
    result=result + Fletter + restString;
}
System.out.println(result);
    }
}