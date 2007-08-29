/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.providers.http.config;

import org.mule.config.spring.parsers.generic.MuleChildDefinitionParser;
import org.mule.providers.http.HttpConnector;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Reigsters a Bean Definition Parser for handling <code><http:connector></code> elements.
 */
public class HttpNamespaceHandler extends NamespaceHandlerSupport
{
    public void init()
    {
        registerBeanDefinitionParser("connector", new MuleChildDefinitionParser(HttpConnector.class, true));
    }

}
