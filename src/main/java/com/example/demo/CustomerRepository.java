/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Wayne.Hu
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
