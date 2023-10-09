package org.example.domain.services;

import org.example.domain.models.ParkingSpace;
import org.example.infra.repositories.ParkingSpaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpaceService {
    private final ParkingSpaceRepository parkingSpaceRepository;

    public ParkingSpaceService(ParkingSpaceRepository parkingSpaceRepository) {
        this.parkingSpaceRepository = parkingSpaceRepository;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaceRepository.findAll();
    }

    public void addParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaceRepository.save(parkingSpace);
    }
}
