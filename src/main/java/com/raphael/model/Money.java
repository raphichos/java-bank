package com.raphael.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Getter
public class Money {

    private final List<MoneyAudit> history = new ArrayList<>();

    public Money(final MoneyAudit history) {
        this.history.add(history);
    }

    public void addHistory(final MoneyAudit history){
        this.history.add(history);
    }

}
