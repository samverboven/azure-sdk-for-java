// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ValidateResourceTypes. */
public final class ValidateResourceTypes extends ExpandableStringEnum<ValidateResourceTypes> {
    /** Static value ServerFarm for ValidateResourceTypes. */
    public static final ValidateResourceTypes SERVER_FARM = fromString("ServerFarm");

    /** Static value Site for ValidateResourceTypes. */
    public static final ValidateResourceTypes SITE = fromString("Site");

    /**
     * Creates or finds a ValidateResourceTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ValidateResourceTypes.
     */
    @JsonCreator
    public static ValidateResourceTypes fromString(String name) {
        return fromString(name, ValidateResourceTypes.class);
    }

    /** @return known ValidateResourceTypes values. */
    public static Collection<ValidateResourceTypes> values() {
        return values(ValidateResourceTypes.class);
    }
}