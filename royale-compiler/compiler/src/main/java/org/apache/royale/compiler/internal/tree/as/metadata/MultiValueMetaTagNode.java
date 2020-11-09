/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.royale.compiler.internal.tree.as.metadata;

import org.apache.royale.compiler.tree.metadata.IMultiValueMetaTagNode;
import org.apache.royale.utils.CheapArray;

public class MultiValueMetaTagNode extends MetaTagNode implements IMultiValueMetaTagNode
{
    private static final String[] EMPTY_STRING = new String[0];

    private Object values;

    /**
     * Constructor.
     * 
     * @param name The name of the metadata tag.
     */
    public MultiValueMetaTagNode(String name)
    {
        super(name);
        values = CheapArray.create(3);
    }

    /**
     * Copy constructor.
     * 
     * @param other The other node.
     */
    public MultiValueMetaTagNode(MetaTagNode other)
    {
        super(other);
    }

    @Override
    public void normalize(boolean fillInOffsets)
    {
        super.normalize(fillInOffsets);
        values = CheapArray.optimize(values, EMPTY_STRING);
    }

    @Override
    public String[] getValues()
    {
        return (String[])CheapArray.toArray(values, EMPTY_STRING);
    }

    public void addValue(String value)
    {
        addToMap(null, value);
        CheapArray.add(value, values);
    }
}
