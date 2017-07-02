
public class assignment14 {
	
public static void main (String args[])
{
	//Initializtion of data//
	byte b = 1;
	short s = 2;
	int i =4;
	long l = 8;
	float f = 16;
	
	//value of byte and short added and stored in //
	int j = b + s;
	System.out.println("j is int " +j);
	
	//value of short and int added and stored in //
	long m = i + s;
	System.out.println("m is long  " +m);
	
	//value of long and int added and stored in //
	float g = l + i;
	System.out.println("g is float " +g);
	
	//value of float and long added and stored in//
	double d = f + l;
	System.out.println("d is double" +d);
	
}
}