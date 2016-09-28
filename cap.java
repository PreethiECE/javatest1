public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
String str,s;
StringTokenizer st;
str=in.nextLine();
st=new StringTokenizer(str, );
while(st.hasMoreTokens())
{
s=st.nextToken();
int n;
n=s.length;
s=s.charAt(0).toUpperCase()+s.substring(1,n-1);
System.out.println(s)
}
}
