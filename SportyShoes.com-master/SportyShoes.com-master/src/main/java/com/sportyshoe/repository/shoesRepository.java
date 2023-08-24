package com.sportyshoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoe.entity.shoes;

@Repository
public interface shoesRepository extends JpaRepository<shoes,Integer>  {

}