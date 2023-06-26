package com.articui.datastream.controller;

import java.util.List;
import com.articui.datastream.jpa.ProgramEntity;
import com.articui.datastream.repo.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestControllerClass {

    @Autowired
    private ProgramRepository programRepository;

    @GetMapping
    List<ProgramEntity> findAll(){
        List<ProgramEntity> findAll = programRepository.findAll();
        findAll.forEach(System.out::println);
        return findAll;
    }

}
