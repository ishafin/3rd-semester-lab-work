class Faculty extends University {
    String facultyName;

    Faculty(String universityName, int ranking, String facultyName) {
        super(universityName, ranking);
        this.facultyName = facultyName;
    }

    void Details() {
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("University Name: " + name);
    }
}