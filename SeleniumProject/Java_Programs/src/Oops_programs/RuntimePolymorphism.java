package Oops_programs;

public class RuntimePolymorphism{
public void method1(int a,int b){

int add= a+b;
System.out.println(add);
}
public void method1(int a,int b,int c){

int add= a+b;
System.out.println(add);
System.out.println("value of c="+c);

}
public static void main(String[]args){
RuntimePolymorphism Rp=new RuntimePolymorphism();
Rp.method1(12,34);
Rp.method1(12,34,7);
}
}