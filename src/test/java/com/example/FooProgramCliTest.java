package com.example;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.Test;

public class FooProgramCliTest {

  @Test
  public void fail() {
    org.junit.Assert.fail("Forced failure");
  }

}
