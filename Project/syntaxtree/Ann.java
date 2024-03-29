//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <SCOMMENT1>
 * f1 -> Label()
 * f2 -> <SCOMMENT2>
 */
public class Ann implements Node {
   public NodeToken f0;
   public Label f1;
   public NodeToken f2;

   public Ann(NodeToken n0, Label n1, NodeToken n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public Ann(Label n0) {
      f0 = new NodeToken("/*");
      f1 = n0;
      f2 = new NodeToken("*/");
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

