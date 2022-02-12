package com.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.junit.Before;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public static final Target CAMPOBUSCAR = Target.the("campo buscar").located(By.id("testId-SearchBar-Input"));
    public static final Target BTNBUSCAR = Target.the("btn Buscar").located(By.xpath("//*[contains(@class,'SearchBar-module_searchBtnIcon__6KVum')]"));
    public static final Target BTNIPHONE = Target.the("btn Iphone 11 128 GB").located(By.id("testId-pod-displaySubTitle-prod10900027"));
    public static final Target BTNAGREGARALCARRITO = Target.the("btn agragar al carrito").located(By.xpath("//*[contains(@class,'jsx-2166277967 button button-primary button-primary-xtra-large') ]"));
    public static final Target BTNVERCARRITO = Target.the("btn ver carrito").located(By.id("linkButton"));
    public static final Target BTNCOMPRAR = Target.the("btn comprar").located(By.xpath("//*[contains(@class,'fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase')]"));


}
