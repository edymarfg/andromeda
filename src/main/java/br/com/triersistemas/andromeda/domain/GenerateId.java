package br.com.triersistemas.andromeda.domain;

import java.util.ArrayList;
import java.util.List;

public class GenerateId {

    private static final List<Integer> ids = new ArrayList<>();

    public static Integer verificaId(Integer id){
        Integer control = ids.size();
        do {
            if (!ids.contains(id)){
                ids.add(id);
                break;
            }else {
                id++;
            }
        }while (true);
        return id;
    }
}
