package org.tperuch;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class ExpenseValidatorCli implements QuarkusApplication {
    @Inject
    ExpenseValidator validator;

    @Override
    public int run(String... args) throws Exception {
        if(args.length !=1){
            throw new IllegalArgumentException("The command requires 1 argument");
        }
        try{
            int amountValue = Integer.parseInt(args[0]);

            if(validator.isValidAmount(amountValue)){
                System.out.println("valid amount: " + amountValue);
                return 0;
            }

            System.out.println("invalid amount: " + amountValue);
            return 0;
        }catch (NumberFormatException ex){
            throw new IllegalArgumentException("The argument must be a integer");
        }
    }
}
