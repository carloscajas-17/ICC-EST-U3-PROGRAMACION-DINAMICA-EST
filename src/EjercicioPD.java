import java.util.HashMap;
import java.util.Map;

public class EjercicioPD{
    // FIBONACCI RECURSIVO NORMAL
    public int  getFibonaci( int n ){
        if( n==0){
            return 0;

        }else if(n==1){
            return 1;
        }else{ 
            return getFibonaci(n-1)+ getFibonaci(n-2);
        }
        
    }
    //FIBONACCI MAPA HASHMAP 
    public int getFibonaciPD( int n){
        Map<Integer, Integer> caching = new HashMap<>();
        return getFibonaciPDHelper(n,caching);

        
    }
    private int getFibonaciPDHelper(int n, Map<Integer, Integer> caching) {
        // Comprobamos si ya lo calculamos antes
        if (caching.containsKey(n)) {
            return caching.get(n);
        }
        // Caso base
        if (n <= 1) {
            caching.put(n, n); // Guardamos en cache
            return n;
        }
        // Calculamos y guardamos en cache
        int resultado = getFibonaciPDHelper(n - 1, caching) + getFibonaciPDHelper(n - 2, caching);
        caching.put(n, resultado);
        return resultado;
    }
}


