@echo off

set regelset=FILE:..\data\ProfielSpraak.txt
set omschrijving=Fiets
set herkomst=Nederland

call execute.cmd "%regelset%" "%omschrijving%" "%herkomst%"
