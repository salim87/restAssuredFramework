package test;

import com.complexJson.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCases {
	
	@Test
	public void pojoGenerate() throws JsonProcessingException {
	/*	List<Curve> curvesList = new ArrayList<Curve>();
		Curve curve = new Curve();
		curve.setZemaCurveId("123");
		curvesList.add(curve);
		Curves curves =new Curves();
		curves.setCurve(curvesList);
		Request request = new Request();
		request.setQuoteFromDate("2304");
		request.setQuoteToDate("2023");
		request.setCurves(curves);
		request.setUpdateOnly("1234");
		request.setInsertedOrUpdated("");
		JsonRoot root = new JsonRoot();
		root.setRequest(request); */

	/*	List<Curve> curvesList = new ArrayList<Curve>();
		Curve curve = new Curve();
		curve.setZemaCurveId("123");
		curvesList.add(curve);
		Curves curves =new Curves();
		curves.setCurve(curvesList);
		Request request = new Request();
		request.setQuoteFromDate("1234").setQuoteToDate("345").setCurves(curves).setUpdateOnly("3421").setInsertedOrUpdated("");
		JsonRoot root = new JsonRoot();
		root.setRequest(request); */

		JsonRoot payload= ComplexPojoGenerator.pojo();



	//	RestAssured.given().body(payload).log().all().post();
		ObjectMapper objectMapper = new ObjectMapper();
		String payload1=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
		System.out.println(payload1);


	}

	@Test
	public void JsonArrayGenerator() throws JsonProcessingException {

	Root root=	ComplexPojoGenerator.root();
	ArrayList<Root> list = new ArrayList<Root>();
	list.add(root);
		/*	Root root = new Root();
		root.setId(123).setInterperoperation("IR").setDateOfOperation("2023");

		Root root1 = new Root();
		root1.setId(123).setInterperoperation("IR").setDateOfOperation("2023");

		List<Root> list = new ArrayList<>();
		list.add(root);
	//	list.add(root1); */

		ObjectMapper objectMapper = new ObjectMapper();
		String pojo=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(pojo);

	}



}
