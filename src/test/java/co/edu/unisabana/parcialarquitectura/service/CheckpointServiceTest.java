package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcialarquitectura.repository.CheckpointPort;
import co.edu.unisabana.parcialarquitectura.repository.jpa.CheckpointRepository;
import co.edu.unisabana.parcialarquitectura.repository.model.Checkin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles(profiles = "test")
@ExtendWith(MockitoExtension.class)
class CheckpointServiceTest {

    @Mock
    private CheckpointRepository checkpointRepository;

    @Mock
    private CheckpointPort checkpointPort;

    @InjectMocks
    CheckpointService checkpointService;
    @Test
    void checkout() {
        CheckpointDTO checkinDTO = new CheckpointDTO("Facility Test", "Driver Test", 10);
        checkpointService.checkout(checkinDTO);
        Checkin lastCheckin = new Checkin(checkinDTO.facility, checkinDTO.driver, checkinDTO.dayOfMonth);
        Mockito.verify(checkpointRepository).save(checkinDTO);
    }
}