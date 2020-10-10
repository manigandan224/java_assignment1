package Mypackage;
import java.lang.*;
public class employee{
String name;
int age;
String city;
public void display(){
System.out.println("The name is:"+name);
System.out.println("The age is:"+age);
System.out.println("The city is:"+city);
}
public static void main(String args[])
{
employee e=new employee();
e.name="Mani";
e.age=20;
e.city="Walajapet";
e.display();
employee e1=new employee();
e1.name="Uday";
e1.age=19;
e1.city="Walajapet";
e1.display();
}
}