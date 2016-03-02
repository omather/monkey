// This is a generated file. Not intended for manual editing.
package io.github.liias.monkey.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MonkeyFunctionDeclaration extends MonkeyComponent {

  @Nullable
  MonkeyBlock getBlock();

  @NotNull
  MonkeyComponentName getComponentName();

  @Nullable
  MonkeyFormalParameterDeclarations getFormalParameterDeclarations();

  @NotNull
  MonkeyModifiers getModifiers();

}