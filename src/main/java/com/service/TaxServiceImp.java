package com.service;

import com.domain.Taxhistory;
import com.domain.User;
import com.repository.TaxRepository;
import com.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TaxServiceImp implements TaxService {

    private final TaxRepository taxRepository;


    public TaxServiceImp(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }


    @Override
    public Taxhistory gettaxhistory(Taxhistory taxhistory){return taxRepository.gettaxhistory(taxhistory);}



}