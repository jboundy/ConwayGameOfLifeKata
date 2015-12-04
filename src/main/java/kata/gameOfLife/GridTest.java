import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.util.List;
import java.io.IOException;

public class GridTest {
 private Grid grid = new Grid();
 private static String TESTFILE = "default_ingest.txt";

  public void ReadGridTest() throws IOException {
    	boolean[][] readgrid = grid.ReadGrid(TESTFILE); 
   	assert(readgrid[1][4] == true);
	assert(readgrid[1][3] == false);
	assert(readgrid[1][5] == false);
	assert(readgrid[2][4] == true);
  }
}
