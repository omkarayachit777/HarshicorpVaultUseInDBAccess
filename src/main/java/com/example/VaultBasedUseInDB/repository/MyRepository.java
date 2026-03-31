package com.example.VaultBasedUseInDB.repository;

import com.example.VaultBasedUseInDB.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<User, Integer> {
}
