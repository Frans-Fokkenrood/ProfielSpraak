@echo off

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

set regelset=FILE:..\data\ProfielSpraak.txt
set omschrijving=Fiets&&			rem Omschrijvingen die worden herkend, zijn: Fiets, Fietsbroek of Kippenvlees
set herkomst=India&&				rem Landen van herkomst die worden herkend, zijn: Taiwan, China, India of Nederland

cls
echo.
echo FIETS:
echo ------
echo.
java com.fokkenrood.antlr.Interpreteer "%regelset%" "%omschrijving%" "%herkomst%"
echo.
echo (met als ingevoerde attributen: goederen_omschrijving='%omschrijving%' en land_van_herkomst='%herkomst%')
echo.
echo Ready!
