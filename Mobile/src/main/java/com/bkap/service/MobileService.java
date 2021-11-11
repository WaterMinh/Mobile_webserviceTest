package com.bkap.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.bkap.dao.IMobileDAO;
import com.bkap.dao.ImplMobileDAO;
import com.bkap.entity.Mobile;
import com.google.gson.Gson;

@Path(value = "/mobile/")
public class MobileService {
	@Path("hello")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String hello() {
		BkapRespone bResp = new BkapRespone(100, "Wellcom to Mobile Web");
		Gson gson = new Gson();
		String json = gson.toJson(bResp);
		return json;
	}
	@Path("list-mobile")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getListMobile() {
		IMobileDAO dao = new ImplMobileDAO();
		List<Mobile> lst = dao.selectAll();
		Gson gson = new Gson();
		String json = gson.toJson(lst);
		return json;
	}
	
	@Path("insert")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String insert(String json) {
		Gson gson = new Gson();
		Mobile mobile = gson.fromJson(json, Mobile.class);
		IMobileDAO dao = new ImplMobileDAO();
		boolean SaveOk = dao.insert(mobile);
			
		if (SaveOk) {
			return gson.toJson(new Messages(100, "Thêm mới dữ liệu thành công!"));
		} else {
			return gson.toJson(new Messages(101, "Thêm mới thất bại!"));
		}		
	}

}
