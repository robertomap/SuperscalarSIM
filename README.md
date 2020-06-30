# SuperscalarSIM
### Superscalar Simulator (ALPHA version) based on Tomasulo's Algorithm

The purpose of this project is to help students of computer engineering understand the concepts of superscalarity in microprocessor architecture.

This program consists of a simulator for a superscalar architecture based on Tomasulo's algorithm. 

This is an alpha version with the purpose of being evaluated and improved. Any contributions are welcomed.

**Roberto Miranda**
robertomap@gmail.com

**Eduardo Gregório**
eduardo.gregorio@sga.pucminas.br

## How to use it

#### Requiremens

- JDK with JavaFX included (Java 10 or lower usually include JavaFX in the JDK).

#### Compiling, Building and Running the project
You need to set your java executable locations in the **path_to_JDK_executables.txt** file to the apropriate ones. (If the latest java version you have installed is less or equal to version 10, ignore this step.)

You can use the scripts in this folder to run, compile or build the entire project. Use the PowerShell scripts (.ps1 files) for Windows and the .sh files for UNIX. To execute the PowerShell scripts, you need to open PowerShell and execute this command: ```Set-ExecutionPolicy Bypass Process```.


#### Starting the Simulator
There's a JRE 8 compiled binary available in the **dist** folder. To use it, just double click the **SuperscalarSIM.jar** file. You can also run it from the command line.

```sh
 $ java -jar dist/SuperscalarSIM.jar 
```

#### Opening an *Assembly Code*
Once started, go to **File** menu, then **Open Program**. It will appear a file selection window. Select a pseudo MIPS assemply file and click **Open**. Some examples are available in the **test** folder. After selecting the file the assembly code will appear in the memory block, represented by the left side table.

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

Every time you click on the **Next** button, at the left lower side, you push the execution ahead one clock cycle. Thus the simulator will evalute every pipeline stage. The menu command **File** -> **Run** have the same purpose.

