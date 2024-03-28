import java.util.Comparator;

public class StreamComparator implements Comparator<StudyGroup> {
    @Override
    public int compare(StudyGroup o1, StudyGroup o2) {
        if (o1.getStudyObjectsList().size() > o2.getStudyObjectsList().size())
            return 1;
        return -1;
    }
}
