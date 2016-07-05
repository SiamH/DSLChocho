/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation

import java.util.HashMap;
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.Variable
import org.xtext.example.mydsl.myDsl.Types
import org.xtext.example.mydsl.myDsl.Equal
import org.xtext.example.mydsl.myDsl.EqualPlus
import org.xtext.example.mydsl.myDsl.EqualMinus
import org.xtext.example.mydsl.myDsl.NotEqualPlus
import org.xtext.example.mydsl.myDsl.NotEqualMinus
import org.xtext.example.mydsl.myDsl.NotEqual
import org.xtext.example.mydsl.myDsl.Types
import java.lang.reflect.Type
import org.xtext.example.mydsl.myDsl.MyDslPackage

import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {

	 public static val DUPLICATE_NAME = 'duplicateName'
	 public static val DUPLICATE_VAR = 'duplicatevariable'
//
	@Check
	def checkDuplicateVarName(Model m) {
		var map = new HashMap<String, Variable>
		for (Types v : m.elements)
		{
			if (v instanceof Variable)
			{
				var nameVar = (v as Variable).name 
				if (map.containsKey(nameVar))
				{
					error('Duplicate Variable name', 
					v,
					MyDslPackage.Literals.VARIABLE__NAME,
					DUPLICATE_NAME)
					error('Duplicate Variable name', 
					map.get(nameVar),
					MyDslPackage.Literals.VARIABLE__NAME,
					DUPLICATE_NAME)
					
				}
				else
				{
					map.put(nameVar, v);
				}	
			}
			else if (v instanceof Equal)
			{
				if ((v as Equal).var1 == (v as Equal).var2)
				{
					error('Same Variable used', 
					v,
					MyDslPackage.Literals.EQUAL__VAR1,
					DUPLICATE_VAR)
				}	
			}	
			else if (v instanceof NotEqual)
			{
				if ((v as NotEqual).var1 == (v as NotEqual).var2)
				{
					error('Same Variable used', 
					v,
					MyDslPackage.Literals.NOT_EQUAL__VAR1,
					DUPLICATE_VAR)
				}	
			}	
			else if (v instanceof EqualPlus)
			{
				if ((v as EqualPlus).var1 == (v as EqualPlus).var2)
				{
					error('Same Variable used', 
					v,
					MyDslPackage.Literals.EQUAL_PLUS__VAR1,
					DUPLICATE_VAR)
				}	
			}	
			else if (v instanceof NotEqualPlus)
			{
				if ((v as NotEqualPlus).var1 == (v as NotEqualPlus).var2)
				{
					error('Same Variable used', 
					v,
					MyDslPackage.Literals.NOT_EQUAL_PLUS__VAR1,
					DUPLICATE_VAR)
				}	
			}	
			else if (v instanceof EqualMinus)
			{
				if ((v as EqualMinus).var1 == (v as EqualMinus).var2)
				{
					error('Same Variable used', 
					v,
					MyDslPackage.Literals.EQUAL_MINUS__VAR1,
					DUPLICATE_VAR)
				}	
			}	
			else if (v instanceof NotEqualMinus)
			{
				if ((v as NotEqualMinus).var1 == (v as NotEqualMinus).var2)
				{
					error('Same Variable used', 
					v,
					MyDslPackage.Literals.NOT_EQUAL_MINUS__VAR1,
					DUPLICATE_VAR)
				}	
			}	
			
		}
		
	}
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
}
