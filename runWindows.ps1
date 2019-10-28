$java_exe="$( (gc path_to_JDK_executables.txt)[1] )"

mkdir bin 2> $null
& "$java_exe" -classpath bin SuperscalarSIM.pkg1.Main
