package com.example.store.controller;

import com.example.store.domain.Kategories;
import com.example.store.domain.Owner;
import com.example.store.repository.KategoriesRepository;
import com.example.store.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/owner")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;
    @PostMapping
    public ResponseEntity<Owner> createOwner(@RequestBody Owner owner){
        Owner save = ownerRepository.save(owner);
        return ResponseEntity.ok(save);
    }
@GetMapping("")
    public ResponseEntity<List<Owner>> getAllOwner(){
        List<Owner> all = ownerRepository.findAll();
        return ResponseEntity.ok(all);
    }

}
