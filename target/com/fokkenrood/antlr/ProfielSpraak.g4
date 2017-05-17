grammar ProfielSpraak;

statements
	:
	(	regel
	)+
	;

regel
	:
	(	RREGEL rg=TEKST LUIDT DUBBELE_PUNT
 		(	toekenning
 		)+
		INDIEN AAN ALLE VOLGENDE VOORWAARDEN WORDT VOLDAAN DUBBELE_PUNT
		(	object
		)+
		PUNT
	)
	;

toekenning
	:
	(	(	HHET 
		|	EN DE
		|	EN HET
		)
		f=feit WORDT
		(	GESTELD OP w=waarde
		|	BEREKEND ALS ( DE | HET ) f1=feit MAAL ( DE | HET ) f2=feit
		)
	)
	;
	
object
	:
	(	STREEPJE f=feit v=vergelijking w=waarde
	)
	;
			
waarde returns [String value]
	:
	(	WOORD										{ $value = $WOORD.text; }
	|	TEKST										{ $value = "\"" + $TEKST.text + "\""; }
	|	GETAL										{ $value = $GETAL.text; }
	|	GETAL_NUL									{ $value = "0"; }
	)
	;

vergelijking returns [String operator]
	:	
	(	IS GELIJK AAN								{ $operator = "=="; }
	|	IS NIET GELIJK AAN							{ $operator = "!="; }
	|	IS GROTER OF GELIJK AAN						{ $operator = ">="; }
	|	IS GROTER DAN								{ $operator = ">";  }
	|	IS KLEINER OF GELIJK AAN					{ $operator = "<="; }
	|	IS KLEINER DAN								{ $operator = "<";  }
	)
	;

feit returns [String signifier]
	:
	(	WOORD										{ $signifier  = $WOORD.text; }
		(	WOORD									{ $signifier += ("_" + $WOORD.text); }
		|	AAN										{ $signifier += ("_aan"); }
		)*
	) 
	;


BLOCKCOMMENT:			'/*' .*? '*/'					-> skip ;
LINECOMMENT:			'//' .*? '\r\n'					-> skip ;

fragment QUOTE:			'"' ;
fragment KOMMA:			',' ;
fragment LETTER:		[a-zA-Z] ;
fragment CIJFER:		[0-9] ;

TEKST:					QUOTE .*? QUOTE					{ setText(getText().replaceAll("\"","")); } ;

AAN:					'aan' ;
ALLE:					'alle' ;
ALS:					'als' ;
BEREKEND:				'berekend' ;
DAN:					'dan' ;
DE:						'de' ;
EN:						'en' ;
GELIJK:					'gelijk' ;
GESTELD:				'gesteld' ;
GROTER:					'groter' ;
HHET:					'Het' ;
HET:					'het' ;
INDIEN:					'indien' ;
IS:						'is' ;
KLEINER:				'kleiner' ;
LUIDT:					'luidt' ;
MAAL:					'maal' ;
NIET:					'niet' ;
OF:						'of' ;
OP:						'op' ;
RREGEL:					'Regel' ;
VOLDAAN:				'voldaan' ;
VOLGENDE:				'volgende' ;
VOORWAARDEN:			'voorwaarden' ;
WORDT:					'wordt' ;

DUBBELE_PUNT:			':' ;
GETAL_NUL:				'0' ;
PUNT:					'.' ;
STREEPJE:				'-' ;

GETAL:					( STREEPJE )? CIJFER+ ;
WOORD:					LETTER ( LETTER | STREEPJE )* ;

WS:						[ \t\r\n]+						-> skip ;
