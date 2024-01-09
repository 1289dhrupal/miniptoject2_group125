/*
 * generated by Xtext 2.32.0
 */
grammar InternalEntityDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package co7217.week18.entity.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package co7217.week18.entity.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co7217.week18.entity.services.EntityDslGrammarAccess;

}
@parser::members {
	private EntityDslGrammarAccess grammarAccess;

	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleWebScrappingProject
entryRuleWebScrappingProject
:
{ before(grammarAccess.getWebScrappingProjectRule()); }
	 ruleWebScrappingProject
{ after(grammarAccess.getWebScrappingProjectRule()); } 
	 EOF 
;

// Rule WebScrappingProject
ruleWebScrappingProject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWebScrappingProjectAccess().getGroup()); }
		(rule__WebScrappingProject__Group__0)
		{ after(grammarAccess.getWebScrappingProjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContent
entryRuleContent
:
{ before(grammarAccess.getContentRule()); }
	 ruleContent
{ after(grammarAccess.getContentRule()); } 
	 EOF 
;

// Rule Content
ruleContent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContentAccess().getAlternatives()); }
		(rule__Content__Alternatives)
		{ after(grammarAccess.getContentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStructureData
entryRuleStructureData
:
{ before(grammarAccess.getStructureDataRule()); }
	 ruleStructureData
{ after(grammarAccess.getStructureDataRule()); } 
	 EOF 
;

// Rule StructureData
ruleStructureData 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStructureDataAccess().getAlternatives()); }
		(rule__StructureData__Alternatives)
		{ after(grammarAccess.getStructureDataAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMediaFiles
entryRuleMediaFiles
:
{ before(grammarAccess.getMediaFilesRule()); }
	 ruleMediaFiles
{ after(grammarAccess.getMediaFilesRule()); } 
	 EOF 
;

// Rule MediaFiles
ruleMediaFiles 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMediaFilesAccess().getAlternatives()); }
		(rule__MediaFiles__Alternatives)
		{ after(grammarAccess.getMediaFilesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTextContent
entryRuleTextContent
:
{ before(grammarAccess.getTextContentRule()); }
	 ruleTextContent
{ after(grammarAccess.getTextContentRule()); } 
	 EOF 
;

// Rule TextContent
ruleTextContent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTextContentAccess().getAlternatives()); }
		(rule__TextContent__Alternatives)
		{ after(grammarAccess.getTextContentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTitle
entryRuleTitle
:
{ before(grammarAccess.getTitleRule()); }
	 ruleTitle
{ after(grammarAccess.getTitleRule()); } 
	 EOF 
;

// Rule Title
ruleTitle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTitleAccess().getGroup()); }
		(rule__Title__Group__0)
		{ after(grammarAccess.getTitleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParagraph
entryRuleParagraph
:
{ before(grammarAccess.getParagraphRule()); }
	 ruleParagraph
{ after(grammarAccess.getParagraphRule()); } 
	 EOF 
;

// Rule Paragraph
ruleParagraph 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParagraphAccess().getGroup()); }
		(rule__Paragraph__Group__0)
		{ after(grammarAccess.getParagraphAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleList
entryRuleList
:
{ before(grammarAccess.getListRule()); }
	 ruleList
{ after(grammarAccess.getListRule()); } 
	 EOF 
;

// Rule List
ruleList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListAccess().getGroup()); }
		(rule__List__Group__0)
		{ after(grammarAccess.getListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTable
entryRuleTable
:
{ before(grammarAccess.getTableRule()); }
	 ruleTable
{ after(grammarAccess.getTableRule()); } 
	 EOF 
;

// Rule Table
ruleTable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTableAccess().getGroup()); }
		(rule__Table__Group__0)
		{ after(grammarAccess.getTableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImage
entryRuleImage
:
{ before(grammarAccess.getImageRule()); }
	 ruleImage
{ after(grammarAccess.getImageRule()); } 
	 EOF 
;

// Rule Image
ruleImage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImageAccess().getGroup()); }
		(rule__Image__Group__0)
		{ after(grammarAccess.getImageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVideo
entryRuleVideo
:
{ before(grammarAccess.getVideoRule()); }
	 ruleVideo
{ after(grammarAccess.getVideoRule()); } 
	 EOF 
;

// Rule Video
ruleVideo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVideoAccess().getGroup()); }
		(rule__Video__Group__0)
		{ after(grammarAccess.getVideoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Content__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContentAccess().getTextContentParserRuleCall_0()); }
		ruleTextContent
		{ after(grammarAccess.getContentAccess().getTextContentParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getContentAccess().getStructureDataParserRuleCall_1()); }
		ruleStructureData
		{ after(grammarAccess.getContentAccess().getStructureDataParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getContentAccess().getMediaFilesParserRuleCall_2()); }
		ruleMediaFiles
		{ after(grammarAccess.getContentAccess().getMediaFilesParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructureData__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStructureDataAccess().getTableParserRuleCall_0()); }
		ruleTable
		{ after(grammarAccess.getStructureDataAccess().getTableParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStructureDataAccess().getListParserRuleCall_1()); }
		ruleList
		{ after(grammarAccess.getStructureDataAccess().getListParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MediaFiles__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMediaFilesAccess().getImageParserRuleCall_0()); }
		ruleImage
		{ after(grammarAccess.getMediaFilesAccess().getImageParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMediaFilesAccess().getVideoParserRuleCall_1()); }
		ruleVideo
		{ after(grammarAccess.getMediaFilesAccess().getVideoParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TextContent__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTextContentAccess().getParagraphParserRuleCall_0()); }
		ruleParagraph
		{ after(grammarAccess.getTextContentAccess().getParagraphParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTextContentAccess().getTitleParserRuleCall_1()); }
		ruleTitle
		{ after(grammarAccess.getTextContentAccess().getTitleParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__0__Impl
	rule__WebScrappingProject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getWebScrappingProjectKeyword_0()); }
	'WebScrappingProject'
	{ after(grammarAccess.getWebScrappingProjectAccess().getWebScrappingProjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__1__Impl
	rule__WebScrappingProject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getWebScrappingProjectAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__2__Impl
	rule__WebScrappingProject__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getNameKeyword_2()); }
	'name'
	{ after(grammarAccess.getWebScrappingProjectAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__3__Impl
	rule__WebScrappingProject__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getWebScrappingProjectAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__4__Impl
	rule__WebScrappingProject__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getNameAssignment_4()); }
	(rule__WebScrappingProject__NameAssignment_4)
	{ after(grammarAccess.getWebScrappingProjectAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__5__Impl
	rule__WebScrappingProject__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getUrlKeyword_5()); }
	'url'
	{ after(grammarAccess.getWebScrappingProjectAccess().getUrlKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__6__Impl
	rule__WebScrappingProject__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getEqualsSignKeyword_6()); }
	'='
	{ after(grammarAccess.getWebScrappingProjectAccess().getEqualsSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__7__Impl
	rule__WebScrappingProject__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getUrlAssignment_7()); }
	(rule__WebScrappingProject__UrlAssignment_7)
	{ after(grammarAccess.getWebScrappingProjectAccess().getUrlAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__8__Impl
	rule__WebScrappingProject__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getRuleAssignment_8()); }
	(rule__WebScrappingProject__RuleAssignment_8)*
	{ after(grammarAccess.getWebScrappingProjectAccess().getRuleAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebScrappingProject__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebScrappingProjectAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getWebScrappingProjectAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
	'Rule'
	{ after(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRulenameAssignment_1()); }
	(rule__Rule__RulenameAssignment_1)?
	{ after(grammarAccess.getRuleAccess().getRulenameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__3__Impl
	rule__Rule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getExtrtactionKeyword_3()); }
	'extrtaction'
	{ after(grammarAccess.getRuleAccess().getExtrtactionKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__4__Impl
	rule__Rule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getContentAssignment_4()); }
	(rule__Rule__ContentAssignment_4)
	{ after(grammarAccess.getRuleAccess().getContentAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Title__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__0__Impl
	rule__Title__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getTextContentKeyword_0()); }
	'TextContent'
	{ after(grammarAccess.getTitleAccess().getTextContentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__1__Impl
	rule__Title__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__2__Impl
	rule__Title__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getTitleKeyword_2()); }
	'Title'
	{ after(grammarAccess.getTitleAccess().getTitleKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__3__Impl
	rule__Title__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getTitleNameAssignment_3()); }
	(rule__Title__TitleNameAssignment_3)
	{ after(grammarAccess.getTitleAccess().getTitleNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Paragraph__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Paragraph__Group__0__Impl
	rule__Paragraph__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParagraphAccess().getTextContentKeyword_0()); }
	'TextContent'
	{ after(grammarAccess.getParagraphAccess().getTextContentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Paragraph__Group__1__Impl
	rule__Paragraph__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Paragraph__Group__2__Impl
	rule__Paragraph__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParagraphAccess().getParagraphKeyword_2()); }
	'Paragraph'
	{ after(grammarAccess.getParagraphAccess().getParagraphKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Paragraph__Group__3__Impl
	rule__Paragraph__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParagraphAccess().getParagraphNameAssignment_3()); }
	(rule__Paragraph__ParagraphNameAssignment_3)
	{ after(grammarAccess.getParagraphAccess().getParagraphNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Paragraph__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__List__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__0__Impl
	rule__List__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getStructureDataKeyword_0()); }
	'StructureData'
	{ after(grammarAccess.getListAccess().getStructureDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__1__Impl
	rule__List__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__2__Impl
	rule__List__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getListKeyword_2()); }
	'List'
	{ after(grammarAccess.getListAccess().getListKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__3__Impl
	rule__List__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getListNameAssignment_3()); }
	(rule__List__ListNameAssignment_3)
	{ after(grammarAccess.getListAccess().getListNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getListAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Table__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__0__Impl
	rule__Table__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getStructureDataKeyword_0()); }
	'StructureData'
	{ after(grammarAccess.getTableAccess().getStructureDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__1__Impl
	rule__Table__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__2__Impl
	rule__Table__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getTableKeyword_2()); }
	'Table'
	{ after(grammarAccess.getTableAccess().getTableKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__3__Impl
	rule__Table__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getTableNameAssignment_3()); }
	(rule__Table__TableNameAssignment_3)
	{ after(grammarAccess.getTableAccess().getTableNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Table__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Image__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Image__Group__0__Impl
	rule__Image__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImageAccess().getMediaFilesKeyword_0()); }
	'MediaFiles'
	{ after(grammarAccess.getImageAccess().getMediaFilesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Image__Group__1__Impl
	rule__Image__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Image__Group__2__Impl
	rule__Image__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImageAccess().getImageKeyword_2()); }
	'Image'
	{ after(grammarAccess.getImageAccess().getImageKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Image__Group__3__Impl
	rule__Image__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImageAccess().getImageNameAssignment_3()); }
	(rule__Image__ImageNameAssignment_3)
	{ after(grammarAccess.getImageAccess().getImageNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Image__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Video__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Video__Group__0__Impl
	rule__Video__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVideoAccess().getMediaFilesKeyword_0()); }
	'MediaFiles'
	{ after(grammarAccess.getVideoAccess().getMediaFilesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Video__Group__1__Impl
	rule__Video__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Video__Group__2__Impl
	rule__Video__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVideoAccess().getVideoKeyword_2()); }
	'Video'
	{ after(grammarAccess.getVideoAccess().getVideoKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Video__Group__3__Impl
	rule__Video__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVideoAccess().getVideoNameAssignment_3()); }
	(rule__Video__VideoNameAssignment_3)
	{ after(grammarAccess.getVideoAccess().getVideoNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Video__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WebScrappingProject__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWebScrappingProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getWebScrappingProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__UrlAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWebScrappingProjectAccess().getUrlSTRINGTerminalRuleCall_7_0()); }
		RULE_STRING
		{ after(grammarAccess.getWebScrappingProjectAccess().getUrlSTRINGTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebScrappingProject__RuleAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWebScrappingProjectAccess().getRuleRuleParserRuleCall_8_0()); }
		ruleRule
		{ after(grammarAccess.getWebScrappingProjectAccess().getRuleRuleParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__RulenameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getRulenameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getRuleAccess().getRulenameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ContentAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getContentContentParserRuleCall_4_0()); }
		ruleContent
		{ after(grammarAccess.getRuleAccess().getContentContentParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__TitleNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTitleAccess().getTitleNameSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getTitleAccess().getTitleNameSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Paragraph__ParagraphNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParagraphAccess().getParagraphNameSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getParagraphAccess().getParagraphNameSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__ListNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListAccess().getListNameSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getListAccess().getListNameSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Table__TableNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableAccess().getTableNameSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getTableAccess().getTableNameSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Image__ImageNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImageAccess().getImageNameSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getImageAccess().getImageNameSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Video__VideoNameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVideoAccess().getVideoNameSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getVideoAccess().getVideoNameSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
