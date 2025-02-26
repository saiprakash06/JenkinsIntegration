package org.sai.testRunner;


import io.cucumber.core.cli.Main;

public class WithOutTestNG {

    public static void main(String[] args) {

        String[] cucumberOptions = {"-g", "org.sai.glueCode","-g","org.sai.Hooks",
                "src/test/resources/FeatureFiles/",
                "--threads", "2"};

        Main.run(cucumberOptions);


    }


}
