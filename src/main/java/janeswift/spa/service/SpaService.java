package janeswift.spa.service;

import janeswift.spa.controller.SpaEntryRepository;
import janeswift.spa.domain.SpaEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaService {

    @Autowired
    private SpaEntryRepository spaEntryRepository;

    public List <SpaEntry> findAllEntries (){
        return this.spaEntryRepository.findAll();
    }
    public SpaEntry findSpaEntryById (Integer id) {
        return this.spaEntryRepository.findSpaEntryById(id);
    }

    public List<SpaEntry> findSpaEntriesByName (String name){
        return this.spaEntryRepository.findSpaEntryByName (name);
    }

    public void deleteSpaEntryById (Integer id){
        this.spaEntryRepository.deleteSpaEntryById (id);
    }

    public void save (SpaEntry newEntry) {
    this.spaEntryRepository.save (newEntry);
    }
}


