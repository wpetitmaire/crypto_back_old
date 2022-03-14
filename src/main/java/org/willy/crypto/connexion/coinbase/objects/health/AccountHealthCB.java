package org.willy.crypto.connexion.coinbase.objects.health;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountHealthCB {
    String accountId;
    BigDecimal unitPrice;
    BigDecimal unitPriceDeltaVariation;
    BigDecimal amount;
    BigDecimal amountPrice;
    BigDecimal amountPriceDeltaVariation;
}
