package AST;
import AST.Visitor.ObjectVisitor;
import AST.Visitor.Visitor;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class ArrayLength extends Exp {
  public Exp e;
  
  public ArrayLength(Exp ae, Location pos) {
    super(pos);
    e=ae; 
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
  public Object accept(ObjectVisitor v) {
    return v.visit(this);
  }
}
