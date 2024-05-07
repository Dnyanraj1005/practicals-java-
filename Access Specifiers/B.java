//classes A and B are in the same package. if B is in same package then it can access members of A directly(Except private) 
//so B.class will not created in (package same) --> error comes at line 9(can't access private member)

package same;
import same.A;
public class B{
	public static void main(String args[]){
	A obj = new A();
	B obj1 = new B();
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	}
}
