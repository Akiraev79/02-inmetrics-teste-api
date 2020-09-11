package br.com.inmetrics.teste;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class ListarTodosEmpregados {

	private String url = "https://inm-api-test.herokuapp.com";
    
    @Test
    public void getListarTodosEmpregados(){
        
    	given().
    		log().all().
            auth().basic("inmetrics", "automacao").
        when().
        	log().all().
            get(url+"/empregado/list_all").
        then().
        	log().all().
            statusCode(200);
    }

}
