package com.example;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.Test;

public class FooProgramCliTest {

  @Test
  public void testStartDaemonMode() {
    FooProgramDaemon daemon = mock(FooProgramDaemon.class);
    FooProgram foreground = mock(FooProgram.class);

    new FooProgramCli().execute(new String[]{ "--daemon" }, () -> daemon, () -> foreground);

    verify(daemon, only()).main(any());
    verifyZeroInteractions(foreground);
  }

  @Test
  public void fail() {
    org.junit.Assert.fail("Forced failure");
  }

}
