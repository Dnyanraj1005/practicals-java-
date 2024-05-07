package pack;             //pack is the package name
public class Addition{
	private double d1,d2;
	
	public Addition(double a, double b){
	d1=1;
	d2=b;
	}
	
	public void sum(){
	System.out.println("Sum="+(d1+d2));
	}
	
}


// keep in mind while compiling a package file (javac -d . class_name.java)
// -d tells to create a directory(pack) in current directory and put Addition.class file to pack directory it...
// (.) after d tells that the package should be created in the current directory
