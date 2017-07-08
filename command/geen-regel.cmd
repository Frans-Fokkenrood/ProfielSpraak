@echo off

set regelset=FILE:..\data\ProfielSpraak.txt
set omschrijving=Fahrad
set herkomst=Deutschland

call execute.cmd "%regelset%" "%omschrijving%" "%herkomst%"
