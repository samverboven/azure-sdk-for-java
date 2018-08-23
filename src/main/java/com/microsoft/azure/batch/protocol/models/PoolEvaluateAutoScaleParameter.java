/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for evaluating an automatic scaling formula on a pool.
 */
public class PoolEvaluateAutoScaleParameter {
    /**
     * The formula for the desired number of compute nodes in the pool.
     * The formula is validated and its results calculated, but it is not
     * applied to the pool. To apply the formula to the pool, 'Enable automatic
     * scaling on a pool'. For more information about specifying this formula,
     * see Automatically scale compute nodes in an Azure Batch pool
     * (https://azure.microsoft.com/en-us/documentation/articles/batch-automatic-scaling).
     */
    @JsonProperty(value = "autoScaleFormula", required = true)
    private String autoScaleFormula;

    /**
     * Get the formula is validated and its results calculated, but it is not applied to the pool. To apply the formula to the pool, 'Enable automatic scaling on a pool'. For more information about specifying this formula, see Automatically scale compute nodes in an Azure Batch pool (https://azure.microsoft.com/en-us/documentation/articles/batch-automatic-scaling).
     *
     * @return the autoScaleFormula value
     */
    public String autoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * Set the formula is validated and its results calculated, but it is not applied to the pool. To apply the formula to the pool, 'Enable automatic scaling on a pool'. For more information about specifying this formula, see Automatically scale compute nodes in an Azure Batch pool (https://azure.microsoft.com/en-us/documentation/articles/batch-automatic-scaling).
     *
     * @param autoScaleFormula the autoScaleFormula value to set
     * @return the PoolEvaluateAutoScaleParameter object itself.
     */
    public PoolEvaluateAutoScaleParameter withAutoScaleFormula(String autoScaleFormula) {
        this.autoScaleFormula = autoScaleFormula;
        return this;
    }

}
