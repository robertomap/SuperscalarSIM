jar_exe=$(sed '3!d' path_to_JDK_executables.txt)
java_exe=$(sed '2!d' path_to_JDK_executables.txt)

# Compila o código
echo "Compiling the code ..."
./compile.sh

# Cria o manifesto
echo "Creating manifest.mf ..."
echo "Main-Class: SuperscalarSIM.pkg1.Main
Class-Path: bin/" > manifest.mf

# Gera o .jar
echo "Generating .jar file ..."
$jar_exe vcfm dist/SuperscalarSIM.jar manifest.mf -C bin/ .

# Executa-o
echo "Executing ..."
pushd src
$java_exe -jar ../dist/SuperscalarSIM.jar
popd
