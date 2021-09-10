/**
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.expression.impl;

import com.intuit.dsl.expression.Contains;
import com.intuit.dsl.expression.Expression;
import com.intuit.dsl.expression.ExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.intuit.dsl.expression.impl.ContainsImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.intuit.dsl.expression.impl.ContainsImpl#getSearch <em>Search</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainsImpl extends FunctionImpl implements Contains
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected Expression input;

  /**
   * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearch()
   * @generated
   * @ordered
   */
  protected Expression search;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainsImpl()
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
    return ExpressionPackage.Literals.CONTAINS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(Expression newInput, NotificationChain msgs)
  {
    Expression oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.CONTAINS__INPUT, oldInput, newInput);
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
  public void setInput(Expression newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.CONTAINS__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.CONTAINS__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.CONTAINS__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getSearch()
  {
    return search;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearch(Expression newSearch, NotificationChain msgs)
  {
    Expression oldSearch = search;
    search = newSearch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.CONTAINS__SEARCH, oldSearch, newSearch);
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
  public void setSearch(Expression newSearch)
  {
    if (newSearch != search)
    {
      NotificationChain msgs = null;
      if (search != null)
        msgs = ((InternalEObject)search).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.CONTAINS__SEARCH, null, msgs);
      if (newSearch != null)
        msgs = ((InternalEObject)newSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.CONTAINS__SEARCH, null, msgs);
      msgs = basicSetSearch(newSearch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.CONTAINS__SEARCH, newSearch, newSearch));
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
      case ExpressionPackage.CONTAINS__INPUT:
        return basicSetInput(null, msgs);
      case ExpressionPackage.CONTAINS__SEARCH:
        return basicSetSearch(null, msgs);
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
      case ExpressionPackage.CONTAINS__INPUT:
        return getInput();
      case ExpressionPackage.CONTAINS__SEARCH:
        return getSearch();
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
      case ExpressionPackage.CONTAINS__INPUT:
        setInput((Expression)newValue);
        return;
      case ExpressionPackage.CONTAINS__SEARCH:
        setSearch((Expression)newValue);
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
      case ExpressionPackage.CONTAINS__INPUT:
        setInput((Expression)null);
        return;
      case ExpressionPackage.CONTAINS__SEARCH:
        setSearch((Expression)null);
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
      case ExpressionPackage.CONTAINS__INPUT:
        return input != null;
      case ExpressionPackage.CONTAINS__SEARCH:
        return search != null;
    }
    return super.eIsSet(featureID);
  }

} //ContainsImpl
