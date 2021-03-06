package com.stacktoheap.go.docker;

import java.nio.file.Paths;
import java.util.Map;

public class Context {
    private final Map environmentVariables;
    private final String workingDir;

    public Context(Map context) {
        environmentVariables = (Map) context.get("environmentVariables");
        workingDir = (String) context.get("workingDirectory");
    }

    public Map getEnvironmentVariables() {
        return environmentVariables;
    }

    public String getPipelineLabel() {
        return environmentVariables.get("GO_PIPELINE_LABEL").toString();
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public String getAbsoluteWorkingDir() {
        return Paths.get("").toAbsolutePath().resolve(workingDir).toString();
    }
}
