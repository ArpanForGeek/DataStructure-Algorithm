package scheduleactivityalgorithm;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Subject implements Comparable<Subject> {
    String subject;
    String startTime;
    String endTime;

    @Override
    public int compareTo(Subject subject) {
        return this.endTime.compareTo(subject.endTime);
    }
}