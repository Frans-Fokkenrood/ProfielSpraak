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

set regel="Maak een score met de volgende parameters:
set regel=%regel%  - score is LAAG 
set regel=%regel%indien aan de volgende voorwaarden wordt voldaan:
set regel=%regel%  - de aangifte heeft rubriek bestemming is niet gelijk aan \"Egypte\"
set regel=%regel%  - de aangifte heeft rubriek omschrijving bevat niet \"BOM\"
set regel=%regel%."

set bestemming="Frankrijk"
set omschrijving="Bloemetje"

cls
echo.
echo De regel luidt:
echo ----------------
echo.
java com.fokkenrood.antlr.Interpreteer %regel% %bestemming% %omschrijving%
echo ----------------
echo.
echo met als aangegeven attributen: bestemming=%bestemming% en omschrijving=%omschrijving%...
echo.
echo Ready!
