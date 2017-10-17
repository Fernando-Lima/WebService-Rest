package com.fernando.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.webservice.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
