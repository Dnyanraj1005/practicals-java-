class Array1{
	public static void main(String[] args){
		int[] a={1,2,3,4,0};
		task1(a);
		task2(a);
		task3(a);
		task4(a);
		}
		
	public static void task1(int[] a){
		System.out.println(a[0]);
		}
		
	public static void task2(int[] a){
		System.out.println(a[a.length-1]);
		}
		
	public static void task3(int[] a){
		System.out.println(a[a.length-2]);
		}
		
	public static void task4(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			}
		System.out.println(sum);
		}
	}
