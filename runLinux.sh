#!/bin/sh
java_exe=$(sed '2!d' path_to_JDK_executables.txt)

./compileLinux.sh
pushd bin
"$java_exe" SuperscalarSIM.pkg1.Main
popd 
