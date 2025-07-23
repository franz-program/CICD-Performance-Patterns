# CI/CD performance patterns (branch mocked-external-services)

This branch tests the effects of mockups.

The application has a service that pings _www.google.com_ before doing some operations. 
The application is tested using the real service and using a mockup of the service.

To see the effects of mockups on performance, the tests loop for 200 times.


The [job without mockups](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16464880153/job/46539727851) took 49 seconds.

The [job with mockups](https://github.com/franz-program/CICD-Performance-Patterns/actions/runs/16464880153/job/46539727879) took 29 seconds.

Most of the jobs' time is spent configuring the GitHub runner (ca. 25 seconds), therefore the time is only partially reduced with mockups.