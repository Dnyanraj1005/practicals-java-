//class C -> if .class file created(here error comes,so .class file will not be created)
// private->cannot acccess, public->accessible, protected->accessible if inherited from A(otherwise not), default->here class C  is outside the package same(where A.class is present) so default is also inaccessible 
package another;
import same.A;
public class C extends A{
	public static void main(String args[]){
	C obj = new C();
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	   
	}
}
