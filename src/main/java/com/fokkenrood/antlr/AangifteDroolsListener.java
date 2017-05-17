package com.fokkenrood.antlr;

import java.util.Calendar;

import com.fokkenrood.antlr.ProfielSpraakParser.ObjectContext;
import com.fokkenrood.antlr.ProfielSpraakParser.RegelContext;
import com.fokkenrood.antlr.ProfielSpraakParser.StatementsContext;
import com.fokkenrood.antlr.ProfielSpraakParser.ToekenningContext;


public class AangifteDroolsListener extends ProfielSpraakBaseListener {
	private Calendar		TODAY			= Calendar.getInstance();
	private StringBuilder	drlRset			= new StringBuilder();
	private StringBuilder	drlWhen			= new StringBuilder();
	private StringBuilder	drlThen			= new StringBuilder();

	//	CONSTRUCTOR:
	public AangifteDroolsListener() {
		TODAY.set(2017, 1, 16);				// Datum voor digitaal Tijdreizen: YYYY, (MM=0-11), (DD=1-31)
	}	// end constructor

	//	GET-er:
	public String getDRL() {
		return (drlRset.toString());
	}

	
	@Override
	public void enterStatements(StatementsContext ctx) {
		drlRset.setLength(0);
		drlRset.append("package Regelset\n\n");
		drlRset.append("import com.fokkenrood.drools.Aangifte;\n\n");
	}	// end enterStatements

	@Override
	public void enterRegel(RegelContext ctx) {
		drlWhen.setLength(0);
		drlWhen.append("rule \"");
		drlWhen.append(ctx.rg.getText());
		drlWhen.append("\"\n");
		drlWhen.append("  when\n");
		drlThen.setLength(0);
		drlThen.append("\n      )\n");
		drlThen.append("  then\n");
	}	// end enterRegel


	@Override
	public void exitRegel(RegelContext ctx) {
		drlThen.append("    $aangifte.setRegel_naam(\"");
		drlThen.append(ctx.rg.getText());
		drlThen.append("\");\n");
		drlThen.append("end\n\n");
		drlRset.append(drlWhen.toString() + drlThen.toString());
	}	// end exitRegel

	
	@Override
	public void exitToekenning(ToekenningContext ctx) {
		if (ctx.w != null) {
			drlThen.append("    $aangifte.set");
			drlThen.append(ctx.f.signifier.substring(0, 1).toUpperCase());
			drlThen.append(ctx.f.signifier.substring(1));
			drlThen.append("(");
			drlThen.append(ctx.w.value);
			drlThen.append(");\n");
		}
		if (ctx.f1 != null) {
			drlThen.append("    $aangifte.set");
			drlThen.append(ctx.f.signifier.substring(0, 1).toUpperCase());
			drlThen.append(ctx.f.signifier.substring(1));
			drlThen.append("(($aangifte.get");
			drlThen.append(ctx.f1.signifier.substring(0, 1).toUpperCase());
			drlThen.append(ctx.f1.signifier.substring(1));
			drlThen.append("() * $aangifte.get");
			drlThen.append(ctx.f2.signifier.substring(0, 1).toUpperCase());
			drlThen.append(ctx.f2.signifier.substring(1));
			drlThen.append("()) / 100);\n");
		}
	}	// end exitToekenning

	
	@Override
	public void exitObject(ObjectContext ctx) {
		drlWhen.append(drlWhen.indexOf("$aangifte") < 1 ? "    $aangifte : Aangifte(\n" : ",\n");
		if (ctx.w != null) {
			drlWhen.append("      ");
			drlWhen.append(ctx.f.signifier);
			drlWhen.append(" ");
			drlWhen.append(ctx.v.operator);
			drlWhen.append(" ");
			drlWhen.append(ctx.w.value);
		}	// end if
	}	// end exitObject
	

}	// end class
