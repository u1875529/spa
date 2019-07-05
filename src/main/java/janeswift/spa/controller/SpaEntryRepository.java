package janeswift.spa.controller;

import janeswift.spa.domain.SpaEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Size;
import java.util.List;

@Service
public class SpaEntryRepository {
    @Autowired
    private SpaEntryRepository spaEntryRepository;

    public List<SpaEntryRepository> findALlEntries (){
        return this.spaEntryRepository.findAll ();
    }

    public List<SpaEntry> findAll() {
    }
}
