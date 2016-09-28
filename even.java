public static void main(String[] arg)
{
int a,b;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=a>>1<<1;
if(a==b)
System.out.println(a+" is even");
else
System.out.println(a+" is not even");
}
