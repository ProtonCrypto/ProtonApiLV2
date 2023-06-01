package com.prton.pw.apilv2.controller;
import com.prton.pw.apilv2.model.Master;
import com.prton.pw.apilv2.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.Collections;
import java.util.List;


@RestController
public class MasterController {

    @Autowired
    private MasterRepository masterRepository;


    @PostMapping("/create")
    public Master createWord(@Valid @RequestBody Master master) {
        return masterRepository.save(master);
    }

    @GetMapping("/getAll")
    public Page<Master> getAllWords(Pageable pageable) {
        return masterRepository.findAll(pageable);
    }

    @GetMapping("/get/{wordId}")
    public List<Master> getAnswersByQuestionId(@PathVariable Long wordId) {
        return masterRepository.findAllById(Collections.singleton(wordId));
    }


}
