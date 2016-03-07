// This is a generated file. Not intended for manual editing.
package io.github.jhsx.flow.render.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.jhsx.flow.render.FlowRenderTypes.*;
import io.github.jhsx.flow.render.psi.*;

public class FlowRenderSetStatementImpl extends FlowRenderStatementImpl implements FlowRenderSetStatement {

  public FlowRenderSetStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FlowRenderVisitor) ((FlowRenderVisitor)visitor).visitSetStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FlowRenderExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FlowRenderExpression.class);
  }

  @Override
  @NotNull
  public List<FlowRenderIdentifierLiteral> getIdentifierLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FlowRenderIdentifierLiteral.class);
  }

}
