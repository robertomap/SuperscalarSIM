$javac_exe="$( (gc path_to_JDK_executables.txt)[0] )"

mkdir bin 2> $null

cp -r src/* bin 2> $null  # Copies everything inside src to bin
ls -r bin -include *.java | foreach { rm $_ }  # Remove all .java files from bin

& "$javac_exe" -classpath src -d bin src/SuperscalarSIM/pkg1/*.java
