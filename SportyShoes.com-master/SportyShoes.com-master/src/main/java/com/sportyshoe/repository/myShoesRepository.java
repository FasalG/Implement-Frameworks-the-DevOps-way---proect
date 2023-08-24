package com.sportyshoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoe.entity.myShoesList;

@Repository
public interface myShoesRepository extends JpaRepository<myShoesList,Integer>{

}