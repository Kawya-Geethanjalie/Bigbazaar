
package my_pos_system;

/**
 *
 * @author GalleComZone
 */
public class item {
    
    String dpno;
    String dname;
    int duprice;
    int dqty;

    public item(String dpno, String dname, int duprice, int dqty) {
        this.dpno = dpno;
        this.dname = dname;
        this.duprice = duprice;
        this.dqty = dqty;
    }

    public String getDpno() {
        return dpno;
    }

    public void setDpno(String dpno) {
        this.dpno = dpno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDuprice() {
        return duprice;
    }

    public void setDuprice(int duprice) {
        this.duprice = duprice;
    }

    public int getDqty() {
        return dqty;
    }

    public void setDqty(int dqty) {
        this.dqty = dqty;
    }

   
    
}
