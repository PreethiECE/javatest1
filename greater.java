public static void main(String[] arg)
{
int a,b,c;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b && a>c)
System.out.println(a+" is greater");
else if (b>a && b>c)
System.out.println(b+" is greater");
else if(c>a && c>b)
System.out.println(c+" is greater");
else
System.out.println("Three numbers are equal");
}
