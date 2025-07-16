import java.util.HashMap;
import java.util.Map;

public class EjercicioPD {
    // Fibonacci recursivo usando long
    public long getFibonaci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonaci(n - 1) + getFibonaci(n - 2);
        }
    }

    // Fibonacci con caching usando Map
    public long getFibonaciPD(int n) {
        Map<Integer, Long> caching = new HashMap<>();
        return getFibonaciPDHelper(n, caching);
    }

    private long getFibonaciPDHelper(int n, Map<Integer, Long> caching) {
        if (caching.containsKey(n)) {
            return caching.get(n);
        }

        if (n <= 1) {
            caching.put(n, (long)n);  // Guardar resultado base
            return n;
        }

        long resultado = getFibonaciPDHelper(n - 1, caching) + getFibonaciPDHelper(n - 2, caching);
        caching.put(n, resultado); // Guardar resultado en cache
        return resultado;
    }
}