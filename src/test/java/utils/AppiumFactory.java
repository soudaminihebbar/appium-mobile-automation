package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import sun.tools.jar.CommandLine;

import java.io.File;

/**
 * Created by shebbar on 09/08/17.
 */
public class AppiumFactory {

    private static AppiumServiceBuilder service;

    static AppiumDriverLocalService appiumService;
    private static String appiumServiceUrl;

    public static void startAppiumServer() {

        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        appiumServiceUrl = appiumService.getUrl().toString();

        System.out.println("Appium service Address: " + appiumServiceUrl);

    }

    public static void stopAppiumServer() {
        System.out.println("Stopping driver");
        DriverFactory.androidDriver.quit();
        System.out.println("Stopping appium server");
        appiumService.stop();
    }
}
