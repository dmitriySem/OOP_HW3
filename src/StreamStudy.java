import java.util.List;

public class StreamStudy {

    public static void main(String[] args) {

        StudyGroup studyGroup = new StudyGroup(List.of(
                new StudyObject(1, "Math"),
                new StudyObject(2, "SQL"),
                new StudyObject(3, "MySQL"),
                new StudyObject(4, "English")));

        studyGroup.forEach(studyObject -> System.out.println(studyObject.toString()));

    }
}
