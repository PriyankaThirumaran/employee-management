package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
