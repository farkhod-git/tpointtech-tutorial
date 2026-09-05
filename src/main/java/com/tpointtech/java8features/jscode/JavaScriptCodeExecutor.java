package com.tpointtech.java8features.jscode;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptCodeExecutor {
    static void main() throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        // nashorn added in 1.8
        // and deprecated in 15
        // (add dependency to execute)
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        nashorn.eval("print('Hello World!')");


    }
}
