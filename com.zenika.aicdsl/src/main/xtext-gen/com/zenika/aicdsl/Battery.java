/**
 * generated by Xtext 2.10.0
 */
package com.zenika.aicdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zenika.aicdsl.Battery#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.zenika.aicdsl.AicdslPackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends Action
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see com.zenika.aicdsl.AicdslPackage#getBattery_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link com.zenika.aicdsl.Battery#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Battery