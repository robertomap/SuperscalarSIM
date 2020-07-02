$java_exe="$( (gc path_to_JDK_executables.txt)[1] )"
$jar_exe="$( (gc path_to_JDK_executables.txt)[2] )"

echo "Compiling the code ..."

./compileWindows.ps1


echo "Creating manifest.mf ..."

echo "Main-Class: SuperscalarSIM.pkg1.Main
Class-Path: bin/" | Out-File -Encoding Default manifest.mf


echo "Generating .jar file ..."

& "$jar_exe" vcfm SuperscalarSIM.jar manifest.mf -C bin/ .


echo "Executing ..."

pushd bin
& "$java_exe" -jar ../SuperscalarSIM.jar
popd
