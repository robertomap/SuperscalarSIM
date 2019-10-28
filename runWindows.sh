java_exe=$(sed '2!d' path_to_JDK_executables.txt)

java -classpath bin SuperscalarSIM.pkg1.Main
