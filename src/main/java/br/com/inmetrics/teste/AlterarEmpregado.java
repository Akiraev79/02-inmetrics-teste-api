package br.com.inmetrics.teste;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

public class AlterarEmpregado {

	private String url = "https://inm-api-test.herokuapp.com";
	
	@SuppressWarnings("unchecked")
	@Test
    public void putAlterarEmpregado(){
       
    	JSONObject requestParams = new JSONObject();
        requestParams.put("admissao", "20/09/2020");
        requestParams.put("cargo", "Analista de Testes Senior");
        requestParams.put("comissao", "600,00");
        requestParams.put("cpf", "272.324.778-30");
        requestParams.put("departamentoId", 22);
        requestParams.put("nome", "Evandro Brandão de Souza");
        requestParams.put("salario", "5.000,00");
        requestParams.put("sexo", "m");
        requestParams.put("tipoContratacao", "clt");
        
        System.out.println(requestParams);

        given().
        	log().all().
        	auth().basic("inmetrics", "automacao").
            body(requestParams.toJSONString()).contentType(ContentType.JSON).
        when().
            put(url + "/empregado/alterar/" + 2950).
        then().
        	log().all().statusCode(202).
            body(containsString("updatedAt"));
    }

	
}
