// This is a generated file. Not intended for manual editing.
package ee.edio.garmin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ee.edio.garmin.psi.MonkeyTypes.*;
import ee.edio.garmin.psi.*;

public class MonkeyPrimaryImpl extends MonkeyPsiCompositeElementImpl implements MonkeyPrimary {

  public MonkeyPrimaryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MonkeyVisitor) ((MonkeyVisitor)visitor).visitPrimary(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MonkeyCreator getCreator() {
    return findChildByClass(MonkeyCreator.class);
  }

  @Override
  @Nullable
  public MonkeyIdentifierSuffix getIdentifierSuffix() {
    return findChildByClass(MonkeyIdentifierSuffix.class);
  }

  @Override
  @Nullable
  public MonkeyLiteral getLiteral() {
    return findChildByClass(MonkeyLiteral.class);
  }

  @Override
  @Nullable
  public MonkeyParExpression getParExpression() {
    return findChildByClass(MonkeyParExpression.class);
  }

  @Override
  @NotNull
  public List<MonkeyReferenceExpression> getReferenceExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MonkeyReferenceExpression.class);
  }

  @Override
  @Nullable
  public MonkeySymbol getSymbol() {
    return findChildByClass(MonkeySymbol.class);
  }

}