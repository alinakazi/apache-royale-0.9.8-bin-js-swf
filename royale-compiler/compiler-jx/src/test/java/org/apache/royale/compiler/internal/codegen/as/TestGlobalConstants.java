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

package org.apache.royale.compiler.internal.codegen.as;

import org.apache.royale.compiler.internal.test.ASTestBase;
import org.apache.royale.compiler.tree.as.IVariableNode;
import org.junit.Test;

/**
 * @author Erik de Bruin
 */
public class TestGlobalConstants extends ASTestBase
{
    @Test
    public void testInfinity()
    {
        IVariableNode node = getField("var a:Number = Infinity;");
        asBlockWalker.visitVariable(node);
        assertOut("var a:Number = Infinity");
    }

    @Test
    public void testNegativeInfinity()
    {
        IVariableNode node = getField("var a:Number = -Infinity;");
        asBlockWalker.visitVariable(node);
        assertOut("var a:Number = -Infinity");
    }

    @Test
    public void testNaN()
    {
        IVariableNode node = getField("var a:Number = NaN;");
        asBlockWalker.visitVariable(node);
        assertOut("var a:Number = NaN");
    }

    @Test
    public void testUndefined()
    {
        IVariableNode node = getField("var a:* = undefined;");
        asBlockWalker.visitVariable(node);
        assertOut("var a:* = undefined");
    }
}
