import java.util.*;
public class Diffie_Hellman
{

public static int keygen(int a,int b,int n){
int ans=(int)Math.pow(a,b)%n;
return ans;
}

public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the public keys P,G: ");
int P=sc.nextInt();
int G=sc.nextInt();
System.out.println("Enter the private keys a,b: ");
int a=sc.nextInt();
int b=sc.nextInt();
Diffie_Hellman dh = new Diffie_Hellman();
int x=dh.keygen(G,a,P);
int y=dh.keygen(G,b,P);
int ka=dh.keygen(y,a,P);
int kb=dh.keygen(x,b,P);
if(ka==kb)
System.out.println("The shared secrete key is : "+ka);
}
}

