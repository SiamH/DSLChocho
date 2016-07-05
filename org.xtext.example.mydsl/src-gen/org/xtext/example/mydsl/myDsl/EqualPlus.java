/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equal Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EqualPlus#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EqualPlus#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EqualPlus#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEqualPlus()
 * @model
 * @generated
 */
public interface EqualPlus extends Types
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEqualPlus_Var1()
   * @model
   * @generated
   */
  Variable getVar1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EqualPlus#getVar1 <em>Var1</em>}' reference.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEqualPlus_Var2()
   * @model
   * @generated
   */
  Variable getVar2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EqualPlus#getVar2 <em>Var2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' reference.
   * @see #getVar2()
   * @generated
   */
  void setVar2(Variable value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' attribute.
   * @see #setRange(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEqualPlus_Range()
   * @model
   * @generated
   */
  int getRange();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EqualPlus#getRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' attribute.
   * @see #getRange()
   * @generated
   */
  void setRange(int value);

} // EqualPlus
