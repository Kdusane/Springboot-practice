package com.Junit.Services;

import com.Junit.Entities.PersonsDetails;
import com.Junit.Repository.PersonRepository;

import java.util.List;
import java.util.Optional;

public interface MainServices {

   public PersonsDetails savePersons(PersonsDetails personsDetails);
   public Optional<PersonsDetails> findById(int id);
   public List<PersonsDetails>  findAllPersonDetails();

}
