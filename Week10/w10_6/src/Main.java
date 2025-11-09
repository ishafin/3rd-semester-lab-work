public class Main {
    public static void main(String[] args) {
        Department d = new Department("Aligarh Muslim University", 1, "Science Faculty", "Computer Science", "Dr.Arman Rasool");
        d.Display();
        System.out.println("University Ranking: " + d.ranking);
    }

}
