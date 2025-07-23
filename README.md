# CI/CD performance patterns (branch conditional-triggering)

This branch tests conditional triggers that runs jobs based on the committed files and the branch.

With no changes under _app/src_, [no pipeline is run](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16464574706), only the pre-checks on file changes.

With changes under _app/src_, [the build and test jobs run](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16464590151).

When the branch condition is added [the test and deploy jobs run](https://gitlab.com/francesco.urdih/cicd-performance-patterns/-/pipelines/1941428985).

With the branch condition and changes under _app/src_, [the build, test, and deploy jobs run](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16464634476).
