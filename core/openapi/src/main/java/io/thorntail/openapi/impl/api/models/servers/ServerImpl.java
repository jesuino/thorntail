/**
 * Copyright 2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.thorntail.openapi.impl.api.models.servers;

import io.thorntail.openapi.impl.api.models.ExtensibleImpl;
import org.eclipse.microprofile.openapi.models.servers.Server;
import org.eclipse.microprofile.openapi.models.servers.ServerVariables;
import io.thorntail.openapi.impl.api.models.ModelImpl;

/**
 * An implementation of the {@link Server} OpenAPI model interface.
 */
public class ServerImpl extends ExtensibleImpl implements Server, ModelImpl {

    private String url;

    private String description;

    private ServerVariables variables;

    /**
     * @see Server#getUrl()
     */
    @Override
    public String getUrl() {
        return this.url;
    }

    /**
     * @see Server#setUrl(String)
     */
    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @see Server#url(String)
     */
    @Override
    public Server url(String url) {
        this.url = url;
        return this;
    }

    /**
     * @see Server#getDescription()
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * @see Server#setDescription(String)
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @see Server#description(String)
     */
    @Override
    public Server description(String description) {
        this.description = description;
        return this;
    }

    /**
     * @see Server#getVariables()
     */
    @Override
    public ServerVariables getVariables() {
        return this.variables;
    }

    /**
     * @see Server#setVariables(ServerVariables)
     */
    @Override
    public void setVariables(ServerVariables variables) {
        this.variables = variables;
    }

    /**
     * @see Server#variables(ServerVariables)
     */
    @Override
    public Server variables(ServerVariables variables) {
        this.variables = variables;
        return this;
    }

}