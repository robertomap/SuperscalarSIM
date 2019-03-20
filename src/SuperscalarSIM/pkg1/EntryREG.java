/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperscalarSIM.pkg1; 

/**
 *
 * @author roberto
 */
public class EntryREG {
    private int Id;
    private String Reg;
    private String V;
    private String Qi;
    private String Valid;

    public EntryREG() {
    }

    public EntryREG(int Id, String Reg, String V, String Qi, String Valid) {
        this.Id = Id;
        this.Reg = Reg;
        this.V = V;
        this.Qi = Qi;
        this.Valid = Valid;
    }

    public int getId() {
        return Id;
    }

    public String getReg() {
        return Reg;
    }

    public String getV() {
        return V;
    }

    public String getQi() {
        return Qi;
    }

    public String getValid() {
        return Valid;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setReg(String Reg) {
        this.Reg = Reg;
    }

    public void setV(String V) {
        this.V = V;
    }

    public void setQi(String Qi) {
        this.Qi = Qi;
    }

    public void setValid(String Valid) {
        this.Valid = Valid;
    }
    
    
    
}
