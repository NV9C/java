import java.util.*;
class Sh
{
public static void main(String args[])
{
Stack s=new Stack();
s.push("A");
s.push("B");
s.push("C");
System.out.println(s);
System.out.println(s.pop("B"));
s.search("A");
System.out.println(s.search("A"));
}
}