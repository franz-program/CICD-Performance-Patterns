# CD performance patterns (branch Parallelization)

This branch tests one way to achieve parallelization: using multiple jobs in the same stage

The application contains two tests with an execution time of 10 seconds each. 

The [tests executed serially](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16447319354) on a GitHub runner took 42 seconds.

The [tests executed in parallel](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16447417108) by two different jobs took 33 seconds.

Most of the jobs' time is spent configuring the GitHub runner (ca. 20 seconds), therefore the time is only partially reduced with parallelism.
