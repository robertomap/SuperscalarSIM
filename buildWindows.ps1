Set-ExecutionPolicy Bypass Process

# Compila o código
echo "Compiling the code ..."
./compile.ps1

# Cria o manifesto
echo "Creating manifest.mf ..."
echo "Main-Class: SuperscalarSIM.pkg1.Main
Class-Path: bin/" | Out-File -Encoding Default manifest.mf

# Gera o .jar
echo "Generating .jar file ..."
jar vcfm SuperscalarSIM.jar manifest.mf -C bin/ .

# Executa-o
echo "Executing ..."
pushd src
java -jar ../SuperscalarSIM.jar
popd
