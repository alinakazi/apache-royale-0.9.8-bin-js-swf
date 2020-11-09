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

package org.apache.royale.swf.types;

/**
 * Edge records have a TypeFlag of 1. There are two types of edge records:
 * straight and curved. The StraightFlag determines the type.
 */
public abstract class EdgeRecord extends ShapeRecord
{
    /**
     * The maximum value that an EdgeRecord delta can take in SWF.
     * <p>
     * This limit arises due to the SWF encoding format of a Shape's EdgeRecord.
     * A delta is encoded using a specified bit length, however, the number of
     * bits used to record this bit length (minus 2) is restricted to 4 bits,
     * which is 15 + 2 = 17 bits for unsigned, or 16 bits for signed.
     * <p>
     * This restricts the signed delta values to 65535 twips.
     */
    public static final int MAX_DELTA_IN_TWIPS = 65535;

    protected EdgeRecord(ShapeRecordType type)
    {
        super(type);
    }
}
