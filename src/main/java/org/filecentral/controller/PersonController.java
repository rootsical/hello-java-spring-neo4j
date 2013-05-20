package org.filecentral.controller;

import org.filecentral.model.Person;
import org.filecentral.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    public String listPeople(Map<String, Object> map) {

        map.put("person", new Person());
        map.put("peopleList", personRepository.findAll().iterator());

        return "people";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @Transactional
    public String addPerson(@ModelAttribute("person") Person person) {

        personRepository.save(person);

        return "redirect:/people/";
    }

    @RequestMapping("/delete/{personId}")
    @Transactional
    public String deletePerson(@PathVariable("personId") Long personId) {

        personRepository.delete(personId);

        return "redirect:/people/";
    }
}
