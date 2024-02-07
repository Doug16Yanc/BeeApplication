package repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeracaoId {
    private static final Map<Long, Boolean> idMap = new HashMap<>();
    public static int gerarid(){
        Random random = new Random();
        Long entrada;

        do {
            entrada = (long) random.nextInt((10000) + 100000000);
        }
        while (idMap.containsKey(entrada));

        idMap.put(entrada, true);
        return Math.toIntExact(entrada);
    }
}
