import java.io.IOException;

public class ConwayGameOfLifeTest {
	private static final String TESTFILE = "bin/default_ingest.txt";
	private ConwayGameOfLife cgol = new ConwayGameOfLife();
	public static final String cut = "ConwayGameOfLife.";

	public static void pmr(String runningtest) {
		System.out.println("Running " + cut + " " + runningtest);
	}

	public static void testGrid() throws IOException {
		pmr("testGrid()");
	}

	public static void runGridTest() throws IOException {
		pmr("new GridTest()");
		new GridTest().ReadGrid(TESTFILE);
	}

	public void runTests() throws IOException{
		testGrid();
		runGridTest();
	}

	public static void main(String[] args) throws IOException {
		new ConwayGameOfLifeTest().runTests();
	}
}
