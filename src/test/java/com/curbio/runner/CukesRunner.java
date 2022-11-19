package com.curbio.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/feature" ,
        glue = "com/curbio/step_definition",
        dryRun = false,
        tags = "@smoke"
)

public class CukesRunner {
}
