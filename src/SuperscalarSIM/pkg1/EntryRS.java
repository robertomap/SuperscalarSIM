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
public class EntryRS {
    private int Inst;
    private String Op;
    private String Vj;
    private String Vk;
    private String Qj;
    private String Qk;
    private String A;
    private String Busy;
    private int Rob;
    private boolean inExecution;

    public EntryRS() {
    }

    public EntryRS(int Inst, String Op, String Vj, String Vk, String Qj, String Qk, String A, String Busy, int Rob, boolean inExecution) {
        this.Inst = Inst;
        this.Op = Op;
        this.Vj = Vj;
        this.Vk = Vk;
        this.Qj = Qj;
        this.Qk = Qk;
        this.A = A;
        this.Busy = Busy;
        this.Rob = Rob;
        this.inExecution = inExecution;
    }

    public int getInst() {
        return Inst;
    }

    public String getOp() {
        return Op;
    }

    public String getVj() {
        return Vj;
    }

    public String getVk() {
        return Vk;
    }

    public String getQj() {
        return Qj;
    }

    public String getQk() {
        return Qk;
    }

    public String getA() {
        return A;
    }

    public String getBusy() {
        return Busy;
    }

    public int getRob() {
        return Rob;
    }

    public boolean isInExecution() {
        return inExecution;
    }

    public void setInst(int Inst) {
        this.Inst = Inst;
    }

    public void setOp(String Op) {
        this.Op = Op;
    }

    public void setVj(String Vj) {
        this.Vj = Vj;
    }

    public void setVk(String Vk) {
        this.Vk = Vk;
    }

    public void setQj(String Qj) {
        this.Qj = Qj;
    }

    public void setQk(String Qk) {
        this.Qk = Qk;
    }

    public void setA(String A) {
        this.A = A;
    }

    public void setBusy(String Busy) {
        this.Busy = Busy;
    }

    public void setRob(int Rob) {
        this.Rob = Rob;
    }

    public void setInExecution(boolean inExecution) {
        this.inExecution = inExecution;
    }

    

    
}
