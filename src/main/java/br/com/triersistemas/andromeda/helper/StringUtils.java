package br.com.triersistemas.andromeda.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class StringUtils {

    private StringUtils() { }

    public static String getRandomName(){
        List<String> nomes = new ArrayList<>();
        nomes.add("Bianca");
        nomes.add("Vitória");
        nomes.add("Caethana");
        nomes.add("Kay");
        nomes.add("Amanda");
        nomes.add("Carol");
        nomes.add("Davi");
        nomes.add("Igor");
        nomes.add("Antônio");
        nomes.add("Edymar");
        nomes.add("Edward");
        SplittableRandom r = new SplittableRandom();
        return nomes.get(r.nextInt(0, nomes.size()));
    }

}
