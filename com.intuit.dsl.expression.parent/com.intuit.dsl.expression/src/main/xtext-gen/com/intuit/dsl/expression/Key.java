/**
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.intuit.dsl.expression.Key#getId <em>Id</em>}</li>
 *   <li>{@link com.intuit.dsl.expression.Key#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see com.intuit.dsl.expression.ExpressionPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.intuit.dsl.expression.ExpressionPackage#getKey_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.intuit.dsl.expression.Key#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see com.intuit.dsl.expression.ExpressionPackage#getKey_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.intuit.dsl.expression.Key#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // Key
