/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.Types
import org.xtext.example.mydsl.myDsl.Variable
import org.xtext.example.mydsl.myDsl.Equal
import org.xtext.example.mydsl.myDsl.EqualPlus
import org.xtext.example.mydsl.myDsl.EqualMinus
import org.xtext.example.mydsl.myDsl.NotEqualPlus
import org.xtext.example.mydsl.myDsl.NotEqualMinus
import org.xtext.example.mydsl.myDsl.NotEqual
import org.xtext.example.mydsl.myDsl.Log
import org.xtext.example.mydsl.myDsl.Solve
import org.xtext.example.mydsl.myDsl.ShowAll




/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MyDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var Model = resource.contents.head as Model
		fsa.generateFile('''CPSOlver.java''', Model.genAPI)
	}
	
	 def dispatch genAPI(Model m)'''
	 import choco.integer.IntVar;
     import choco.Problem;

     public class CPSOlver{ 
     public static void main(String[] args) {

     Problem myPb = new Problem();

	«FOR t : m.elements»
	«IF t instanceof Log»
		System.out.println("«t.str»");
	«ENDIF»
	«IF t instanceof Variable»
IntVar «t.name» = myPb.makeEnumIntVar("«t.name»", 1, «t.range»);
	«ENDIF»
	«IF t instanceof Equal»
		myPb.post(myPb.eq(«t.var1.getName()», «t.var2.getName()»));
	«ENDIF»
	«IF t instanceof NotEqual»
		myPb.post(myPb.neq(«t.var1.getName()», «t.var2.getName()»));
	«ENDIF»
	«IF t instanceof EqualPlus»
		myPb.post(myPb.eq(«t.var1.getName()», myPb.plus(«t.var2.getName()», «t.range»)));
	«ENDIF»
	«IF t instanceof EqualMinus»
		myPb.post(myPb.eq(«t.var1.getName()», myPb.minus(«t.var2.getName()», «t.range»)));
	«ENDIF»
	«IF t instanceof NotEqualPlus»
		myPb.post(myPb.neq(«t.var1.getName()», myPb.plus(«t.var2.getName()», «t.range»)));
	«ENDIF»
	«IF t instanceof NotEqualMinus»
		myPb.post(myPb.neq(«t.var1.getName()», myPb.minus(«t.var2.getName()», «t.range»)));
	«ENDIF»
	«IF t instanceof Solve»
		myPb.solve(«t.range»);
	«ENDIF»
	«IF t instanceof ShowAll»
		 «FOR v : m.elements»
			«IF v instanceof Variable»
System.out.println(«v.name»);
			«ENDIF»
		«ENDFOR»
	«ENDIF»
	«ENDFOR»
	}
}
  '''
}
