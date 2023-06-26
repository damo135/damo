abstract class a
{
abstract void get_data(int a);
}
class b extends a
{
int a;
void get_data(int x)
{
a=x;
}
void display()
{
System.out.println("a="+a);
}
}
public class abs
{
public static void main(String args[])
{
b b1 = new b();
b1.get_data(10);
b1.display();
}
}