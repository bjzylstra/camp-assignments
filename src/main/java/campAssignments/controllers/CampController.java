/**
 * 
 */
package campAssignments.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import campAssignments.databaseObjects.Camp;
import campAssignments.databaseObjects.CampRepository;

/**
 * @author Bert
 * Controller to fetch Camp identification object
 */
@Controller
public class CampController {

    @Autowired
    private CampRepository campRepository;

    @RequestMapping(path="/camps", 
    		method = RequestMethod.GET,
    		produces = "application/json")
    @ResponseBody
    public String getCamps() throws JsonProcessingException {
        List<Camp> camp = new ArrayList<Camp>((Collection<? extends Camp>) campRepository.findAll());
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writer().writeValueAsString(camp);
    }
}
