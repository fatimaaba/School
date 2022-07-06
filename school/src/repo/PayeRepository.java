package repo;

import entity.Lesson;
import entity.Paye;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PayeRepository {

    private List<Paye> payes = new LinkedList<>();


    private Long nextId = 0L;

    public void addPaye(Paye paye){
        paye.setId(nextId++);
        payes.add(paye);

    }

    public void deletePaye(Long id){
        payes = payes.stream().filter(paye -> !paye.getId().equals(id)).collect(Collectors.toList());
    }

    public List<Paye> findAllPaye(){
        for (Paye paye : payes) {
            System.out.println("List of Paye : " + paye);
        }
        return payes;
    }
}
