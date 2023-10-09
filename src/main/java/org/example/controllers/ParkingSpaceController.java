package org.example.controllers;

import org.example.domain.models.ParkingSpace;
import org.example.domain.services.ParkingSpaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping(path = "api/parking/parkings")
public class ParkingSpaceController {
    private final ParkingSpaceService parkingSpaceService;

    public ParkingSpaceController(ParkingSpaceService parkingSpaceService) {
        this.parkingSpaceService = parkingSpaceService;
    }

    @GetMapping()
    public List<ParkingSpace> getParkingSpacesController(){
        return parkingSpaceService.getParkingSpaces();
    }

    @PostMapping()
    public void postParkingSpaceController(@RequestBody ParkingSpace parkingSpace) {
        parkingSpaceService.addParkingSpace(parkingSpace);
    }
}
