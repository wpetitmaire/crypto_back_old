package org.willy.crypto.connexion.coinbase.objects.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class DetailTransaction {

    @Column(name = "detail_transaction_title")
    private String title;

    @Column(name = "detail_transaction_subtitle")
    private String subtitle;

    @Column(name = "detail_transaction_header")
    private String header;

    @Column(name = "detail_transaction_health")
    private String health;

    @Column(name = "detail_transaction_payment_method_name")
    private String payment_method_name;
}
