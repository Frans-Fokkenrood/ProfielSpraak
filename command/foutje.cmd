@echo off

set regel=RULE:
set regel=%regel%Regel \"FOUTJE\" luidt:##
set regel=%regel%Het percentage invoerrecht wordt gesteld op 50##
set regel=%regel%  en de factuurwaarde wordt gesteld op 1500##
set regel=%regel%  en het bedrag aan invoerrecht wordt gerekend als de factuurwaarde maal het percentage invoerrecht##
set regel=%regel%  en het certificaat wordt gesteld op \"geen\"##
set regel=%regel%indien aan de volgende voorwaarden wordt voldaan:##
set regel=%regel%  - goederen omschrijving is gelijk aan \"Fiets\"##
set regel=%regel%  - land van herkomst is gelijk aan \"India\"##
set regel=%regel%.##

set omschrijving=Fiets
set herkomst=India

call execute.cmd "%regel%" "%omschrijving%" "%herkomst%"
