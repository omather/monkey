package io.github.liias.monkey.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.github.liias.monkey.MonkeyLanguage;
import io.github.liias.monkey.lexer.MonkeyLexer;
import io.github.liias.monkey.psi.MonkeyFile;
import io.github.liias.monkey.psi.MonkeyTypes;
import org.jetbrains.annotations.NotNull;

public class MonkeyParserDefinition implements ParserDefinition {
  public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
  public static final TokenSet COMMENTS = TokenSet.create(MonkeyTypes.SINGLE_LINE_COMMENT);

  public static final IFileElementType FILE = new IFileElementType(Language.findInstance(MonkeyLanguage.class));

  @NotNull
  @Override
  public Lexer createLexer(Project project) {
    return new MonkeyLexer();
  }

  @Override
  public PsiParser createParser(Project project) {
    return new MonkeyParser();
  }

  @Override
  public IFileElementType getFileNodeType() {
    return FILE;
  }

  @NotNull
  @Override
  public TokenSet getWhitespaceTokens() {
    return WHITE_SPACES;
  }

  @NotNull
  @Override
  public TokenSet getCommentTokens() {
    return COMMENTS;
  }

  @NotNull
  @Override
  public TokenSet getStringLiteralElements() {
    return MonkeyTokenTypesSets.STRINGS;
  }

  @NotNull
  @Override
  public PsiElement createElement(ASTNode node) {
    return MonkeyTypes.Factory.createElement(node);
  }

  @Override
  public PsiFile createFile(FileViewProvider viewProvider) {
    return new MonkeyFile(viewProvider);
  }

  @Override
  public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
    return SpaceRequirements.MAY;
  }
}
