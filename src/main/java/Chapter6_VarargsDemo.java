public class Chapter6_VarargsDemo {

	public static void main(String[] args) {
		System.out.println("Example 1: Ten arguments");
		Chapter6_Varargs.varargsExample(1, 2, 3, 4, 5, 6, 7, 8 , 9, 10);

		System.out.println("Example 2: Five arguments");
		Chapter6_Varargs.varargsExample(1, 2, 3, 4, 5);

		System.out.println("Example 3: One argument");
		Chapter6_Varargs.varargsExample(1);
	}

}
