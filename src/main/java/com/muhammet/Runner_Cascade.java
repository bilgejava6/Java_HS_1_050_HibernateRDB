package com.muhammet;

import com.muhammet.entity.Department;
import com.muhammet.entity.Person;
import com.muhammet.repository.DepartmentRepository;
import com.muhammet.repository.PersonRepository;

import java.util.List;

public class Runner_Cascade {
    public static void main(String[] args) {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = Department.builder()
                .name("Yazılım")
                .build();
        Person person = Person.builder()
                .name("Bahar KUŞ")
                .age(26)
                .department(department)
                .build();


       Person person1 = Person.builder()
                .name("Hakan BATI")
                .age(54)
                .department(department)
                .build();


      Person  person2 = Person.builder()
                .name("Betül TEKİM")
                .age(29)
                .department(department)
                .build();

      department.setPersonList(List.of(person,person1,person2));

      departmentRepository.save(department);


//        departmentRepository.findAll().forEach(d->{
//            System.out.println("Departman....: "+ d.getName());
//            d.getPersonList().forEach(p->{
//                System.out.println("p_ad.....: "+ p.getName());
//            });
//            System.out.println("--------------------");
//        });
    }
}
