package com.muhammet;

import com.muhammet.entity.Department;
import com.muhammet.entity.Person;
import com.muhammet.repository.DepartmentRepository;
import com.muhammet.repository.PersonRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        PersonRepository personRepository = new PersonRepository();

//        Department department = Department.builder()
//                .name("Yazılım Departmanı")
//                .build();
//        departmentRepository.save(department);
//
//        Person person = Person.builder()
//                .name("Muhammet HOCA")
//                .age(34)
//                .department(department)
//                .build();
//        personRepository.save(person);

        List<Person> personList =  personRepository.findAll();
        System.out.println("*************");
        personList.forEach(p->{
            System.out.println("p_id.....: "+ p.getId());
            System.out.println("p_ad.....: "+ p.getName());
            System.out.println("p_yaş....: "+ p.getAge());
            System.out.println("----------------------------");
        });
        System.out.println("1. Personel Deperman"+personList.get(0).getDepartment().toString());

    }
}
