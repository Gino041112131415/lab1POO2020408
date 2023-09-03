import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //1a
	if (6<6*5)
	System.out.println( "hello" );
	System.out.println( "there" );
		// respuesta: hello
		// there
		
		/*1b*/
		int x=1, y=2, z=3;
		
		if(x>y)
		if(x>z)
	    System.out.println( "1111" );
		else
	    System.out.println( "2222" );
	    
	      // respuesta: no imprime nada
	      
	      
	     /*1c*/ 
	     int x=1, y=2, z=3;
	     
	     if(x<z)
	        System.out.println( "*" );
	     else if (x == z)
	         System.out.println( "&" );
	     else
	        System.out.println( "$" );
	    // respuesta: *
	    
	    
	    /*1D*/ 
	    int x=1, y=2, z=3;
	     if(x<y)
	       System.out.println( "####" );
	       else
	        System.out.println( "&&&&" );
	        System.out.println( "****" );
	    // respuesta: ####
	    //****
	    
	    
	     /*1E*/
	     int x=1, y=2, z=3;
	     if(x>y)
	     System.out.println( "####" );
	     else{
	        System.out.println( "&&&&" );
	        System.out.println( "****" );
	     }
	     // respuesta: &&&&
	    //****
	     
	    /*1F*/    
	    int a1=100; int a2=200;
	    if(a1>100 && a2<=200)
	    System.out.println(a1+" " +a2+" "+ (a1+a2));
	    else 
	    System.out.println(a1+" " +a2+" "+ (2*a1-a2));
	    // respuesta: 100 200 0
	    
	    
	    /*1G*/
	     int x=1, y=2, z=3;
	     if(++x y++  || x-- > 0)
	     z++;
	     else
	     z--;
	     System.out.println(x+" "+y+" "+z);
	    // respuesta: 1 3 4 
	    
	    /*1H*/
	    int x=1, y=2, z=3;
	     if(x<y){
	     System.out.println( "####" );
	      System.out.println( "****" );
	     }
	     else
	     System.out.println( "&&&&" );
	     
	   // respuesta:####
	   //****
	   
	   /*1I*/
	    int x=1, y=2, z=3;
	    if ('x' > 'y' || 66> (int)('A'))
	     System.out.println( "#*#" );
	   // respuesta: #*#
	   
	   /*1J*/
	   int x=1, y=2, z=3;
	     
	     if(x < z)
	        System.out.println( "*" );
	     else if (x==z)
	         System.out.println( "&" );
	     else
	        System.out.println( "$" );
	      // respuesta:*
	      
	        
	    
	         
	        
	    
	}
}
