public class StudyObject {
    private int Id;
    private String name;

    public StudyObject(int id, String name) {
        Id = id;
        this.name = name;
    }

    public StudyObject() {
    }

    @Override
    public String toString() {
        return "StudyObject{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
