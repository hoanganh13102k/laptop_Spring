package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.BillDetails;

public interface BillDetailRepository extends JpaRepository<BillDetails, Integer> {

}