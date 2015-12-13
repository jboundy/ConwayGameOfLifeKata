package kata.gameoflife;

import java.util.Arrays;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.util.List;
import java.io.IOException;

public class Grid {
  private boolean[][] grid = new boolean[4][8];

  public boolean[][] readGrid(String file) throws IOException {
    grid = new boolean[4][8];
    List<String> lines = Files.readAllLines(Paths.get(file), Charset.forName("UTF-8"));

    for (int i = 0; i < lines.size(); i++) {
      char[] charline = lines.get(i).toCharArray();
      for (int c = 0; c < charline.length; c++) {
        if (charline[c] == '*') {
          grid[i][c] = true;
        } else  {
          grid[i][c] = false;
        }
      }
    }
    return grid;
  }

  public int getNumAliveNeighbors(int x, int y){
    // check all around
  
  }

  public boolean isNeighborAlive(int x, int y) {
    if (checkNeighborBounds(x, y)) {
      return grid[x][y];
    }
    return false;
  }

  public boolean checkNeighborBounds(int x, int y){
    int width = grid.length - 1;
    int height  = grid[width].length - 1;
    if(x < 0 || y  < 0 || x > width || y  > height ){
      return false;
    }
    return true;
  }
}
