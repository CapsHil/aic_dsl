/*
 * generated by Xtext 2.10.0
 */
package com.zenika.parser.antlr;

import com.google.inject.Inject;
import com.zenika.parser.antlr.internal.InternalAicdslParser;
import com.zenika.services.AicdslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AicdslParser extends AbstractAntlrParser {

	@Inject
	private AicdslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAicdslParser createParser(XtextTokenStream stream) {
		return new InternalAicdslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Dsl";
	}

	public AicdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AicdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
