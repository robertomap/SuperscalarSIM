$java_exe="$( (gc path_to_JDK_executables.txt)[1] )"
$jar_exe="$( (gc path_to_JDK_executables.txt)[2] )"

# Compila o código
echo "Compiling the code ..."
./compileWindows.ps1

# Cria o manifesto
echo "Creating manifest.mf ..."
echo "Main-Class: SuperscalarSIM.pkg1.Main
Class-Path: bin/" | Out-File -Encoding Default manifest.mf

# Gera o .jar
echo "Generating .jar file ..."
& "$jar_exe" vcfm SuperscalarSIM.jar manifest.mf -C bin/ .

# Executa-o
echo "Executing ..."
pushd src
& "$java_exe" -jar ../SuperscalarSIM.jar
popd
