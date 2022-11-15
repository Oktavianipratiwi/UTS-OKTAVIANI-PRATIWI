/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oktaviani.nasabah.service.repository;

import com.oktaviani.nasabah.service.entity.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface NasabahRepository extends JpaRepository<Nasabah, Long>{
    public Nasabah findByNasabahId(Long nasabahId);
    
}
