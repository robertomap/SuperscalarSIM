#!/bin/sh
java_exe=$(sed '2!d' path_to_JDK_executables.txt)
jar_exe=$(sed '3!d' path_to_JDK_executables.txt)

echo "Compiling the code ..."

./compileLinux.sh


echo "Creating manifest.mf ..."

echo "Main-Class: SuperscalarSIM.pkg1.Main
Class-Path: bin/" > manifest.mf


echo "Generating .jar file ..."

"$jar_exe" vcfm SuperscalarSIM.jar manifest.mf -C bin/ .


echo "Executing ..."

pushd bin
"$java_exe" -jar ../SuperscalarSIM.jar
popd
