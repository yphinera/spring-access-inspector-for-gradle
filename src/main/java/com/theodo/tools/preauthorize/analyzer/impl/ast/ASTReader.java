package com.theodo.tools.preauthorize.analyzer.impl.ast;

import lombok.extern.slf4j.Slf4j;
import spoon.Launcher;
import spoon.reflect.CtModel;

import java.io.File;

@Slf4j
public class ASTReader {
    public static CtModel readAst(File gradleFile) {
        try {
            log.info("🌱 Analyzing Module directory '{}' with POM {}", gradleFile.getParentFile().getName(), "file://" + gradleFile.getAbsolutePath());
            Launcher launcher = new Launcher();
            launcher.getEnvironment().setNoClasspath(true);
            launcher.getEnvironment().setIgnoreDuplicateDeclarations(true);
            launcher.addInputResource(gradleFile.getParent());
            return launcher.buildModel();
        } finally {
            log.info("🌱 Module has been read and Analyzed");
        }
    }
}
