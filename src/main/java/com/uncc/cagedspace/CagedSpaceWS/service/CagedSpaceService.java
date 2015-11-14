package com.uncc.cagedspace.CagedSpaceWS.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import com.uncc.cagedspace.CagedSpaceWS.CagedSpace;
import com.uncc.cagedspace.CagedSpaceWS.CagedSpaceUtil;
import com.uncc.cagedspace.CagedSpaceWS.Grid;

@Path("/grids")
public class CagedSpaceService {
	ObjectMapper mapper = new ObjectMapper();
	//ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
	CagedSpace cs = CagedSpaceUtil.getJSONData();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Grid> getGrids() {
		return cs.getGrids();

	}

	@PUT
	@Path("/{gridId}")
	//@Produces(MediaType.APPLICATION_JSON)
	public void updateGrid(@PathParam("gridId") long id, Grid grid) {
		grid.setId(id);
		// return messageService.updateMessage(message);

		System.out.println("***********8" + grid.toString());
		List<Grid> grids = cs.getGrids();
		for (int i = 0; i < grids.size(); i++) {
			if (grids.get(i).getId() == id) {
				grids.set(i, grid);
				break;
			}
		}
		System.out.println("*****" + cs.toString());
		// //update grid in json file
		try {
//			mapper.writeValue(new File(this.getClass().getClassLoader()
//					.getResource("cagedspace.json").getFile()), cs);
			mapper.writeValue(new File("F:/learnings_Workspace/CagedSpaceWS/src/main/resources/cagedspace.json"), cs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//return CagedSpaceUtil.getJSONData().getGrids();

	}

}
