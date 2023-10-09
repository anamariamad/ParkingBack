package org.example.infra.repositories;

import org.example.domain.models.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Long> {
}
