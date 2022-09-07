package com.example.arackiralamaportali;

import com.example.arackiralamaportali.Data.CarTypeRepository;
import com.example.arackiralamaportali.Data.CityRepository;
import com.example.arackiralamaportali.Data.RoleRepository;
import com.example.arackiralamaportali.Models.CarType;
import com.example.arackiralamaportali.Models.City;
import com.example.arackiralamaportali.Models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AracKiralamaPortaliApplication implements CommandLineRunner{

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private CarTypeRepository carTypeRepository;

    public static void main(String[] args) {

        SpringApplication.run(AracKiralamaPortaliApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        if(roleRepository.count()<=0){
            Role role1=new Role();
            role1.setRoleName("ADMIN");
            role1.setRole_id(1);
            Role role2=new Role();
            role2.setRoleName("USER");
            role2.setRole_id(2);
            Role role3=new Role();
            role3.setRoleName("EDITOR");
            role3.setRole_id(3);
            roleRepository.save(role1);
            roleRepository.save(role2);
            roleRepository.save(role3);
        }
        if(cityRepository.count()<=0){
            cityRepository.saveAll(List.of(new City(1,"İstanbul"),new City(2,"Ankara"),
                    new City(3,"İzmir"),new City(4,"Antalya")));
        }
        if(carTypeRepository.count()<=0){
            carTypeRepository.saveAll(List.of(new CarType(1,"Binek"),new CarType(2,"Kamyonet"),
                    new CarType(3,"Minivan"),new CarType(4,"Minibüs"),new CarType(4,"Ticari"),new CarType(5,"Arazi")));

        }
    }
}
