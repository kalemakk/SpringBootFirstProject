package com.nyomPlanet.Controller;
import com.nyomPlanet.Services.NyomPlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/nyomplanetcal")
public class NyomPlanetController {
    private final NyomPlanetService nyomPlanetService;
    @Autowired
    public NyomPlanetController(NyomPlanetService nyomPlanetService) {
        this.nyomPlanetService = nyomPlanetService;
    }
    @GetMapping(path = "/{enteredAmount}")
    public List<Object> getServiceProviders(@PathVariable("enteredAmount") double enteredAmount){
        return nyomPlanetService.getServiceProviders(enteredAmount);
    }
}
