package com.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePage {
    public static final Target BTNCLOSECMR = Target.the("btn close add cmr").located(By.xpath("//*[contains(@class,'dy-lb-close')]"));
    public static final Target BTNCLOSEEXPERIENCE = Target.the("btn close experience").located(By.xpath("//*[contains(@id,'kplDeferButton')]"));
    public static final Target TEXTFIEDLEMAIL = Target.the("campo correo").located(By.id("emailAddress"));
    public static final  Target BTNCONTINUEEMAIL = Target.the("btn continuar email").located(By.xpath("//*[contains(@class,'fbra_button fbra_test_button fbra_emailInputForm__submitButton fbra_test_emailInputForm__submitButton')]"));
    public static final Target STATELIST = Target.the("btn depto").located(By.id("region"));
    public static final Target CITYLIST = Target.the("btn municipio").located(By.id("ciudad"));
    public static final Target NEIGHBORHOODLIST = Target.the("btn comuna").located(By.id("comuna"));
    public static  final Target BTNCONTINUEPURCHASE = Target.the("btn continuar compra").located(By.xpath("//*[contains(@name,'field04')]"));
    public static final Target TEXTFIELDADDRESS = Target.the("campo direccion").located(By.id("address"));
    public static final Target TEXTFIELDCOMPLEMENTADDRESS = Target.the("campo torre").located(By.id("departmentNumber"));
    public static final Target BTNINPUTADDRESS = Target.the("btn ingresa direccion").located(By.xpath("//*[contains(@name,'useAddress')]"));
    public static final Target BTNPAY = Target.the("btn ir a pagar").located(By.
            xpath("//*[contains(@class,'fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton')]"));
    public static final Target RESULT = Target.the("elige tu medio de pago").located(By.xpath("//*[contains(text(),'Elige tu medio de pago')]"));

}
