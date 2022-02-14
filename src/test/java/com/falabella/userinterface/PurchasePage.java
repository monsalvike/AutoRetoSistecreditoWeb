package com.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePage {
    public static final Target CAMPOEMAIL = Target.the("campo correo").located(By.id("emailAddress"));
    public static final  Target BTNCONTINUAREMAIL = Target.the("btn continuar email").located(By.xpath("//*[contains(@class,'fbra_button fbra_test_button fbra_emailInputForm__submitButton fbra_test_emailInputForm__submitButton')]"));
    public static final Target LISTDEPARTAMENTO = Target.the("btn depto").located(By.id("region"));
    public static final Target LISTCIUDAD = Target.the("btn municipio").located(By.id("ciudad"));
    public static final Target LISTBARRIO = Target.the("btn comuna").located(By.id("comuna"));
    public static  final Target BTNCONTINUACOMPRA = Target.the("btn continuar compra").located(By.xpath("//*[contains(@name,'field04')]"));
    public static final Target CAMPODIRECCION = Target.the("campo direccion").located(By.id("address"));
    public static final Target CAMPOCOMPLEMENTO = Target.the("campo torre").located(By.id("departmentNumber"));
    public static final Target BTNINGRESADIR = Target.the("btn ingresa direccion").located(By.xpath("//*[contains(@name,'useAddress')]"));
    public static final Target BTNIRAPAGAR = Target.the("btn ir a pagar").located(By.
            xpath("//*[contains(@class,'fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton')]"));
    public static final Target RESULT = Target.the("elige tu medio de pago").located(By.xpath("//*[contains(text(),'Elige tu medio de pago')]"));

}
