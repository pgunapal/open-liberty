/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.microprofile.telemetry.internal_fat.apps.telemetry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import componenttest.app.FATServlet;
import io.opentelemetry.api.baggage.Baggage;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/BaggageServlet")
public class BaggageServlet extends FATServlet {

    @Inject
    private Baggage baggage;

    @Test
    public void current_empty() {
        try (Scope scope = Context.root().makeCurrent()) {
            assertEquals(Baggage.current(), Baggage.empty());
        }
    }

    @Test
    public void current() {
        try (Scope scope = Context.root().with(Baggage.builder().put("foo", "bar").build()).makeCurrent()) {
            Baggage result = Baggage.current();
            assertEquals(result.getEntryValue("foo"), "bar");
        }
    }

}