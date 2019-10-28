$java_exe="$( (gc path_to_JDK_executables.txt)[1] )"

./compileWindows.ps1
& "$java_exe" -classpath bin SuperscalarSIM.pkg1.Main
