import java.io.IOException;

public class nineteenTest {
    public static void main(String[] args) {

        dataAnalyzer dA = null;
        try {
            dA = new dataAnalyzer("dsaStudents.txt");
        } catch (IOException e){
            System.out.println("Something went wrong");
        }

        dA.makeAGraph();

    }
}
