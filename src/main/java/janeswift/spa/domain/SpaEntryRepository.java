package janeswift.spa.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpaEntryRepository
extends CrudRepository <SpaEntry, Integer>{
    @Override
    List <SpaEntry> findAll ();
}