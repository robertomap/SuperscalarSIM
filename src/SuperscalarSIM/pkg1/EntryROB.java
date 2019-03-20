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
public class EntryROB {
    private int Id;
    private int Inst;
    private String Type;
    private String D;
    private String V;
    private String Ready;

    public EntryROB(int Id, int Inst, String Type, String D, String V, String Ready) {
        this.Id = Id;
        this.Inst = Inst;
        this.Type = Type;
        this.D = D;
        this.V = V;
        this.Ready = Ready;
    }

    public int getId() {
        return Id;
    }

    public int getInst() {
        return Inst;
    }

    public String getType() {
        return Type;
    }

    public String getD() {
        return D;
    }

    public String getV() {
        return V;
    }

    public String getReady() {
        return Ready;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setInst(int Inst) {
        this.Inst = Inst;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setD(String D) {
        this.D = D;
    }

    public void setV(String V) {
        this.V = V;
    }

    public void setReady(String Ready) {
        this.Ready = Ready;
    }

    

    
}
