/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oktaviani.nasabah.service.service;

import com.oktaviani.nasabah.service.entity.Nasabah;
import com.oktaviani.nasabah.service.repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */

@Service
public class NasabahService {
      @Autowired
    private NasabahRepository nasabahRepository;
    
    public Nasabah saveNasabah(Nasabah nasabah){
        return nasabahRepository.save(nasabah);
    }

    public Nasabah findNasabahById(Long nasabahId) {
        return nasabahRepository.findByNasabahId(nasabahId);
    }
}
