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
public class GraduatedStudent {
    private String thesis;
    private Student std;

    public GraduatedStudent(String thesis, Student std) {
        this.thesis = thesis;
        this.std = std;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public Student getStd() {
        return std;
    }

    public void setStd(Student std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "GraduatedStudent{" + "thesis=" + thesis + ", std=" + std + '}';
    }
    
}
