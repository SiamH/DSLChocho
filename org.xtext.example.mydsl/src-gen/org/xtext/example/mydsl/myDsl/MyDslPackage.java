/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypesImpl <em>Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTypes()
   * @generated
   */
  int TYPES = 1;

  /**
   * The number of structural features of the '<em>Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VariableImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__RANGE = TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EqualImpl <em>Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EqualImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEqual()
   * @generated
   */
  int EQUAL = 3;

  /**
   * The feature id for the '<em><b>Var1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__VAR1 = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__VAR2 = TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_FEATURE_COUNT = TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EqualPlusImpl <em>Equal Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EqualPlusImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEqualPlus()
   * @generated
   */
  int EQUAL_PLUS = 4;

  /**
   * The feature id for the '<em><b>Var1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_PLUS__VAR1 = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_PLUS__VAR2 = TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_PLUS__RANGE = TYPES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equal Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_PLUS_FEATURE_COUNT = TYPES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EqualMinusImpl <em>Equal Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EqualMinusImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEqualMinus()
   * @generated
   */
  int EQUAL_MINUS = 5;

  /**
   * The feature id for the '<em><b>Var1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_MINUS__VAR1 = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_MINUS__VAR2 = TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_MINUS__RANGE = TYPES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equal Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_MINUS_FEATURE_COUNT = TYPES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NotEqualImpl <em>Not Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NotEqualImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNotEqual()
   * @generated
   */
  int NOT_EQUAL = 6;

  /**
   * The feature id for the '<em><b>Var1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__VAR1 = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__VAR2 = TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Not Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_FEATURE_COUNT = TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NotEqualPlusImpl <em>Not Equal Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NotEqualPlusImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNotEqualPlus()
   * @generated
   */
  int NOT_EQUAL_PLUS = 7;

  /**
   * The feature id for the '<em><b>Var1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_PLUS__VAR1 = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_PLUS__VAR2 = TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_PLUS__RANGE = TYPES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Not Equal Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_PLUS_FEATURE_COUNT = TYPES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NotEqualMinusImpl <em>Not Equal Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NotEqualMinusImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNotEqualMinus()
   * @generated
   */
  int NOT_EQUAL_MINUS = 8;

  /**
   * The feature id for the '<em><b>Var1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_MINUS__VAR1 = TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_MINUS__VAR2 = TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_MINUS__RANGE = TYPES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Not Equal Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_MINUS_FEATURE_COUNT = TYPES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ShowAllImpl <em>Show All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ShowAllImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getShowAll()
   * @generated
   */
  int SHOW_ALL = 9;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_ALL__RANGE = TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Show All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_ALL_FEATURE_COUNT = TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LogImpl <em>Log</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LogImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLog()
   * @generated
   */
  int LOG = 10;

  /**
   * The feature id for the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__STR = TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Log</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FEATURE_COUNT = TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SolveImpl <em>Solve</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SolveImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSolve()
   * @generated
   */
  int SOLVE = 11;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLVE__RANGE = TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Solve</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLVE_FEATURE_COUNT = TYPES_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Types <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Types</em>'.
   * @see org.xtext.example.mydsl.myDsl.Types
   * @generated
   */
  EClass getTypes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Variable#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable#getRange()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Equal <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal</em>'.
   * @see org.xtext.example.mydsl.myDsl.Equal
   * @generated
   */
  EClass getEqual();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Equal#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Equal#getVar1()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_Var1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Equal#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Equal#getVar2()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_Var2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EqualPlus <em>Equal Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal Plus</em>'.
   * @see org.xtext.example.mydsl.myDsl.EqualPlus
   * @generated
   */
  EClass getEqualPlus();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.EqualPlus#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.EqualPlus#getVar1()
   * @see #getEqualPlus()
   * @generated
   */
  EReference getEqualPlus_Var1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.EqualPlus#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.EqualPlus#getVar2()
   * @see #getEqualPlus()
   * @generated
   */
  EReference getEqualPlus_Var2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.EqualPlus#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.EqualPlus#getRange()
   * @see #getEqualPlus()
   * @generated
   */
  EAttribute getEqualPlus_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EqualMinus <em>Equal Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal Minus</em>'.
   * @see org.xtext.example.mydsl.myDsl.EqualMinus
   * @generated
   */
  EClass getEqualMinus();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.EqualMinus#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.EqualMinus#getVar1()
   * @see #getEqualMinus()
   * @generated
   */
  EReference getEqualMinus_Var1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.EqualMinus#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.EqualMinus#getVar2()
   * @see #getEqualMinus()
   * @generated
   */
  EReference getEqualMinus_Var2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.EqualMinus#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.EqualMinus#getRange()
   * @see #getEqualMinus()
   * @generated
   */
  EAttribute getEqualMinus_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NotEqual <em>Not Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equal</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqual
   * @generated
   */
  EClass getNotEqual();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.NotEqual#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqual#getVar1()
   * @see #getNotEqual()
   * @generated
   */
  EReference getNotEqual_Var1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.NotEqual#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqual#getVar2()
   * @see #getNotEqual()
   * @generated
   */
  EReference getNotEqual_Var2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NotEqualPlus <em>Not Equal Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equal Plus</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqualPlus
   * @generated
   */
  EClass getNotEqualPlus();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.NotEqualPlus#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqualPlus#getVar1()
   * @see #getNotEqualPlus()
   * @generated
   */
  EReference getNotEqualPlus_Var1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.NotEqualPlus#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqualPlus#getVar2()
   * @see #getNotEqualPlus()
   * @generated
   */
  EReference getNotEqualPlus_Var2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.NotEqualPlus#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqualPlus#getRange()
   * @see #getNotEqualPlus()
   * @generated
   */
  EAttribute getNotEqualPlus_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NotEqualMinus <em>Not Equal Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equal Minus</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqualMinus
   * @generated
   */
  EClass getNotEqualMinus();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.NotEqualMinus#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqualMinus#getVar1()
   * @see #getNotEqualMinus()
   * @generated
   */
  EReference getNotEqualMinus_Var1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.NotEqualMinus#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqualMinus#getVar2()
   * @see #getNotEqualMinus()
   * @generated
   */
  EReference getNotEqualMinus_Var2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.NotEqualMinus#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.NotEqualMinus#getRange()
   * @see #getNotEqualMinus()
   * @generated
   */
  EAttribute getNotEqualMinus_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ShowAll <em>Show All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show All</em>'.
   * @see org.xtext.example.mydsl.myDsl.ShowAll
   * @generated
   */
  EClass getShowAll();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ShowAll#isRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.ShowAll#isRange()
   * @see #getShowAll()
   * @generated
   */
  EAttribute getShowAll_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log</em>'.
   * @see org.xtext.example.mydsl.myDsl.Log
   * @generated
   */
  EClass getLog();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Log#getStr <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str</em>'.
   * @see org.xtext.example.mydsl.myDsl.Log#getStr()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Str();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Solve <em>Solve</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Solve</em>'.
   * @see org.xtext.example.mydsl.myDsl.Solve
   * @generated
   */
  EClass getSolve();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Solve#isRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.xtext.example.mydsl.myDsl.Solve#isRange()
   * @see #getSolve()
   * @generated
   */
  EAttribute getSolve_Range();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TypesImpl <em>Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TypesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTypes()
     * @generated
     */
    EClass TYPES = eINSTANCE.getTypes();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VariableImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__RANGE = eINSTANCE.getVariable_Range();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EqualImpl <em>Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EqualImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEqual()
     * @generated
     */
    EClass EQUAL = eINSTANCE.getEqual();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__VAR1 = eINSTANCE.getEqual_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__VAR2 = eINSTANCE.getEqual_Var2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EqualPlusImpl <em>Equal Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EqualPlusImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEqualPlus()
     * @generated
     */
    EClass EQUAL_PLUS = eINSTANCE.getEqualPlus();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL_PLUS__VAR1 = eINSTANCE.getEqualPlus_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL_PLUS__VAR2 = eINSTANCE.getEqualPlus_Var2();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUAL_PLUS__RANGE = eINSTANCE.getEqualPlus_Range();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EqualMinusImpl <em>Equal Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EqualMinusImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEqualMinus()
     * @generated
     */
    EClass EQUAL_MINUS = eINSTANCE.getEqualMinus();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL_MINUS__VAR1 = eINSTANCE.getEqualMinus_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL_MINUS__VAR2 = eINSTANCE.getEqualMinus_Var2();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUAL_MINUS__RANGE = eINSTANCE.getEqualMinus_Range();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NotEqualImpl <em>Not Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NotEqualImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNotEqual()
     * @generated
     */
    EClass NOT_EQUAL = eINSTANCE.getNotEqual();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL__VAR1 = eINSTANCE.getNotEqual_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL__VAR2 = eINSTANCE.getNotEqual_Var2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NotEqualPlusImpl <em>Not Equal Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NotEqualPlusImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNotEqualPlus()
     * @generated
     */
    EClass NOT_EQUAL_PLUS = eINSTANCE.getNotEqualPlus();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL_PLUS__VAR1 = eINSTANCE.getNotEqualPlus_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL_PLUS__VAR2 = eINSTANCE.getNotEqualPlus_Var2();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOT_EQUAL_PLUS__RANGE = eINSTANCE.getNotEqualPlus_Range();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NotEqualMinusImpl <em>Not Equal Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NotEqualMinusImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNotEqualMinus()
     * @generated
     */
    EClass NOT_EQUAL_MINUS = eINSTANCE.getNotEqualMinus();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL_MINUS__VAR1 = eINSTANCE.getNotEqualMinus_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL_MINUS__VAR2 = eINSTANCE.getNotEqualMinus_Var2();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOT_EQUAL_MINUS__RANGE = eINSTANCE.getNotEqualMinus_Range();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ShowAllImpl <em>Show All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ShowAllImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getShowAll()
     * @generated
     */
    EClass SHOW_ALL = eINSTANCE.getShowAll();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW_ALL__RANGE = eINSTANCE.getShowAll_Range();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LogImpl <em>Log</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LogImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLog()
     * @generated
     */
    EClass LOG = eINSTANCE.getLog();

    /**
     * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__STR = eINSTANCE.getLog_Str();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SolveImpl <em>Solve</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SolveImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSolve()
     * @generated
     */
    EClass SOLVE = eINSTANCE.getSolve();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOLVE__RANGE = eINSTANCE.getSolve_Range();

  }

} //MyDslPackage
