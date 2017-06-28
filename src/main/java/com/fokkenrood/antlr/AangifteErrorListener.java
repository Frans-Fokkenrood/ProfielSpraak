package com.fokkenrood.antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class AangifteErrorListener extends BaseErrorListener {
	private StringBuilder message = new StringBuilder();

	//	GET-er:
	public String getMessage() {
		return (message.toString());
	}	// end getMessage

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
							int line, int charPositionInLine, String msg, RecognitionException ex) {
		
		String part[] = msg.split("(mismatched|input| expecting) ");
		
		message.append("Foutje op lijn ");
		message.append(line);
		message.append(" rond positie ");
		message.append(charPositionInLine);
		message.append(":\n\tU heeft getypt ");
		message.append(part[2]);
		message.append(", terwijl ");
		message.append(part[3].replaceAll("[{}]", "").replaceAll(",", " of"));
		message.append(" werd verwacht\n");
	}	// end syntaxError
	
}	// end class
