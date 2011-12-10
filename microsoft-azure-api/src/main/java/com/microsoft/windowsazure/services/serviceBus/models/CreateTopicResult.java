/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.microsoft.windowsazure.services.serviceBus.models;

/**
 * Represents the result of a <code>createTopic</code> operation.
 */
public class CreateTopicResult {

    private TopicInfo value;

    /**
     * Creates an instance of the <code>CreateTopicResult</code> class.
     * 
     * @param value
     *            A {@link TopicInfo} object assigned as the value of the result.
     */
    public CreateTopicResult(TopicInfo value) {
        this.setValue(value);
    }

    /**
     * Specfies the value of the result.
     * 
     * @param value
     *            A {@link TopicInfo} object assigned as the value of the result.
     */
    public void setValue(TopicInfo value) {
        this.value = value;
    }

    /**
     * Returns the value of the result.
     * 
     * @return A {@link TopicInfo} object that represents the value of the result.
     */
    public TopicInfo getValue() {
        return value;
    }

}
