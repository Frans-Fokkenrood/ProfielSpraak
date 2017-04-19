@echo off

set CLASSPATH=..\lib\antlr-4.6-complete.jar;..\target

set regel="Maak een score met de volgende parameters: - score is LAAG indien aan de volgende voorwaarden wordt voldaan: - de aangifte heeft rubriek bestemming is niet gelijk aan \"Egypte\" - de aangifte heeft rubriek omschrijving bevat niet \"BOM\"."

set bestemming=Frankrijk
set omschrijving=BOMMETJE

cls
echo.
java com.fokkenrood.antlr.Interpreteer %regel%
