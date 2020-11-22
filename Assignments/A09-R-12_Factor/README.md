# SI Assignment 09 - Reading Task - 12 Factor
 - [Task](https://datsoftlyngby.github.io/soft2020fall/resources/80748096-A9-12-Factor-App.pdf)


Overall this assignment felt abit wierd, since there's a reason for the chosen priotrity.

Nonetheless i've made a few changes to it, where i've weighted some of the config stuff abit higher.


|#|Factor|Desc|
|:-:|-|-|
| 5 | Build, release, run | The delivery pipeline should strictly consist of build, release, run.  |
| 11 | Logs |  Applications should produce logs as event streams and leave the execution environment to aggregate. |
| 1 | Codebase | There should be exactly one codebase for a deployed service with the codebase being used for many deployments. |
| 2 | Dependencies | All dependencies should be declared, with no implicit reliance on system tools or libraries. |
| 10 | Dev/prod parity | All environments should be as similar as possible. |
| 3 | Config | Configuration that varies between deployments should be stored in the environment. |
| 7 | Port Binding | 	Self-contained services should make themselves available to other services by specified ports. |
| 4 | Backing Services | All backing services are treated as attached resources and attached and detached by the execution environment. |
| 12 | Admin Processes | Any needed admin tasks should be kept in source control and packaged with the application. |
| 6 | Processes | Applications should be deployed as one or more stateless processes with persisted data stored on a backing service. |
| 9 | Disposability | Fast startup and shutdown are advocated for a more robust and resilient system. |
| 8 | Concurrency | Concurrency is advocated by scaling individual processes. |




 

 

 




 

 

 

 

 


 