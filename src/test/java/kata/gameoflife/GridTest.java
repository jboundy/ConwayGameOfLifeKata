package kata.gameoflife;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.util.List;
import java.io.IOException;

public class GridTest {
 private Grid grid = new Grid();
 private static String TESTFILE = "default_ingest.txt";
 private boolean[][] readGrid;

  public void ReadGridTest() throws IOException {
    readGrid = grid.ReadGrid(TESTFILE);
  	System.out.println("Running assertGridProperties()");
	  assertGridPopulated();
    assertAliveNeighborCheck();
   }

 public void assertGridPopulated() {
	assert(readGrid[1][4] == true);
	assert(readGrid[1][3] == false);
	assert(readGrid[1][5] == false);
	assert(readGrid[2][4] == true);
  assert(readGrid[0][0] == false);
  assert(readGrid[3][7] == false);
 }

 public void assertAliveNeighorCheck(){
  assert(grid.GetAliveNeighbors(1, 4) == 2);
 }

 public void assertCheckNeighborBounds(){
   //assert(grid.CheckNeighborBounds(1,1) == true);
   //assert(grid.CheckNeighborBounds(0,0) == false);
   //assert(grid.CheckNeighborBounds(7,7) == false);
   //assert(grid.CheckNeighborBounds(1,0) == false);
 }
}
