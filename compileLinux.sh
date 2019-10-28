javac_exe=$(sed '1!d' path_to_JDK_executables.txt)

mkdir bin
$javac_exe -classpath src -d bin src/SuperscalarSIM/pkg1/*.java
