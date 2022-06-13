class Addition
{
int x;
int y;

Addition(int a, int b)
{
x=a;
y=b;

}
}
public class ParameterizedConstructor
{
public static void main(String args[])
{
Addition P= new Addition(700,800);
System.out.println(P.x + P.y);
}
}