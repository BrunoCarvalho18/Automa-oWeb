package br.com.aprendendoautomatizar.funcionalidade;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import br.com.aprendendoutomatizar.pages.ProductAddToCartPage;

public class ProductAddToCartFuncionalidade {
	private ProductAddToCartPage account;

	Faker faker = new Faker();

	public ProductAddToCartFuncionalidade() {
		account = new ProductAddToCartPage();

	}

	public void selecionarCampoQuantidade() {
		account.getCampoQuantidade().sendKeys(faker.number().digit());
	}

	// WebElement campoEstado = navegador.findElement(By.id("id_state"));
	// new Select(campoEstado).selectByValue(String.valueOf(1));
    // (navegador.findElement(By.id("id_country"))).selectByValue(String.valueOf(21));

	public void selecionaCampoSize() {
		account.selecionaCampo(By.id("group_1"), 2);
	}
	
	public void selecionaCampoCor(){
		account.getCampoCor().click();
	}
	
	public void selecionaBotaoAddToCart(){
		account.getBotaoAddToCart().click();
	}

	public void selecionaBotaoProceed(){
		account.getBotaoProceed().click();
	}
}
