package com.bank.accounts.repository;

import com.bank.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Integer> {
    Optional<Accounts> findByCustomerId(int id);
    @Transactional
    @Modifying
    void deleteByCustomerId(int id);
}
