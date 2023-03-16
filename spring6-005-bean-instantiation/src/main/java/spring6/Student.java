package spring6;

import java.util.Date;

/**
 * GFKDXS
 *
 * @version 1.0
 * @Description:
 * @ClassName: Student
 * @author: Bruce Xiao
 * @date: 2023-03-16
 */
public class Student {

    private Date brith;



    public void setBrith(Date brith) {
        this.brith = brith;
    }

    @Override
    public String toString() {
        return "Student{" +
                "brith=" + brith +
                '}';
    }
}
