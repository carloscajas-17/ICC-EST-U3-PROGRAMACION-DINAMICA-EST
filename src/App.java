import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjercicioPD();
        runMaze();

        
    }
    private static void runMaze() {
        boolean[][] predefinedMaze = {
                { true, true, true, true },
                { false, true, false, true }, 
                { true, true, false, false },
                { true, true, true, true }
        };
        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberinto cargado: ");
        maze.printMaze();

        Cell start = new Cell(0,0);
        Cell end = new Cell(3,3);

        MazeSolver compMazeSolver = new MazeSolverRecursivoCompletoBT();
        /*
        List<MazeSolver> solvers = Arrays.asList(
            new MazeSolverRecursive(),
            new MazeSolverCompleto()
            );

        MazeSolver solver = solvers.get(0);
        List<Cell> path;
        path = solver.getPath(maze.getGrid(), start, end);

        System.out.println("\nCamino encontrado (2 direcciones)");
        if (path.isEmpty()) {
            System.out.println("No se encontró camino");
        } else {
            System.out.println(path);
        }

        solver = solvers.get(1);
        path = solver.getPath(maze.getGrid(), start, end);

        System.out.println("\nCamino encontrado (4 direcciones)");
        if (path.isEmpty()) {
            System.out.println("No se encontró camino");
        } else {
            System.out.println(path);
        }*/
        MazeResult path3 = compMazeSolver.getPath(maze.getGrid(), start, end);
        System.out.println("Laberinto Recorrido");
        maze.paintMaze(path3.getPath());
        System.out.println("Laberinto con las celdas visitadas");
        maze.paintMazeVisited(path3.getPath(), start, end);
    }

    


    /*
    private static void runEjercicioPD() {
        EjercicioPD ejercicioPD = new EjercicioPD();

        System.out.println("Nombre : ANDRES CAJAS");
        System.out.println();
        System.out.println("----- Fibonacci Recursivo -----");
        long start = System.nanoTime();
        long resultado = ejercicioPD.getFibonaci(50);  // Puedes poner 50 u otro valor grande
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Resultado: " + resultado + " en tiempo  " + duration);

        System.out.println("----- Fibonacci con caching -----");
        start = System.nanoTime();
        resultado = ejercicioPD.getFibonaciPD(50);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Resultado: " + resultado + " en tiempo  " + duration);
    }
     */
}