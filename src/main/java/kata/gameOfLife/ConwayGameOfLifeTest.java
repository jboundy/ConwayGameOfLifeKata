

public class ConwayGameOfLifeTest {
	private ConwayGameOfLife cgol = new ConwayGameOfLife();
	public static final String cut = "ConwayGameOfLife.";

	public static void pmr(String runningtest) {
		System.out.println("Running " + cut + " " + runningtest);
	}
	public static void testGrid() {
		pmr("testGrid()");			
	}

	public void runTests() {
		testGrid();

	}

	public static void main(String[] args) {
		new ConwayGameOfLifeTest().runTests();
	}
}
