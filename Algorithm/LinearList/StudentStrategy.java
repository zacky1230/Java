package Algorithm.LinearList;

/**
 * @author gy1zc3@gmail.com
 *         Created by zacky on 20:30.
 */
public class StudentStrategy implements Strategy {
    @Override
    public boolean equals(Object obj1, Object obj2) {
        if(obj1 instanceof Student && obj2 instanceof Student){
            Student s1 = (Student) obj1;
            Student s2 = (Student) obj2;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compare(Object obj1, Object obj2) {
        return 0;
    }
}
