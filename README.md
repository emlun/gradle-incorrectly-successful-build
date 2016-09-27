Demo of Gradle failing to register failed tests
===

 1. Check out the `build-succeeds` tag and run `./gradlew clean test`.
    Notice how the build is marked as successful despite there being failed
    tests.

 2. Check out the `build-fails` tag and run `./gradlew clean test`.  Notice
    how the build is now correctly marked as unsuccessful.

 3. Look at the diff from `build-succeeds` to `build-fails`. With a little more
    work, we can conclude that the call to `System.exit(int)` prevents Gradle
    from registering the test failure. Refactoring the code to move this call
    out to the `static void main` method would resolve our problem.
