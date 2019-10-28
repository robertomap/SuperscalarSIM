# Compila o código
echo "Compiling the code ..."
./compile.ps1

# Cria o manifesto
echo "Creating manifest.mf ..."
echo "Main-Class: SuperscalarSIM.pkg1.Main
Class-Path: bin/" > manifest.mf

# Gera o .jar
echo "Generating .jar file ..."
jar vcfm dist/SuperscalarSIM.jar manifest.mf -C bin/ .

# Executa-o
echo "Executing ..."
pushd src
java -jar ../dist/SuperscalarSIM.jar
popd
