package com.raphael.repository;

import com.raphael.exception.NoFundsEnoughException;
import com.raphael.model.AccountWallet;
import com.raphael.model.Money;
import com.raphael.model.MoneyAudit;
import com.raphael.model.Wallet;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import static com.raphael.model.BankService.ACCOUNT;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class CommonsRepository {

    public static void checkFundsForTransaction(final Wallet source, final long amount){
        if (source.getFunds() < amount){
            throw new NoFundsEnoughException("Sua conta não tem dinheiro o suficiente para realizar essa transação");
        }
    }

    public static List<Money> generateMoney(final UUID transactionId, final long funds, final String description){
        var history = new MoneyAudit(transactionId, ACCOUNT, description, OffsetDateTime.now());
        return Stream.generate(() -> new Money(history)).limit(funds).toList();

    }

}
