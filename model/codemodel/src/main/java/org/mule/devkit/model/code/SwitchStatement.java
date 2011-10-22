/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package org.mule.devkit.model.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Switch statement
 */
public final class SwitchStatement implements Statement {

    /**
     * Test part of switch statement.
     */
    private Expression test;

    /**
     * vector of JCases.
     */
    private List<CaseStatement> cases = new ArrayList<CaseStatement>();

    /**
     * a single default case
     */
    private CaseStatement defaultCase = null;

    /**
     * Construct a While statment
     */
    SwitchStatement(Expression test) {
        this.test = test;
    }

    public Expression test() {
        return test;
    }

    public Iterator<CaseStatement> cases() {
        return cases.iterator();
    }

    public CaseStatement _case(Expression label) {
        CaseStatement c = new CaseStatement(label);
        cases.add(c);
        return c;
    }

    public CaseStatement _default() {
        // what if (default != null) ???

        // default cases statements don't have a label
        defaultCase = new CaseStatement(null, true);
        return defaultCase;
    }

    public void state(Formatter f) {
        if (Op.hasTopOp(test)) {
            f.p("switch ").g(test).p(" {").nl();
        } else {
            f.p("switch (").g(test).p(')').p(" {").nl();
        }
        for (CaseStatement c : cases) {
            f.s(c);
        }
        if (defaultCase != null) {
            f.s(defaultCase);
        }
        f.p('}').nl();
    }

}
