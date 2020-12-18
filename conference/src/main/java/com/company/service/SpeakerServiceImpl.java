package com.company.service;

import com.company.model.Speaker;
import com.company.repository.HibernateSpeakerRepositoryImpl;
import com.company.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
