/**
 * 
 */
package campAssignments.controllers;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import campAssignments.databaseObjects.CampDao;
import campAssignments.databaseObjects.CampRepository;
import campAssignmentsApi.Camp;

/**
 * @author Bert
 * Controller to fetch Camp identification object
 */
@RestController
public class CampController {

    @Autowired
    private CampRepository campRepository;

    @RequestMapping(path="/camps", 
    		method = RequestMethod.GET,
    		produces = "application/json")
    public List<Camp> getCamps() {
    	List<Camp> camps = new ArrayList<Camp>();
    	for(CampDao campDao : campRepository.findAll()) {
    		Camp camp = new Camp(campDao.getId(),
    				campDao.getDescription(),
    				Date.from(campDao.getStartDate().atZone(ZoneId.systemDefault()).toInstant()),
    				Date.from(campDao.getEndDate().atZone(ZoneId.systemDefault()).toInstant()));
    		camps.add(camp);
    	}
        return camps;
    }
}
