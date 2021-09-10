/**
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.intuit.dsl.expression.Split#getExp <em>Exp</em>}</li>
 *   <li>{@link com.intuit.dsl.expression.Split#getRegex <em>Regex</em>}</li>
 * </ul>
 *
 * @see com.intuit.dsl.expression.ExpressionPackage#getSplit()
 * @model
 * @generated
 */
public interface Split extends CollectionFunctionCall
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see com.intuit.dsl.expression.ExpressionPackage#getSplit_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.intuit.dsl.expression.Split#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

  /**
   * Returns the value of the '<em><b>Regex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regex</em>' attribute.
   * @see #setRegex(String)
   * @see com.intuit.dsl.expression.ExpressionPackage#getSplit_Regex()
   * @model
   * @generated
   */
  String getRegex();

  /**
   * Sets the value of the '{@link com.intuit.dsl.expression.Split#getRegex <em>Regex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regex</em>' attribute.
   * @see #getRegex()
   * @generated
   */
  void setRegex(String value);

} // Split
