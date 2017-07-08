@echo off

set regelset=FILE:..\data\ProfielSpraak.txt
set omschrijving=Kippenvlees
set herkomst=Taiwan

call execute.cmd "%regelset%" "%omschrijving%" "%herkomst%"
