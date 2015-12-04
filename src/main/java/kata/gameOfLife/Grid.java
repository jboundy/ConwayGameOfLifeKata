import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.util.List;
import java.io.IOException;

public class Grid {

  private boolean[][] grid = new boolean[4][8];
  private boolean IsAlive;
  private boolean IsDead;

  public boolean[][] ReadGrid(String file) throws IOException {
      boolean[][] grid = new boolean[4][8];
      List<String> lines = Files.readAllLines(Paths.get(file), Charset.forName("UTF-8"));
      for (int i = 0; i < lines.size(); i++) {
        char[] charline = lines.get(i).toCharArray();
        for (int c = 0; c < charline.length; c++) {
          if (c == '.') {
            grid[i][c] = false;
          } else {
            grid[i][c] = true;
          }
        }
      }
    return grid;
  }
}
