@echo off

set regelset=FILE:..\data\ProfielSpraak.txt
set omschrijving=Fietsbroek
set herkomst=China

call execute.cmd "%regelset%" "%omschrijving%" "%herkomst%"
