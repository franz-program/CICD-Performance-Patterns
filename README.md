# Repository for the work "Performance Patterns for CI/CD Pipelines"
## Authors: Francesco Urdih, Theodoros Theodoropoulos, and Uwe Zdun

### Abstract

Continuous Integration and Continuous Deployment (CI/CD) pipelines constitute an important aspect of modern software development, automating workflows to enable frequent integration, rapid feedback, and reliable software releases. The performance of these pipelines directly influences the speed and efficiency of the software delivery lifecycle, making optimization essential as development projects need to scale. This paper explores 9 foundational performance patterns that address key forces such as pipeline speed, resource efficiency, and scalability. The patterns deal with, among other things, reducing inefficiencies when running the pipeline and increasing the usage of available resources. One common strategy employed in the patterns to address inefficiency is reducing the number of tasks executed in the pipeline. Our pattern mining study draws upon a dataset from an empirical analysis of 31 grey literature sources, exploring practitioner perspectives on enhancing CI/CD pipeline performance. To find known uses of the presented patterns, we analyze multiple mature GitLab and GitHub repositories in depth. This catalog can be employed by practitioners and researchers for the improvement of existing CI/CD systems or when designing new ones.

### Repository

In this repository, the GitHub-related code snippets from the paper are tested. 
Each pattern is tested on its own branch.

### Links

- [Here](https://zenodo.org/records/14747352) you can find the replication package of the study.
- [Here](https://gitlab.com/francesco.urdih/cicd-performance-patterns) you can find the equivalent repository on GitLab, with GitLab-related snippets.
