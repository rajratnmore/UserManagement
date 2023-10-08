package com.geekster.OneToOneMapping.repo;

import com.geekster.OneToOneMapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {

}
