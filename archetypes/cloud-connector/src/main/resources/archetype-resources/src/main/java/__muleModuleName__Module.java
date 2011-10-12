/**
 * Mule Development Kit
 * Copyright 2010-2011 (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
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

/**
 * This file was automatically generated by the Mule Development Kit
 */
#set($D='$')
#set($moduleNameLower = "${muleModuleName.toLowerCase()}")
#set($moduleGroupIdPath = $groupId.replace(".", "/"))
package ${package};

import org.mule.api.annotations.Module;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Processor;

/**
 * Module
 *
 * @author MuleSoft, Inc.
 */
@Module(name="${moduleNameLower}", schemaVersion="${version}")
public class ${muleModuleName}Module
{
    /**
     * Configurable
     */
    @Configurable
    private String myProperty;

    /**
     * Set property
     *
     * @param myProperty My property
     */
    public void setMyProperty(String myProperty)
    {
        this.myProperty = myProperty;
    }

    /**
     * Custom processor
     *
     * {@sample.xml doc/${moduleNameLower}-connector.xml.sample ${moduleNameLower}:my-processor}
     *
     * @param content Content to be processed
     * @return Some string
     */
    @Processor
    public String myProcessor(String content)
    {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */

        return content;
    }
}
