/*
IntelliJ IDEA 2024.1.1 (Community Edition)
Build #IC-241.15989.150, built on April 29, 2024
@Author FX504GE a.k.a. Imam FR
Java Developer
Created on 16/05/2024 2:18 AM
@Last Modified 16/05/2024 2:18 AM
Version 1.0
*/

package com.juaracoding.ifrujian5.ujian5;

import org.testng.TestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RunnerUjian {
    public static void main(String[] args) {
        String rootProject = System.getProperty("user.dir");
        TestNG runner = new TestNG();
        runner.setOutputDirectory(rootProject + "\\output-testng\\rest-assured\\" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy-HHmmss")));
        List<String> suitefiles = new ArrayList<String>();
        suitefiles.add(rootProject + "\\loadrunner.xml");
        runner.setTestSuites(suitefiles);
        runner.run();
    }
}
