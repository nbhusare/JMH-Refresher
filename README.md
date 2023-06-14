# JMH-Refresher
## Why JMH?
- JMH stands for **Java Microbenchmarking Harness**
- It enables benchmarking and profiling of Java or other languages targeting JVM
- It is specifically designed for micro benchmarking - precise measurement of the performance of methods and small code snippets
- It allows customization of the benchmarking process using features like Benchmark modes, states, blackhole...etc.

## Setup
#Gradle
#Maven

## Java Doc (version - 1.36)
- https://javadoc.io/doc/org.openjdk.jmh/jmh-core/latest/org/openjdk/jmh/annotations/Benchmark.html

## Annotations
- @Benchmark
    - The annotation marks the benchmarking code
    - It is typically placed on a method or a class
    - The below happens after you add the annotation
        - JMH generates the bootstrapping code during compilation which is used while benchmarking
        - The method(s) are added to the benchmarking list
        - The environment is prepared for the benchmarking to run
    - The below constraints apply 
        - The method should be public
        - The method arguments may only include the `State` classes or infra. classes, like `Control` or `Blackhole`
        - Benchmark methods can declare Exceptions and Throwables. Any exception raised or thrown is treated as a bench failure.

- @BenchmarkMode
- @State
- @OutputTimeUnit
- 
## Blackhole

