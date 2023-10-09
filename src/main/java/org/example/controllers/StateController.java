package org.example.controllers;

import org.example.domain.models.State;
import org.example.domain.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping(path = "api/parking/states")
public class StateController {
    private final StateService stateService;

    @Autowired
    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    public void addStateController(@RequestBody State state) {
        stateService.addState(state);
    }
}
