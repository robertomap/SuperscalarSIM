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
public class EntryMEM {
    private int Inst;
    private String ProgLine;

    public EntryMEM() {
    }

    public EntryMEM(int Inst, String codeLine) {
        this.Inst = Inst;
        this.ProgLine = codeLine;
    }

    public int getInst() {
        return Inst;
    }

    public String getProgLine() {
        return ProgLine;
    }

    public void setInst(int Inst) {
        this.Inst = Inst;
    }

    public void setProgLine(String ProgLine) {
        this.ProgLine = ProgLine;
    }

    
}
