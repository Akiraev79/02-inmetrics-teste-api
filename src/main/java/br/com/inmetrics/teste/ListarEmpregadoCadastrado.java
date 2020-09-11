package br.com.inmetrics.teste;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class ListarEmpregadoCadastrado {

	private String url = "https://inm-api-test.herokuapp.com";

	@Test
	public void getListarEmpregadoCadastrado() {

		given()
			.log().all()
			.auth().basic("inmetrics", "automacao").
		when()
			.get(url + "/empregado/list/" + 2950).
		then()
			.statusCode(202);
	}

}
