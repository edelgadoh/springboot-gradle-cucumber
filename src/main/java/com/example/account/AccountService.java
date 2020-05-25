package com.example.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public void executeRule(){
        List<AccountEntity> accountEntityList = accountRepository.findAllByTypeIsNot(AccountType.FREE);
        accountEntityList.stream().forEach(accountEntity -> {
            accountEntity.setAmount(accountEntity.getAmount().subtract(BigDecimal.TEN));
            accountRepository.save(accountEntity);
        });
    }

}
