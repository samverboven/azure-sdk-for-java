/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error encountered by the Batch service when deleting a certificate.
 */
public class DeleteCertificateError {
    /**
     * An identifier for the certificate deletion error. Codes are invariant
     * and are intended to be consumed programmatically.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * A message describing the certificate deletion error, intended to be
     * suitable for display in a user interface.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * A list of additional error details related to the certificate deletion
     * error.
     * This list includes details such as the active pools and nodes
     * referencing this certificate. However, if a large number of resources
     * reference the certificate, the list contains only about the first
     * hundred.
     */
    @JsonProperty(value = "values")
    private List<NameValuePair> values;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the DeleteCertificateError object itself.
     */
    public DeleteCertificateError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the DeleteCertificateError object itself.
     */
    public DeleteCertificateError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get this list includes details such as the active pools and nodes referencing this certificate. However, if a large number of resources reference the certificate, the list contains only about the first hundred.
     *
     * @return the values value
     */
    public List<NameValuePair> values() {
        return this.values;
    }

    /**
     * Set this list includes details such as the active pools and nodes referencing this certificate. However, if a large number of resources reference the certificate, the list contains only about the first hundred.
     *
     * @param values the values value to set
     * @return the DeleteCertificateError object itself.
     */
    public DeleteCertificateError withValues(List<NameValuePair> values) {
        this.values = values;
        return this;
    }

}
