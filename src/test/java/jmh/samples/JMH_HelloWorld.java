package jmh.samples;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class JMH_HelloWorld {

    @Benchmark
    public void helloJmh() {
    }

    public static void main(String[] args) throws RunnerException {
        var options = new OptionsBuilder() //
                .include(JMH_HelloWorld.class.getSimpleName()) //
                .forks(1) //
                .build();
        new Runner(options).run();
    }
}