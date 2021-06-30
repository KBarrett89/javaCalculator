package hello;

public class examresults {

	public static int physics = 100;
	public static int chemistry = 150;
	public static int biology = 80;
	public static int total = physics + chemistry + biology;
	public static int percent = total / 450;

	public static void displayResult() {
		System.out.print("Physics: ");
		System.out.println(physics);
		System.out.print("Chemistry: ");
		System.out.println(chemistry);
		System.out.print("Biology: ");
		System.out.println(biology);
		System.out.print("Total: ");
		System.out.print(total);
		System.out.println("/450");
	}

	public static void displayPercent() {

		System.out.print("Physics: ");
		System.out.print(physics / 150.0 * 100);
		System.out.println(" %");
		System.out.print("Chemistry: ");
		System.out.print(chemistry / 150.0 * 100);
		System.out.println(" %");
		System.out.print("Biology: ");
		System.out.print(biology / 150.0 * 100);
		System.out.println(" %");
		System.out.print("Total: ");
		System.out.print(total / 450.0 * 100);
		System.out.println(" %");

	}
}
