package ladder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class ParticipantGroup {
    private final List<Participant> participants;

    public ParticipantGroup(List<String> names) {
        checkMinimumParticipants(names);
        checkDuplicatedParticipant(names);
        this.participants = generate(names);
    }

    private void checkMinimumParticipants(List<String> names) {
        if (names.size() < 2) {
            throw new IllegalArgumentException("참가자는 2명 이상이어야 합니다.");
        }
    }

    private void checkDuplicatedParticipant(List<String> names) {
        if (names.size() != new HashSet<>(names).size()) {
            throw new IllegalArgumentException("중복되는 참가자 명이 있습니다.");
        }
    }

    private List<Participant> generate(List<String> names) {
        List<Participant> participants = new ArrayList<>();
        for (String name : names) {
            participants.add(new Participant(name));
        }
        return participants;
    }

    public int getSize() {
        return participants.size();
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public Participant getParticipant(final int index) {
        return participants.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticipantGroup that = (ParticipantGroup) o;
        return Objects.equals(participants, that.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participants);
    }
}