/*
 * #%L
 * Software Transactional Memory Example using Multiverse
 * %%
 * Copyright (C) 2012 - 2015 Java Creed
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.javacreed.examples.multiverse.part3;

public class PojoAccount {

  private final long lastUpdate;
  private final int balance;

  public PojoAccount(final int balance) {
    lastUpdate = System.currentTimeMillis();
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public long getLastUpdate() {
    return lastUpdate;
  }

  @Override
  public String toString() {
    return String.format("%d (as of %tF %<tT)", balance, lastUpdate);
  }
}
