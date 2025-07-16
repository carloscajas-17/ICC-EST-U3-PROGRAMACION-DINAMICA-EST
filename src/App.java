public class App {
    public static void main(String[] args) throws Exception {
        runEjercicioPD();
    }
    private static void runEjercicioPD(){
        EjercicioPD ejercicioPD= new EjercicioPD();
        System.out.println(" FIBONACCI RECURSIVO");
        long start = 0;
        int resultado= ejercicioPD.getFibonaci(5);
        long end= 0;
        long duration = end - start;
        System.out.println(" Resultado "+ resultado +" en tiempo " +duration );

        System.out.println("FIBONACCI RECURSIVO CACHING");
        start = 0;
        resultado= ejercicioPD.getFibonaciPD(5);
        end=0;
        duration= end - start;
        System.out.println(" Resultado "+ resultado +" en tiempo " +duration );

        

        
    }
}
