package org.willy.crypto.connexion.coinbase.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.willy.crypto.connexion.coinbase.objects.account.Account;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, String> {

    @Query("SELECT a from Account a where a.type <> 'fiat'")
    List<Account> findAllNoneFiatAccounts(Sort sort);
}
