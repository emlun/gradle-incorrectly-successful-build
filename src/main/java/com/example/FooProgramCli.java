package com.example;

import java.util.function.Supplier;

public class FooProgramCli {

  private static void doCommandlineSetup() { /* ... */ }

  public static void main(String[] args) {
    doCommandlineSetup();

    new FooProgramCli().execute(
      args,
      () -> new FooProgramDaemon() {},
      () -> new FooProgram() {}
    );
  }

  public void execute(
      String[] args,
      Supplier<FooProgramDaemon> daemon,
      Supplier<FooProgram> foreground
  ) {
    if (isDaemonMode(args)) {
      daemon.get().main(args);
    } else {
      System.exit(foreground.get().main(args));
    }
  }

  private static boolean isDaemonMode(String[] args) {
    return false;
  }

}
