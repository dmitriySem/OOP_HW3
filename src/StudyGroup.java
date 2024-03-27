import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<StudyObject>{
    private int count;
    private List<StudyObject> studyObjectsList;

    public StudyGroup(List<StudyObject> studyObjectsList) {
        this.studyObjectsList = studyObjectsList;
        this.count = 0;
    }

    public StudyGroup() {
        this.studyObjectsList = new ArrayList<>();
    }

    public void setStudyObjectsList(List<StudyObject> studyObjectsList) {
        this.studyObjectsList = studyObjectsList;
    }

    public List<StudyObject> getStudyObjectsList() {
        return studyObjectsList;
    }

    public void addStudyObjectsList(StudyObject studyObject){
        this.studyObjectsList.add(studyObject);
    }

    @Override
    public Iterator<StudyObject> iterator() {
        return new StudyGroupIterable(this);
    }

}
