# CI/CD performance patterns (branch selective-testing)

This branch tests the effects of selective testing.

The application uses [bazel](https://bazel.build/docs) as build/test tool, which detects changes in an application and only runs again the tests
that are affected by the changes. The tool results are cached and saved for future workflow runs.
To see the effects of the selective testing, the application contains two tests that take 5 seconds each. A first commit is made to build the cache and a second commit is then made, without modifying the tests.


The [tests on the first commit](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16469966064/job/46556454412) took 64 seconds.

The [tests on the second commit](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16469998232/job/46556558973) took 32 seconds. 
Furthermore, in the [second commit logs](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16469998232/job/46556558973#step:5:76), _Bazel_ indicates that the tests are not run but the cached results are used.

Most of the time is spent configuring the GitHub runner, therefore the test time is only partially reduced.
Furthermore, the time saved is more than 10 seconds, indicating that Bazel also uses the cache for build results (applying therefore also the incremental build pattern).