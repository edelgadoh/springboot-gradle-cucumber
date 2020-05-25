package cucumber.entity;

import com.example.account.AccountEntity;
import com.example.account.AccountType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
public class AccountFileEntity {
    private String type;
    private String owner;
    private BigDecimal amount;
    private LocalDateTime lastUpdate;

    public AccountFileEntity(Map<String, String> entry) {
        type = entry.get("type");
        owner = entry.get("owner");
        amount = new BigDecimal(entry.get("amount"));
    }

    public AccountEntity parseToAccountEntity() {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setType(AccountType.valueOf(getType()));
        accountEntity.setOwner(getOwner());
        accountEntity.setAmount(getAmount());
        accountEntity.setLastUpdate(getLastUpdate());
        return accountEntity;
    }
}
