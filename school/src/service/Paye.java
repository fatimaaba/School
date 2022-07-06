package service;

import repo.PayeRepository;

import java.util.List;

public class Paye {

    private PayeRepository payeRepository = new PayeRepository();

    public List<entity.Paye> selectAllPaye(){
        return payeRepository.findAllPaye();
    }
}
