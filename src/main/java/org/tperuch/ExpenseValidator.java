package org.tperuch;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class ExpenseValidator {
    @ConfigProperty(name = "debug-enabled", defaultValue = "false")
    private boolean debug;

    @ConfigProperty(name = "range-high")
    private int targetRangeHigh;

    @ConfigProperty(name = "range-low")
    private int targetRangeLow;

    public void debugRanges(){
        System.out.println("High range = " +targetRangeHigh);
        System.out.println("Low range = " +targetRangeLow);
    }

    public boolean isValidAmount(int amount) {
        if(debug){
            debugRanges();
        }

        return amount >= targetRangeLow && amount <= targetRangeHigh;
    }
}
