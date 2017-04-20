package com.fokkenrood.antlr;

import java.util.Calendar;

import com.fokkenrood.antlr.ProfielSpraakParser.ObjectContext;
import com.fokkenrood.antlr.ProfielSpraakParser.RegelContext;


public class AangifteDroolsListener extends ProfielSpraakBaseListener {
	private Calendar		TODAY			= Calendar.getInstance();
	private String			regel			= "Regel";
	private String			regelset		= "Regelset";
	private StringBuilder	drlWhen			= new StringBuilder();
	private StringBuilder	drlThen			= new StringBuilder();

	//	CONSTRUCTOR:
	public AangifteDroolsListener() {
		TODAY.set(2017, 1, 16);				// Datum voor digitaal Tijdreizen: YYYY, (MM=0-11), (DD=1-31)
	}	// end constructor

	//	GET-er:
	public String getDRL() {
		return (drlWhen.toString() + drlThen.toString());
	}

	
	@Override
	public void enterRegel(RegelContext ctx) {
		drlWhen.setLength(0);
		drlWhen.append("package ");
		drlWhen.append(regelset);
		drlWhen.append("\n\n");
		drlWhen.append("import com.fokkenrood.drools.Aangifte;\n\n");
		drlWhen.append("rule \"");
		drlWhen.append(regel);
		drlWhen.append("\"\n");
		drlWhen.append("  when\n");
		drlThen.setLength(0);
		drlThen.append("\n      )\n");
		drlThen.append("  then\n");
	}	// end enterRegel


	@Override
	public void exitRegel(RegelContext ctx) {
		drlThen.append("    $aangifte.setScore(\"");
		drlThen.append(ctx.w.getText());
		drlThen.append("\");\n");
		drlThen.append("end\n");
	}	// end exitRegel

	
	@Override
	public void exitObject(ObjectContext ctx) {
		drlWhen.append(drlWhen.indexOf("$aangifte") < 1 ? "    $aangifte : Aangifte(\n" : ",\n");
		if (ctx.w1 != null) {
			drlWhen.append("      ");
			drlWhen.append(ctx.f.signifier);
			drlWhen.append(" ");
			drlWhen.append(ctx.v.operator);
			drlWhen.append(" ");
			drlWhen.append(ctx.w1.value);
		}	// end if
		if (ctx.w2 != null) {
			drlWhen.append("      ");
			drlWhen.append(ctx.f.signifier);
			drlWhen.append((ctx.not != null ? " not" : ""));
			drlWhen.append(" matches \".*(");
			drlWhen.append(ctx.w2.getText());
			drlWhen.append(").*\"");
		}	// end if
	}	// end exitObject
	

}	// end class
