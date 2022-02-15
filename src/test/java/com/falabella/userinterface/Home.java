package com.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static final Target TEXTFIELDSEARCH = Target.the("campo buscar").located(By.id("testId-SearchBar-Input"));
    public static final Target BTNSEARCH = Target.the("btn Buscar").located(By.xpath("//*[contains(@class,'SearchBar-module_searchBtnIcon__6KVum')]"));
    public static final Target BTNADDCART = Target.the("btn agragar al carrito").located(By.xpath("//*[contains(@class,'jsx-2166277967 button button-primary button-primary-xtra-large')]"));
    public static final Target BTNSEECART = Target.the("btn ver carrito").located(By.id("linkButton"));
    public static final Target BTNPURCHASE = Target.the("btn comprar").located(By.xpath("//*[contains(@class,'fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase')]"));


}
