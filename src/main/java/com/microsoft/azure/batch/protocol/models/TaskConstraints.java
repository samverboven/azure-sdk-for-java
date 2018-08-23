/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Execution constraints to apply to a task.
 */
public class TaskConstraints {
    /**
     * The maximum elapsed time that the task may run, measured from the time
     * the task starts. If the task does not complete within the time limit,
     * the Batch service terminates it.
     * If this is not specified, there is no time limit on how long the task
     * may run.
     */
    @JsonProperty(value = "maxWallClockTime")
    private Period maxWallClockTime;

    /**
     * The minimum time to retain the task directory on the compute node where
     * it ran, from the time it completes execution. After this time, the Batch
     * service may delete the task directory and all its contents.
     * The default is infinite, i.e. the task directory will be retained until
     * the compute node is removed or reimaged.
     */
    @JsonProperty(value = "retentionTime")
    private Period retentionTime;

    /**
     * The maximum number of times the task may be retried. The Batch service
     * retries a task if its exit code is nonzero.
     * Note that this value specifically controls the number of retries for the
     * task executable due to a nonzero exit code. The Batch service will try
     * the task once, and may then retry up to this limit. For example, if the
     * maximum retry count is 3, Batch tries the task up to 4 times (one
     * initial try and 3 retries). If the maximum retry count is 0, the Batch
     * service does not retry the task after the first attempt. If the maximum
     * retry count is -1, the Batch service retries the task without limit.
     * Resource files and application packages are only downloaded again if the
     * task is retried on a new compute node.
     */
    @JsonProperty(value = "maxTaskRetryCount")
    private Integer maxTaskRetryCount;

    /**
     * Get if this is not specified, there is no time limit on how long the task may run.
     *
     * @return the maxWallClockTime value
     */
    public Period maxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set if this is not specified, there is no time limit on how long the task may run.
     *
     * @param maxWallClockTime the maxWallClockTime value to set
     * @return the TaskConstraints object itself.
     */
    public TaskConstraints withMaxWallClockTime(Period maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
        return this;
    }

    /**
     * Get the default is infinite, i.e. the task directory will be retained until the compute node is removed or reimaged.
     *
     * @return the retentionTime value
     */
    public Period retentionTime() {
        return this.retentionTime;
    }

    /**
     * Set the default is infinite, i.e. the task directory will be retained until the compute node is removed or reimaged.
     *
     * @param retentionTime the retentionTime value to set
     * @return the TaskConstraints object itself.
     */
    public TaskConstraints withRetentionTime(Period retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * Get note that this value specifically controls the number of retries for the task executable due to a nonzero exit code. The Batch service will try the task once, and may then retry up to this limit. For example, if the maximum retry count is 3, Batch tries the task up to 4 times (one initial try and 3 retries). If the maximum retry count is 0, the Batch service does not retry the task after the first attempt. If the maximum retry count is -1, the Batch service retries the task without limit. Resource files and application packages are only downloaded again if the task is retried on a new compute node.
     *
     * @return the maxTaskRetryCount value
     */
    public Integer maxTaskRetryCount() {
        return this.maxTaskRetryCount;
    }

    /**
     * Set note that this value specifically controls the number of retries for the task executable due to a nonzero exit code. The Batch service will try the task once, and may then retry up to this limit. For example, if the maximum retry count is 3, Batch tries the task up to 4 times (one initial try and 3 retries). If the maximum retry count is 0, the Batch service does not retry the task after the first attempt. If the maximum retry count is -1, the Batch service retries the task without limit. Resource files and application packages are only downloaded again if the task is retried on a new compute node.
     *
     * @param maxTaskRetryCount the maxTaskRetryCount value to set
     * @return the TaskConstraints object itself.
     */
    public TaskConstraints withMaxTaskRetryCount(Integer maxTaskRetryCount) {
        this.maxTaskRetryCount = maxTaskRetryCount;
        return this;
    }

}
