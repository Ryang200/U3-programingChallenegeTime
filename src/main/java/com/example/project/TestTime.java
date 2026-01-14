import com.example.project.Time;

public class TestTime {
    public static void main(String[] args) {
        Time time4 = new Time(10,14,43);
        Time time5 = new Time(8,30,29);
        time4.add(time5);
   
        System.out.println(time4.info());
    }
}