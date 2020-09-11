package br.com.inmetrics.teste;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

public class CadastrarEmpregado {

	private String url = "https://inm-api-test.herokuapp.com";

    @SuppressWarnings("unchecked")
	@Test
    public void postCadastrarEmpregado(){
    	
        JSONObject requestParams = new JSONObject();
        requestParams.put("admissao", "11/09/2020");
        requestParams.put("cargo", "Analista de Testes Pleno");
        requestParams.put("comissao", "500,00");
        requestParams.put("cpf", "272.324.778-30");
        requestParams.put("departamentoId", 22);
        requestParams.put("nome", "Evandro Brandão");
        requestParams.put("salario", "7.000,00");
        requestParams.put("sexo", "m");
        requestParams.put("tipoContratacao", "pj");

        System.out.println(requestParams);
        
        given().
        	log().all().
        	auth().basic("inmetrics", "automacao").
            body(requestParams.toJSONString()).contentType(ContentType.JSON).
        when().
            post(url + "/empregado/cadastrar").
        then().
        	log().all().statusCode(202).
            body(containsString("createdAt"));
    }

}
