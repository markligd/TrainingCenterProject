class Course {

    private String nameOfCourse;
    private int duration;

    public Course(String nameOfCourse, int duration) {
        this.nameOfCourse = nameOfCourse;
        this.duration = duration;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
