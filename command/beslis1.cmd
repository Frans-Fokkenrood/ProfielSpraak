@echo off

set CLASSPATH=..\lib\antlr-4.6-complete.jar;..\target

set regel="Maak een score met de volgende parameters: - score is HOOG indien aan de volgende voorwaarden wordt voldaan: - de aangifte heeft rubriek bestemming is gelijk aan \"Frankrijk\" - de aangifte heeft rubriek omschrijving bevat \"BOM\"."

set bestemming=Duitsland
set omschrijving=Bloemen

cls
echo.
java com.fokkenrood.antlr.Interpreteer %regel%
