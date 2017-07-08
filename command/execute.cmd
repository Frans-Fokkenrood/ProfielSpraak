@echo off

if {{%1}} == {{}} goto FOUT
if {{%2}} == {{}} goto FOUT
if {{%3}} == {{}} goto FOUT

:INTERPRETEER
set CLASSPATH=..\target
set CLASSPATH=%CLASSPATH%;..\lib\antlr-4.6-complete.jar
set CLASSPATH=%CLASSPATH%;..\lib\slf4j-nop-1.7.18.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\kie-api-6.3.0.Final.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\drools-compiler-6.3.0.Final.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\slf4j-api-1.7.2.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\drools-core-6.3.0.Final.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\kie-internal-6.3.0.Final.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\xstream-1.4.7.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\org.eclipse.jdt.core_3.11.0.v20140806-1653.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\mvel2-2.2.6.Final.jar
set CLASSPATH=%CLASSPATH%;..\..\..\droolsjbpm-tools-distribution-6.3.0.Final\binaries\protobuf-java-2.5.0.jar

cls
echo.
echo Execute Interpreteer:
echo ---------------------
echo.
echo Omschrijvingen die worden herkend, zijn: Fiets, Fietsbroek of Kippenvlees.
echo Landen van herkomst die worden herkend, zijn: Taiwan, China, India of Nederland
echo.
echo.
java com.fokkenrood.antlr.Interpreteer %1 %2 %3
echo.
echo De ingevoerde attributen waren: goederen_omschrijving=%2 en land_van_herkomst=%3
goto EINDE

:FOUT
cls
echo.
echo EXECUTE.CMD kan niet zelfstandig worden aangeroepen,
echo             en verwacht de 3 parameters Regel(set), Omschrijving en Land_van_herkomst.

:EINDE
echo.
echo Ready!
