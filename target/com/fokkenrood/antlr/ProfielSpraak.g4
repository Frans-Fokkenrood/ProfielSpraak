grammar ProfielSpraak;

regel
	:
	(	MMAAK EEN SCORE MET DE VOLGENDE PARAMETERS DUBBELE_PUNT
 		STREEPJE SCORE IS w=waarde
		INDIEN AAN DE VOLGENDE VOORWAARDEN WORDT VOLDAAN DUBBELE_PUNT
		(	object
		)+
		PUNT
	)
	;
	
object
	:
	(	STREEPJE DE AANGIFTE HEEFT RUBRIEK f=feit
		(	v=vergelijking w1=waarde
		|	BEVAT ( not=NIET )? w2=waarde
		)
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
		(	WOORD									{ $signifier += (" " + $WOORD.text); }
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

AANGIFTE:				'aangifte' ;
AAN:					'aan' ;
BEVAT:					'bevat' ;
DAN:					'dan' ;
DE:						'de' ;
EEN:					'een' ;
GELIJK:					'gelijk' ;
GROTER:					'groter' ;
HEEFT:					'heeft' ;
INDIEN:					'indien' ;
IS:						'is' ;
KLEINER:				'kleiner' ;
MMAAK:					'Maak' ;
MET:					'met' ;
NIET:					'niet' ;
OF:						'of' ;
PARAMETERS:				'parameters' ;
RUBRIEK:				'rubriek' ;
SCORE:					'score' ;
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
