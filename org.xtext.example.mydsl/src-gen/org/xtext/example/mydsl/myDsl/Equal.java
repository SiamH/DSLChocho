/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Equal#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Equal#getVar2 <em>Var2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEqual()
 * @model
 * @generated
 */
public interface Equal extends Types
{
  /**
   * Returns the value of the '<em><b>Var1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var1</em>' reference.
   * @see #setVar1(Variable)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEqual_Var1()
   * @model
   * @generated
   */
  Variable getVar1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Equal#getVar1 <em>Var1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var1</em>' reference.
   * @see #getVar1()
   * @generated
   */
  void setVar1(Variable value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' reference.
   * @see #setVar2(Variable)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEqual_Var2()
   * @model
   * @generated
   */
  Variable getVar2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Equal#getVar2 <em>Var2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' reference.
   * @see #getVar2()
   * @generated
   */
  void setVar2(Variable value);

} // Equal
