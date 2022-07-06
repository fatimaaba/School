package repo;

import entity.Manager;
import entity.Teacher;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerRepository {

    private List<Manager> managers = new LinkedList<>();


    private Long nextId = 0L;

    public void addManager(Manager manager){
        manager.setId(nextId++);
        managers.add(manager);
    }

    public void deleteManager(Long id){
        managers = managers.stream().filter(manager -> !manager.getId().equals(id)).collect(Collectors.toList());
    }

    public void updateManager(Manager manager){
        var managerInDb = managers
                .stream()
                .filter(teacher1 -> teacher1.getId().equals(manager))
                .findFirst();

        if (managerInDb.isEmpty()){
            return;
        }

        managerInDb.get().setName(manager.getName());
        managerInDb.get().setLastName(manager.getLastName());
    }
}
