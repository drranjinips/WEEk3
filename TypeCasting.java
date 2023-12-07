
public class TypeCasting {

	public static void main(String[] args) {
		/*Java Automatic Conversion - 
		1)Automatic Type conversion- Widening- Happens when
          Two tyes are  compatible
        2)The destination type is larger than the
         source type
*/

		//Below code Demostrate automatic Type conversion
		 byte a=40;
		 byte b = 50;
		   b=a ;
		   System.out.println("THe value of b is " + b);
		 /*Below code Demostrate automatic Type conversion
		  Here destination type is larger than the
	         source type. Here Widening Happened*/
		  byte c=40;
		  byte d=50;
		  float e=(c*d)/3;
		  System.out.println("THe value of e is " + e);
		  //Below Code Demontrating Casting incompatible Types
		  int aa=20;
		  byte bb=35;
		  //bb=aa;
		  	/*This will throw error  bb=aa; since
		  in smaller data type we are saving a bigger Data Type.
		  So we have to Narrow the Type*/
		  bb=(byte)aa;
		  System.out.println("The value of bb  " + bb);
		   //Another Example of Narrowing
		  byte x;
		  int y=400;
		  double z= 600.75d;
		  x=(byte)z;
		  //Another Example
		  byte aaaa=20;
		  //aaaa= aaaa *2; 
		  /*The above code  throw error , 
		  because automatically it will take as integer*/
		  
		  aaaa= (byte)(aaaa *2);
		  System.out.println("The value of aaaa  " + aaaa);
		  
		  
		  
		 
		 
		 

	}

}
