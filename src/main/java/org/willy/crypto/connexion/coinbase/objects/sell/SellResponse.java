package org.willy.crypto.connexion.coinbase.objects.sell;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.willy.crypto.connexion.coinbase.objects.PaginationCB;

import java.util.List;

/**
 *<strong>Coinbase sell list pagination ressource</strong>
 * Description <a href="https://docs.cloud.coinbase.com/sign-in-with-coinbase/docs/api-sells">Coinbase - sell list</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SellResponse {
    /**
     * Coinbase pagination basic structure
     * @see PaginationCB
     */
    private PaginationCB pagination;

    /**
     * Coinbase sell list
     * @see Sell
     */
    private List<Sell> data;
}