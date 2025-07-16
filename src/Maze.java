import java.util.List;

public class Maze {
    private boolean[][] grid;

    public Maze(boolean[][] grid) {
        this.grid = grid;
    }

    public boolean[][] getGrid() {
        return grid;
    }

    // Imprime el laberinto normal con '-' y 'x'
    public void printMaze() {
        System.out.println("Laberinto cargado:");
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] ? "-" : "x");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Imprime el laberinto con el camino marcado con 'x'
    public void printMazeWithPath(List<Cell> path) {
        System.out.println("\nLaberinto con camino (marcado con 'x'):");
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = 0; j < grid[0].length; j++) {
                boolean esCamino = false;
                for (Cell cell : path) {
                    if (cell.getRow() == i && cell.getCol() == j) {
                        esCamino = true;
                        break;
                    }
                }
                System.out.print(esCamino ? "x" : (grid[i][j] ? "-" : "x"));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
