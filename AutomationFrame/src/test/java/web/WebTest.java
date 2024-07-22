package web;

import org.testng.annotations.Test;

public class WebTest extends WebTestBase {

    @Test
    public void exampleWebTest() {
        driver.get("https://www.example.com");
        // Añadir aserciones y acciones de prueba
    }
}
