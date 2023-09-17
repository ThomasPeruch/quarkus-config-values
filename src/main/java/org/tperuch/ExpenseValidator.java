package org.tperuch;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class ExpenseValidator {

    @Inject
    ExpenseConfiguration configuration;

    public void debugRanges(){
        System.out.println("High range = " +configuration.rangeHigh());
        System.out.println("Low range = " +configuration.rangeLow());
    }

    public boolean isValidAmount(int amount) {
        if(configuration.debugEnabled()){
            debugRanges();
        }

        return amount >= configuration.rangeLow() && amount <= configuration.rangeHigh();
    }
}
