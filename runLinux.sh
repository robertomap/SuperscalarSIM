java_exe=$(sed '2!d' path_to_JDK_executables.txt)

./compileLinux.sh
java -classpath bin SuperscalarSIM.pkg1.Main
