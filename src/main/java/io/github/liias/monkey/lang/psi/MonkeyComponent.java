package io.github.liias.monkey.lang.psi;

import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.Nullable;

public interface MonkeyComponent extends MonkeyPsiCompositeElement, PsiNameIdentifierOwner {
  @Nullable
  MonkeyComponentName getComponentName();
}