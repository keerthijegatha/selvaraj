import java.util.*;
class NumCount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String st=s.nextLine();
int count=0;
char[] c=st.toCharArray();
for(int i=0;i<st.length();i++)
{
int k=(int)c[i];
if((k>=48)&&(k<=57))
{
count++;
}
}
System.out.println("No.of digits are "+count);
System.out.println("No.of chars other than digits are "+(st.length()-count));
}
}
