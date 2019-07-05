package janeswift.spa.controller;

import janeswift.spa.domain.SpaEntry;
import janeswift.spa.service.SpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RequestMapping ("/api")
@RestController
public class SpaController {
    @Autowired
    private SpaService spaService;

    @GetMapping ("/treatments")
    public List<SpaEntry> testMapping (){

        return spaService.findAllEntries();
    }

    @GetMapping ("/treatment/{id}")
    public SpaEntry findGuestBookEntryByid (@PathVariable ("id") Integer id) {
        return this.spaService.findSpaEntryById(id);
    }

    @GetMapping ("/name/{name}")
    public List <SpaEntry> findSpaEntriesByName (@PathVariable ("name") String name){
    return this.spaService.findSpaEntriesByName(name);
    }

    @DeleteMapping ("/treatment/{id}")
    public void deleteSpaEntryById (@PathVariable ("id") Integer id){
    this.spaService.deleteSpaEntryById (id);
    }

    @PostMapping ("/add")
    public void addTreatment (@RequestBody SpaEntry spaEntry){
        this.spaService.save (spaEntry);
    }

    @PostMapping ("/update")
    public void updateTreatment (@RequestBody SpaEntry spaEntry){
        this.spaService.save(spaEntry);
    }
}
