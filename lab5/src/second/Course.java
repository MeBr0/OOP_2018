package second;

public class Course {
    private String courseTitle;
    private Textbook textbook;
    private Instructor instructor;

    public Course(String courseTitle, Textbook textbook, Instructor instructor) {
        this.courseTitle = courseTitle;
        this.textbook = textbook;
        this.instructor = instructor;
    }

    public String getCourseTitle() { return courseTitle; }
    public void setCourseTitle(String courseTitle) { this.courseTitle = courseTitle; }

    public Textbook getTextbook() { return textbook; }
    public void setTextbook(Textbook textbook) { this.textbook = textbook; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    @Override
    public String toString() {
        return String.format("%s: courseTitle - %s, %s, %s",
                getClass(), getCourseTitle(), getTextbook(), getInstructor());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            Course other = (Course) obj;

            if (!courseTitle.equals(other.courseTitle)) return false;

            else if (!textbook.equals(this.textbook)) return false;

            return instructor.equals(this.instructor);

        } else return false;
    }
}
