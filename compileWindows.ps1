Set-ExecutionPolicy Bypass Process

$javac_exe="$( (gc path_to_JDK_executables.txt)[0] )"

mkdir bin
& "$javac_exe" -classpath src -d bin src/SuperscalarSIM/pkg1/*.java
