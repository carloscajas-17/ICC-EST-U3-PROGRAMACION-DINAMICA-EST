import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MazeSolverRecursivoCompletoBT implements MazeSolver {

    private List<Cell> path;
    private Set<Cell> visited;
    private boolean[][] grid;
    private Cell end;

    public MazeSolverRecursivoCompletoBT() {
        this.path = new ArrayList<>();
        this.visited = new LinkedHashSet<>();
    }

    @Override
    public MazeResult getPath(boolean[][] grid, Cell start, Cell end) {
        path.clear();
        visited.clear();
        this.grid = grid;
        this.end = end;

        if (grid == null || grid.length == 0) {
            return new MazeResult(new ArrayList<>(), new LinkedHashSet<>());
        }

        if (findPath(start)) {
            System.out.println("Camino");
            System.out.println(path);
            System.out.println("Visitadas");
            System.out.println(visited);
            MazeResult resultados = new MazeResult(path, visited);
            return resultados;
        }

        return new MazeResult(new ArrayList<>(), new LinkedHashSet<>());
    }

    private boolean findPath(Cell current) {
        if (!isInMaze(current)) {
            return false;
        }

        if (!isValid(current)) {
            return false;
        }

        visited.add(current);
        path.add(current);

        if (current.equals(end)) {
            return true;
        }

        // Derecha, Abajo, Izquierda, Arriba
        if (findPath(new Cell(current.row, current.col + 1)) ||
                findPath(new Cell(current.row + 1, current.col)) ||
                findPath(new Cell(current.row, current.col - 1)) ||
                findPath(new Cell(current.row - 1, current.col))) {
            return true;
        }

        // Backtraking: esta celda no lleva al final - se elimina del camino
        path.remove(path.size() - 1);
        return false;

    }

    private boolean isValid(Cell current) {
        if (!grid[current.row][current.col] || visited.contains(current))
            return false;

        return true;
    }

    private boolean isInMaze(Cell current) {
        int row = current.row;
        int col = current.col;

        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return false;
        }

        return true;
    }
}