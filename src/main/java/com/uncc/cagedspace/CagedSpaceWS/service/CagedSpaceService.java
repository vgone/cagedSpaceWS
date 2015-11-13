package com.uncc.cagedspace.CagedSpaceWS.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.uncc.cagedspace.CagedSpaceWS.CagedSpace;
import com.uncc.cagedspace.CagedSpaceWS.CagedSpaceUtil;
import com.uncc.cagedspace.CagedSpaceWS.Grid;

@Path("/grids")
public class CagedSpaceService {

	CagedSpace cs = CagedSpaceUtil.getJSONData();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Grid> getGrids() {
		return cs.getGrids();

	}

}
