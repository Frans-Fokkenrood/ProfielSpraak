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

		message.append("\nFoutje op lijn ");
		message.append(line);
		message.append(" rond positie ");
		message.append(charPositionInLine);

		String part[] = null;
//		message.append(":\n\t(" + msg + ") -----> ");
		
		if (msg.startsWith("no viable alternative")) {
			part = msg.split("at input ");
			message.append(":\n\tDe getypte woorden c.q. lettercombinatie ");
			message.append(part[1]);
			message.append(" vormt geen interpreteerbaar alternatief\n");
			return;
		}	// end if
		
		part = msg.split("(mismatched|extraneous|input| expecting) ");
		message.append(":\n\tU heeft ");
		message.append(msg.substring(0,5).equals("extra") ? "per ongeluk " : "het woord ");
		message.append((part[2].length() == 3 ? "een " : ""));
		message.append(part[2]);
		message.append(" getypt, terwijl ");
		message.append((part[3].length() == 3 ? "een " : ""));
		message.append(part[3].replaceAll("[{}]", "").replaceAll(",", " of"));
		message.append(" werd verwacht\n");
	}	// end syntaxError
	
}	// end class
