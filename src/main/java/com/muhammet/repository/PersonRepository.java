package com.muhammet.repository;

import com.muhammet.entity.Person;
import com.muhammet.utility.Repository;

public class PersonRepository extends Repository<Person,Long> {
    public PersonRepository(){
        super(new Person());
    }
}
