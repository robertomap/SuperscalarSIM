# SuperscalarSIM
### Superscalar Simulator (ALPHA version) based on Tomasulo's Algorithm

The purpose of this project is to help computer engineering students to understand the concepts of superscalarity in the architecture of microprocessors.

This program consists of a simulator for a superscalar architecture based on Tomasulo's algorithm. 

This is an alpha version with the purpose of being evaluated and improved. Any contribution is welcomed. 

**Roberto Miranda**
robertomap@gmail.com

**Eduardo Gregório**
eduardo.gregorio@sga.pucminas.br

## How to use it

#### Starting the Simulator
Double click on the 'SuperscalarSIM.jar' file. You can either run it from terminal.

```sh
 $ java -jar dist/SuperscalarSIM.jar 
```

#### Opening an *Assembly Code*
Once started, go to **File** menu, then **Open Program**. The assembly code will appear in the left side table which represents the instruction memory block.

#### Configuring Operational Parameters
On the **Configuration** menu it's possible to select different pipeline execution options.

- Operational Units
    - Second ALU Unit
    - Second FP Unit
    - Second Memory Unit
    ----
    - 2-line Buffer
    - 3-line Buffer

- Pipeline Ways
    - 1-way Pipeline
    - 2-way Pipeline
    - 4-way Pipeline

#### Executing the Code
Now you'll be able to see the instructions flowing through the pipeline one clock tick at a time.

Every time you click the **Next** button, at the left lower screen side, you push the execution ahead one clock cycle. The menu command **File** -> **Run** have the same purpose.

