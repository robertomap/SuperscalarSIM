#!/bin/sh
javac_exe=$(sed '1!d' path_to_JDK_executables.txt)

mkdir bin

cp -r src/* bin 2>/dev/null # Copies everything inside src to bin
find bin -name "*.java" -delete  # Remove all .java files from bin

"$javac_exe" -classpath src -d bin src/SuperscalarSIM/pkg1/*.java
