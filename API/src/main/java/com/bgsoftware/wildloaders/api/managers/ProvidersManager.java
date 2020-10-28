package com.bgsoftware.wildloaders.api.managers;

import com.bgsoftware.wildloaders.api.hooks.ClaimsProvider;
import com.bgsoftware.wildloaders.api.hooks.TickableProvider;

public interface ProvidersManager {

    /**
     * Add a claims provider to the plugin.
     * @param claimsProvider The claims provider to add.
     */
    void addClaimsProvider(ClaimsProvider claimsProvider);

    /**
     * Add a tickable provider to the plugin.
     * @param tickableProvider The tickable provider to add.
     */
    void addTickableProvider(TickableProvider tickableProvider);

}
