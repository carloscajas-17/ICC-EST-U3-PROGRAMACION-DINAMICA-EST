import java.util.Arrays;
import java.util.List;

public class Maze {

    private boolean[][] maze;
    private int rows;
    private int columns;

    public Maze(boolean[][] maze) {
        this.maze = maze;
        this.rows = maze.length;
        this.columns = maze[0].length;
    }

    public void printMaze() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(maze[i][j] ? " - " : " * ");
            }
            System.out.println();
        }
    }

    public void paintMaze(List<Cell> path) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Cell current = new Cell(i, j);
                if (path.contains(current)) {
                    System.out.print(" > ");
                } else if (maze[i][j]) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public void paintMazeVisited(List<Cell> path, Cell start, Cell end) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Cell current = new Cell(i, j);
                if (path.contains(current) || maze[i][j]) {
                    System.out.print(" > ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public boolean[][] getGrid() {
        return maze;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.deepHashCode(maze);
        result = prime * result + rows;
        result = prime * result + columns;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Maze other = (Maze) obj;
        if (!Arrays.deepEquals(maze, other.maze))
            return false;
        if (rows != other.rows)
            return false;
        if (columns != other.columns)
            return false;
        return true;
    }

    
    
}