/*
 * Created on Dec 26, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.error;

import static junit.framework.Assert.assertEquals;
import static org.fest.assertions.error.DoesNotContainString.*;

import org.fest.assertions.description.*;
import org.junit.Test;

/**
 * Tests for <code>{@link DoesNotContainString#create(Description)}</code>.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class DoesNotContainString_create_Test {

  private ErrorMessageFactory errorMessage;

  @Test public void should_create_error_message() {
    errorMessage = doesNotContain("Yoda", "Luke");
    String message = errorMessage.create(new TextDescription("Test"));
    assertEquals("[Test] expecting:<'Yoda'> to contain:<'Luke'>", message);
  }

  @Test public void should_create_error_message_when_ignoring_case() {
    errorMessage = doesNotContainIgnoringCase("Yoda", "Luke");
    String message = errorMessage.create(new TextDescription("Test"));
    assertEquals("[Test] expecting:<'Yoda'> to contain:<'Luke'> (ignoring case)", message);
  }
}
