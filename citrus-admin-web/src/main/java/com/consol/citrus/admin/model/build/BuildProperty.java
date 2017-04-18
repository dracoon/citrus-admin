/*
 * Copyright 2006-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.consol.citrus.admin.model.build;

/**
 * @author Christoph Deppisch
 * @since 2.6
 */
public class BuildProperty {

    protected String name;
    protected String value;

    /**
     * Default constructor.
     */
    public BuildProperty() {
        super();
    }

    /**
     * Constructor using fields.
     * @param name
     * @param value
     */
    public BuildProperty(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name property.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of the value property.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value property.
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
