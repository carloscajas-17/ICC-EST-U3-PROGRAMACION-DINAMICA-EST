public class App {
    public static void main(String[] args) throws Exception {
        runEjercicioPD();
    }
    private static void runEjercicioPD(){
        EjercicioPD ejercicioPD= new EjercicioPD();
        System.out.println(" FIBONACCI RECURSIVO");
        long start = System.nanoTime();
        int resultado= ejercicioPD.getFibonaci(5);
        long end= System.nanoTime();
        long duration = end - start;
        System.out.println(" Resultado "+ resultado +" en tiempo " +duration );

        System.out.println("FIBONACCI RECURSIVO CACHING");
        start = System.nanoTime();
        resultado= ejercicioPD.getFibonaciPD(5);
        end=System.nanoTime();
        duration= end - start;
        System.out.println(" Resultado "+ resultado +" en tiempo " +duration );



        
    }
}
