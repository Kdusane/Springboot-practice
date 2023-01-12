package com.Junit.Services;

import com.Junit.Entities.PersonsDetails;
import com.Junit.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Services implements MainServices {
    @Autowired
    private PersonRepository personRepository;



    @Override
    public PersonsDetails savePersons(PersonsDetails personsDetails) {
        return personRepository.save(personsDetails);
    }

    @Override
    public Optional<PersonsDetails> findById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public List<PersonsDetails> findAllPersonDetails() {
        return personRepository.findAll();
    }
}
