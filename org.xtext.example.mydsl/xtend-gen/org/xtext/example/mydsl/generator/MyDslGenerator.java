/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.myDsl.Equal;
import org.xtext.example.mydsl.myDsl.EqualMinus;
import org.xtext.example.mydsl.myDsl.EqualPlus;
import org.xtext.example.mydsl.myDsl.Log;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.NotEqual;
import org.xtext.example.mydsl.myDsl.NotEqualMinus;
import org.xtext.example.mydsl.myDsl.NotEqualPlus;
import org.xtext.example.mydsl.myDsl.ShowAll;
import org.xtext.example.mydsl.myDsl.Solve;
import org.xtext.example.mydsl.myDsl.Types;
import org.xtext.example.mydsl.myDsl.Variable;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model Model = ((org.xtext.example.mydsl.myDsl.Model) _head);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CPSOlver.java");
    CharSequence _genAPI = this.genAPI(Model);
    fsa.generateFile(_builder.toString(), _genAPI);
  }
  
  protected CharSequence _genAPI(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t ");
    _builder.append("import choco.integer.IntVar;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("import choco.Problem;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public class CPSOlver{ ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("     ");
    _builder.append("Problem myPb = new Problem();");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Types> _elements = m.getElements();
      for(final Types t : _elements) {
        {
          if ((t instanceof Log)) {
            _builder.append("\t");
            _builder.append("System.out.println(\"");
            String _str = ((Log)t).getStr();
            _builder.append(_str, "\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof Variable)) {
            _builder.append("IntVar ");
            String _name = ((Variable)t).getName();
            _builder.append(_name, "");
            _builder.append(" = myPb.makeEnumIntVar(\"");
            String _name_1 = ((Variable)t).getName();
            _builder.append(_name_1, "");
            _builder.append("\", 1, ");
            int _range = ((Variable)t).getRange();
            _builder.append(_range, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof Equal)) {
            _builder.append("\t");
            _builder.append("myPb.post(myPb.eq(");
            Variable _var1 = ((Equal)t).getVar1();
            String _name_2 = _var1.getName();
            _builder.append(_name_2, "\t");
            _builder.append(", ");
            Variable _var2 = ((Equal)t).getVar2();
            String _name_3 = _var2.getName();
            _builder.append(_name_3, "\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof NotEqual)) {
            _builder.append("\t");
            _builder.append("myPb.post(myPb.neq(");
            Variable _var1_1 = ((NotEqual)t).getVar1();
            String _name_4 = _var1_1.getName();
            _builder.append(_name_4, "\t");
            _builder.append(", ");
            Variable _var2_1 = ((NotEqual)t).getVar2();
            String _name_5 = _var2_1.getName();
            _builder.append(_name_5, "\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof EqualPlus)) {
            _builder.append("\t");
            _builder.append("myPb.post(myPb.eq(");
            Variable _var1_2 = ((EqualPlus)t).getVar1();
            String _name_6 = _var1_2.getName();
            _builder.append(_name_6, "\t");
            _builder.append(", myPb.plus(");
            Variable _var2_2 = ((EqualPlus)t).getVar2();
            String _name_7 = _var2_2.getName();
            _builder.append(_name_7, "\t");
            _builder.append(", ");
            int _range_1 = ((EqualPlus)t).getRange();
            _builder.append(_range_1, "\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof EqualMinus)) {
            _builder.append("\t");
            _builder.append("myPb.post(myPb.eq(");
            Variable _var1_3 = ((EqualMinus)t).getVar1();
            String _name_8 = _var1_3.getName();
            _builder.append(_name_8, "\t");
            _builder.append(", myPb.minus(");
            Variable _var2_3 = ((EqualMinus)t).getVar2();
            String _name_9 = _var2_3.getName();
            _builder.append(_name_9, "\t");
            _builder.append(", ");
            int _range_2 = ((EqualMinus)t).getRange();
            _builder.append(_range_2, "\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof NotEqualPlus)) {
            _builder.append("\t");
            _builder.append("myPb.post(myPb.neq(");
            Variable _var1_4 = ((NotEqualPlus)t).getVar1();
            String _name_10 = _var1_4.getName();
            _builder.append(_name_10, "\t");
            _builder.append(", myPb.plus(");
            Variable _var2_4 = ((NotEqualPlus)t).getVar2();
            String _name_11 = _var2_4.getName();
            _builder.append(_name_11, "\t");
            _builder.append(", ");
            int _range_3 = ((NotEqualPlus)t).getRange();
            _builder.append(_range_3, "\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof NotEqualMinus)) {
            _builder.append("\t");
            _builder.append("myPb.post(myPb.neq(");
            Variable _var1_5 = ((NotEqualMinus)t).getVar1();
            String _name_12 = _var1_5.getName();
            _builder.append(_name_12, "\t");
            _builder.append(", myPb.minus(");
            Variable _var2_5 = ((NotEqualMinus)t).getVar2();
            String _name_13 = _var2_5.getName();
            _builder.append(_name_13, "\t");
            _builder.append(", ");
            int _range_4 = ((NotEqualMinus)t).getRange();
            _builder.append(_range_4, "\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof Solve)) {
            _builder.append("\t");
            _builder.append("myPb.solve(");
            boolean _isRange = ((Solve)t).isRange();
            _builder.append(_isRange, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((t instanceof ShowAll)) {
            {
              EList<Types> _elements_1 = m.getElements();
              for(final Types v : _elements_1) {
                {
                  if ((v instanceof Variable)) {
                    _builder.append("System.out.println(");
                    String _name_14 = ((Variable)v).getName();
                    _builder.append(_name_14, "");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genAPI(final Model m) {
    return _genAPI(m);
  }
}
