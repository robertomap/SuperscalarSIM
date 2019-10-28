$java_exe="$( (gc path_to_JDK_executables.txt)[1] )"

./compileWindows.ps1
pushd bin
& "$java_exe" SuperscalarSIM.pkg1.Main
popd
