# cache-error
error with spring cloud issue https://github.com/spring-cloud/spring-cloud-commons/issues/1193
## steps to produce the error 
1. `mvn clean native:compile -Pnative`

```
[2/7] Performing analysis...  [*]                                                                      (105.8s @ 1.54GB)
  15,044 (90.13%) of 16,691 classes reachable
  22,312 (62.51%) of 35,695 fields reachable
  69,477 (58.89%) of 117,986 methods reachable
     940 classes,   315 fields, and 3,727 methods registered for reflection

Error: Classes that should be initialized at run time got initialized during image building:
 ch.qos.logback.core.util.StatusPrinter was unintentionally initialized at build time. To see why ch.qos.logback.core.util.StatusPrinter got initialized use --trace-class-initialization=ch.qos.logback.core.util.StatusPrinter
ch.qos.logback.classic.Logger was unintentionally initialized at build time. To see why ch.qos.logback.classic.Logger got initialized use --trace-class-initialization=ch.qos.logback.classic.Logger
ch.qos.logback.classic.Level was unintentionally initialized at build time. To see why ch.qos.logback.classic.Level got initialized use --trace-class-initialization=ch.qos.logback.classic.Level
ch.qos.logback.core.status.StatusBase was unintentionally initialized at build time. To see why ch.qos.logback.core.status.StatusBase got initialized use --trace-class-initialization=ch.qos.logback.core.status.StatusBase
ch.qos.logback.core.util.Loader was unintentionally initialized at build time. To see why ch.qos.logback.core.util.Loader got initialized use --trace-class-initialization=ch.qos.logback.core.util.Loader
ch.qos.logback.core.CoreConstants was unintentionally initialized at build time. To see why ch.qos.logback.core.CoreConstants got initialized use --trace-class-initialization=ch.qos.logback.core.CoreConstants
ch.qos.logback.core.status.InfoStatus was unintentionally initialized at build time. To see why ch.qos.logback.core.status.InfoStatus got initialized use --trace-class-initialization=ch.qos.logback.core.status.InfoStatus
org.slf4j.LoggerFactory was unintentionally initialized at build time. To see why org.slf4j.LoggerFactory got initialized use --trace-class-initialization=org.slf4j.LoggerFactory
To see how the classes got initialized, use --trace-class-initialization=ch.qos.logback.core.util.StatusPrinter,ch.qos.logback.classic.Logger,ch.qos.logback.classic.Level,ch.qos.logback.core.status.StatusBase,ch.qos.logback.core.util.Loader,ch.qos.logback.core.CoreConstants,ch.qos.logback.core.status.InfoStatus,org.slf4j.LoggerFactory
Error: Use -H:+ReportExceptionStackTraces to print stacktrace of underlying exception
```
