package com.Junit.Controller;


import com.Junit.Entities.PersonsDetails;
import com.Junit.Services.MainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private MainServices mainServices;

    @PostMapping("/savePersonDetails")
    public PersonsDetails savePersonDetails(@RequestBody PersonsDetails personsDetails){
        return mainServices.savePersons(personsDetails);
    }

    @GetMapping("/getPersonById/{id}")
    public Optional<PersonsDetails> getPersonDetailsById(@PathVariable int id){
        return mainServices.findById(id);
    }

    @GetMapping("/getallPersonDetails")
    public List<PersonsDetails> getallPersonDetails(){
        return mainServices.findAllPersonDetails();
    }

}
