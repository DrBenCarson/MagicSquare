import java.util.*;
import java.io.*;
public class MagicChecker {

public boolean MagiCCheck(int [][]zz)
{
	boolean thing1=true;
	boolean thing2=true;
	boolean thing3=true;
	boolean thing4=true;
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	int f=0;
	int g=3;
	
	for (int n=0;n<4;n++)
	{
		a=0;
		for (int m=0;b<zz[0].length;b++)
		{
			a+=zz[n][m];
		}
		if (n==0)
		{
			b=a;
		}
		if (a!=b)
		{
			thing1=false;
			break;
		}
	}
	for (int w=0;w<zz.length;w++)
	{
		c=0;
		for(int q=0;q<zz[0].length;q++)
		{
			c+=zz[q][w];
		}
		if(c!=b)
		{
			thing1=false;
			break;
		}
	}
	for (int l=0;l<zz[0].length;l++)
	{
		d+=zz[l][e];
		e++;
	}
	if (d!=b)
	{
		thing3=false;
	}
	for (int v=zz.length-1;v>=0;v--)
	{
		f+=zz[g][v];
		g--;
	}
	if(f!=b)
	{
		thing4=false;
	}
	if(thing1==true&&thing2==true&&thing3==true&&thing4==true)
	{
		return true;
	}
	else 
	{
		return false;
	}
}





}
