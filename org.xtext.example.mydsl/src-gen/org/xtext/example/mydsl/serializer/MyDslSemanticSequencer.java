package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Equal;
import org.xtext.example.mydsl.myDsl.EqualMinus;
import org.xtext.example.mydsl.myDsl.EqualPlus;
import org.xtext.example.mydsl.myDsl.Log;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NotEqual;
import org.xtext.example.mydsl.myDsl.NotEqualMinus;
import org.xtext.example.mydsl.myDsl.NotEqualPlus;
import org.xtext.example.mydsl.myDsl.ShowAll;
import org.xtext.example.mydsl.myDsl.Solve;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.EQUAL:
				if(context == grammarAccess.getEqualRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_Equal(context, (Equal) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EQUAL_MINUS:
				if(context == grammarAccess.getEqualMinusRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_EqualMinus(context, (EqualMinus) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EQUAL_PLUS:
				if(context == grammarAccess.getEqualPlusRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_EqualPlus(context, (EqualPlus) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LOG:
				if(context == grammarAccess.getLogRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_Log(context, (Log) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NOT_EQUAL:
				if(context == grammarAccess.getNotEqualRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_NotEqual(context, (NotEqual) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NOT_EQUAL_MINUS:
				if(context == grammarAccess.getNotEqualMinusRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_NotEqualMinus(context, (NotEqualMinus) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NOT_EQUAL_PLUS:
				if(context == grammarAccess.getNotEqualPlusRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_NotEqualPlus(context, (NotEqualPlus) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SHOW_ALL:
				if(context == grammarAccess.getShowAllRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_ShowAll(context, (ShowAll) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SOLVE:
				if(context == grammarAccess.getSolveRule() ||
				   context == grammarAccess.getTypesRule()) {
					sequence_Solve(context, (Solve) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.VARIABLE:
				if(context == grammarAccess.getTypesRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (var1=[Variable|ID] var2=[Variable|ID] range=INT)
	 */
	protected void sequence_EqualMinus(EObject context, EqualMinus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL_MINUS__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL_MINUS__VAR1));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL_MINUS__VAR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL_MINUS__VAR2));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL_MINUS__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL_MINUS__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualMinusAccess().getVar1VariableIDTerminalRuleCall_2_0_1(), semanticObject.getVar1());
		feeder.accept(grammarAccess.getEqualMinusAccess().getVar2VariableIDTerminalRuleCall_4_0_1(), semanticObject.getVar2());
		feeder.accept(grammarAccess.getEqualMinusAccess().getRangeINTTerminalRuleCall_6_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var1=[Variable|ID] var2=[Variable|ID] range=INT)
	 */
	protected void sequence_EqualPlus(EObject context, EqualPlus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL_PLUS__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL_PLUS__VAR1));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL_PLUS__VAR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL_PLUS__VAR2));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL_PLUS__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL_PLUS__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualPlusAccess().getVar1VariableIDTerminalRuleCall_2_0_1(), semanticObject.getVar1());
		feeder.accept(grammarAccess.getEqualPlusAccess().getVar2VariableIDTerminalRuleCall_4_0_1(), semanticObject.getVar2());
		feeder.accept(grammarAccess.getEqualPlusAccess().getRangeINTTerminalRuleCall_6_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var1=[Variable|ID] var2=[Variable|ID])
	 */
	protected void sequence_Equal(EObject context, Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL__VAR1));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL__VAR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL__VAR2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualAccess().getVar1VariableIDTerminalRuleCall_2_0_1(), semanticObject.getVar1());
		feeder.accept(grammarAccess.getEqualAccess().getVar2VariableIDTerminalRuleCall_4_0_1(), semanticObject.getVar2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     str=STRING
	 */
	protected void sequence_Log(EObject context, Log semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOG__STR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOG__STR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogAccess().getStrSTRINGTerminalRuleCall_2_0(), semanticObject.getStr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=Types*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var1=[Variable|ID] var2=[Variable|ID] range=INT)
	 */
	protected void sequence_NotEqualMinus(EObject context, NotEqualMinus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT_EQUAL_MINUS__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT_EQUAL_MINUS__VAR1));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT_EQUAL_MINUS__VAR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT_EQUAL_MINUS__VAR2));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT_EQUAL_MINUS__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT_EQUAL_MINUS__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNotEqualMinusAccess().getVar1VariableIDTerminalRuleCall_2_0_1(), semanticObject.getVar1());
		feeder.accept(grammarAccess.getNotEqualMinusAccess().getVar2VariableIDTerminalRuleCall_4_0_1(), semanticObject.getVar2());
		feeder.accept(grammarAccess.getNotEqualMinusAccess().getRangeINTTerminalRuleCall_6_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var1=[Variable|ID] var2=[Variable|ID] range=INT)
	 */
	protected void sequence_NotEqualPlus(EObject context, NotEqualPlus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT_EQUAL_PLUS__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT_EQUAL_PLUS__VAR1));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT_EQUAL_PLUS__VAR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT_EQUAL_PLUS__VAR2));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT_EQUAL_PLUS__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT_EQUAL_PLUS__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNotEqualPlusAccess().getVar1VariableIDTerminalRuleCall_2_0_1(), semanticObject.getVar1());
		feeder.accept(grammarAccess.getNotEqualPlusAccess().getVar2VariableIDTerminalRuleCall_4_0_1(), semanticObject.getVar2());
		feeder.accept(grammarAccess.getNotEqualPlusAccess().getRangeINTTerminalRuleCall_6_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var1=[Variable|ID] var2=[Variable|ID])
	 */
	protected void sequence_NotEqual(EObject context, NotEqual semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT_EQUAL__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT_EQUAL__VAR1));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT_EQUAL__VAR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT_EQUAL__VAR2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNotEqualAccess().getVar1VariableIDTerminalRuleCall_2_0_1(), semanticObject.getVar1());
		feeder.accept(grammarAccess.getNotEqualAccess().getVar2VariableIDTerminalRuleCall_4_0_1(), semanticObject.getVar2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     range=BOOLEAN
	 */
	protected void sequence_ShowAll(EObject context, ShowAll semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SHOW_ALL__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SHOW_ALL__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShowAllAccess().getRangeBOOLEANTerminalRuleCall_2_0(), semanticObject.isRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     range=BOOLEAN
	 */
	protected void sequence_Solve(EObject context, Solve semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SOLVE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SOLVE__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSolveAccess().getRangeBOOLEANTerminalRuleCall_2_0(), semanticObject.isRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID range=INT)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getRangeINTTerminalRuleCall_5_0(), semanticObject.getRange());
		feeder.finish();
	}
}
