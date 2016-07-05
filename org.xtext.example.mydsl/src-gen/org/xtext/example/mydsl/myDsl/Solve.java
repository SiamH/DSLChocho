/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Solve#isRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSolve()
 * @model
 * @generated
 */
public interface Solve extends Types
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' attribute.
   * @see #setRange(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSolve_Range()
   * @model
   * @generated
   */
  boolean isRange();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Solve#isRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' attribute.
   * @see #isRange()
   * @generated
   */
  void setRange(boolean value);

} // Solve
