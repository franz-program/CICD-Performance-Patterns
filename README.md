# CI/CD performance patterns (branch incremental-build)

This branch tests the effects on incrementally building an application.

The application contains popular java libraries to download and compile.

The [build executed from scratch](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16466906854) on a GitHub runner took 71 seconds.

The [build executed incrementally](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16466943261) on a GitHub runner took 65 seconds.

Most of the jobs' time is spent configuring the GitHub runner (ca. 40 seconds), therefore the time is only partially reduced with cache.
