public class Split
{
public static void main(String args[])
{
int a[]={7,4,5,1,3,9,6};
int x[]=new int[a.length/2];
int y[]=new int[(a.length/2)+1];
for(int i=0;i<x.length;i=i+1)
{
x[i]=a[i];
}
for(int i=0;i<y.length;i=i+1)
{
y[i]=a[x.length+i];
}
for(int i :x)
{
System.out.print(i);
}
System.out.println("      ");
for(int i :y)
{
System.out.print(i);
}
a=null;
}
}
