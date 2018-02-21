/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup05;

/**
 *
 * @author INT105
 */
public class Student {
    private long stdId;
    private String stadName;

    public Student(long stdId, String stadName) {
        this.stdId = stdId;
        this.stadName = stadName;
    }
    

    public long getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public String getStadName() {
        return stadName;
    }

    public void setStadName(String stadName) {
        this.stadName = stadName;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stadName=" + stadName + '}';
    }
    
}
