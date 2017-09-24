package e;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as e

public class Exception {
	//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//created as class name exception
	public static void main(String[] args) 
	//static is used for memory management
	//void is used to define the return type of the method
	//String[] args is actually an array of java.lang.String type and it's name is args here
		
	{
		// TODO Auto-generated method stub
		int i,j,k;//intializing 3 integer variables and their values
		i=10;
		j=0;
		k=i/j;
		System.out.println(k);
	/*In this program we get Arithmentic exception as an error
	 *if the divisor(denominator) is 0,it is undefined,here Jvm is
	 *unable to evaluate the result and thereby terminates the execution.
	 *Before terminating because java as friendly language it gives a message of the problem
	 *	
	 */
	}

}
