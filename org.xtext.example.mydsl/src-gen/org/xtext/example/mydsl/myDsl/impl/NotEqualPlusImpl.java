/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NotEqualPlus;
import org.xtext.example.mydsl.myDsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Equal Plus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NotEqualPlusImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NotEqualPlusImpl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NotEqualPlusImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotEqualPlusImpl extends TypesImpl implements NotEqualPlus
{
  /**
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected Variable var1;

  /**
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected Variable var2;

  /**
   * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected static final int RANGE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected int range = RANGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotEqualPlusImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.NOT_EQUAL_PLUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVar1()
  {
    if (var1 != null && var1.eIsProxy())
    {
      InternalEObject oldVar1 = (InternalEObject)var1;
      var1 = (Variable)eResolveProxy(oldVar1);
      if (var1 != oldVar1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.NOT_EQUAL_PLUS__VAR1, oldVar1, var1));
      }
    }
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar1(Variable newVar1)
  {
    Variable oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NOT_EQUAL_PLUS__VAR1, oldVar1, var1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVar2()
  {
    if (var2 != null && var2.eIsProxy())
    {
      InternalEObject oldVar2 = (InternalEObject)var2;
      var2 = (Variable)eResolveProxy(oldVar2);
      if (var2 != oldVar2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.NOT_EQUAL_PLUS__VAR2, oldVar2, var2));
      }
    }
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVar2()
  {
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar2(Variable newVar2)
  {
    Variable oldVar2 = var2;
    var2 = newVar2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NOT_EQUAL_PLUS__VAR2, oldVar2, var2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(int newRange)
  {
    int oldRange = range;
    range = newRange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NOT_EQUAL_PLUS__RANGE, oldRange, range));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.NOT_EQUAL_PLUS__VAR1:
        if (resolve) return getVar1();
        return basicGetVar1();
      case MyDslPackage.NOT_EQUAL_PLUS__VAR2:
        if (resolve) return getVar2();
        return basicGetVar2();
      case MyDslPackage.NOT_EQUAL_PLUS__RANGE:
        return getRange();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.NOT_EQUAL_PLUS__VAR1:
        setVar1((Variable)newValue);
        return;
      case MyDslPackage.NOT_EQUAL_PLUS__VAR2:
        setVar2((Variable)newValue);
        return;
      case MyDslPackage.NOT_EQUAL_PLUS__RANGE:
        setRange((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.NOT_EQUAL_PLUS__VAR1:
        setVar1((Variable)null);
        return;
      case MyDslPackage.NOT_EQUAL_PLUS__VAR2:
        setVar2((Variable)null);
        return;
      case MyDslPackage.NOT_EQUAL_PLUS__RANGE:
        setRange(RANGE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.NOT_EQUAL_PLUS__VAR1:
        return var1 != null;
      case MyDslPackage.NOT_EQUAL_PLUS__VAR2:
        return var2 != null;
      case MyDslPackage.NOT_EQUAL_PLUS__RANGE:
        return range != RANGE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (range: ");
    result.append(range);
    result.append(')');
    return result.toString();
  }

} //NotEqualPlusImpl
