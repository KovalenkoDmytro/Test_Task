package com.test_task.repository;

import com.test_task.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Shop, Long> {

    Shop findStoreByName(String name);

}
