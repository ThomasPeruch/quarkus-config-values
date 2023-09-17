package org.tperuch;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "expense")
public interface ExpenseConfiguration {

    @WithDefault("false")
    boolean debugEnabled();

    int rangeHigh();

    int rangeLow();
}
