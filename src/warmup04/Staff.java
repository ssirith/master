/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup04;

/**
 *
 * @author INT105
 */
public class Staff {
    private boolean isStaff;

    public Staff(boolean isStaff) {
        this.isStaff = isStaff;
    }

    
    public boolean isIsStaff() {
        return isStaff;
    }

    public void setIsStaff(boolean isStaff) {
        this.isStaff = isStaff;
    }

    @Override
    public String toString() {
        return "Staff{" + "isStaff=" + isStaff + '}';
    }
    
    
}
