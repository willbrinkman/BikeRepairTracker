package com.willbrinkman.BikeRepairTracker.models.repositories;

import com.willbrinkman.BikeRepairTracker.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
