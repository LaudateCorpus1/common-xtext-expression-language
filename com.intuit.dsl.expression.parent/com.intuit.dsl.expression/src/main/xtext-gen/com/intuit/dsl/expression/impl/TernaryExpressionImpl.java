/**
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.expression.impl;

import com.intuit.dsl.expression.Expression;
import com.intuit.dsl.expression.ExpressionPackage;
import com.intuit.dsl.expression.TernaryExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.intuit.dsl.expression.impl.TernaryExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.intuit.dsl.expression.impl.TernaryExpressionImpl#getTruevalue <em>Truevalue</em>}</li>
 *   <li>{@link com.intuit.dsl.expression.impl.TernaryExpressionImpl#getFalsevalue <em>Falsevalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TernaryExpressionImpl extends ExpressionImpl implements TernaryExpression
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getTruevalue() <em>Truevalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTruevalue()
   * @generated
   * @ordered
   */
  protected Expression truevalue;

  /**
   * The cached value of the '{@link #getFalsevalue() <em>Falsevalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalsevalue()
   * @generated
   * @ordered
   */
  protected Expression falsevalue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TernaryExpressionImpl()
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
    return ExpressionPackage.Literals.TERNARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getTruevalue()
  {
    return truevalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTruevalue(Expression newTruevalue, NotificationChain msgs)
  {
    Expression oldTruevalue = truevalue;
    truevalue = newTruevalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE, oldTruevalue, newTruevalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTruevalue(Expression newTruevalue)
  {
    if (newTruevalue != truevalue)
    {
      NotificationChain msgs = null;
      if (truevalue != null)
        msgs = ((InternalEObject)truevalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE, null, msgs);
      if (newTruevalue != null)
        msgs = ((InternalEObject)newTruevalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE, null, msgs);
      msgs = basicSetTruevalue(newTruevalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE, newTruevalue, newTruevalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getFalsevalue()
  {
    return falsevalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFalsevalue(Expression newFalsevalue, NotificationChain msgs)
  {
    Expression oldFalsevalue = falsevalue;
    falsevalue = newFalsevalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE, oldFalsevalue, newFalsevalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFalsevalue(Expression newFalsevalue)
  {
    if (newFalsevalue != falsevalue)
    {
      NotificationChain msgs = null;
      if (falsevalue != null)
        msgs = ((InternalEObject)falsevalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE, null, msgs);
      if (newFalsevalue != null)
        msgs = ((InternalEObject)newFalsevalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE, null, msgs);
      msgs = basicSetFalsevalue(newFalsevalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE, newFalsevalue, newFalsevalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE:
        return basicSetTruevalue(null, msgs);
      case ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE:
        return basicSetFalsevalue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION:
        return getExpression();
      case ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE:
        return getTruevalue();
      case ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE:
        return getFalsevalue();
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
      case ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE:
        setTruevalue((Expression)newValue);
        return;
      case ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE:
        setFalsevalue((Expression)newValue);
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
      case ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE:
        setTruevalue((Expression)null);
        return;
      case ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE:
        setFalsevalue((Expression)null);
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
      case ExpressionPackage.TERNARY_EXPRESSION__EXPRESSION:
        return expression != null;
      case ExpressionPackage.TERNARY_EXPRESSION__TRUEVALUE:
        return truevalue != null;
      case ExpressionPackage.TERNARY_EXPRESSION__FALSEVALUE:
        return falsevalue != null;
    }
    return super.eIsSet(featureID);
  }

} //TernaryExpressionImpl
