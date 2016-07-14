import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class JavaHashMap {

    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 25);
        Student student1 = new Student("Mark", "Eaten", 35);
        Student student2 = new Student("Tom", "Rise", 21);
        Student student3 = new Student("Johnny", "Law", 24);
        Student student4 = new Student("Samuel", "Jackson", 53);

        Grade grade = new Grade(5, "A", "great");
        Grade grade2 = new Grade(3, "C", "not bad");
        Grade grade3 = new Grade(4, "B", "good");

        Map<Student, Grade> map = new HashMap<Student, Grade>(2);
        map.put(student, grade);
        map.put(student2, grade2);
        map.put(student1, grade2);
        map.put(student3, grade2);
        map.put(student4, grade2);

        /*Map<String, Integer> words = new HashMap<String, Integer>();
        words.put("some_word", 5);
        words.put("another_word", 3);
        words.put("new_word", 9);

        for (String key : words.keySet()) {
            Integer value = words.get(key);
            System.out.println(key + " - " + value);
        }

        words.put("new_word", 7);

        for (String key : words.keySet()) {
            Integer value = words.get(key);
            System.out.println(key + " - " + value);
        }*/
    }
}
