import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StudyGroupIterable implements Iterator<StudyObject>{

    private List<StudyObject> studyGroups;
    private int count;

    public StudyGroupIterable(StudyGroup studyGroups) {
        this.studyGroups = studyGroups.getStudyObjectsList();
        this.count = 0;
    }


    @Override
    public boolean hasNext() {
        return count != studyGroups.size();
    }

    @Override
    public StudyObject next() {
        if (hasNext())
            return studyGroups.get(count++);
        return null;
    }
}
