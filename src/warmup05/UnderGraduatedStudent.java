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
public class UnderGraduatedStudent {
    private String project;
    private Student std;

    public UnderGraduatedStudent(String project, Student std) {
        this.project = project;
        this.std = std;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Student getStd() {
        return std;
    }

    public void setStd(Student std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "UnderGraduatedStudent{" + "project=" + project + ", std=" + std + '}';
    }
    
}
