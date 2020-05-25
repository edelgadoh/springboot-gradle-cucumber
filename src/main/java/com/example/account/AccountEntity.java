package com.example.account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private Long id;

    @Column
    private AccountType type;

    @Column
    private String owner;

    @Column
    private BigDecimal amount;

    @Column
    private LocalDateTime lastUpdate;

    @PrePersist
    public void onPersist() {
        this.lastUpdate = LocalDateTime.now();
    }

}
