public class Chapter6_Varargs {

	public static void varargsExample(int ... vars) {
		for(int i : vars) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
