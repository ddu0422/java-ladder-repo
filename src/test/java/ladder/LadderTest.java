package ladder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LadderTest {
    ParticipantGroup participantGroup;

    @BeforeEach
    void setUp() {
        participantGroup = new ParticipantGroup(Arrays.asList("pobi", "crong"));
    }

    @Test
    void 높이가_1_이하인_경우() {
        assertThrows(IllegalArgumentException.class, () -> {
            Ladder ladder = LadderGenerator.generate(participantGroup, 0);
        });
    }
}
