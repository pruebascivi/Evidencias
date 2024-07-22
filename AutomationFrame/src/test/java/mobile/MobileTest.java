package mobile;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class MobileTest extends MobileTestBase {

    @Test
    @Parameters({"platformName"})
    public void exampleMobileTest(String platformName) {
        // Añadir acciones de prueba y aserciones para la aplicación móvil
    }
}
