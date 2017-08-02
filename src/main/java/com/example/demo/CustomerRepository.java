/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.entity.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Wayne.Hu
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
  @Query("select u from #{#entityName} u where u.name like %?1%")
  List<Customer> findByName(String name);
}
