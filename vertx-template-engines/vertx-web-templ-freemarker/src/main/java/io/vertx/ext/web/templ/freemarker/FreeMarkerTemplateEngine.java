/*
 * Copyright 2016 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.ext.web.templ.freemarker;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.ext.web.templ.TemplateEngine;
import io.vertx.ext.web.templ.freemarker.impl.FreeMarkerTemplateEngineImpl;

/**
 * A template engine that uses the FreeMarker library.
 *
 * @author <a href="mailto:plopes@redhat.com">Paulo Lopes</a>
 */
@VertxGen
public interface FreeMarkerTemplateEngine extends TemplateEngine {
  /**
   * Default max number of templates to cache
   */
  int DEFAULT_MAX_CACHE_SIZE = 10000;

  /**
   * Default template extension
   */
  String DEFAULT_TEMPLATE_EXTENSION = "ftl";

  /**
   * Create a template engine using defaults
   *
   * @return  the engine
   */
  static FreeMarkerTemplateEngine create() {
    return new FreeMarkerTemplateEngineImpl();
  }

  /**
   * Set the extension for the engine
   *
   * @param extension  the extension
   * @return a reference to this for fluency
   */
  @Fluent
  FreeMarkerTemplateEngine setExtension(String extension);

  /**
   * Set the max cache size for the engine
   *
   * @param maxCacheSize  the maxCacheSize
   * @return a reference to this for fluency
   */
  @Fluent
  FreeMarkerTemplateEngine setMaxCacheSize(int maxCacheSize);
}
