package PruebaTecnicaNtt.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PruebaTecnicaNtt.model.Limit;
import PruebaTecnicaNtt.services.poijiLimitsService;


@RestController
@RequestMapping(value = "")
public class LimitsRestController {
    
    @Autowired
    private poijiLimitsService service;
    @GetMapping(path = "/limits")
    public List<Limit> getlimits() {
        List<Limit> listLimits = service.getlimit();
        return listLimits;
    }
}