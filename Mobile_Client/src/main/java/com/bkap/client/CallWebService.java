package com.bkap.client;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.bkap.entity.Mobile;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CallWebService {
	public List<Mobile> loadAll() {
		String api = "http://localhost:8080/Mobile/api/mobile/list-mobile";
		Client client = new Client();
		WebResource webRes = client.resource(api);
		ClientResponse cliRes = webRes.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		String json = cliRes.getEntity(String.class);

		Gson gson = new Gson();
		TypeToken<List<Mobile>> token = new TypeToken<List<Mobile>>() {};
		List<Mobile> lst = gson.fromJson(json, token.getType());
		return lst;
	}
	public  String insert(Mobile mobile) {
		String api = "http://localhost:8080/Mobile/api/mobile/insert" ;		
		Gson gson = new Gson();
		String json = gson.toJson(mobile);
		Client client = new Client();		
		WebResource webRes = client.resource(api);
		ClientResponse cliRes = webRes.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);
	
		String jsonResp = cliRes.getEntity(String.class);

		return jsonResp;
	}

}
