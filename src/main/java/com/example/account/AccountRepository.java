package com.example.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    Optional<AccountEntity> findByOwner(String owner);
    List<AccountEntity> findAllByTypeIsNot(AccountType accountType);
}