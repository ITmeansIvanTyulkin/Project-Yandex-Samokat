package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Honor MagicBook Pro\\Documents\\MEGA\\JavaProjects\\Driver for google browser\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
}
