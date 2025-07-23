# CD performance patterns (branch Caching)

This branch tests the effects on caching the build artifacts.

The application contains 11 popular java libraries to download and compile.

The [build executed without cache](https://gitlab.com/francesco.urdih/cicd-performance-patterns/-/jobs/10769183090) on a GitLab runner took 51 seconds.

The [build executed with cache](https://gitlab.com/francesco.urdih/cicd-performance-patterns/-/jobs/10769251569) on a GitLab runner took 48 seconds.

Most of the jobs' time is spent configuring the GitLab runner (ca. 40 seconds), therefore the time is only partially reduced with cache.
