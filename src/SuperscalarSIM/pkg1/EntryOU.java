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
public class EntryOU {
    
    private int Inst;
    private String Op;
    private String Operand1;
    private String Operand2;
    private int RobIndex;    

    public EntryOU(int Inst, String Op, String Operand1, String Operand2, int RobIndex) {
        this.Inst = Inst;
        this.Op = Op;
        this.Operand1 = Operand1;
        this.Operand2 = Operand2;
        this.RobIndex = RobIndex;
    }

    public int getInst() {
        return Inst;
    }

    public String getOp() {
        return Op;
    }

    public String getOperand1() {
        return Operand1;
    }

    public String getOperand2() {
        return Operand2;
    }

    public int getRobIndex() {
        return RobIndex;
    }

    public void setInst(int Inst) {
        this.Inst = Inst;
    }

    public void setOp(String Op) {
        this.Op = Op;
    }

    public void setOperand1(String Operand1) {
        this.Operand1 = Operand1;
    }

    public void setOperand2(String Operand2) {
        this.Operand2 = Operand2;
    }

    public void setRobIndex(int RobIndex) {
        this.RobIndex = RobIndex;
    }

    
}
