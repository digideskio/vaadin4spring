/*
 * Copyright 2015 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.spring.sidebar.annotation;

import org.springframework.context.annotation.Import;
import org.vaadin.spring.sidebar.config.SideBarConfiguration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Add this annotation to your application configuration to enable the {@link org.vaadin.spring.sidebar.components.AccordionSideBar}
 * component. After that, just inject the side bar into your UIs. The side bar uses {@link org.vaadin.spring.i18n.I18N}, so remember
 * {@link org.vaadin.spring.i18n.annotation.EnableI18N enable} it as well, unless you are using auto configuration.
 *
 * @author Petter Holmström (petter@vaadin.com)
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SideBarConfiguration.class)
public @interface EnableSideBar {
}
