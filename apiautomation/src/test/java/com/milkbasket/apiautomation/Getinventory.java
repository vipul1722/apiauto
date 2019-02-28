package com.milkbasket.apiautomation;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
public class Getinventory {
@Test
	public void test()
	{
	RestAssured.baseURI="https://dev.stockone.in";
 
	Response rest=RestAssured.given().body("{\r\n" + 
			"	\r\n" + 
			"	\"client_id\":\"7TEDIIumqXXTPaQlYKNIzr0BOdo2F2tAjXLqHRFz\",\r\n" + 
			"	\"client_secret\":\"Zc5rPJh8IrKz8o0eAAvcj0KyInkIfHFggQFr9s7xH8QNci1UARlMfrmnIl5nbqZldGHRCQPitmWxSLMToXTEt7Q0th89LwCzHU71583FXN22vZv97UCSjBjNesxTzY4X\",\r\n" + 
			"	\"grant_type\":\"client_credentials\"\r\n" + 
			"\r\n" + 
			"	\r\n" + 
			"}")
			.header("Content-Type","application/json")
			  .header("cache-control", "no-cache")
	.when().post("/o/token/")
	.then().assertThat().statusCode(400)
	.extract().response();
	
	String strw=rest.asString();
	System.out.println(strw);
	 

	
	
	
	
	
	
/*	
	Response res=	RestAssured.given()
	.header("Authorization","yEhTxMntrjBdVPVVG8nhDKLPeV7h4r")
	.header("Content-Type","application/json")
	.body("{\r\n" + 
			"    \"seller_id\": 1,\r\n" + 
			"    \"warehouse\": \"milkbasket_test\",\r\n" + 
			"    \"sku\": [\r\n" + 
			"        \"50\"\r\n" + 
			"    ]\r\n" + 
			"}")
	
	.when().post("/api/mp/get_inventory/")
	.then().assertThat().statusCode(200).and().body("status",equalTo("200"))
	.extract().response();              //raw format

String str= res.asString();
System.out.println(str);

int code = res.getStatusCode();
System.out.println("code is "  +  code);

JsonPath j = new JsonPath(str);
String status=j.get("products[0].data[1].mrp");
System.out.println(status);
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	}


}