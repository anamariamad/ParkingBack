package org.example.domain.services;

import org.example.domain.models.State;
import org.example.infra.repositories.StateRepository;
import org.springframework.stereotype.Service;

@Service
public class StateService {
    private final StateRepository stateRepository;

    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public void addState(State state) {
        stateRepository.save(state);
    }
}
