package com.uncc.cagedspace.CagedSpaceWS.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import com.uncc.cagedspace.CagedSpaceWS.CagedSpaceUtil;
import com.uncc.cagedspace.CagedSpaceWS.pojo.*;;

@Path("/grids")
public class CagedSpaceService {
	ObjectMapper mapper = new ObjectMapper();
	// ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
	CagedSpace cs = CagedSpaceUtil.getJSONData();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Grid> getGrids() {
		System.out.println("inside grids");
		return cs.getGrids();

	}
	
	@GET
	@Path("/{gridId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Grid getGrid(@PathParam("gridId") long id) {
		List<Grid> grids = cs.getGrids();
		
		for(Grid tempGrid:grids){
			
			if(tempGrid.getId()==id) {
				return tempGrid;
			}
		}
		return null;

	}
	
	@GET
	@Path("/orchestra")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Orchestra> getOrchestraDetails() {
		return cs.getOrchestra();
	}
	
	@GET
	@Path("/floorMap")
	@Produces(MediaType.TEXT_PLAIN)
	public String getFloorMap() {
		return cs.getFloorMap();
	}
	

	@PUT
	@Path("/grids/{gridId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Grid> updateGrid(@PathParam("gridId") int id, Grid grid) {
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
			// mapper.writeValue(new File(this.getClass().getClassLoader()
			// .getResource("cagedspace.json").getFile()), cs);
			mapper.writeValue(
					new File(
							CagedSpaceUtil.getFileName()),
					cs);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return CagedSpaceUtil.getJSONData().getGrids();

	}

	@PUT
	@Path("/grids/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Grid> updateGrids(List<Grid> gridUpdated) {
		// grid.setId(id);
		// return messageService.updateMessage(message);

		System.out.println("***********8" + gridUpdated.toString());
		List<Grid> grids = cs.getGrids();

		for (Grid tempg : gridUpdated) {
			for (int i = 0; i < grids.size(); i++) {
				if (grids.get(i).getId() == tempg.getId()) {
					grids.set(i, tempg);
					break;
				}
			}

		}
		System.out.println("*****" + cs.toString());
		// //update grid in json file
		try {
			// mapper.writeValue(new File(this.getClass().getClassLoader()
			// .getResource("cagedspace.json").getFile()), cs);
			mapper.writeValue(
					new File(
							CagedSpaceUtil.getFileName()),
					cs);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return CagedSpaceUtil.getJSONData().getGrids();

	}

}
